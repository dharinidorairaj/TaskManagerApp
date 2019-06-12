package com.task.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.task.manager.dao.TaskDao;
import com.task.manager.service.TaskManagerService;
import com.task.manager.serviceimpl.TaskManagerServiceImpl;

@RestController
public class TaskManagerController {
	
	@Autowired
	private TaskManagerServiceImpl taskManagerService;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/allTasks")
	public List<TaskDao> getAllTasks(){
		System.out.println("Get all tasks:::::");
		
		return taskManagerService.getAllTasks();
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/allTasks/{taskId}")
	public TaskDao getTask(@PathVariable(name="taskId") Long taskId) {
		return taskManagerService.getTask(taskId);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST,value="/allTasks")
	public void addTask(@RequestBody TaskDao taskDao) {
		taskManagerService.addTask(taskDao);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method=RequestMethod.PUT,value="/allTasks/{taskId}")
	public void updateTask(@RequestBody TaskDao taskDao, @PathVariable Long taskId) {
		System.out.println();
		taskManagerService.addTask(taskDao);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method=RequestMethod.DELETE,value="/allTasks/{taskId}")
	public void deleteTask(@PathVariable Long taskId) {
		taskManagerService.deleteTask(taskId);
	}
	
} 
