/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.Commands;
import org.xtext.tl.mydsl.myDsl.Definiton;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definiton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl#getCommandList <em>Command List</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl#getOutputVars <em>Output Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitonImpl extends MinimalEObjectImpl.Container implements Definiton
{
  /**
   * The default value of the '{@link #getInputVars() <em>Input Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputVars()
   * @generated
   * @ordered
   */
  protected static final String INPUT_VARS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputVars() <em>Input Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputVars()
   * @generated
   * @ordered
   */
  protected String inputVars = INPUT_VARS_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommandList() <em>Command List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandList()
   * @generated
   * @ordered
   */
  protected Commands commandList;

  /**
   * The default value of the '{@link #getOutputVars() <em>Output Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputVars()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_VARS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputVars() <em>Output Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputVars()
   * @generated
   * @ordered
   */
  protected String outputVars = OUTPUT_VARS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.DEFINITON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputVars()
  {
    return inputVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputVars(String newInputVars)
  {
    String oldInputVars = inputVars;
    inputVars = newInputVars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__INPUT_VARS, oldInputVars, inputVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCommandList()
  {
    return commandList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommandList(Commands newCommandList, NotificationChain msgs)
  {
    Commands oldCommandList = commandList;
    commandList = newCommandList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__COMMAND_LIST, oldCommandList, newCommandList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandList(Commands newCommandList)
  {
    if (newCommandList != commandList)
    {
      NotificationChain msgs = null;
      if (commandList != null)
        msgs = ((InternalEObject)commandList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__COMMAND_LIST, null, msgs);
      if (newCommandList != null)
        msgs = ((InternalEObject)newCommandList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__COMMAND_LIST, null, msgs);
      msgs = basicSetCommandList(newCommandList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__COMMAND_LIST, newCommandList, newCommandList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputVars()
  {
    return outputVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputVars(String newOutputVars)
  {
    String oldOutputVars = outputVars;
    outputVars = newOutputVars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__OUTPUT_VARS, oldOutputVars, outputVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        return basicSetCommandList(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.DEFINITON__INPUT_VARS:
        return getInputVars();
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        return getCommandList();
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        return getOutputVars();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DEFINITON__INPUT_VARS:
        setInputVars((String)newValue);
        return;
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        setCommandList((Commands)newValue);
        return;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        setOutputVars((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.DEFINITON__INPUT_VARS:
        setInputVars(INPUT_VARS_EDEFAULT);
        return;
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        setCommandList((Commands)null);
        return;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        setOutputVars(OUTPUT_VARS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.DEFINITON__INPUT_VARS:
        return INPUT_VARS_EDEFAULT == null ? inputVars != null : !INPUT_VARS_EDEFAULT.equals(inputVars);
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        return commandList != null;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        return OUTPUT_VARS_EDEFAULT == null ? outputVars != null : !OUTPUT_VARS_EDEFAULT.equals(outputVars);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (inputVars: ");
    result.append(inputVars);
    result.append(", outputVars: ");
    result.append(outputVars);
    result.append(')');
    return result.toString();
  }

} //DefinitonImpl
