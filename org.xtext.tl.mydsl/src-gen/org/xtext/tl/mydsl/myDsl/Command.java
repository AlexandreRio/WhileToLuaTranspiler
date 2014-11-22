/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getVarL <em>Var L</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getExpL <em>Exp L</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getC1 <em>C1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Command#getC2 <em>C2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Var L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var L</em>' attribute.
   * @see #setVarL(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_VarL()
   * @model
   * @generated
   */
  String getVarL();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getVarL <em>Var L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var L</em>' attribute.
   * @see #getVarL()
   * @generated
   */
  void setVarL(String value);

  /**
   * Returns the value of the '<em><b>Exp L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp L</em>' attribute.
   * @see #setExpL(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_ExpL()
   * @model
   * @generated
   */
  String getExpL();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getExpL <em>Exp L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp L</em>' attribute.
   * @see #getExpL()
   * @generated
   */
  void setExpL(String value);

  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute.
   * @see #setExp(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_Exp()
   * @model
   * @generated
   */
  String getExp();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getExp <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' attribute.
   * @see #getExp()
   * @generated
   */
  void setExp(String value);

  /**
   * Returns the value of the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C1</em>' containment reference.
   * @see #setC1(Commands)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_C1()
   * @model containment="true"
   * @generated
   */
  Commands getC1();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getC1 <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C1</em>' containment reference.
   * @see #getC1()
   * @generated
   */
  void setC1(Commands value);

  /**
   * Returns the value of the '<em><b>Exp1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' attribute.
   * @see #setExp1(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_Exp1()
   * @model
   * @generated
   */
  String getExp1();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getExp1 <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' attribute.
   * @see #getExp1()
   * @generated
   */
  void setExp1(String value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' attribute.
   * @see #setExp2(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_Exp2()
   * @model
   * @generated
   */
  String getExp2();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getExp2 <em>Exp2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' attribute.
   * @see #getExp2()
   * @generated
   */
  void setExp2(String value);

  /**
   * Returns the value of the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C2</em>' containment reference.
   * @see #setC2(Commands)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommand_C2()
   * @model containment="true"
   * @generated
   */
  Commands getC2();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Command#getC2 <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C2</em>' containment reference.
   * @see #getC2()
   * @generated
   */
  void setC2(Commands value);

} // Command
