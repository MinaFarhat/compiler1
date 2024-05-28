// Generated from C:/Users/EVO.STORE/IdeaProjects/tasneem/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, IMPORT_=2, TRY=3, CATCH=4, EQUALS=5, PLUS_EQUALS=6, MINUS_EQUALS=7, 
		TIMES_EQUALS=8, DIVIDE_EQUALS=9, MODULO_EQUALS=10, PLUS=11, MINUS=12, 
		TIMES=13, DIVIDE=14, MODULO=15, AND=16, OR=17, NOT=18, EQUAL_TO=19, NOT_EQUAL_TO=20, 
		GREATER_THAN=21, GREATER_THAN_OR_EQUAL_TO=22, LESS_THAN=23, LESS_THAN_OR_EQUAL_TO=24, 
		FINA=25, CBracketC=26, COMMA=27, Dot=28, TWODOT=29, CHILD=30, OSP=31, 
		CSP=32, OP=33, CP=34, SINGLE_QUOTE=35, SemiC=36, Name=37, OBracketC=38, 
		Newline=39, Whitespace=40, FINAL=41, CLass_Name_Constructor=42, Semicc=43, 
		LineBODY=44, SpaceBody=45, WIDGET=46, BUILDM=47, CONTAINAR=48, Row=49, 
		BUILDContext=50, Context=51, Return=52, Scaffold=53, COLUMN=54, GESTUREDETECTOR=55, 
		CARD=56, Text=57, OPenContext=58, CloseContext=59, COMMAWidget=60, SpaceBuild=61, 
		LineIntoBuild=62, OPENCYRBRWIDGETtree=63, SemiCIntoBuild=64, CSPChildrenRow=65, 
		OSPChildren=66, TWODOTCARD=67, ONTAP=68, CloseCYRBRWIDGETtree=69, CloseRow=70, 
		SemiCrow=71, CPCARD=72, CloseRowWidget=73, DecorationContainer=74, INT=75, 
		STRING=76, LIST=77, BOOLEAN=78, SpaceBodyDeclare=79, NAMEVARIABLE=80, 
		SemiDeclareVariable=81, Overridemethod=82, INHERITS_KEYWORD=83, CLASS_NAME=84, 
		Space=85, LineClass=86, OBC=87, CBC=88, THIS=89, OP_Constructor=90, DotData=91, 
		NAMEDATA=92, COMMAData=93, CloseConstructorss=94, SemiData=95, SpaceBodyCC=96, 
		OPCARD=97, CHILDCARD=98, SemiCcard=99, LineCard=100, OPScaffold=101, BodyScaffold=102, 
		TWODOTScaffold=103, CPScaffold=104, SemiCScaffold=105, LineScaffold=106, 
		OPGESTUREDETECTOR=107, CHILDGesture=108, TWODOTGestureDetector=109, CPGESTUREDETECTOR=110, 
		SemiCGESTUREDETECTOR=111, OPText=112, SingleQ=113, InputIntoText=114, 
		SpaceText=115, CPText=116, TWODOTTEXT=117, CHILDRENColumn=118, OPCOLUMN=119, 
		OSPChildrenColumn=120, TWODOTChildrenColumn=121, CPColumn=122, CSPChildrenColumn=123, 
		SemiCcolumn=124, LineColumn=125, SpaceContainer=126, OPContainer=127, 
		CHILDContainer=128, TWODOTCONTAINER=129, LineIntoContainer=130, CPContainer=131, 
		SemiCcontainer=132, OPENROW=133, CHILDRENRow=134, TWODOTChildren=135, 
		LineRow=136;
	public static final int
		RULE_plur = 0, RULE_class = 1, RULE_bodyClass = 2, RULE_body = 3, RULE_constructor = 4, 
		RULE_data = 5, RULE_declareVariable = 6, RULE_dataType = 7, RULE_widget = 8, 
		RULE_scaffold = 9, RULE_build = 10, RULE_return = 11, RULE_row = 12, RULE_column = 13, 
		RULE_text = 14, RULE_container = 15, RULE_gestureDetector = 16, RULE_card = 17, 
		RULE_onTap = 18, RULE_child = 19, RULE_widgets = 20, RULE_children = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"plur", "class", "bodyClass", "body", "constructor", "data", "declareVariable", 
			"dataType", "widget", "scaffold", "build", "return", "row", "column", 
			"text", "container", "gestureDetector", "card", "onTap", "child", "widgets", 
			"children"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'import'", "'try'", "'catch'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", null, "'}'", null, 
			"'.'", null, null, "'['", "']'", "'('", "')'", "'''", "';'", null, "'{'", 
			null, null, null, null, null, null, null, "'Widget'", "'build'", "'Container'", 
			"'Row'", "'BuildContext'", "'context'", "'return'", "'Scaffold'", "'Column'", 
			"'GestureDetector'", "'Card'", "'Text'", null, null, null, null, null, 
			null, null, null, null, null, "'onTap'", null, null, null, null, null, 
			"'decoration'", "'int'", "'String'", "'List'", "'boolean'", null, null, 
			null, "'@override'", "'extends'", null, null, null, null, null, "'this'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'body'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "IMPORT_", "TRY", "CATCH", "EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", 
			"TIMES_EQUALS", "DIVIDE_EQUALS", "MODULO_EQUALS", "PLUS", "MINUS", "TIMES", 
			"DIVIDE", "MODULO", "AND", "OR", "NOT", "EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN", 
			"GREATER_THAN_OR_EQUAL_TO", "LESS_THAN", "LESS_THAN_OR_EQUAL_TO", "FINA", 
			"CBracketC", "COMMA", "Dot", "TWODOT", "CHILD", "OSP", "CSP", "OP", "CP", 
			"SINGLE_QUOTE", "SemiC", "Name", "OBracketC", "Newline", "Whitespace", 
			"FINAL", "CLass_Name_Constructor", "Semicc", "LineBODY", "SpaceBody", 
			"WIDGET", "BUILDM", "CONTAINAR", "Row", "BUILDContext", "Context", "Return", 
			"Scaffold", "COLUMN", "GESTUREDETECTOR", "CARD", "Text", "OPenContext", 
			"CloseContext", "COMMAWidget", "SpaceBuild", "LineIntoBuild", "OPENCYRBRWIDGETtree", 
			"SemiCIntoBuild", "CSPChildrenRow", "OSPChildren", "TWODOTCARD", "ONTAP", 
			"CloseCYRBRWIDGETtree", "CloseRow", "SemiCrow", "CPCARD", "CloseRowWidget", 
			"DecorationContainer", "INT", "STRING", "LIST", "BOOLEAN", "SpaceBodyDeclare", 
			"NAMEVARIABLE", "SemiDeclareVariable", "Overridemethod", "INHERITS_KEYWORD", 
			"CLASS_NAME", "Space", "LineClass", "OBC", "CBC", "THIS", "OP_Constructor", 
			"DotData", "NAMEDATA", "COMMAData", "CloseConstructorss", "SemiData", 
			"SpaceBodyCC", "OPCARD", "CHILDCARD", "SemiCcard", "LineCard", "OPScaffold", 
			"BodyScaffold", "TWODOTScaffold", "CPScaffold", "SemiCScaffold", "LineScaffold", 
			"OPGESTUREDETECTOR", "CHILDGesture", "TWODOTGestureDetector", "CPGESTUREDETECTOR", 
			"SemiCGESTUREDETECTOR", "OPText", "SingleQ", "InputIntoText", "SpaceText", 
			"CPText", "TWODOTTEXT", "CHILDRENColumn", "OPCOLUMN", "OSPChildrenColumn", 
			"TWODOTChildrenColumn", "CPColumn", "CSPChildrenColumn", "SemiCcolumn", 
			"LineColumn", "SpaceContainer", "OPContainer", "CHILDContainer", "TWODOTCONTAINER", 
			"LineIntoContainer", "CPContainer", "SemiCcontainer", "OPENROW", "CHILDRENRow", 
			"TWODOTChildren", "LineRow"
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
	public String getGrammarFileName() { return "dartParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PlurContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public PlurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPlur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPlur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPlur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlurContext plur() throws RecognitionException {
		PlurContext _localctx = new PlurContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			class_();
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dartParser.CLASS, 0); }
		public List<TerminalNode> Space() { return getTokens(dartParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(dartParser.Space, i);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(dartParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(dartParser.CLASS_NAME, i);
		}
		public TerminalNode INHERITS_KEYWORD() { return getToken(dartParser.INHERITS_KEYWORD, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode LineBODY() { return getToken(dartParser.LineBODY, 0); }
		public BodyClassContext bodyClass() {
			return getRuleContext(BodyClassContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CLASS);
			setState(47);
			match(Space);
			setState(48);
			match(CLASS_NAME);
			setState(49);
			match(Space);
			setState(50);
			match(INHERITS_KEYWORD);
			setState(51);
			match(Space);
			setState(52);
			match(CLASS_NAME);
			setState(53);
			match(Space);
			setState(54);
			match(OBC);
			setState(55);
			match(LineBODY);
			setState(56);
			bodyClass();
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

	public static class BodyClassContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public List<DeclareVariableContext> declareVariable() {
			return getRuleContexts(DeclareVariableContext.class);
		}
		public DeclareVariableContext declareVariable(int i) {
			return getRuleContext(DeclareVariableContext.class,i);
		}
		public BodyClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBodyClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBodyClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBodyClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyClassContext bodyClass() throws RecognitionException {
		BodyClassContext _localctx = new BodyClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bodyClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				declareVariable();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FINAL );
			setState(63);
			constructor();
			setState(64);
			build();
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

	public static class BodyContext extends ParserRuleContext {
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			widgets();
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CLass_Name_Constructor() { return getToken(dartParser.CLass_Name_Constructor, 0); }
		public TerminalNode OP_Constructor() { return getToken(dartParser.OP_Constructor, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode CloseConstructorss() { return getToken(dartParser.CloseConstructorss, 0); }
		public TerminalNode Semicc() { return getToken(dartParser.Semicc, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CLass_Name_Constructor);
			setState(69);
			match(OP_Constructor);
			setState(70);
			data();
			setState(71);
			match(CloseConstructorss);
			setState(72);
			match(Semicc);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(dartParser.THIS, 0); }
		public TerminalNode DotData() { return getToken(dartParser.DotData, 0); }
		public TerminalNode NAMEDATA() { return getToken(dartParser.NAMEDATA, 0); }
		public List<TerminalNode> COMMAData() { return getTokens(dartParser.COMMAData); }
		public TerminalNode COMMAData(int i) {
			return getToken(dartParser.COMMAData, i);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(THIS);
			setState(75);
			match(DotData);
			setState(76);
			match(NAMEDATA);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(COMMAData);
					setState(78);
					data();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class DeclareVariableContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(dartParser.FINAL, 0); }
		public List<TerminalNode> SpaceBodyDeclare() { return getTokens(dartParser.SpaceBodyDeclare); }
		public TerminalNode SpaceBodyDeclare(int i) {
			return getToken(dartParser.SpaceBodyDeclare, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NAMEVARIABLE() { return getToken(dartParser.NAMEVARIABLE, 0); }
		public TerminalNode SemiDeclareVariable() { return getToken(dartParser.SemiDeclareVariable, 0); }
		public TerminalNode LineBODY() { return getToken(dartParser.LineBODY, 0); }
		public DeclareVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDeclareVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDeclareVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVariableContext declareVariable() throws RecognitionException {
		DeclareVariableContext _localctx = new DeclareVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declareVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FINAL);
			setState(85);
			match(SpaceBodyDeclare);
			setState(86);
			dataType();
			setState(87);
			match(SpaceBodyDeclare);
			setState(88);
			match(NAMEVARIABLE);
			setState(89);
			match(SemiDeclareVariable);
			setState(90);
			match(LineBODY);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public TerminalNode STRING() { return getToken(dartParser.STRING, 0); }
		public TerminalNode LIST() { return getToken(dartParser.LIST, 0); }
		public TerminalNode BOOLEAN() { return getToken(dartParser.BOOLEAN, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (INT - 75)) | (1L << (STRING - 75)) | (1L << (LIST - 75)) | (1L << (BOOLEAN - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WidgetContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_widget);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				container();
				}
				break;
			case Row:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				row();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				column();
				}
				break;
			case Scaffold:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				scaffold();
				}
				break;
			case GESTUREDETECTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				gestureDetector();
				}
				break;
			case Text:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				text();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				card();
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

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode Scaffold() { return getToken(dartParser.Scaffold, 0); }
		public TerminalNode OPScaffold() { return getToken(dartParser.OPScaffold, 0); }
		public TerminalNode LineScaffold() { return getToken(dartParser.LineScaffold, 0); }
		public TerminalNode BodyScaffold() { return getToken(dartParser.BodyScaffold, 0); }
		public TerminalNode TWODOTScaffold() { return getToken(dartParser.TWODOTScaffold, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode LineIntoBuild() { return getToken(dartParser.LineIntoBuild, 0); }
		public TerminalNode CloseContext() { return getToken(dartParser.CloseContext, 0); }
		public TerminalNode SemiCIntoBuild() { return getToken(dartParser.SemiCIntoBuild, 0); }
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scaffold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Scaffold);
			setState(104);
			match(OPScaffold);
			setState(105);
			match(LineScaffold);
			setState(106);
			match(BodyScaffold);
			setState(107);
			match(TWODOTScaffold);
			setState(108);
			widget();
			setState(109);
			match(LineIntoBuild);
			setState(110);
			match(CloseContext);
			setState(111);
			match(SemiCIntoBuild);
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

	public static class BuildContext extends ParserRuleContext {
		public TerminalNode LineClass() { return getToken(dartParser.LineClass, 0); }
		public TerminalNode Overridemethod() { return getToken(dartParser.Overridemethod, 0); }
		public List<TerminalNode> LineIntoBuild() { return getTokens(dartParser.LineIntoBuild); }
		public TerminalNode LineIntoBuild(int i) {
			return getToken(dartParser.LineIntoBuild, i);
		}
		public TerminalNode WIDGET() { return getToken(dartParser.WIDGET, 0); }
		public List<TerminalNode> SpaceBuild() { return getTokens(dartParser.SpaceBuild); }
		public TerminalNode SpaceBuild(int i) {
			return getToken(dartParser.SpaceBuild, i);
		}
		public TerminalNode BUILDM() { return getToken(dartParser.BUILDM, 0); }
		public TerminalNode OPenContext() { return getToken(dartParser.OPenContext, 0); }
		public TerminalNode BUILDContext() { return getToken(dartParser.BUILDContext, 0); }
		public TerminalNode Context() { return getToken(dartParser.Context, 0); }
		public TerminalNode CloseContext() { return getToken(dartParser.CloseContext, 0); }
		public TerminalNode OPENCYRBRWIDGETtree() { return getToken(dartParser.OPENCYRBRWIDGETtree, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode CloseCYRBRWIDGETtree() { return getToken(dartParser.CloseCYRBRWIDGETtree, 0); }
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LineClass);
			setState(114);
			match(Overridemethod);
			setState(115);
			match(LineIntoBuild);
			setState(116);
			match(WIDGET);
			setState(117);
			match(SpaceBuild);
			setState(118);
			match(BUILDM);
			setState(119);
			match(OPenContext);
			setState(120);
			match(BUILDContext);
			setState(121);
			match(SpaceBuild);
			setState(122);
			match(Context);
			setState(123);
			match(CloseContext);
			setState(124);
			match(SpaceBuild);
			setState(125);
			match(OPENCYRBRWIDGETtree);
			setState(126);
			match(LineIntoBuild);
			setState(127);
			return_();
			setState(128);
			match(CloseCYRBRWIDGETtree);
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

	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(dartParser.Return, 0); }
		public TerminalNode SpaceBuild() { return getToken(dartParser.SpaceBuild, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Return);
			setState(131);
			match(SpaceBuild);
			setState(132);
			widget();
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode Row() { return getToken(dartParser.Row, 0); }
		public TerminalNode OPENROW() { return getToken(dartParser.OPENROW, 0); }
		public TerminalNode LineRow() { return getToken(dartParser.LineRow, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode LineIntoBuild() { return getToken(dartParser.LineIntoBuild, 0); }
		public TerminalNode CloseContext() { return getToken(dartParser.CloseContext, 0); }
		public TerminalNode SemiCIntoBuild() { return getToken(dartParser.SemiCIntoBuild, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(Row);
			setState(135);
			match(OPENROW);
			setState(136);
			match(LineRow);
			setState(137);
			children();
			setState(138);
			match(LineIntoBuild);
			setState(139);
			match(CloseContext);
			setState(140);
			match(SemiCIntoBuild);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(dartParser.COLUMN, 0); }
		public TerminalNode OPCOLUMN() { return getToken(dartParser.OPCOLUMN, 0); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TerminalNode CPColumn() { return getToken(dartParser.CPColumn, 0); }
		public TerminalNode SemiCcolumn() { return getToken(dartParser.SemiCcolumn, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(COLUMN);
			setState(143);
			match(OPCOLUMN);
			setState(144);
			children();
			setState(145);
			match(CPColumn);
			setState(146);
			match(SemiCcolumn);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(dartParser.Text, 0); }
		public TerminalNode OPText() { return getToken(dartParser.OPText, 0); }
		public List<TerminalNode> SingleQ() { return getTokens(dartParser.SingleQ); }
		public TerminalNode SingleQ(int i) {
			return getToken(dartParser.SingleQ, i);
		}
		public TerminalNode InputIntoText() { return getToken(dartParser.InputIntoText, 0); }
		public TerminalNode CPText() { return getToken(dartParser.CPText, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Text);
			setState(149);
			match(OPText);
			setState(150);
			match(SingleQ);
			setState(151);
			match(InputIntoText);
			setState(152);
			match(SingleQ);
			setState(153);
			match(CPText);
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

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINAR() { return getToken(dartParser.CONTAINAR, 0); }
		public List<TerminalNode> SpaceContainer() { return getTokens(dartParser.SpaceContainer); }
		public TerminalNode SpaceContainer(int i) {
			return getToken(dartParser.SpaceContainer, i);
		}
		public TerminalNode OPContainer() { return getToken(dartParser.OPContainer, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CPContainer() { return getToken(dartParser.CPContainer, 0); }
		public List<TerminalNode> SemiCIntoBuild() { return getTokens(dartParser.SemiCIntoBuild); }
		public TerminalNode SemiCIntoBuild(int i) {
			return getToken(dartParser.SemiCIntoBuild, i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CONTAINAR);
			setState(156);
			match(SpaceContainer);
			setState(157);
			match(OPContainer);
			setState(158);
			match(SpaceContainer);
			setState(159);
			child();
			setState(160);
			match(CPContainer);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiCIntoBuild) {
				{
				{
				setState(161);
				match(SemiCIntoBuild);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GESTUREDETECTOR() { return getToken(dartParser.GESTUREDETECTOR, 0); }
		public TerminalNode OPGESTUREDETECTOR() { return getToken(dartParser.OPGESTUREDETECTOR, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CPGESTUREDETECTOR() { return getToken(dartParser.CPGESTUREDETECTOR, 0); }
		public TerminalNode SemiCGESTUREDETECTOR() { return getToken(dartParser.SemiCGESTUREDETECTOR, 0); }
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gestureDetector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(GESTUREDETECTOR);
			setState(168);
			match(OPGESTUREDETECTOR);
			setState(169);
			child();
			setState(170);
			match(CPGESTUREDETECTOR);
			setState(171);
			match(SemiCGESTUREDETECTOR);
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

	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(dartParser.CARD, 0); }
		public TerminalNode OPCARD() { return getToken(dartParser.OPCARD, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode LineIntoBuild() { return getToken(dartParser.LineIntoBuild, 0); }
		public TerminalNode CloseContext() { return getToken(dartParser.CloseContext, 0); }
		public List<TerminalNode> SemiCcard() { return getTokens(dartParser.SemiCcard); }
		public TerminalNode SemiCcard(int i) {
			return getToken(dartParser.SemiCcard, i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CARD);
			setState(174);
			match(OPCARD);
			setState(175);
			child();
			setState(176);
			match(LineIntoBuild);
			setState(177);
			match(CloseContext);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiCcard) {
				{
				{
				setState(178);
				match(SemiCcard);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(dartParser.ONTAP, 0); }
		public OnTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOnTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOnTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOnTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnTapContext onTap() throws RecognitionException {
		OnTapContext _localctx = new OnTapContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_onTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ONTAP);
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

	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(dartParser.CHILD, 0); }
		public TerminalNode TWODOT() { return getToken(dartParser.TWODOT, 0); }
		public TerminalNode CHILDContainer() { return getToken(dartParser.CHILDContainer, 0); }
		public TerminalNode TWODOTCONTAINER() { return getToken(dartParser.TWODOTCONTAINER, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TerminalNode CHILDCARD() { return getToken(dartParser.CHILDCARD, 0); }
		public TerminalNode TWODOTCARD() { return getToken(dartParser.TWODOTCARD, 0); }
		public TerminalNode CHILDGesture() { return getToken(dartParser.CHILDGesture, 0); }
		public TerminalNode TWODOTGestureDetector() { return getToken(dartParser.TWODOTGestureDetector, 0); }
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_child);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(CHILD);
				setState(187);
				match(TWODOT);
				}
				break;
			case CHILDContainer:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(CHILDContainer);
				setState(189);
				match(TWODOTCONTAINER);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINAR) | (1L << Row) | (1L << Scaffold) | (1L << COLUMN) | (1L << GESTUREDETECTOR) | (1L << CARD) | (1L << Text))) != 0)) {
					{
					{
					setState(190);
					widget();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHILDCARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(CHILDCARD);
				setState(197);
				match(TWODOTCARD);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINAR) | (1L << Row) | (1L << Scaffold) | (1L << COLUMN) | (1L << GESTUREDETECTOR) | (1L << CARD) | (1L << Text))) != 0)) {
					{
					{
					setState(198);
					widget();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHILDGesture:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(CHILDGesture);
				setState(205);
				match(TWODOTGestureDetector);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINAR) | (1L << Row) | (1L << Scaffold) | (1L << COLUMN) | (1L << GESTUREDETECTOR) | (1L << CARD) | (1L << Text))) != 0)) {
					{
					{
					setState(206);
					widget();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class WidgetsContext extends ParserRuleContext {
		public TerminalNode COMMAWidget() { return getToken(dartParser.COMMAWidget, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public WidgetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidgets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidgets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidgets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetsContext widgets() throws RecognitionException {
		WidgetsContext _localctx = new WidgetsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_widgets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTAINAR) | (1L << Row) | (1L << Scaffold) | (1L << COLUMN) | (1L << GESTUREDETECTOR) | (1L << CARD) | (1L << Text))) != 0)) {
				{
				{
				setState(214);
				widget();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(COMMAWidget);
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

	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDRENRow() { return getToken(dartParser.CHILDRENRow, 0); }
		public TerminalNode TWODOTChildren() { return getToken(dartParser.TWODOTChildren, 0); }
		public TerminalNode OSPChildren() { return getToken(dartParser.OSPChildren, 0); }
		public WidgetsContext widgets() {
			return getRuleContext(WidgetsContext.class,0);
		}
		public List<TerminalNode> LineIntoBuild() { return getTokens(dartParser.LineIntoBuild); }
		public TerminalNode LineIntoBuild(int i) {
			return getToken(dartParser.LineIntoBuild, i);
		}
		public TerminalNode CSPChildrenRow() { return getToken(dartParser.CSPChildrenRow, 0); }
		public TerminalNode CHILDRENColumn() { return getToken(dartParser.CHILDRENColumn, 0); }
		public TerminalNode TWODOTChildrenColumn() { return getToken(dartParser.TWODOTChildrenColumn, 0); }
		public TerminalNode OSPChildrenColumn() { return getToken(dartParser.OSPChildrenColumn, 0); }
		public TerminalNode CSPChildrenColumn() { return getToken(dartParser.CSPChildrenColumn, 0); }
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_children);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDRENRow:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(CHILDRENRow);
				setState(223);
				match(TWODOTChildren);
				setState(224);
				match(OSPChildren);
				setState(225);
				widgets();
				setState(226);
				match(LineIntoBuild);
				setState(227);
				match(LineIntoBuild);
				setState(228);
				match(CSPChildrenRow);
				}
				break;
			case CHILDRENColumn:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(CHILDRENColumn);
				setState(231);
				match(TWODOTChildrenColumn);
				setState(232);
				match(OSPChildrenColumn);
				setState(233);
				widgets();
				setState(234);
				match(CSPChildrenColumn);
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
		"\u0004\u0001\u0088\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002<\b\u0002\u000b"+
		"\u0002\f\u0002=\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005P\b\u0005\n\u0005\f\u0005S\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00a3\b\u000f\n\u000f\f\u000f\u00a6\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b4\b\u0011\n"+
		"\u0011\f\u0011\u00b7\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c0\b\u0013\n"+
		"\u0013\f\u0013\u00c3\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00c8\b\u0013\n\u0013\f\u0013\u00cb\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00d0\b\u0013\n\u0013\f\u0013\u00d3\t\u0013\u0003"+
		"\u0013\u00d5\b\u0013\u0001\u0014\u0005\u0014\u00d8\b\u0014\n\u0014\f\u0014"+
		"\u00db\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00ed\b\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0001\u0001\u0000KN\u00ea\u0000,\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bD\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fT\u0001"+
		"\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010e\u0001\u0000"+
		"\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000"+
		"\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0086\u0001\u0000\u0000\u0000"+
		"\u001a\u008e\u0001\u0000\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000"+
		"\u001e\u009b\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\""+
		"\u00ad\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&\u00d4\u0001"+
		"\u0000\u0000\u0000(\u00d9\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-\u0001\u0001\u0000\u0000\u0000./\u0005"+
		"\u0001\u0000\u0000/0\u0005U\u0000\u000001\u0005T\u0000\u000012\u0005U"+
		"\u0000\u000023\u0005S\u0000\u000034\u0005U\u0000\u000045\u0005T\u0000"+
		"\u000056\u0005U\u0000\u000067\u0005W\u0000\u000078\u0005,\u0000\u0000"+
		"89\u0003\u0004\u0002\u00009\u0003\u0001\u0000\u0000\u0000:<\u0003\f\u0006"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0003"+
		"\b\u0004\u0000@A\u0003\u0014\n\u0000A\u0005\u0001\u0000\u0000\u0000BC"+
		"\u0003(\u0014\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005*\u0000\u0000"+
		"EF\u0005Z\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005^\u0000\u0000HI\u0005"+
		"+\u0000\u0000I\t\u0001\u0000\u0000\u0000JK\u0005Y\u0000\u0000KL\u0005"+
		"[\u0000\u0000LQ\u0005\\\u0000\u0000MN\u0005]\u0000\u0000NP\u0003\n\u0005"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0005)\u0000\u0000UV\u0005O\u0000\u0000V"+
		"W\u0003\u000e\u0007\u0000WX\u0005O\u0000\u0000XY\u0005P\u0000\u0000YZ"+
		"\u0005Q\u0000\u0000Z[\u0005,\u0000\u0000[\r\u0001\u0000\u0000\u0000\\"+
		"]\u0007\u0000\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^f\u0003\u001e"+
		"\u000f\u0000_f\u0003\u0018\f\u0000`f\u0003\u001a\r\u0000af\u0003\u0012"+
		"\t\u0000bf\u0003 \u0010\u0000cf\u0003\u001c\u000e\u0000df\u0003\"\u0011"+
		"\u0000e^\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000"+
		"\u0000gh\u00055\u0000\u0000hi\u0005e\u0000\u0000ij\u0005j\u0000\u0000"+
		"jk\u0005f\u0000\u0000kl\u0005g\u0000\u0000lm\u0003\u0010\b\u0000mn\u0005"+
		">\u0000\u0000no\u0005;\u0000\u0000op\u0005@\u0000\u0000p\u0013\u0001\u0000"+
		"\u0000\u0000qr\u0005V\u0000\u0000rs\u0005R\u0000\u0000st\u0005>\u0000"+
		"\u0000tu\u0005.\u0000\u0000uv\u0005=\u0000\u0000vw\u0005/\u0000\u0000"+
		"wx\u0005:\u0000\u0000xy\u00052\u0000\u0000yz\u0005=\u0000\u0000z{\u0005"+
		"3\u0000\u0000{|\u0005;\u0000\u0000|}\u0005=\u0000\u0000}~\u0005?\u0000"+
		"\u0000~\u007f\u0005>\u0000\u0000\u007f\u0080\u0003\u0016\u000b\u0000\u0080"+
		"\u0081\u0005E\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u00054\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084\u0085\u0003\u0010"+
		"\b\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086\u0087\u00051\u0000"+
		"\u0000\u0087\u0088\u0005\u0085\u0000\u0000\u0088\u0089\u0005\u0088\u0000"+
		"\u0000\u0089\u008a\u0003*\u0015\u0000\u008a\u008b\u0005>\u0000\u0000\u008b"+
		"\u008c\u0005;\u0000\u0000\u008c\u008d\u0005@\u0000\u0000\u008d\u0019\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u00056\u0000\u0000\u008f\u0090\u0005w\u0000"+
		"\u0000\u0090\u0091\u0003*\u0015\u0000\u0091\u0092\u0005z\u0000\u0000\u0092"+
		"\u0093\u0005|\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u00059\u0000\u0000\u0095\u0096\u0005p\u0000\u0000\u0096\u0097\u0005q"+
		"\u0000\u0000\u0097\u0098\u0005r\u0000\u0000\u0098\u0099\u0005q\u0000\u0000"+
		"\u0099\u009a\u0005t\u0000\u0000\u009a\u001d\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u00050\u0000\u0000\u009c\u009d\u0005~\u0000\u0000\u009d\u009e\u0005"+
		"\u007f\u0000\u0000\u009e\u009f\u0005~\u0000\u0000\u009f\u00a0\u0003&\u0013"+
		"\u0000\u00a0\u00a4\u0005\u0083\u0000\u0000\u00a1\u00a3\u0005@\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u00057\u0000\u0000\u00a8\u00a9\u0005k\u0000\u0000\u00a9\u00aa"+
		"\u0003&\u0013\u0000\u00aa\u00ab\u0005n\u0000\u0000\u00ab\u00ac\u0005o"+
		"\u0000\u0000\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00ae\u00058\u0000\u0000"+
		"\u00ae\u00af\u0005a\u0000\u0000\u00af\u00b0\u0003&\u0013\u0000\u00b0\u00b1"+
		"\u0005>\u0000\u0000\u00b1\u00b5\u0005;\u0000\u0000\u00b2\u00b4\u0005c"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005D\u0000\u0000\u00b9%\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\u001e\u0000\u0000\u00bb\u00d5\u0005\u001d\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0080\u0000\u0000\u00bd\u00c1\u0005\u0081\u0000\u0000\u00be"+
		"\u00c0\u0003\u0010\b\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00d5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005b\u0000\u0000\u00c5\u00c9\u0005"+
		"C\u0000\u0000\u00c6\u00c8\u0003\u0010\b\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00d5\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005l\u0000"+
		"\u0000\u00cd\u00d1\u0005m\u0000\u0000\u00ce\u00d0\u0003\u0010\b\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d4\u00ba\u0001\u0000\u0000\u0000\u00d4\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c4\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d5\'\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u0010\b\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005<\u0000\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u0086\u0000\u0000\u00df\u00e0\u0005\u0087\u0000\u0000\u00e0\u00e1\u0005"+
		"B\u0000\u0000\u00e1\u00e2\u0003(\u0014\u0000\u00e2\u00e3\u0005>\u0000"+
		"\u0000\u00e3\u00e4\u0005>\u0000\u0000\u00e4\u00e5\u0005A\u0000\u0000\u00e5"+
		"\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005v\u0000\u0000\u00e7\u00e8"+
		"\u0005y\u0000\u0000\u00e8\u00e9\u0005x\u0000\u0000\u00e9\u00ea\u0003("+
		"\u0014\u0000\u00ea\u00eb\u0005{\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ec\u00de\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ed+\u0001\u0000\u0000\u0000\u000b=Qe\u00a4\u00b5\u00c1\u00c9"+
		"\u00d1\u00d4\u00d9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}