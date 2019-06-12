package com.task.manager.service;

import java.util.List;

import com.task.manager.dao.TaskDao;

public interface TaskManagerService {
	
	//This method is used to get all the tasks
	public List<TaskDao> getAllTasks();
	public TaskDao getTask(Long taskId);
	public void addTask(TaskDao task);
	public void updateTask(TaskDao task, Long taskId);
	public void deleteTask(Long taskId);
}
