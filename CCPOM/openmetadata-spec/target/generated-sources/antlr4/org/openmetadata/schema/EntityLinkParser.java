// Generated from org/openmetadata/schema/EntityLink.g4 by ANTLR 4.13.1
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
public class EntityLinkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ENTITY_TYPE=3, ENTITY_FIELD=4, RESERVED=5, ENTITY_ATTRIBUTE=6, 
		ENTITY_FQN=7;
	public static final int
		RULE_entitylink = 0, RULE_entity = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"entitylink", "entity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<#E'", "'>'", null, null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ENTITY_TYPE", "ENTITY_FIELD", "RESERVED", "ENTITY_ATTRIBUTE", 
			"ENTITY_FQN"
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
	public String getGrammarFileName() { return "EntityLink.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EntityLinkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntitylinkContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EntityLinkParser.EOF, 0); }
		public List<TerminalNode> RESERVED() { return getTokens(EntityLinkParser.RESERVED); }
		public TerminalNode RESERVED(int i) {
			return getToken(EntityLinkParser.RESERVED, i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public EntitylinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entitylink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntitylink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntitylink(this);
		}
	}

	public final EntitylinkContext entitylink() throws RecognitionException {
		EntitylinkContext _localctx = new EntitylinkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entitylink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				match(RESERVED);
				setState(6);
				entity();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RESERVED );
			setState(11);
			match(T__1);
			setState(12);
			match(EOF);
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
	public static class EntityContext extends ParserRuleContext {
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	 
		public EntityContext() { }
		public void copyFrom(EntityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityAttributeContext extends EntityContext {
		public TerminalNode ENTITY_ATTRIBUTE() { return getToken(EntityLinkParser.ENTITY_ATTRIBUTE, 0); }
		public EntityAttributeContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityAttribute(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityTypeContext extends EntityContext {
		public TerminalNode ENTITY_TYPE() { return getToken(EntityLinkParser.ENTITY_TYPE, 0); }
		public EntityTypeContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityFieldContext extends EntityContext {
		public TerminalNode ENTITY_FIELD() { return getToken(EntityLinkParser.ENTITY_FIELD, 0); }
		public EntityFieldContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntityFqnContext extends EntityContext {
		public TerminalNode ENTITY_FQN() { return getToken(EntityLinkParser.ENTITY_FQN, 0); }
		public EntityFqnContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).enterEntityFqn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntityLinkListener ) ((EntityLinkListener)listener).exitEntityFqn(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY_TYPE:
				_localctx = new EntityTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(ENTITY_TYPE);
				}
				break;
			case ENTITY_ATTRIBUTE:
				_localctx = new EntityAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(ENTITY_ATTRIBUTE);
				}
				break;
			case ENTITY_FQN:
				_localctx = new EntityFqnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(ENTITY_FQN);
				}
				break;
			case ENTITY_FIELD:
				_localctx = new EntityFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(ENTITY_FIELD);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0007\u0015\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000"+
		"\f\u0000\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0000\u0000"+
		"\u0002\u0000\u0002\u0000\u0000\u0016\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0007\u0005\u0001\u0000\u0000"+
		"\u0005\u0006\u0005\u0005\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007"+
		"\u0005\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001"+
		"\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0005\u0002\u0000\u0000\f\r\u0005\u0000\u0000\u0001\r\u0001"+
		"\u0001\u0000\u0000\u0000\u000e\u0013\u0005\u0003\u0000\u0000\u000f\u0013"+
		"\u0005\u0006\u0000\u0000\u0010\u0013\u0005\u0007\u0000\u0000\u0011\u0013"+
		"\u0005\u0004\u0000\u0000\u0012\u000e\u0001\u0000\u0000\u0000\u0012\u000f"+
		"\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0002\t\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}