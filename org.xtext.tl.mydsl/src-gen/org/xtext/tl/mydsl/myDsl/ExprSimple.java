/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getMot <em>Mot</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends EObject
{
  /**
   * Returns the value of the '<em><b>Mot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mot</em>' attribute.
   * @see #setMot(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprSimple_Mot()
   * @model
   * @generated
   */
  String getMot();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getMot <em>Mot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mot</em>' attribute.
   * @see #getMot()
   * @generated
   */
  void setMot(String value);

  /**
   * Returns the value of the '<em><b>Lexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexpr</em>' containment reference.
   * @see #setLexpr(Lexpr)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprSimple_Lexpr()
   * @model containment="true"
   * @generated
   */
  Lexpr getLexpr();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getLexpr <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexpr</em>' containment reference.
   * @see #getLexpr()
   * @generated
   */
  void setLexpr(Lexpr value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprSimple_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.ExprSimple#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // ExprSimple
