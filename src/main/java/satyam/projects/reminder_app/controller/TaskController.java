package satyam.projects.reminder_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import satyam.projects.reminder_app.model.Task;
import satyam.projects.reminder_app.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController{

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask (@RequestBody Task task){
        Task saved = taskService.addTask(task);
        return new ResponseEntity<>(saved,HttpStatus.CREATED);
    }
    
}