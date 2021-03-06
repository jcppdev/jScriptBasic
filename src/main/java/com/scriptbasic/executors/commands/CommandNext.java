package com.scriptbasic.executors.commands;

import com.scriptbasic.api.ScriptBasicException;
import com.scriptbasic.spi.Interpreter;

/**
 * @author Peter Verhas
 * date Jul 20, 2012
 */
public class CommandNext extends AbstractCommand {
    private CommandFor loopStartNode;

    /**
     * @return the loopStartNode
     */
    public CommandFor getLoopStartNode() {
        return loopStartNode;
    }

    /**
     * @param loopStartNode the loopStartNode to set
     */
    public void setLoopStartNode(final CommandFor loopStartNode) {
        this.loopStartNode = loopStartNode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.scriptbasic.executors.commands.AbstractCommand#execute(com.scriptbasic
     * .interfaces.Interpreter)
     */
    @Override
    public void execute(final Interpreter interpreter)
            throws ScriptBasicException {
        loopStartNode.stepLoopVariable(interpreter);
    }
}
