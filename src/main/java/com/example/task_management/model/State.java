package com.example.task_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class State {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String code;
	private String description;

}
