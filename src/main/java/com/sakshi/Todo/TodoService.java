package com.sakshi.Todo;

import org.springframework.stereotype.*;
import java.util.*;

@Service
public class TodoService {

    private TodoDAO dao;

    public TodoService(TodoDAO dao)
    {
        this.dao = dao;
    }

    public String save(Task t)
    {
        String msg = "";

        try
        {
            dao.save(t);
            msg = "task created";
        }
        catch(Exception e)
        {
            msg = "create issue " + e;
        }

        return msg;
    }

    public List<Task> findAll()
    {
        return dao.findAll();
    }

    public String deleteById(int id)
    {
        String msg = "";

        try
        {
            int n = dao.deleteById(id);

            if (n > 0)
                msg = "task deleted";
            else
                msg = "task not found";
        }
        catch(Exception e)
        {
            msg = "delete issue " + e;
        }

        return msg;
    }
}