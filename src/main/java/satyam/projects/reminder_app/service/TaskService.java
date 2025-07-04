package satyam.projects.reminder_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satyam.projects.reminder_app.model.Task;
import satyam.projects.reminder_app.repository.TaskRepository;

@Service
public class TaskService{

@Autowired
public TaskRepository taskRepository;

public Task addTask(Task task){
    return taskRepository.save(task);
}

}
