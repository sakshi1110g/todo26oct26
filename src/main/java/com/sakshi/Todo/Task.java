package com.sakshi.Todo;

public class Task
{
    private Integer id;
    private String task;

    public Task() { }

    public Task(Integer id, String task)
    {
        this.id = id;
        this.task = task;
    }

    // getters or accessor
    public Integer getId() { return id; }
    public String getTask() { return task; }

    // setters or mutators
    public void setId(Integer id) { this.id = id; }
    public void setTask(String task) { this.task = task; }
}