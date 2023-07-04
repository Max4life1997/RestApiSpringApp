package com.example.springrestapiapp.userController.service;

import com.example.springrestapiapp.userController.entity.UserEntity;
import com.example.springrestapiapp.userController.exceptions.UserAlreadyExistException;
import com.example.springrestapiapp.userController.exceptions.UserNotFoundException;
import com.example.springrestapiapp.userController.model.User;
import com.example.springrestapiapp.userController.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity userEntity) throws UserAlreadyExistException {
        if (userRepo.findByUserName(userEntity.getUserName()) != null) {
            throw new UserAlreadyExistException(String.format("Пользователь %s уже существует", userEntity.getUserName()));
        }
        return userRepo.save(userEntity);
    }

    public User getUserById(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null) {
            throw new UserNotFoundException(String.format("Пользователь c id: %s не найден", id));
        }
        return User.toModel(user);
    }

    public Long deleteUser(Long id) throws UserNotFoundException {
        if (userRepo.findById(id).get() == null) {
            throw new UserNotFoundException(String.format("Пользователь c id: %s не найден", id));
        }
        userRepo.deleteById(id);
        return id;
    }

}
