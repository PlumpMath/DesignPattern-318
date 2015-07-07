package com.designPattern.filterChain;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequestStr(request.getRequestStr().replace("����", "**"));
		chain.doFilter(request, response, chain);
		response.setResponseStr(response.getResponseStr().replace("yellow", "green"));
	}

}
