package com.iostream.file2;

import java.io.File;
import java.io.FilenameFilter;

public class FilterJava implements FilenameFilter {
	private String suffix;
	
	public FilterJava(String name) {
		super();
		this.suffix = name;
	}

	@Override
	public boolean accept(File dir, String name) {
//		System.out.println(dir.getName()+":"+name);
		return name.endsWith(suffix);
	}

}
