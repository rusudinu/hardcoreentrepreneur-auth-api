package com.codingshadows.hardcoreentrepreneur;

import com.codingshadows.hardcoreentrepreneur.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findUserByUsername(String username);

    User findByUserID(String PostID);

    void removeByUserID(String PostID);

}
