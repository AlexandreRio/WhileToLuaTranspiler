/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Vars#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Vars#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getVars()
 * @model
 * @generated
 */
public interface Vars extends EObject
{
  /**
   * Returns the value of the '<em><b>V1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' attribute.
   * @see #setV1(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getVars_V1()
   * @model
   * @generated
   */
  String getV1();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Vars#getV1 <em>V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' attribute.
   * @see #getV1()
   * @generated
   */
  void setV1(String value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tl.mydsl.myDsl.Vars}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' containment reference list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getVars_V2()
   * @model containment="true"
   * @generated
   */
  EList<Vars> getV2();

} // Vars
