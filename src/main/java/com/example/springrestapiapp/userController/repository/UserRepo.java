package com.example.springrestapiapp.userController.repository;


import com.example.springrestapiapp.userController.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserName(String userName);
}
