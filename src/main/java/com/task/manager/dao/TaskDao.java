package com.task.manager.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TaskDao {

	@Id
	 @Column(name="task_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long taskId;
	 
	 @Column(name="task_name")
	 private String taskName;
	 
	 @Column(name="start_date")
	 private String startDate;
	 
	 @Column(name="end_date")
	 private String endDate;
	 
	 @Column(name="priority")
	 private String priority;
	 
	 @Column(name="status")
	 private String status;
	 
	 @Column(name="parent_task_id")
	 private Long parentTaskId;
	 
//	 @ManyToOne(cascade={CascadeType.MERGE})
//	 @JoinColumn(name="parent_task_id", insertable = true, updatable = true)
//	 private TaskDao parentTask;
//	 
//	 public TaskDao getParentTask() {
//		return parentTask;
//	 }
//	 public void setParentTask(TaskDao parentTask) {
//		this.parentTask = parentTask;
//	 }
	
	 public Long getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(Long parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public TaskDao() {
		 
	 }
	 
	 public TaskDao(String taskName, String startDate, String endDate, String priority, String status) {
		 this.taskName = taskName;
		 this.startDate = startDate;
		 this.endDate = endDate;
		 this.priority = priority;
		 this.status = status;
	 }
	 
		public Long getTaskId() {
			return taskId;
		}
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
		public String getTaskName() {
			return taskName;
		}
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getPriority() {
			return priority;
		}
		public void setPriority(String priority) {
			this.priority = priority;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

}
