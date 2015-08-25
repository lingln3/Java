package com.generic.demo;

import com.generic.demo.bean.Student;

public class GenericDemo4 {

	public static void main(String[] args) {
		Tool<Student> tool = new Tool<Student>();
		tool.setObject(new Student("hehe",20));
		tool.show(123);
		tool.show("haihai");
		tool.show(new Student("haha",20));
	}

}
