package com.codingshadows.hardcoreentrepreneur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "he_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String userID;
    private String username;
    private String password;
}
