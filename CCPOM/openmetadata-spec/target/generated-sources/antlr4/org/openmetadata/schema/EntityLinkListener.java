// Generated from org/openmetadata/schema/EntityLink.g4 by ANTLR 4.13.1
package org.openmetadata.schema;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EntityLinkParser}.
 */
public interface EntityLinkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EntityLinkParser#entitylink}.
	 * @param ctx the parse tree
	 */
	void enterEntitylink(EntityLinkParser.EntitylinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntityLinkParser#entitylink}.
	 * @param ctx the parse tree
	 */
	void exitEntitylink(EntityLinkParser.EntitylinkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entityType}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntityType(EntityLinkParser.EntityTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entityType}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntityType(EntityLinkParser.EntityTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entityAttribute}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntityAttribute(EntityLinkParser.EntityAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entityAttribute}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntityAttribute(EntityLinkParser.EntityAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entityFqn}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntityFqn(EntityLinkParser.EntityFqnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entityFqn}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntityFqn(EntityLinkParser.EntityFqnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entityField}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntityField(EntityLinkParser.EntityFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entityField}
	 * labeled alternative in {@link EntityLinkParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntityField(EntityLinkParser.EntityFieldContext ctx);
}