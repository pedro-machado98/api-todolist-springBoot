package br.com.pedromachado.desafiotodolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.pedromachado.desafiotodolist.entity.Todo;

@SpringBootTest
class DesafioTodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;


	@Test
	void testCreateTodoSucess() {
		Todo todo = new Todo("todo 1", "Desc todo 1", false, 4);

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.lenght()").isEqualTo(1)
		.jsonPath("$[0].nome").isEqualTo(todo.getNome())
		.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
		.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
		.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}

	void testCreateTodoFailure() {
	}

}
