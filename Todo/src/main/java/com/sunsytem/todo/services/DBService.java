package com.sunsytem.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsytem.todo.domain.Todo;
import com.sunsytem.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository repository;
	
	public void instaciaBaseDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Todo t1 = new Todo(null, "Estuda Bicho!", "Spring Boot", LocalDateTime.parse("17/06/2021 10:20", formatter), false);
		Todo t2 = new Todo(null, "Sai pra lá!!!", "Java Web", LocalDateTime.parse("18/06/2021 14:20", formatter), false);
		Todo t3 = new Todo(null, "Estuda Bicho!", "Eclispe STS", LocalDateTime.parse("19/06/2021 17:20", formatter), true);
		Todo t4 = new Todo(null, "Estuda Bicho!", "Hibernate", LocalDateTime.parse("20/06/2021 21:20", formatter), true);
		repository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
