package com.sakshi.Todo;

import org.springframework.stereotype.*;
import java.util.*;
import org.springframework.jdbc.core.*;

@Repository
public class TodoDAO {

    private JdbcTemplate jt;

    public TodoDAO(JdbcTemplate jt)
    {
        this.jt = jt;
    }

    public int save(Task t)
    {
        String sql = "insert into task(task) values(?)";

        return jt.update(sql, t.getTask());
    }

    public List<Task> findAll()
    {
        String sql = "select id, task from task";

        return jt.query(sql,
                new BeanPropertyRowMapper<>(Task.class));
    }

    public int deleteById(int id)
    {
        String sql = "delete from task where id=?";

        return jt.update(sql, id);
    }
}