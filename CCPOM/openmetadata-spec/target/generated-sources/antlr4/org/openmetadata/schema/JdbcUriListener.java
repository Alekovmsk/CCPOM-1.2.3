// Generated from org/openmetadata/schema/JdbcUri.g4 by ANTLR 4.13.1
package org.openmetadata.schema;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JdbcUriParser}.
 */
public interface JdbcUriListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#jdbcUrl}.
	 * @param ctx the parse tree
	 */
	void enterJdbcUrl(JdbcUriParser.JdbcUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#jdbcUrl}.
	 * @param ctx the parse tree
	 */
	void exitJdbcUrl(JdbcUriParser.JdbcUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#schemaTable}.
	 * @param ctx the parse tree
	 */
	void enterSchemaTable(JdbcUriParser.SchemaTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#schemaTable}.
	 * @param ctx the parse tree
	 */
	void exitSchemaTable(JdbcUriParser.SchemaTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(JdbcUriParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(JdbcUriParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(JdbcUriParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(JdbcUriParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(JdbcUriParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(JdbcUriParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JdbcUriParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(JdbcUriParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JdbcUriParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(JdbcUriParser.ServerNameContext ctx);
}