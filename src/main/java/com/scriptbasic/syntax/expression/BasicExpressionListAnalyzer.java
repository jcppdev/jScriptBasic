package com.scriptbasic.syntax.expression;

import com.scriptbasic.context.Context;
import com.scriptbasic.executors.GenericExpressionList;
import com.scriptbasic.interfaces.*;
import com.scriptbasic.syntax.AbstractGenericListAnalyzer;

public final class BasicExpressionListAnalyzer
        extends
        AbstractGenericListAnalyzer<ExpressionList, GenericExpressionList, Expression, ExpressionAnalyzer>
        implements ExpressionListAnalyzer {

    public BasicExpressionListAnalyzer(final Context ctx) {
        super(ctx);
    }

    @Override
    public ExpressionList analyze() throws AnalysisException {
        return super.analyze(new GenericExpressionList(), ctx.expressionAnalyzer);
    }

}
