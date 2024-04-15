// Generated from e:/PLC/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FunctionCraftParser.CommentContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#defaultArgPlural}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArgPlural(FunctionCraftParser.DefaultArgPluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#defaultArgPlural}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArgPlural(FunctionCraftParser.DefaultArgPluralContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(FunctionCraftParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(FunctionCraftParser.CompareContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(FunctionCraftParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(FunctionCraftParser.OperatorContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#arithmaticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmaticOperator(FunctionCraftParser.ArithmaticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arithmaticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmaticOperator(FunctionCraftParser.ArithmaticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(FunctionCraftParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(FunctionCraftParser.RelationalOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFuncDecleration}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFuncDecleration(FunctionCraftParser.LambdaFuncDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFuncDecleration}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFuncDecleration(FunctionCraftParser.LambdaFuncDeclerationContext ctx);
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
	 * Enter a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(FunctionCraftParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FunctionCraftParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FunctionCraftParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
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
}