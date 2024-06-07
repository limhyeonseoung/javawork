package _01_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {
		//		properties : Map계열 => 키+값 세트 저장
		// HashMap과의 차이 : properties에는 키 = String,값 = String으로 담는다

		Properties prop = new Properties();

		//값을 추가할 때
		//1.setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");

		System.out.println(prop);

		//		값을 얻어올때
		//		2. getProperty(String key)
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("AAA")); // 값이 존재하지 않으면 null
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
