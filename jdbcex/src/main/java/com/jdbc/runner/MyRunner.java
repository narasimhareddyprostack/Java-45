package com.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.dao.impl.TestDaoImpl;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	TestDaoImpl dao;
	@Override
	public void run(String... args) throws Exception {
		dao.insertRecords();
		List list = dao.selectData();
		list.forEach(map->System.out.println(map));
	}

}
