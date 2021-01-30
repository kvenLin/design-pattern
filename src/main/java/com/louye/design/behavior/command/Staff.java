package com.louye.design.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: louye
 * @Date: 2021/1/31 00:21
 * @Description:
 */
public class Staff {
     private List<Command> commandList = new ArrayList<Command>();


     public void addCommand(Command command) {
         commandList.add(command);
     }

     public void executeCommands() {
         for (Command command : commandList) {
             command.execute();
         }
         commandList.clear();
     }
}
