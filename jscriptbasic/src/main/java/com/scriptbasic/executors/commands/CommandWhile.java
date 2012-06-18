package com.scriptbasic.executors.commands;

import com.scriptbasic.interfaces.Command;
import com.scriptbasic.interfaces.Expression;
import com.scriptbasic.interfaces.ExtendedInterpreter;

public class CommandWhile extends AbstractCommand {
    private Command wendNode;

    public Command getWendNode() {
        return wendNode;
    }

    public void setWendNode(Command wendNode) {
        this.wendNode = wendNode;
    }

    private Expression condition;

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public void execute(final ExtendedInterpreter interpreter) {
        // TODO Auto-generated method stub
    }

}