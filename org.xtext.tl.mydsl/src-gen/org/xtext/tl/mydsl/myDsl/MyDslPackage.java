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
   * The feature id for the '<em><b>Input Vars</b></em>' attribute.
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
   * The feature id for the '<em><b>Output Vars</b></em>' attribute.
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
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.CommandImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 4;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C = 0;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C2 = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tl.mydsl.myDsl.impl.CommandsImpl
   * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 3;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__C = COMMAND__C;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__C2 = COMMAND__C2;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;


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
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Definiton#getInputVars <em>Input Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Vars</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton#getInputVars()
   * @see #getDefiniton()
   * @generated
   */
  EAttribute getDefiniton_InputVars();

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
   * Returns the meta object for the attribute '{@link org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars <em>Output Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Vars</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars()
   * @see #getDefiniton()
   * @generated
   */
  EAttribute getDefiniton_OutputVars();

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
   * Returns the meta object for class '{@link org.xtext.tl.mydsl.myDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tl.mydsl.myDsl.Command#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.tl.mydsl.myDsl.Command#getC()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C();

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
     * The meta object literal for the '<em><b>Input Vars</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITON__INPUT_VARS = eINSTANCE.getDefiniton_InputVars();

    /**
     * The meta object literal for the '<em><b>Command List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITON__COMMAND_LIST = eINSTANCE.getDefiniton_CommandList();

    /**
     * The meta object literal for the '<em><b>Output Vars</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITON__OUTPUT_VARS = eINSTANCE.getDefiniton_OutputVars();

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
     * The meta object literal for the '{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tl.mydsl.myDsl.impl.CommandImpl
     * @see org.xtext.tl.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C = eINSTANCE.getCommand_C();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C2 = eINSTANCE.getCommand_C2();

  }

} //MyDslPackage
