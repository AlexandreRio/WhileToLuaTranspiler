/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.tl.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/tl/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.functionImpl <em>function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.functionImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getfunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Fun Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUN_NAME = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEF = 1;

  /**
   * The number of structural features of the '<em>function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl <em>Definiton</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getDefiniton()
   * @generated
   */
  int DEFINITON = 2;

  /**
   * The feature id for the '<em><b>Input Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITON__INPUT_VARS = 0;

  /**
   * The feature id for the '<em><b>Command List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITON__COMMAND_LIST = 1;

  /**
   * The feature id for the '<em><b>Output Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITON__OUTPUT_VARS = 2;

  /**
   * The number of structural features of the '<em>Definiton</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.InputImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getInput()
   * @generated
   */
  int INPUT = 3;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__V = 0;

  /**
   * The feature id for the '<em><b>V2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__V2 = 1;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.OutputImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 4;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__V = 0;

  /**
   * The feature id for the '<em><b>V2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__V2 = 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.CommandsImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 5;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__C = 0;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprsImpl <em>Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.ExprsImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprs()
   * @generated
   */
  int EXPRS = 6;

  /**
   * The number of structural features of the '<em>Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.CommandImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 7;

  /**
   * The feature id for the '<em><b>Var L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__VAR_L = 0;

  /**
   * The feature id for the '<em><b>Exp L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXP_L = 1;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NOM = 2;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXP = 3;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C1 = 4;

  /**
   * The feature id for the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXP1 = 5;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXP2 = 6;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C2 = 7;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.ExprImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 8;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXP = EXPRS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR_SIMPLE = EXPRS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exp Et</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXP_ET = EXPRS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exp Terminale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXP_TERMINALE = EXPRS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = EXPRS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.AndImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getAnd()
   * @generated
   */
  int AND = 9;

  /**
   * The feature id for the '<em><b>Exp Ou</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXP_OU = 0;

  /**
   * The feature id for the '<em><b>Exp Ou2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXP_OU2 = 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.OrImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getOr()
   * @generated
   */
  int OR = 10;

  /**
   * The feature id for the '<em><b>Exp Non</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXP_NON = 0;

  /**
   * The feature id for the '<em><b>Exp Non2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXP_NON2 = 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.NotImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getNot()
   * @generated
   */
  int NOT = 11;

  /**
   * The feature id for the '<em><b>Non</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__NON = 0;

  /**
   * The feature id for the '<em><b>Exp Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXP_EQ = 1;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.EqImpl <em>Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.EqImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getEq()
   * @generated
   */
  int EQ = 12;

  /**
   * The feature id for the '<em><b>Expr Eq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__EXPR_EQ1 = 0;

  /**
   * The feature id for the '<em><b>Expr Eq2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__EXPR_EQ2 = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__EXP = 2;

  /**
   * The number of structural features of the '<em>Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl <em>Expr Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprTerm()
   * @generated
   */
  int EXPR_TERM = 13;

  /**
   * The feature id for the '<em><b>Expr Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TERM__EXPR_TERM = 0;

  /**
   * The number of structural features of the '<em>Expr Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprSimple()
   * @generated
   */
  int EXPR_SIMPLE = 14;

  /**
   * The feature id for the '<em><b>Mot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__MOT = 0;

  /**
   * The feature id for the '<em><b>Lexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LEXPR = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR = 2;

  /**
   * The number of structural features of the '<em>Expr Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.LexprImpl <em>Lexpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.LexprImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getLexpr()
   * @generated
   */
  int LEXPR = 15;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__EXP = 0;

  /**
   * The number of structural features of the '<em>Lexpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tl.mydsl.myDsl.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Model#getModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Model();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function</em>'.
   * @see org.xtext.tl.mydsl.myDsl.function
   * @generated
   */
  EClass getfunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.function#getFunName <em>Fun Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fun Name</em>'.
   * @see org.xtext.tl.mydsl.myDsl.function#getFunName()
   * @see #getfunction()
   * @generated
   */
  EAttribute getfunction_FunName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.function#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.xtext.tl.mydsl.myDsl.function#getDef()
   * @see #getfunction()
   * @generated
   */
  EReference getfunction_Def();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Definiton <em>Definiton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definiton</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton
   * @generated
   */
  EClass getDefiniton();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Definiton#getInputVars <em>Input Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Vars</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton#getInputVars()
   * @see #getDefiniton()
   * @generated
   */
  EReference getDefiniton_InputVars();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Definiton#getCommandList <em>Command List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command List</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton#getCommandList()
   * @see #getDefiniton()
   * @generated
   */
  EReference getDefiniton_CommandList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars <em>Output Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Vars</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars()
   * @see #getDefiniton()
   * @generated
   */
  EReference getDefiniton_OutputVars();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Input#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Input#getV()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_V();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.tl.mydsl.myDsl.Input#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>V2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Input#getV2()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_V2();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Output#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Output#getV()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_V();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.tl.mydsl.myDsl.Output#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>V2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Output#getV2()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_V2();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commands</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Commands
   * @generated
   */
  EClass getCommands();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tl.mydsl.myDsl.Commands#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>C</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Commands#getC()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_C();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exprs</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Exprs
   * @generated
   */
  EClass getExprs();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Command#getVarL <em>Var L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var L</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getVarL()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_VarL();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getExpL <em>Exp L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp L</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getExpL()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_ExpL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Command#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getNom()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Nom();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getExp()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getC1()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getExp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp1</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getExp1()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Exp1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getExp2()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Exp2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getC2()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C2();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Expr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Expr#getExp()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Expr#getExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Simple</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Expr#getExprSimple()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExprSimple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Expr#getExpEt <em>Exp Et</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Et</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Expr#getExpEt()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExpEt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Expr#getExpTerminale <em>Exp Terminale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Terminale</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Expr#getExpTerminale()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExpTerminale();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.xtext.tl.mydsl.myDsl.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.And#getExpOu <em>Exp Ou</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Ou</em>'.
   * @see org.xtext.tl.mydsl.myDsl.And#getExpOu()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_ExpOu();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tl.mydsl.myDsl.And#getExpOu2 <em>Exp Ou2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Ou2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.And#getExpOu2()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_ExpOu2();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Or#getExpNon <em>Exp Non</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Non</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Or#getExpNon()
   * @see #getOr()
   * @generated
   */
  EReference getOr_ExpNon();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tl.mydsl.myDsl.Or#getExpNon2 <em>Exp Non2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Non2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Or#getExpNon2()
   * @see #getOr()
   * @generated
   */
  EReference getOr_ExpNon2();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.tl.mydsl.myDsl.Not#getNon <em>Non</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Non</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Not#getNon()
   * @see #getNot()
   * @generated
   */
  EAttribute getNot_Non();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Not#getExpEq <em>Exp Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Eq</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Not#getExpEq()
   * @see #getNot()
   * @generated
   */
  EReference getNot_ExpEq();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Eq
   * @generated
   */
  EClass getEq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq1 <em>Expr Eq1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Eq1</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Eq#getExprEq1()
   * @see #getEq()
   * @generated
   */
  EReference getEq_ExprEq1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq2 <em>Expr Eq2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Eq2</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Eq#getExprEq2()
   * @see #getEq()
   * @generated
   */
  EReference getEq_ExprEq2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Eq#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Eq#getExp()
   * @see #getEq()
   * @generated
   */
  EReference getEq_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.ExprTerm <em>Expr Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Term</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprTerm
   * @generated
   */
  EClass getExprTerm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.ExprTerm#getExprTerm <em>Expr Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr Term</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprTerm#getExprTerm()
   * @see #getExprTerm()
   * @generated
   */
  EAttribute getExprTerm_ExprTerm();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Simple</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprSimple
   * @generated
   */
  EClass getExprSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getMot <em>Mot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mot</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprSimple#getMot()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Mot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getLexpr <em>Lexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lexpr</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprSimple#getLexpr()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Lexpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.tl.mydsl.myDsl.ExprSimple#getExpr()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Lexpr <em>Lexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lexpr</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Lexpr
   * @generated
   */
  EClass getLexpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tl.mydsl.myDsl.Lexpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Lexpr#getExp()
   * @see #getLexpr()
   * @generated
   */
  EReference getLexpr_Exp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODEL = eINSTANCE.getModel_Model();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.functionImpl <em>function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.functionImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getfunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getfunction();

    /**
     * The meta object literal for the '<em><b>Fun Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__FUN_NAME = eINSTANCE.getfunction_FunName();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEF = eINSTANCE.getfunction_Def();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl <em>Definiton</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getDefiniton()
     * @generated
     */
    EClass DEFINITON = eINSTANCE.getDefiniton();

    /**
     * The meta object literal for the '<em><b>Input Vars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITON__INPUT_VARS = eINSTANCE.getDefiniton_InputVars();

    /**
     * The meta object literal for the '<em><b>Command List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITON__COMMAND_LIST = eINSTANCE.getDefiniton_CommandList();

    /**
     * The meta object literal for the '<em><b>Output Vars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITON__OUTPUT_VARS = eINSTANCE.getDefiniton_OutputVars();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.InputImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__V = eINSTANCE.getInput_V();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__V2 = eINSTANCE.getInput_V2();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.OutputImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__V = eINSTANCE.getOutput_V();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__V2 = eINSTANCE.getOutput_V2();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandsImpl <em>Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.CommandsImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommands()
     * @generated
     */
    EClass COMMANDS = eINSTANCE.getCommands();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__C = eINSTANCE.getCommands_C();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprsImpl <em>Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.ExprsImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprs()
     * @generated
     */
    EClass EXPRS = eINSTANCE.getExprs();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.CommandImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Var L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__VAR_L = eINSTANCE.getCommand_VarL();

    /**
     * The meta object literal for the '<em><b>Exp L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXP_L = eINSTANCE.getCommand_ExpL();

    /**
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NOM = eINSTANCE.getCommand_Nom();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXP = eINSTANCE.getCommand_Exp();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C1 = eINSTANCE.getCommand_C1();

    /**
     * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXP1 = eINSTANCE.getCommand_Exp1();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXP2 = eINSTANCE.getCommand_Exp2();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C2 = eINSTANCE.getCommand_C2();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.ExprImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXP = eINSTANCE.getExpr_Exp();

    /**
     * The meta object literal for the '<em><b>Expr Simple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR_SIMPLE = eINSTANCE.getExpr_ExprSimple();

    /**
     * The meta object literal for the '<em><b>Exp Et</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXP_ET = eINSTANCE.getExpr_ExpEt();

    /**
     * The meta object literal for the '<em><b>Exp Terminale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXP_TERMINALE = eINSTANCE.getExpr_ExpTerminale();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.AndImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Exp Ou</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__EXP_OU = eINSTANCE.getAnd_ExpOu();

    /**
     * The meta object literal for the '<em><b>Exp Ou2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__EXP_OU2 = eINSTANCE.getAnd_ExpOu2();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.OrImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Exp Non</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__EXP_NON = eINSTANCE.getOr_ExpNon();

    /**
     * The meta object literal for the '<em><b>Exp Non2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__EXP_NON2 = eINSTANCE.getOr_ExpNon2();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.NotImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Non</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOT__NON = eINSTANCE.getNot_Non();

    /**
     * The meta object literal for the '<em><b>Exp Eq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__EXP_EQ = eINSTANCE.getNot_ExpEq();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.EqImpl <em>Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.EqImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getEq()
     * @generated
     */
    EClass EQ = eINSTANCE.getEq();

    /**
     * The meta object literal for the '<em><b>Expr Eq1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__EXPR_EQ1 = eINSTANCE.getEq_ExprEq1();

    /**
     * The meta object literal for the '<em><b>Expr Eq2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__EXPR_EQ2 = eINSTANCE.getEq_ExprEq2();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__EXP = eINSTANCE.getEq_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl <em>Expr Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprTerm()
     * @generated
     */
    EClass EXPR_TERM = eINSTANCE.getExprTerm();

    /**
     * The meta object literal for the '<em><b>Expr Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_TERM__EXPR_TERM = eINSTANCE.getExprTerm_ExprTerm();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getExprSimple()
     * @generated
     */
    EClass EXPR_SIMPLE = eINSTANCE.getExprSimple();

    /**
     * The meta object literal for the '<em><b>Mot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__MOT = eINSTANCE.getExprSimple_Mot();

    /**
     * The meta object literal for the '<em><b>Lexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LEXPR = eINSTANCE.getExprSimple_Lexpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EXPR = eINSTANCE.getExprSimple_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.LexprImpl <em>Lexpr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.LexprImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getLexpr()
     * @generated
     */
    EClass LEXPR = eINSTANCE.getLexpr();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__EXP = eINSTANCE.getLexpr_Exp();

  }

} //MyDslPackage
