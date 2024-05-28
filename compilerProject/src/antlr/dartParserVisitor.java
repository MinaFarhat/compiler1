// Generated from C:/Users/EVO.STORE/IdeaProjects/tasneem/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#plur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlur(dartParser.PlurContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(dartParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bodyClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyClass(dartParser.BodyClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(dartParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(dartParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(dartParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(dartParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(dartParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(dartParser.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(dartParser.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgets(dartParser.WidgetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(dartParser.ChildrenContext ctx);
}