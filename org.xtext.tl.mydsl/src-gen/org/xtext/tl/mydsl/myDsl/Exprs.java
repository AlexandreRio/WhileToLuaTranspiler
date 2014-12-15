/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Exprs#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Exprs#getExpL <em>Exp L</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expr)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprs_Exp()
   * @model containment="true"
   * @generated
   */
  Expr getExp();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Exprs#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expr value);

  /**
   * Returns the value of the '<em><b>Exp L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp L</em>' containment reference.
   * @see #setExpL(Exprs)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprs_ExpL()
   * @model containment="true"
   * @generated
   */
  Exprs getExpL();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Exprs#getExpL <em>Exp L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp L</em>' containment reference.
   * @see #getExpL()
   * @generated
   */
  void setExpL(Exprs value);

} // Exprs
