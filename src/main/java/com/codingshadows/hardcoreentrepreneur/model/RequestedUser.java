package com.codingshadows.hardcoreentrepreneur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestedUser {
    private String username;
    private String password;
}
