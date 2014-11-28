/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Input#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Input#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' attribute.
   * @see #setV(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getInput_V()
   * @model
   * @generated
   */
  String getV();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Input#getV <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' attribute.
   * @see #getV()
   * @generated
   */
  void setV(String value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' attribute list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getInput_V2()
   * @model unique="false"
   * @generated
   */
  EList<String> getV2();

} // Input
