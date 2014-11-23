/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.And#getExpOu <em>Exp Ou</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.And#getExpOu2 <em>Exp Ou2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Ou</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Ou</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Ou</em>' containment reference.
   * @see #setExpOu(Or)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getAnd_ExpOu()
   * @model containment="true"
   * @generated
   */
  Or getExpOu();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.And#getExpOu <em>Exp Ou</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Ou</em>' containment reference.
   * @see #getExpOu()
   * @generated
   */
  void setExpOu(Or value);

  /**
   * Returns the value of the '<em><b>Exp Ou2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tl.mydsl.myDsl.Or}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Ou2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Ou2</em>' containment reference list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getAnd_ExpOu2()
   * @model containment="true"
   * @generated
   */
  EList<Or> getExpOu2();

} // And
