package com.task.manager.repository;

import org.springframework.data.repository.CrudRepository;

import com.task.manager.dao.TaskDao;

public interface TaskManagerRepository extends CrudRepository<TaskDao, Long>{

}
