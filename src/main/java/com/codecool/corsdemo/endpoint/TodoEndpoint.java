package com.codecool.corsdemo.endpoint;

import com.codecool.corsdemo.entity.TodoEntryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("todo")
public class TodoEndpoint {
    @GetMapping
    public List<TodoEntryDto> getCurrentTodos() {
        return List.of(
                new TodoEntryDto().title("Help Marc").description("Figure out how the f***ing CORS stuff works"),
                new TodoEntryDto().title("Dea").description("Answer the remaining 47 questions")
        );
    }
}
