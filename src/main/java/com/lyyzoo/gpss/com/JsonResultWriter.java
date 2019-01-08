package com.lyyzoo.gpss.com;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonResultWriter {
	/**
	 * ��װ���Ĳ��͵��岽��
	 * @param response
	 * @param object
	 * @throws IOException
	 */

	public static void writer(HttpServletResponse response,Object object) throws IOException {

		Gson gson=new Gson();
		String json=gson.toJson(object);
//		4����Ӧ���ݵ����ͺͱ���
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
//		5��
		response.getWriter().print(json);
		response.getWriter().close();

	}

}