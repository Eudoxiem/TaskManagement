package com.example.task_management.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class UserTask {
	
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Date assignationDate;
@ManyToOne
private User user;
@ManyToOne
private Task task;

}
