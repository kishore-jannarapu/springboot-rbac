package com.cloud.microservice.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtResponse {
    private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
}
