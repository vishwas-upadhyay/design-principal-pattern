package com.vishwas.design.pattern.behavioral.command.simple;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Switcher {

    List<Command> commandList;

    public Switcher(){
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command:commandList){
            command.execute();
        }
    }
}
