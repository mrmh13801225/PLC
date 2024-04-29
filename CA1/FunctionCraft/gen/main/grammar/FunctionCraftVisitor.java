// Generated from E:/PLC/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FunctionCraftParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#declerationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclerationArg(FunctionCraftParser.DeclerationArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#defaultArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultArg(FunctionCraftParser.DefaultArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#normalArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalArgs(FunctionCraftParser.NormalArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#defaultArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultArgs(FunctionCraftParser.DefaultArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#declerationArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclerationArgs(FunctionCraftParser.DeclerationArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#patternDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternDeclaration(FunctionCraftParser.PatternDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecleration(FunctionCraftParser.FunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambdaFunctionDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionDecleration(FunctionCraftParser.LambdaFunctionDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#inputArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgs(FunctionCraftParser.InputArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignmentOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperators(FunctionCraftParser.AssignmentOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(FunctionCraftParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#directValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectValue(FunctionCraftParser.DirectValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#intVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(FunctionCraftParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#floatVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVal(FunctionCraftParser.FloatValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#booleanVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVal(FunctionCraftParser.BooleanValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#listAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAccess(FunctionCraftParser.ListAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lamdaCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLamdaCall(FunctionCraftParser.LamdaCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPointer(FunctionCraftParser.FunctionPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAppend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAppend(FunctionCraftParser.ExprAppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAppend_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAppend_(FunctionCraftParser.ExprAppend_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(FunctionCraftParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprOr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr_(FunctionCraftParser.ExprOr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(FunctionCraftParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd_(FunctionCraftParser.ExprAnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(FunctionCraftParser.ExprEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprEq_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq_(FunctionCraftParser.ExprEq_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprCmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCmp(FunctionCraftParser.ExprCmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprCmp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCmp_(FunctionCraftParser.ExprCmp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(FunctionCraftParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprAddSub_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub_(FunctionCraftParser.ExprAddSub_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprMultDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(FunctionCraftParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprMultDiv_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv_(FunctionCraftParser.ExprMultDiv_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(FunctionCraftParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprUnaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryPostfix(FunctionCraftParser.ExprUnaryPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#exprValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValues(FunctionCraftParser.ExprValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FunctionCraftParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(FunctionCraftParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FunctionCraftParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlock(FunctionCraftParser.ElseifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopDo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDo(FunctionCraftParser.LoopDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(FunctionCraftParser.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLoopStatement(FunctionCraftParser.IfLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifLoopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLoopBlock(FunctionCraftParser.IfLoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseifLoopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifLoopBlock(FunctionCraftParser.ElseifLoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseLoopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseLoopBlock(FunctionCraftParser.ElseLoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#nextif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextif(FunctionCraftParser.NextifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#breakif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakif(FunctionCraftParser.BreakifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FunctionCraftParser.CommentContext ctx);
}