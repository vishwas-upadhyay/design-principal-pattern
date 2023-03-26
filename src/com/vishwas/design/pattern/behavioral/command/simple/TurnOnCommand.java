package com.vishwas.design.pattern.behavioral.command.simple;

// Command
public class TurnOnCommand implements Command{
    private Light light;
    public TurnOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
