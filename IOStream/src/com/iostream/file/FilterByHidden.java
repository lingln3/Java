package com.iostream.file;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter {
/*
 * �ļ����ˣ��ҳ��������ļ�
 * @see java.io.FileFilter#accept(java.io.File)
 */
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isHidden();
	}

}
