/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq1 <em>Expr Eq1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq2 <em>Expr Eq2</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Eq#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getEq()
 * @model
 * @generated
 */
public interface Eq extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Eq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Eq1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Eq1</em>' containment reference.
   * @see #setExprEq1(EObject)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getEq_ExprEq1()
   * @model containment="true"
   * @generated
   */
  EObject getExprEq1();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq1 <em>Expr Eq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Eq1</em>' containment reference.
   * @see #getExprEq1()
   * @generated
   */
  void setExprEq1(EObject value);

  /**
   * Returns the value of the '<em><b>Expr Eq2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Eq2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Eq2</em>' containment reference.
   * @see #setExprEq2(EObject)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getEq_ExprEq2()
   * @model containment="true"
   * @generated
   */
  EObject getExprEq2();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Eq#getExprEq2 <em>Expr Eq2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Eq2</em>' containment reference.
   * @see #getExprEq2()
   * @generated
   */
  void setExprEq2(EObject value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(EObject)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getEq_Exp()
   * @model containment="true"
   * @generated
   */
  EObject getExp();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Eq#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EObject value);

} // Eq
