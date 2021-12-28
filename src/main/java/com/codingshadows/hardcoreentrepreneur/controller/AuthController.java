package com.codingshadows.hardcoreentrepreneur.controller;

import com.codingshadows.hardcoreentrepreneur.repository.UserRepository;
import com.codingshadows.hardcoreentrepreneur.model.RequestedUser;
import com.codingshadows.hardcoreentrepreneur.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    private final MongoTemplate mongoTemplate;

    @PostMapping("/api/register")
    public User register(@RequestBody RequestedUser requestedUser) {
        User user = userRepository.findUserByUsername(requestedUser.getUsername());
        if (user != null) {
            return new User("ALREADY_EXISTS", "ALREADY_EXISTS", "ALREADY_EXISTS");
        }
        User savedUser = new User(UUID.randomUUID().toString(), requestedUser.getUsername(), requestedUser.getPassword());
        userRepository.save(savedUser);
        return savedUser;
    }

    @GetMapping("/api/auth")
    public User auth(@RequestBody RequestedUser requestedUser) {
        User user = userRepository.findUserByUsername(requestedUser.getUsername());
        if (user == null)
            return null;
        if (user.getPassword().equals(requestedUser.getPassword()))
            return user;
        return null;
    }

    @PostMapping("/api/update")
    public User updateUserData(@RequestBody RequestedUser requestedUser) {
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(requestedUser.getUsername()));
        Update update = new Update();
        update.set("username", requestedUser.getUsername());
        update.set("password", requestedUser.getPassword());
        return mongoTemplate.findAndModify(query, update, User.class);
    }

}
