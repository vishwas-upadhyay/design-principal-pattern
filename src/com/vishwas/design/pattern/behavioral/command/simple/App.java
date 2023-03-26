package com.vishwas.design.pattern.behavioral.command.simple;

//Client
public class App {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Light light = new Light();
        switcher.addCommand(new TurnOnCommand(light));
        switcher.addCommand(new TurnOffCommand(light));
        switcher.executeCommands();
    }
}
