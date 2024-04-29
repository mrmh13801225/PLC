// Generated from E:/PLC/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#declerationArg}.
	 * @param ctx the parse tree
	 */
	void enterDeclerationArg(FunctionCraftParser.DeclerationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#declerationArg}.
	 * @param ctx the parse tree
	 */
	void exitDeclerationArg(FunctionCraftParser.DeclerationArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#defaultArg}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArg(FunctionCraftParser.DefaultArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#defaultArg}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArg(FunctionCraftParser.DefaultArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#normalArgs}.
	 * @param ctx the parse tree
	 */
	void enterNormalArgs(FunctionCraftParser.NormalArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#normalArgs}.
	 * @param ctx the parse tree
	 */
	void exitNormalArgs(FunctionCraftParser.NormalArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#defaultArgs}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArgs(FunctionCraftParser.DefaultArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#defaultArgs}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArgs(FunctionCraftParser.DefaultArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#declerationArgs}.
	 * @param ctx the parse tree
	 */
	void enterDeclerationArgs(FunctionCraftParser.DeclerationArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#declerationArgs}.
	 * @param ctx the parse tree
	 */
	void exitDeclerationArgs(FunctionCraftParser.DeclerationArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#patternDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPatternDeclaration(FunctionCraftParser.PatternDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#patternDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPatternDeclaration(FunctionCraftParser.PatternDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecleration(FunctionCraftParser.FunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecleration(FunctionCraftParser.FunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunctionDecleration(FunctionCraftParser.LambdaFunctionDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFunctionDecleration}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunctionDecleration(FunctionCraftParser.LambdaFunctionDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#inputArgs}.
	 * @param ctx the parse tree
	 */
	void enterInputArgs(FunctionCraftParser.InputArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#inputArgs}.
	 * @param ctx the parse tree
	 */
	void exitInputArgs(FunctionCraftParser.InputArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignmentOperators}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperators(FunctionCraftParser.AssignmentOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignmentOperators}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperators(FunctionCraftParser.AssignmentOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(FunctionCraftParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(FunctionCraftParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#directValue}.
	 * @param ctx the parse tree
	 */
	void enterDirectValue(FunctionCraftParser.DirectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#directValue}.
	 * @param ctx the parse tree
	 */
	void exitDirectValue(FunctionCraftParser.DirectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#intVal}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(FunctionCraftParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#intVal}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(FunctionCraftParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#floatVal}.
	 * @param ctx the parse tree
	 */
	void enterFloatVal(FunctionCraftParser.FloatValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#floatVal}.
	 * @param ctx the parse tree
	 */
	void exitFloatVal(FunctionCraftParser.FloatValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVal(FunctionCraftParser.BooleanValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVal(FunctionCraftParser.BooleanValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#listAccess}.
	 * @param ctx the parse tree
	 */
	void enterListAccess(FunctionCraftParser.ListAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#listAccess}.
	 * @param ctx the parse tree
	 */
	void exitListAccess(FunctionCraftParser.ListAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 */
	void enterPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 */
	void exitPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lamdaCall}.
	 * @param ctx the parse tree
	 */
	void enterLamdaCall(FunctionCraftParser.LamdaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lamdaCall}.
	 * @param ctx the parse tree
	 */
	void exitLamdaCall(FunctionCraftParser.LamdaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 */
	void enterBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 */
	void exitBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAppend}.
	 * @param ctx the parse tree
	 */
	void enterExprAppend(FunctionCraftParser.ExprAppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAppend}.
	 * @param ctx the parse tree
	 */
	void exitExprAppend(FunctionCraftParser.ExprAppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAppend_}.
	 * @param ctx the parse tree
	 */
	void enterExprAppend_(FunctionCraftParser.ExprAppend_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAppend_}.
	 * @param ctx the parse tree
	 */
	void exitExprAppend_(FunctionCraftParser.ExprAppend_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(FunctionCraftParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(FunctionCraftParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void enterExprOr_(FunctionCraftParser.ExprOr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprOr_}.
	 * @param ctx the parse tree
	 */
	void exitExprOr_(FunctionCraftParser.ExprOr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(FunctionCraftParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(FunctionCraftParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd_(FunctionCraftParser.ExprAnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAnd_}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd_(FunctionCraftParser.ExprAnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void enterExprEq(FunctionCraftParser.ExprEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprEq}.
	 * @param ctx the parse tree
	 */
	void exitExprEq(FunctionCraftParser.ExprEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprEq_}.
	 * @param ctx the parse tree
	 */
	void enterExprEq_(FunctionCraftParser.ExprEq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprEq_}.
	 * @param ctx the parse tree
	 */
	void exitExprEq_(FunctionCraftParser.ExprEq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprCmp}.
	 * @param ctx the parse tree
	 */
	void enterExprCmp(FunctionCraftParser.ExprCmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprCmp}.
	 * @param ctx the parse tree
	 */
	void exitExprCmp(FunctionCraftParser.ExprCmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprCmp_}.
	 * @param ctx the parse tree
	 */
	void enterExprCmp_(FunctionCraftParser.ExprCmp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprCmp_}.
	 * @param ctx the parse tree
	 */
	void exitExprCmp_(FunctionCraftParser.ExprCmp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAddSub}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FunctionCraftParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAddSub}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FunctionCraftParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprAddSub_}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub_(FunctionCraftParser.ExprAddSub_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprAddSub_}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub_(FunctionCraftParser.ExprAddSub_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprMultDiv}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FunctionCraftParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprMultDiv}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FunctionCraftParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprMultDiv_}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv_(FunctionCraftParser.ExprMultDiv_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprMultDiv_}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv_(FunctionCraftParser.ExprMultDiv_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprUnary}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(FunctionCraftParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprUnary}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(FunctionCraftParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprUnaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryPostfix(FunctionCraftParser.ExprUnaryPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprUnaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryPostfix(FunctionCraftParser.ExprUnaryPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#exprValues}.
	 * @param ctx the parse tree
	 */
	void enterExprValues(FunctionCraftParser.ExprValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#exprValues}.
	 * @param ctx the parse tree
	 */
	void exitExprValues(FunctionCraftParser.ExprValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(FunctionCraftParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(FunctionCraftParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(FunctionCraftParser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(FunctionCraftParser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopDo}.
	 * @param ctx the parse tree
	 */
	void enterLoopDo(FunctionCraftParser.LoopDoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopDo}.
	 * @param ctx the parse tree
	 */
	void exitLoopDo(FunctionCraftParser.LoopDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfLoopStatement(FunctionCraftParser.IfLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfLoopStatement(FunctionCraftParser.IfLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifLoopBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfLoopBlock(FunctionCraftParser.IfLoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifLoopBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfLoopBlock(FunctionCraftParser.IfLoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseifLoopBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifLoopBlock(FunctionCraftParser.ElseifLoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseifLoopBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifLoopBlock(FunctionCraftParser.ElseifLoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseLoopBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseLoopBlock(FunctionCraftParser.ElseLoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseLoopBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseLoopBlock(FunctionCraftParser.ElseLoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#nextif}.
	 * @param ctx the parse tree
	 */
	void enterNextif(FunctionCraftParser.NextifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#nextif}.
	 * @param ctx the parse tree
	 */
	void exitNextif(FunctionCraftParser.NextifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#breakif}.
	 * @param ctx the parse tree
	 */
	void enterBreakif(FunctionCraftParser.BreakifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#breakif}.
	 * @param ctx the parse tree
	 */
	void exitBreakif(FunctionCraftParser.BreakifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FunctionCraftParser.CommentContext ctx);
}