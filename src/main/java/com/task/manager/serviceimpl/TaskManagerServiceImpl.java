package com.task.manager.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.manager.dao.TaskDao;
import com.task.manager.repository.TaskManagerRepository;
import com.task.manager.service.TaskManagerService;

@Service
public class TaskManagerServiceImpl implements TaskManagerService {
	
	@Autowired
	private TaskManagerRepository taskRepository;

	@Override
	public List<TaskDao> getAllTasks() {
		System.out.println("Get all sevice:::::::");
		List<TaskDao> taskList = new ArrayList<>();
		taskRepository.findAll()
		.forEach(taskList::add);
		return taskList;
		
	}

	@Override
	public TaskDao getTask(Long taskId) {
		Optional<TaskDao> taskDao = taskRepository.findById(taskId);
		return taskDao.get();
	}
	
	@Override
	public void addTask(TaskDao task) {
		taskRepository.save(task);
	}

	@Override
	public void updateTask(TaskDao task, Long taskId) {
		taskRepository.save(task);
		
	}

	@Override
	public void deleteTask(Long taskId) {
		taskRepository.deleteById(taskId);
		
	}
	
	
}
