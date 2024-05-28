lexer grammar dartLexer;
CLASS:'class' -> pushMode(CLASS_DECLARATION);
IMPORT_:'import';
TRY:'try';
CATCH:'catch';
EQUALS : '=' ;
PLUS_EQUALS : '+=' ;
MINUS_EQUALS : '-=' ;
TIMES_EQUALS : '*=' ;
DIVIDE_EQUALS : '/=' ;
MODULO_EQUALS : '%=' ;
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIVIDE : '/' ;
MODULO : '%' ;
AND : '&&' ;
OR : '||' ;
NOT : '!' ;
EQUAL_TO : '==' ;
NOT_EQUAL_TO : '!=' ;
GREATER_THAN : '>' ;
GREATER_THAN_OR_EQUAL_TO : '>=' ;
LESS_THAN : '<' ;
LESS_THAN_OR_EQUAL_TO : '<=' ;
FINA : 'final';

CBracketC: '}';
COMMA:',';
Dot:'.';
TWODOT:':';
CHILD:'child';

OSP:'[';
CSP:']';
OP:'(';
CP:')';
SINGLE_QUOTE : '\'' ;
SemiC:';';
Name:[a-z-A-Z]+[1-9]*;
OBracketC: '{';
//CPBracketC: '}';

Newline
:
	(
		'\r' '\n'?
		| '\n'
	)
;

Whitespace
:
	[ \t]+
;

mode BODY;
FINAL:'final'->pushMode(Dic);
CLass_Name_Constructor:Name->pushMode(Constructor);
Semicc: SemiC->popMode;
LineBODY:Newline;
SpaceBody: Whitespace ;

mode BUILD;
WIDGET:'Widget';
BUILDM:'build';
CONTAINAR:'Container'->pushMode(CONTAINERWIDGET);
Row:'Row'->pushMode(RowWidget);
BUILDContext:'BuildContext';
Context:'context';
Return:'return';
Scaffold:'Scaffold'->pushMode(ScaffoldWidget);
COLUMN:'Column'->pushMode(ColumnWidget);
GESTUREDETECTOR:'GestureDetector'->pushMode(GestureDetectorWidget);
CARD:'Card'->pushMode(CARDWIDGET);
Text:'Text'->pushMode(TextWidget);

OPenContext:OP;
CloseContext:CP;
COMMAWidget:',';
SpaceBuild: Whitespace ;
LineIntoBuild:Newline;
OPENCYRBRWIDGETtree:OBracketC;
SemiCIntoBuild:SemiC;
CSPChildrenRow:CSP;
OSPChildren:OSP;
TWODOTCARD:':';
ONTAP:'onTap';
CloseCYRBRWIDGETtree:CBracketC;
//OPENROW:OP;
CloseRow:CP;
SemiCrow:SemiC->popMode;
CPCARD:CP;
CloseRowWidget:CP->popMode,popMode;
DecorationContainer:'decoration';





mode Dic ;
INT : 'int';
STRING : 'String';
LIST : 'List';
BOOLEAN : 'boolean';
SpaceBodyDeclare : Whitespace;
NAMEVARIABLE:Name;
SemiDeclareVariable:SemiC -> popMode;

mode CLASS_DECLARATION;
Overridemethod:'@override'->pushMode(BUILD);
INHERITS_KEYWORD : 'extends' ;
CLASS_NAME : [a-z-A-Z]+[1-9]* ;
Space: Whitespace ;
LineClass:Newline;
OBC:OBracketC->pushMode(BODY);
CBC:CBracketC->popMode;

mode Constructor;
THIS:'this';
OP_Constructor :OP ;
DotData:Dot;
NAMEDATA:Name;
COMMAData:COMMA;
CloseConstructorss:CP->popMode;
SemiData:SemiC;
SpaceBodyCC: Whitespace ;


mode CARDWIDGET;
OPCARD:OP;
CHILDCARD:'child'->pushMode(BUILD);
SemiCcard:SemiC;
LineCard:Newline;

mode ScaffoldWidget;
OPScaffold:OP;
BodyScaffold:'body';
TWODOTScaffold:':'->popMode;
CPScaffold:CP;
SemiCScaffold:SemiC;
LineScaffold:Newline;



mode GestureDetectorWidget;
OPGESTUREDETECTOR:OP;
CHILDGesture:'child';
TWODOTGestureDetector:':'->popMode;
CPGESTUREDETECTOR:CP;
SemiCGESTUREDETECTOR:SemiC;

mode TextWidget;
OPText: OP;
SingleQ:SINGLE_QUOTE;
InputIntoText:Name;
SpaceText:Whitespace;
CPText:CP->popMode;
TWODOTTEXT:':';

mode ColumnWidget;
CHILDRENColumn:'children';
OPCOLUMN:OP;
OSPChildrenColumn:OSP;
TWODOTChildrenColumn:TWODOT->pushMode(BUILD);
CPColumn:CP;
CSPChildrenColumn:CSP;
SemiCcolumn:SemiC->popMode;
LineColumn:Newline;

mode CONTAINERWIDGET;
SpaceContainer:Whitespace;
OPContainer:OP;
CHILDContainer:'child';
TWODOTCONTAINER:':';
LineIntoContainer:Newline;
CPContainer:CP->popMode;

SemiCcontainer:SemiC;

mode RowWidget;
OPENROW:OP;
CHILDRENRow:'children';

TWODOTChildren:TWODOT->pushMode(BUILD);
LineRow:Newline;









