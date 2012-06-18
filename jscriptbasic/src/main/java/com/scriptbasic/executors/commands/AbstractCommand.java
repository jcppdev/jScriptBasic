package com.scriptbasic.executors.commands;

import com.scriptbasic.interfaces.Command;
import com.scriptbasic.interfaces.Executor;
import com.scriptbasic.interfaces.ExtendedInterpreter;
import com.scriptbasic.interfaces.NestedStructure;

public abstract class AbstractCommand implements Executor, Command,
        NestedStructure {

    @Override
    public abstract void execute(ExtendedInterpreter interpreter);

    private Command nextCommand;

    /**
     * Get the next command that has to be executed unless some condition alters
     * this, like in case of If, While and similar.
     * 
     * @return
     */
    public Command getNextCommand() {
        return nextCommand;
    }

    public void setNextCommand(Command nextCommand) {
        this.nextCommand = nextCommand;
    }
}