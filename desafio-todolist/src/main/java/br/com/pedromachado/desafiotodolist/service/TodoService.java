package br.com.pedromachado.desafiotodolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pedromachado.desafiotodolist.entity.Todo;
import br.com.pedromachado.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {


    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create() {
        
    }
    
    public List<Todo> read() {
        
    }

    public List<Todo> update() {
        
    }

    public List<Todo> delete() {
        
    }
}
