package com.lyyzoo.gpss.util;

import java.util.ArrayList;

public class StringUtil {
	/**
	 * �ж��ַ����Ƿ�Ϊ�գ��շ��ؿ�null
	 * @param obj
	 * @return
	 */
	public static String empty(Object obj) 
	{
		return (obj==null||obj=="")?null:obj.toString();
		
	}
	/**
	 * ���ַ���תΪСд
	 */
	public static String lower(String str) {
		return str.toLowerCase();
	}
	/**
	 * ��ajax JSON���л��Ĳ����л��ԭʼ����
	 * @return
	 */
	public static ArrayList getArray(String str) {
	    ArrayList<String> arrs=new ArrayList<>();
	    String newstr = str.substring(1, str.length()-1);
	    String [] arrayStr = newstr.split(",");
	    for(String s : arrayStr) {
	        arrs.add(s.substring(1,s.length()-1));
	    }
	    return arrs;
	}
	/**
     * �Ѷ���ת��Ϊ�ַ��������������null,����null
     */
    public static String valueOf(Object obj) {
        return (obj==null)?null:obj.toString();
    }
	
	
}
