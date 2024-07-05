// Generated from org/openmetadata/schema/Fqn.g4 by ANTLR 4.13.1
package org.openmetadata.schema;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FqnParser}.
 */
public interface FqnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FqnParser#fqn}.
	 * @param ctx the parse tree
	 */
	void enterFqn(FqnParser.FqnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FqnParser#fqn}.
	 * @param ctx the parse tree
	 */
	void exitFqn(FqnParser.FqnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedName}
	 * labeled alternative in {@link FqnParser#name}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedName(FqnParser.UnquotedNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedName}
	 * labeled alternative in {@link FqnParser#name}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedName(FqnParser.UnquotedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedName}
	 * labeled alternative in {@link FqnParser#name}.
	 * @param ctx the parse tree
	 */
	void enterQuotedName(FqnParser.QuotedNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedName}
	 * labeled alternative in {@link FqnParser#name}.
	 * @param ctx the parse tree
	 */
	void exitQuotedName(FqnParser.QuotedNameContext ctx);
}