package com.scriptbasic.executors.operators;

import com.scriptbasic.spi.Interpreter;
import com.scriptbasic.spi.RightValue;
import com.scriptbasic.api.ScriptBasicException;
import com.scriptbasic.executors.rightvalues.BasicDoubleValue;
import com.scriptbasic.executors.rightvalues.BasicLongValue;
import com.scriptbasic.interfaces.*;

public class UnaryOperatorMinus extends AbstractUnaryOperator {

    @Override
    public RightValue evaluate(final Interpreter interpreter)
            throws ScriptBasicException {
        final var operand = getOperand();
        final var rightValue = operand.evaluate(interpreter);
        RightValue result = null;
        if (!rightValue.isNumeric()) {
            throw new BasicRuntimeException(
                    "Unary minus operator applied to non numeric value");

        }
        if (rightValue.isDouble()) {
            result = new BasicDoubleValue(-1
                    * ((BasicDoubleValue) rightValue).getValue());
        } else if (rightValue.isLong()) {
            result = new BasicLongValue(-1
                    * ((BasicLongValue) rightValue).getValue());
        }
        return result;
    }
}
