/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Function#getFunName <em>Fun Name</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Function#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Fun Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun Name</em>' attribute.
   * @see #setFunName(String)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getFunction_FunName()
   * @model
   * @generated
   */
  String getFunName();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Function#getFunName <em>Fun Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun Name</em>' attribute.
   * @see #getFunName()
   * @generated
   */
  void setFunName(String value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(Definiton)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getFunction_Def()
   * @model containment="true"
   * @generated
   */
  Definiton getDef();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Function#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Definiton value);

} // Function
