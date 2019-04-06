package com.likzn.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/5 15:36
 * @description:
 */
public class Staff {
    private List<Command> list = new ArrayList<>();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void executeCommand() {
        for (Command command : list) {
            command.execute();

        }
        list.clear();
    }
}
