package org.framestudy.beanfactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
	/**
	 * 根据要求，创建对象
	 * @param str 传入创建对象的类型的全路径
	 * @return
	 */
	public static Object getBean(String str) {
		Object obj = null;
		try {
			if(str.contains("-->")) {
				String[] strs = str.split("-->");
				Map<String,Object> objMap = new HashMap<>();
				
				for (String clsString : strs) {
					Class<?> cls = Class.forName(clsString);
					Object obj01 = cls.newInstance();
					objMap.put(clsString, obj01);
				}
				//建立关系
				obj = objMap.get(strs[0]);//service
				Field field = obj.getClass().getDeclaredField("userDaoImpl");
				field.setAccessible(true);
				field.set(obj, objMap.get(strs[1]));//就是将dao赋值给service
			}else {
				Class<?> cls = Class.forName(str);
				obj = cls.newInstance();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	} 
	
	
	
	
	
	
	
	
}
