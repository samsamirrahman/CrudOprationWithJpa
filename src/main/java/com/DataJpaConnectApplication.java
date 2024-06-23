package com;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaConnectApplication {

	public static void main(String[] args) {
	    SpringApplication.run(DataJpaConnectApplication.class, args);
	    System.out.println("DataJpaConnectApplication.main()");
	
	}
}
