package com.ipv.su.uedis.utils;

import java.util.Collection;


public class Converter {
	
	private Converter() {
		// nop
	}
	
	public static String toString(Collection<String> source, String separator) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for(Object s : source) {
			if(!isFirst) {
				sb.append(separator);
			}
			sb.append(s);
			isFirst = false;
		}
		
		return sb.toString();
	}
}
