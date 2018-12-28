package com.github.abigail830.mockserversample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class MockServerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockServerSampleApplication.class, args);
	}

}

