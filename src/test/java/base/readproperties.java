package base;


import java.io.FileReader;
import java.util.Properties;

public class readproperties {
	
	public static void main(String[] args) throws Throwable {
		FileReader fr=new FileReader("C:\\Users\\ECS\\eclipse-workspace\\practice\\src\\test\\resources\\config.properties");	
	
	Properties p = new Properties();
	p.load(fr);
	//System.out.println(p.getProperty("browser"));
	//System.out.println(p.getProperty("testurl"));
	}
			
	
		
	}
		
		
	


