package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	TaskService taskService;
	
	//localhost:8080/api/tasks
	@GetMapping("/tasks")
	public List getTask() {
		System.out.println("Test Case 123 - Controller");
		return taskService.getTasks();
	}
}
