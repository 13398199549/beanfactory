package org.framestudy.beanfactory.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties工具类
 * @author DELL
 *
 */
public class PropertisUtils {

	/**
	 * 根据key获取value
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		String value = "";
		Properties property = new Properties();
		InputStream inStream = PropertisUtils.class.getClassLoader().getResourceAsStream("beans.properties");
		try {
			property.load(inStream);
			value = property.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void main(String[] args) {
		PropertisUtils prop = new PropertisUtils();
		System.out.println(prop.getValue("userDaoImpl"));
	}
	
	
	
	
	
}
