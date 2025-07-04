package satyam.projects.reminder_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import satyam.projects.reminder_app.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{}