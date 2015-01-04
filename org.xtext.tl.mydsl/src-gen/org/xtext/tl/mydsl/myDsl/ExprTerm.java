/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.ExprTerm#getTermVar <em>Term Var</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.ExprTerm#getTermSym <em>Term Sym</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprTerm()
 * @model
 * @generated
 */
public interface ExprTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Term Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Var</em>' attribute.
   * @see #setTermVar(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprTerm_TermVar()
   * @model
   * @generated
   */
  String getTermVar();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.ExprTerm#getTermVar <em>Term Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term Var</em>' attribute.
   * @see #getTermVar()
   * @generated
   */
  void setTermVar(String value);

  /**
   * Returns the value of the '<em><b>Term Sym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Sym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Sym</em>' attribute.
   * @see #setTermSym(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getExprTerm_TermSym()
   * @model
   * @generated
   */
  String getTermSym();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.ExprTerm#getTermSym <em>Term Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term Sym</em>' attribute.
   * @see #getTermSym()
   * @generated
   */
  void setTermSym(String value);

} // ExprTerm
