package com.cloud.microservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserPrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String privilegeName;

}
