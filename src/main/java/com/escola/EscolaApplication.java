package com.escola;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EscolaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EscolaApplication.class, args);
		log.info("\n------------------------\n"
				+ "   Clean Architecture\n"
				+ "------------------------"
		);

	}

}
