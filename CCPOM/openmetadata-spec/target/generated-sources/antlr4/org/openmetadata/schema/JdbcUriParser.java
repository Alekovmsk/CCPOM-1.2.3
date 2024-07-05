// Generated from org/openmetadata/schema/JdbcUri.g4 by ANTLR 4.13.1
package org.openmetadata.schema;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JdbcUriParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DATABASE_TYPE=3, URI_SEPARATOR=4, PORT_NUMBER=5, IDENTIFIER=6, 
		HOST_NAME=7, IPV4_ADDRESS=8, IPV6_ADDRESS=9, HEXDIGIT=10, CONNECTION_ARG=11, 
		CONNECTION_ARG_INIT=12, PERIOD=13, COLON=14, AMP=15, WS=16;
	public static final int
		RULE_jdbcUrl = 0, RULE_schemaTable = 1, RULE_databaseName = 2, RULE_schemaName = 3, 
		RULE_tableName = 4, RULE_serverName = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"jdbcUrl", "schemaTable", "databaseName", "schemaName", "tableName", 
			"serverName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'jdbc:'", "'/'", null, null, null, null, null, null, null, null, 
			null, "'?'", "'.'", "':'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DATABASE_TYPE", "URI_SEPARATOR", "PORT_NUMBER", "IDENTIFIER", 
			"HOST_NAME", "IPV4_ADDRESS", "IPV6_ADDRESS", "HEXDIGIT", "CONNECTION_ARG", 
			"CONNECTION_ARG_INIT", "PERIOD", "COLON", "AMP", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JdbcUri.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JdbcUriParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JdbcUrlContext extends ParserRuleContext {
		public TerminalNode DATABASE_TYPE() { return getToken(JdbcUriParser.DATABASE_TYPE, 0); }
		public ServerNameContext serverName() {
			return getRuleContext(ServerNameContext.class,0);
		}
		public TerminalNode PORT_NUMBER() { return getToken(JdbcUriParser.PORT_NUMBER, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode CONNECTION_ARG_INIT() { return getToken(JdbcUriParser.CONNECTION_ARG_INIT, 0); }
		public List<TerminalNode> CONNECTION_ARG() { return getTokens(JdbcUriParser.CONNECTION_ARG); }
		public TerminalNode CONNECTION_ARG(int i) {
			return getToken(JdbcUriParser.CONNECTION_ARG, i);
		}
		public SchemaTableContext schemaTable() {
			return getRuleContext(SchemaTableContext.class,0);
		}
		public List<TerminalNode> AMP() { return getTokens(JdbcUriParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(JdbcUriParser.AMP, i);
		}
		public JdbcUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdbcUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterJdbcUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitJdbcUrl(this);
		}
	}

	public final JdbcUrlContext jdbcUrl() throws RecognitionException {
		JdbcUrlContext _localctx = new JdbcUrlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jdbcUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(DATABASE_TYPE);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 912L) != 0)) {
				{
				setState(14);
				serverName();
				}
			}

			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT_NUMBER) {
				{
				setState(17);
				match(PORT_NUMBER);
				}
			}

			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(20);
				match(T__1);
				setState(21);
				databaseName();
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONNECTION_ARG_INIT) {
				{
				setState(24);
				match(CONNECTION_ARG_INIT);
				setState(25);
				match(CONNECTION_ARG);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(26);
					match(AMP);
					setState(27);
					match(CONNECTION_ARG);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(35);
				schemaTable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaTableContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JdbcUriParser.COLON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(JdbcUriParser.PERIOD, 0); }
		public SchemaTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterSchemaTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitSchemaTable(this);
		}
	}

	public final SchemaTableContext schemaTable() throws RecognitionException {
		SchemaTableContext _localctx = new SchemaTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemaTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(COLON);
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(39);
				schemaName();
				setState(40);
				match(PERIOD);
				}
				break;
			}
			setState(44);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdbcUriParser.IDENTIFIER, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitDatabaseName(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_databaseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(46);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdbcUriParser.IDENTIFIER, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitSchemaName(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdbcUriParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServerNameContext extends ParserRuleContext {
		public TerminalNode HOST_NAME() { return getToken(JdbcUriParser.HOST_NAME, 0); }
		public TerminalNode IPV4_ADDRESS() { return getToken(JdbcUriParser.IPV4_ADDRESS, 0); }
		public TerminalNode IPV6_ADDRESS() { return getToken(JdbcUriParser.IPV6_ADDRESS, 0); }
		public TerminalNode URI_SEPARATOR() { return getToken(JdbcUriParser.URI_SEPARATOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JdbcUriParser.IDENTIFIER, 0); }
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).enterServerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdbcUriListener ) ((JdbcUriListener)listener).exitServerName(this);
		}
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_serverName);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(HOST_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(IPV4_ADDRESS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(IPV6_ADDRESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(URI_SEPARATOR);
				setState(57);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(URI_SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0017\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u001d\b\u0000\n\u0000\f\u0000 \t\u0000\u0003\u0000\"\b\u0000"+
		"\u0001\u0000\u0003\u0000%\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0003\u00020\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005<\b\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004"+
		"\u0006\b\n\u0000\u0000C\u0000\f\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b3\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f\r\u0005\u0001"+
		"\u0000\u0000\r\u000f\u0005\u0003\u0000\u0000\u000e\u0010\u0003\n\u0005"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u0013\u0005\u0005\u0000"+
		"\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0002\u0000"+
		"\u0000\u0015\u0017\u0003\u0004\u0002\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017!\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0005\f\u0000\u0000\u0019\u001e\u0005\u000b\u0000\u0000\u001a"+
		"\u001b\u0005\u000f\u0000\u0000\u001b\u001d\u0005\u000b\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\u0018\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#%\u0003\u0002"+
		"\u0001\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&*\u0005\u000e\u0000\u0000\'(\u0003\u0006\u0003"+
		"\u0000()\u0005\r\u0000\u0000)+\u0001\u0000\u0000\u0000*\'\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003"+
		"\b\u0004\u0000-\u0003\u0001\u0000\u0000\u0000.0\u0005\u0006\u0000\u0000"+
		"/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000"+
		"\u0000\u000012\u0005\u0006\u0000\u00002\u0007\u0001\u0000\u0000\u0000"+
		"34\u0005\u0006\u0000\u00004\t\u0001\u0000\u0000\u00005<\u0005\u0007\u0000"+
		"\u00006<\u0005\b\u0000\u00007<\u0005\t\u0000\u000089\u0005\u0004\u0000"+
		"\u00009<\u0005\u0006\u0000\u0000:<\u0005\u0004\u0000\u0000;5\u0001\u0000"+
		"\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;8\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u000b\u0001\u0000\u0000"+
		"\u0000\t\u000f\u0012\u0016\u001e!$*/;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}