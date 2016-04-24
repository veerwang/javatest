import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

import java.util.*;

public class Main
{
	private static final String statInfoPath = "/home/kevin/statinfo";
	private static final int    MAXBUFLENGTH = 1024;

	private static List<InfoManager> g_infoManager = new LinkedList<InfoManager>();
	private static InfoManager infoManager = new InfoManager();

	private static void clearTmpInfoManager()
	{
		infoManager.moduleName 	     = ""; 
		infoManager.moduleNameTextCN = "";
		infoManager.moduleNameTextTW = ""; 
		infoManager.commentText      = "";
		infoManager.DesText          = "";
		infoManager.SrcText          = "";
		infoManager.TagNo            = "";
		infoManager.FactorNo         = "";
	}

	private static void parserValue(String key,String value)
	{
		if ( value == null ) return;
		if 	( key.equals("Name") )
			infoManager.moduleName =  value;
		else if ( key.equals("Name[zh_CN]") )
			infoManager.moduleNameTextCN = value;
		else if ( key.equals("Name[zh_TW]") )
			infoManager.moduleNameTextTW = value;
		else if ( key.equals("Comment") )
			infoManager.commentText= value;
		else if ( key.equals("Dest") )
			infoManager.DesText= value;
		else if ( key.equals("Src") )
			infoManager.SrcText= value;
		else if ( key.equals("TagNo") )
			infoManager.TagNo= value;
		else if ( key.equals("FactorNo") )
			infoManager.FactorNo= value;
	}

	private static void traverseFolder(String path)
	{
		File file = new File(path);  
		if (file.exists()) {  
			File[] files = file.listFiles();  
			if (files.length == 0) {  
				System.out.println("文件夹是空的!");  
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						traverseFolder(file2.getAbsolutePath());  
					} else {
						clearTmpInfoManager();
						readEachLine(file2.getAbsolutePath());
						if ( !infoManager.moduleName.equals("") && infoManager != null )
						{
							InfoManager tmp = new InfoManager(infoManager);
							g_infoManager.add(tmp);
						}
					}
				}
			}
		} else {
			System.out.println("文件不存在!");  
		}
	}

	private static void readEachLine(String filename)
	{
		String filePath  = filename; 
		InputStream is   = null;
		String resultStr = null;

		try {
			is = new FileInputStream(filePath);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gb18030"), MAXBUFLENGTH);
			for (String line = reader.readLine(); line != null; line = reader.readLine()){
				line = line.trim();
				// do something here
				String[] tmpline = line.split("=");
				if ( tmpline.length == 2 )
				{
					tmpline[0] = tmpline[0].replaceAll("\\s*","");
					tmpline[1] = tmpline[1].replaceAll("\\s*","");

					parserValue(tmpline[0],tmpline[1]);
				}
			}
		}catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
					is = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void printInfoStatus()
	{
		for ( int i =0;i<g_infoManager.size();i++  )
		{
			System.out.println("Name = "+g_infoManager.get(i).moduleName);
			System.out.println("Name[zh_CN] = "+g_infoManager.get(i).moduleNameTextCN);
			System.out.println("Name[zh_TW] = "+g_infoManager.get(i).moduleNameTextTW);
			System.out.println("Comment = "+g_infoManager.get(i).commentText);
			System.out.println("Dest = "+g_infoManager.get(i).DesText);
			System.out.println("Src = "+g_infoManager.get(i).SrcText);
			System.out.println("Info = "+g_infoManager.get(i).infoText);
			System.out.println("TagNo = "+g_infoManager.get(i).TagNo);
			System.out.println("FactorNo = "+g_infoManager.get(i).FactorNo);
		}
	}

	private static void processInfo()
	{
		for ( int i =0;i<g_infoManager.size();i++  )
		{
			g_infoManager.get(i).readInfoFromFile();
		}
	}

	public static void main (String[] args)
	{
		System.out.println("System Properties Parser V1.00");
		traverseFolder(statInfoPath);
		processInfo();
		printInfoStatus();
	}
}
