package com.example.demo.service;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;

public interface IGreetingService
{
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
