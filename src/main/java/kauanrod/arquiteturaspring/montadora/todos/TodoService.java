package kauanrod.arquiteturaspring.montadora.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        return repository.save(novoTodo);
    }
}
