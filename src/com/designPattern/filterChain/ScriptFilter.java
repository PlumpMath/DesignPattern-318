package com.designPattern.filterChain;

public class ScriptFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String s = request.getRequestStr().replace("<", "[").replace(">", "]");
		request.setRequestStr(s);
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr()+"scriptFilter");
	}


}
