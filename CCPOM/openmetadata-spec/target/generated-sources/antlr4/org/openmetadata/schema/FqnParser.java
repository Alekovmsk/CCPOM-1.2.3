// Generated from org/openmetadata/schema/Fqn.g4 by ANTLR 4.13.1
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
public class FqnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAME=1, NAME_WITH_RESERVED=2, QUOTE=3, NON_RESERVED=4, RESERVED=5;
	public static final int
		RULE_fqn = 0, RULE_name = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"fqn", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\"'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAME", "NAME_WITH_RESERVED", "QUOTE", "NON_RESERVED", "RESERVED"
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
	public String getGrammarFileName() { return "Fqn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FqnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FqnContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode EOF() { return getToken(FqnParser.EOF, 0); }
		public List<TerminalNode> RESERVED() { return getTokens(FqnParser.RESERVED); }
		public TerminalNode RESERVED(int i) {
			return getToken(FqnParser.RESERVED, i);
		}
		public FqnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fqn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).enterFqn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).exitFqn(this);
		}
	}

	public final FqnContext fqn() throws RecognitionException {
		FqnContext _localctx = new FqnContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fqn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			name();
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RESERVED) {
				{
				{
				setState(5);
				match(RESERVED);
				setState(6);
				name();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedNameContext extends NameContext {
		public TerminalNode NAME_WITH_RESERVED() { return getToken(FqnParser.NAME_WITH_RESERVED, 0); }
		public QuotedNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).enterQuotedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).exitQuotedName(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedNameContext extends NameContext {
		public TerminalNode NAME() { return getToken(FqnParser.NAME, 0); }
		public UnquotedNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).enterUnquotedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FqnListener ) ((FqnListener)listener).exitUnquotedName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new UnquotedNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(NAME);
				}
				break;
			case NAME_WITH_RESERVED:
				_localctx = new QuotedNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(NAME_WITH_RESERVED);
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
		"\u0004\u0001\u0005\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000"+
		"\u000b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0011\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0012"+
		"\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000"+
		"\u0004\t\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0005\u0000\u0000\u0006"+
		"\b\u0003\u0002\u0001\u0000\u0007\u0005\u0001\u0000\u0000\u0000\b\u000b"+
		"\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000"+
		"\u0000\u0000\n\f\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000\u0000\u000e\u0011"+
		"\u0005\u0001\u0000\u0000\u000f\u0011\u0005\u0002\u0000\u0000\u0010\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0003"+
		"\u0001\u0000\u0000\u0000\u0002\t\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}