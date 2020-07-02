package com.nayaz.restwebservices.restfulwebservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nayaz.restwebservices.restfulwebservices.beans.Todo;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;

	static {

		todos.add(new Todo(++idCounter, "nayazjh", "Learn Python", new Date(), false));
		todos.add(new Todo(++idCounter, "nayazjh", "Learn Spring Boot", new Date(), false));
		todos.add(new Todo(++idCounter, "nayazjh", "Learn Micro Services", new Date(), false));
		todos.add(new Todo(++idCounter, "nayazjh", "Learn Angular", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
			
		}else {
			deleteTodoById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteTodoById(long id) {
		Todo todo = findById(id);
		if (todo == null)
			return null;
		if (todos.remove(todo)) {
			return todo;
		}
		return null;

	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
