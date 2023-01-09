package com.task.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepo;
	
	public List getTasks() {
		ArrayList tasks = new ArrayList();
		taskRepo.findAll().forEach(tasks::add);	
		return tasks;
	}}
