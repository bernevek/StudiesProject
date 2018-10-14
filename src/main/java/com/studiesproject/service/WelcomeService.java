package com.studiesproject.service;

import com.studiesproject.model.User;

import java.util.List;

public interface WelcomeService {
    List<User> processNameForm(User user);

    List<User> getUsers();
}
