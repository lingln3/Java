package com.generic.demo;

import com.generic.demo.bean.Student;

public class GenericDemo3 {

	public static void main(String[] args) {
		Tool<Student> tool = new Tool<Student>();
		
		tool.setObject(new Student());
		Student st = tool.getObject();
	}

}
