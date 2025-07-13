package satyam.projects.reminder_app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String title;
private String description;
private LocalDateTime dueTime;

private boolean isCompleted = false;
private boolean isNotified = false;


public Task(){}

public Task(String title, String description){
    this.title = title;
    this.description = description; 
}

public String getTitle(){
    return title;
}

public String getDescription(){
    return description;
}

public boolean getIsCompleted(){
    return isCompleted;
}

public boolean getIsNotified(){
    return isNotified;
}

public void setDueTime(LocalDateTime dueTime){
    this.dueTime = dueTime;
}

public LocalDateTime getDueTime(){
    return dueTime;
}

public void setIsCompleted(boolean isCompleted){
    this.isCompleted = isCompleted;
}

public void setIsNotified(boolean isNotified){
    this.isNotified = isNotified;
}

}