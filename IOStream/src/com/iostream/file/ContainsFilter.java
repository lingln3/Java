package com.iostream.file;

import java.io.File;
import java.io.FilenameFilter;
/*
 * һ�����ư���contains�Ĺ�����
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
