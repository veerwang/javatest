import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class InfoManager {
	public String moduleName;
	public String moduleNameTextCN;
	public String moduleNameTextTW;
	public String commentText;
	public String DesText;
	public String SrcText;
	public String TagNo;
	public String FactorNo;

	public String infoText;

	private static final String statPath = "/home/kevin/stat/";

	InfoManager ( ) {
	}

	InfoManager ( InfoManager v ) {
		this.moduleName       =  v.moduleName 	     ;
		this.moduleNameTextCN =  v.moduleNameTextCN  ; 
		this.moduleNameTextTW =  v.moduleNameTextTW  ; 
		this.commentText      =  v.commentText       ;
		this.DesText          =  v.DesText           ; 
		this.SrcText          =  v.SrcText           ;
		this.TagNo            =  v.TagNo             ;
		this.FactorNo         =  v.FactorNo          ;
	}

	public void readInfoFromFile()
	{
		String filePath  = statPath + DesText;
		InputStream is   = null;
		String resultStr = null;

		try {
			is = new FileInputStream(filePath);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, "gb18030"), 512);
			for (String line = reader.readLine(); line != null; line = reader.readLine()){
				line = line.trim();
				// do something here
				infoText = line;
			}
		}catch (FileNotFoundException fnfe){
			//fnfe.printStackTrace();
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
}
