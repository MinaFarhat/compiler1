parser grammar dartParser;
options {tokenVocab=dartLexer;}
plur :class;
class:CLASS Space CLASS_NAME Space INHERITS_KEYWORD Space CLASS_NAME Space OBC  LineBODY bodyClass  ;
bodyClass:(declareVariable)+ constructor build ;
body:widgets;
constructor: CLass_Name_Constructor OP_Constructor data CloseConstructorss Semicc;
data: THIS DotData NAMEDATA( COMMAData data )*  ;

declareVariable: FINAL SpaceBodyDeclare dataType SpaceBodyDeclare NAMEVARIABLE SemiDeclareVariable LineBODY;
dataType: INT | STRING | LIST | BOOLEAN;
widget:  container
            |row
            |column
            |scaffold
            |gestureDetector
            |text
            |card
            ;

scaffold:Scaffold OPScaffold LineScaffold BodyScaffold TWODOTScaffold widget LineIntoBuild CloseContext SemiCIntoBuild;
build:LineClass Overridemethod LineIntoBuild WIDGET SpaceBuild BUILDM OPenContext BUILDContext SpaceBuild Context CloseContext SpaceBuild  OPENCYRBRWIDGETtree LineIntoBuild return CloseCYRBRWIDGETtree;
return: Return SpaceBuild widget;
row: Row OPENROW LineRow children LineIntoBuild CloseContext SemiCIntoBuild;
column:COLUMN OPCOLUMN children CPColumn SemiCcolumn;
text:Text OPText SingleQ InputIntoText SingleQ CPText ;
container: CONTAINAR SpaceContainer OPContainer SpaceContainer child  CPContainer (SemiCIntoBuild)* ;

gestureDetector: GESTUREDETECTOR OPGESTUREDETECTOR child CPGESTUREDETECTOR SemiCGESTUREDETECTOR;
card:CARD OPCARD child LineIntoBuild CloseContext (SemiCcard)*;
onTap: ONTAP ;
child: CHILD TWODOT
       |CHILDContainer TWODOTCONTAINER widget
       |CHILDCARD TWODOTCARD widget
      // |CHILDText TWODOTText
       |CHILDGesture TWODOTGestureDetector widget
       ;



widgets:(widget)* COMMAWidget;
children : CHILDRENRow TWODOTChildren OSPChildren widgets LineIntoBuild LineIntoBuild CSPChildrenRow
           |CHILDRENColumn TWODOTChildrenColumn OSPChildrenColumn widgets CSPChildrenColumn
           ;
