/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Commands#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tl.mydsl.myDsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference list.
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getCommands_C()
   * @model containment="true"
   * @generated
   */
  EList<Command> getC();

} // Commands
