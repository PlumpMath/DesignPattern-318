package com.designPattern.filterChain;

public class Test {

	public static void main(String[] args) {
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new SensitiveFilter());
		filterChain.addFilter(new ScriptFilter());
		filterChain.addFilter(new DefaultFilter());
		Request request = new Request();
		request.setRequestStr("大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿");
		Response response = new Response();
		filterChain.doFilter(request, response, filterChain);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
