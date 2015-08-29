package com.iostream.file;

import java.io.File;
import java.io.FilenameFilter;
/*
 * 一个名称包含contains的过滤器
 */
public class ContainsFilter implements FilenameFilter {
	private String contains;
	public ContainsFilter(String contains) {
		super();
		this.contains = contains;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.contains(contains);
	}

}
