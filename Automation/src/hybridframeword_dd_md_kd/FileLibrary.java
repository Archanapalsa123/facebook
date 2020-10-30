package hybridframeword_dd_md_kd;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLibrary {
	public String getPropKeyValue(String propPath,String key) throws Throwable
	{
	
	FileInputStream fis=new FileInputStream(propPath);
	Properties prop=new Properties();
	prop.load(fis);
	String propValue=prop.getProperty(key,"Incorrect key,please check key");
	return propValue;
	

}
	
}