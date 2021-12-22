package com.cloud.microservice.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LoginRequest implements Serializable {

    private String userName;
    private String password;
    
}
