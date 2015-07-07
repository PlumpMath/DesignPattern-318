package com.designPattern.filterChain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	private List<Filter> filters = new ArrayList<Filter>();
	int index = 0;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		if (index == filters.size())
			return;
		Filter filter = filters.get(index);
		index++;
		filter.doFilter(request, response, chain);
	}

}
