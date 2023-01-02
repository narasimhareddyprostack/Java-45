package com.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.dao.TestDao;
@Repository
public class TestDaoImpl implements TestDao {
	@Autowired
	JdbcTemplate jt;
	@Override
	public void insertRecords() {
		jt.update("insert into emp values(104,'Modi', 55000)");
		jt.update("insert into emp values(105,'Shaw', 65000)");

	}

	@Override
	public List selectData() {
		return jt.queryForList("select * from emp");
	}

}
