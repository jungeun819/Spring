package com.sh.spring.demo.model.dto;

import java.time.LocalDateTime;
import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//boilerplate - lombok

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dev {
	private int no; //pk
	private String name;
	private int career;
	private String email;
	private Gender gender;
	private String[] lang;
	private LocalDateTime createdAt;
}
