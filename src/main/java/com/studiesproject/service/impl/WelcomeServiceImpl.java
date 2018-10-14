package com.studiesproject.service.impl;

import com.studiesproject.model.User;
import com.studiesproject.service.WelcomeService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    private List<User> users = new LinkedList<>();

    @Override
    public List<User> processNameForm(User user) {
        users.add(user);
        return users;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
