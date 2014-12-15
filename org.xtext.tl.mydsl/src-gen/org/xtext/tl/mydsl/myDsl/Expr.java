/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Expr#getExprSimple <em>Expr Simple</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Expr#getExpEt <em>Exp Et</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Expr#getExpTerminale <em>Exp Terminale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Simple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Simple</em>' containment reference.
   * @see #setExprSimple(ExprSimple)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExpr_ExprSimple()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSimple();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Expr#getExprSimple <em>Expr Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Simple</em>' containment reference.
   * @see #getExprSimple()
   * @generated
   */
  void setExprSimple(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Exp Et</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Et</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Et</em>' containment reference.
   * @see #setExpEt(And)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExpr_ExpEt()
   * @model containment="true"
   * @generated
   */
  And getExpEt();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Expr#getExpEt <em>Exp Et</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Et</em>' containment reference.
   * @see #getExpEt()
   * @generated
   */
  void setExpEt(And value);

  /**
   * Returns the value of the '<em><b>Exp Terminale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Terminale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Terminale</em>' containment reference.
   * @see #setExpTerminale(ExprTerm)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExpr_ExpTerminale()
   * @model containment="true"
   * @generated
   */
  ExprTerm getExpTerminale();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Expr#getExpTerminale <em>Exp Terminale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Terminale</em>' containment reference.
   * @see #getExpTerminale()
   * @generated
   */
  void setExpTerminale(ExprTerm value);

} // Expr
