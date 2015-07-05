package com.nowcoder.pat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TestCase> list = new ArrayList<>();
		try {
			int num = Integer.parseInt(input());
			for (int i = 0; i < num; i++) {
				String temp = input();
				String[] t = temp.split(" ");
				long a = Long.parseLong(t[0]);
				long b = Long.parseLong(t[1]);
				long c = Long.parseLong(t[2]);

				TestCase tc = new TestCase(a, b, c);
				list.add(tc);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 1;
		for (TestCase t : list) {
			System.out.println("Case #" + i + ": " + t.ifAplusBgtC());
			i++;
		}
	}

	public static String input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
}

class TestCase {
	private long a;
	private long b;
	private long c;

	public TestCase(long a, long b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean ifAplusBgtC() {
		return (a + b) > c ? true : false;
	}
}
