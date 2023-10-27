package br.com.pedromachado.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedromachado.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
