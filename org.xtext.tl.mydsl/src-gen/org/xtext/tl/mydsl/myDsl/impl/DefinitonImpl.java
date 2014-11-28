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
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.Output;

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
   * The cached value of the '{@link #getInputVars() <em>Input Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputVars()
   * @generated
   * @ordered
   */
  protected Input inputVars;

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
   * The cached value of the '{@link #getOutputVars() <em>Output Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputVars()
   * @generated
   * @ordered
   */
  protected Output outputVars;

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
  public Input getInputVars()
  {
    return inputVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputVars(Input newInputVars, NotificationChain msgs)
  {
    Input oldInputVars = inputVars;
    inputVars = newInputVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__INPUT_VARS, oldInputVars, newInputVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputVars(Input newInputVars)
  {
    if (newInputVars != inputVars)
    {
      NotificationChain msgs = null;
      if (inputVars != null)
        msgs = ((InternalEObject)inputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__INPUT_VARS, null, msgs);
      if (newInputVars != null)
        msgs = ((InternalEObject)newInputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__INPUT_VARS, null, msgs);
      msgs = basicSetInputVars(newInputVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__INPUT_VARS, newInputVars, newInputVars));
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
  public Output getOutputVars()
  {
    return outputVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputVars(Output newOutputVars, NotificationChain msgs)
  {
    Output oldOutputVars = outputVars;
    outputVars = newOutputVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__OUTPUT_VARS, oldOutputVars, newOutputVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputVars(Output newOutputVars)
  {
    if (newOutputVars != outputVars)
    {
      NotificationChain msgs = null;
      if (outputVars != null)
        msgs = ((InternalEObject)outputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__OUTPUT_VARS, null, msgs);
      if (newOutputVars != null)
        msgs = ((InternalEObject)newOutputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITON__OUTPUT_VARS, null, msgs);
      msgs = basicSetOutputVars(newOutputVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITON__OUTPUT_VARS, newOutputVars, newOutputVars));
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
      case MyDslPackage.DEFINITON__INPUT_VARS:
        return basicSetInputVars(null, msgs);
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        return basicSetCommandList(null, msgs);
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        return basicSetOutputVars(null, msgs);
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
        setInputVars((Input)newValue);
        return;
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        setCommandList((Commands)newValue);
        return;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        setOutputVars((Output)newValue);
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
        setInputVars((Input)null);
        return;
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        setCommandList((Commands)null);
        return;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        setOutputVars((Output)null);
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
        return inputVars != null;
      case MyDslPackage.DEFINITON__COMMAND_LIST:
        return commandList != null;
      case MyDslPackage.DEFINITON__OUTPUT_VARS:
        return outputVars != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitonImpl
