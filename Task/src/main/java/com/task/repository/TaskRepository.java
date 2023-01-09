package com.task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.Task;


public interface TaskRepository extends CrudRepository<Task, Integer> {

}
