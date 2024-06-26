package com.example.EmployeeApp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeAppConfig {
// 3rd party API so we need to create a Bean for ModelMapper..
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
