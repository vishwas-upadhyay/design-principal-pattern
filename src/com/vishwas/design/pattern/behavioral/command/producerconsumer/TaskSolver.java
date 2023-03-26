package com.vishwas.design.pattern.behavioral.command.producerconsumer;

//Command
public class TaskSolver implements Command {
    Task task;

    public TaskSolver(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
    task.execute();
    }
}
