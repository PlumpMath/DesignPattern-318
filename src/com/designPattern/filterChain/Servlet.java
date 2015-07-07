package com.designPattern.filterChain;

public class Servlet {
	public void doPost(Response response, Request request) {
		System.out.println(request.getRequestStr());
		response.setResponseStr("do u like yellow?");
	}
}
