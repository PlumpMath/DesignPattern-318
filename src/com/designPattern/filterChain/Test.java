package com.designPattern.filterChain;

public class Test {

	public static void main(String[] args) {
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new SensitiveFilter());
		filterChain.addFilter(new ScriptFilter());
		filterChain.addFilter(new DefaultFilter());
		Request request = new Request();
		request.setRequestStr("��Һ�:)��<script>�����У�����ҵ�������ڿ�û�о�����Ϊ��������һ��");
		Response response = new Response();
		filterChain.doFilter(request, response, filterChain);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}