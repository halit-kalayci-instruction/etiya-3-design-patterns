package org.example.behavorial.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> commands = new ArrayList<>();

    public void addCommandToQuery(Command command)
    {
        commands.add(command);
    }

    public void executeAll()
    {
        for(Command command: commands) {
            command.execute();
        }
        commands.clear();
    }
}
