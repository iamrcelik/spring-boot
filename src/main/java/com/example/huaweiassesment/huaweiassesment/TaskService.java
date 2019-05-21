package com.example.huaweiassesment.huaweiassesment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public List<String> getAllTopics() {

        List<String> tasks = new ArrayList<>();
            tasks.add("Osman");
            return tasks;
    }

}
