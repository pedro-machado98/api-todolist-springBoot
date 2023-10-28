package br.com.pedromachado.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.pedromachado.desafiotodolist.entity.Todo;
import br.com.pedromachado.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return read();
    }
    
    public List<Todo> read() {
        Sort sort = Sort.by("prioridade").descending();
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return read(); 
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return read();
    }
}
