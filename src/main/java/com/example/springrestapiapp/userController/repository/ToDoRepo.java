package com.example.springrestapiapp.userController.repository;


import com.example.springrestapiapp.userController.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDoEntity, Long> {
}
