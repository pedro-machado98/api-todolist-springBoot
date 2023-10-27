package br.com.pedromachado.desafiotodolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromachado.desafiotodolist.entity.Todo;
import br.com.pedromachado.desafiotodolist.service.TodoService;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController (TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    @Transactional
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> read(){
        return todoService.read();
    }

    @PutMapping
    List<Todo> update(Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
}
