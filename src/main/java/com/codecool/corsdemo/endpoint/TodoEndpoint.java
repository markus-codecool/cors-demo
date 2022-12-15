package com.codecool.corsdemo.endpoint;

import com.codecool.corsdemo.entity.TodoEntryDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoEndpoint {
    @GetMapping("")
    @ResponseBody
    public List<TodoEntryDto> getCurrentTodos() {
        List<TodoEntryDto> result = List.of(
                new TodoEntryDto().setTitle("Help Marc").setDescription("Figure out how the f***ing CORS stuff works"),
                new TodoEntryDto().setTitle("Dea").setDescription("Answer the remaining 47 questions")
        );
        System.out.println(result);
        return result;
    }
}
