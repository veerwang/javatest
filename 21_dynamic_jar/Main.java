import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main (String[] args)
	{
		URL[] urls = new URL[] {};
		MyClassLoader classLoader = new MyClassLoader(urls, null);
		try {
			classLoader.addJar(new File("/home/kevin/javatest/20_dynamic_jar/com/kevin/utils/Tools.jar").toURI().toURL());
			Class<?> clazz = classLoader.loadClass("com.kevin.utils.Tools");
			Method method = clazz.getDeclaredMethod("printMemory");
			method.invoke(null);
			classLoader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class MyClassLoader extends URLClassLoader 
	{
		public MyClassLoader(URL[] urls) 
		{
			super(urls);
		}

		public MyClassLoader(URL[] urls, ClassLoader parent) 
		{
			super(urls, parent);
		}

		public void addJar(URL url) 
		{
			this.addURL(url);
		}

	}
}
