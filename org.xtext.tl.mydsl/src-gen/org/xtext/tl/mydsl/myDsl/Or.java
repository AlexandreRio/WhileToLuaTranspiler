/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Or#getExpNon <em>Exp Non</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Or#getExpNon2 <em>Exp Non2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Non</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Non</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Non</em>' containment reference.
   * @see #setExpNon(Not)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getOr_ExpNon()
   * @model containment="true"
   * @generated
   */
  Not getExpNon();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Or#getExpNon <em>Exp Non</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Non</em>' containment reference.
   * @see #getExpNon()
   * @generated
   */
  void setExpNon(Not value);

  /**
   * Returns the value of the '<em><b>Exp Non2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tl.mydsl.myDsl.Not}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Non2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Non2</em>' containment reference list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getOr_ExpNon2()
   * @model containment="true"
   * @generated
   */
  EList<Not> getExpNon2();

} // Or
