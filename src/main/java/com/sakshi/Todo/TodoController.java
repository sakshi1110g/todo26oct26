package com.sakshi.Todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins="*")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service)
    {
        this.service = service;
    }

    @PostMapping("/save")
    public String save(@RequestBody Task t)
    {
        return service.save(t);
    }

    @GetMapping("/findall")
    public List<Task> findAll()
    {
        return service.findAll();
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable int id)
    {
        return service.deleteById(id);
    }
}