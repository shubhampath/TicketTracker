package com.tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private String userType;
}
