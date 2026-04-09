package com.amir.taskmanager.service;

import com.amir.taskmanager.exception.ResourceNotFoundException;
import com.amir.taskmanager.model.Task;
import com.amir.taskmanager.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepo repo;

    public TaskService(TaskRepo repo) {
        this.repo = repo;
    }

    public Task addTask(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        return repo.save(task);
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public void deleteTask(Long id) {
        Task task1 = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not Found"));
        repo.delete(task1);
    }

    public Task updateTask(Long id, Task task) {
        Task task1 = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not Found"));

        task1.setTitle(task.getTitle());
        task1.setDescription(task.getDescription());
        task1.setStatus(task.getStatus());

        return repo.save(task1);
    }
}
