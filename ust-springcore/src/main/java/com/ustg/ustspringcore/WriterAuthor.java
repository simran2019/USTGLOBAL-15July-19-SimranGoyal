package com.ustg.ustspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustg.ustspringcore.beans.Author;

public class WriterAuthor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Author.xml");

		Author author = context.getBean(Author.class);

		System.out.println(author.getName());
		author.getWriter().write();

	}

}
