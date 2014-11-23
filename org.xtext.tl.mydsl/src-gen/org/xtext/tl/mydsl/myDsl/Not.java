/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Not#getNon <em>Non</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Not#getExpEq <em>Exp Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends EObject
{
  /**
   * Returns the value of the '<em><b>Non</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Non</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non</em>' attribute list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getNot_Non()
   * @model unique="false"
   * @generated
   */
  EList<String> getNon();

  /**
   * Returns the value of the '<em><b>Exp Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Eq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Eq</em>' containment reference.
   * @see #setExpEq(Eq)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getNot_ExpEq()
   * @model containment="true"
   * @generated
   */
  Eq getExpEq();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Not#getExpEq <em>Exp Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Eq</em>' containment reference.
   * @see #getExpEq()
   * @generated
   */
  void setExpEq(Eq value);

} // Not
