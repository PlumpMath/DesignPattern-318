package com.designPattern.filterChain;

public class DefaultFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		new Servlet().doPost(response, request);
	}

}
