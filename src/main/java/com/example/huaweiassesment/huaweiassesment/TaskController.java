package com.example.huaweiassesment.huaweiassesment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController{

    @Autowired
    private TaskService taskService;

    @RequestMapping("/tasks")
	public List<String> getAllTopics() {
    	
    	return taskService.getAllTopics();
    		
	}

}