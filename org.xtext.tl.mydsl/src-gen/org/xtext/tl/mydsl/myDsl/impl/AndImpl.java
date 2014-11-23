/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.tl.mydsl.myDsl.And;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.Or;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.AndImpl#getExpOu <em>Exp Ou</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.AndImpl#getExpOu2 <em>Exp Ou2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndImpl extends MinimalEObjectImpl.Container implements And
{
  /**
   * The cached value of the '{@link #getExpOu() <em>Exp Ou</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpOu()
   * @generated
   * @ordered
   */
  protected Or expOu;

  /**
   * The cached value of the '{@link #getExpOu2() <em>Exp Ou2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpOu2()
   * @generated
   * @ordered
   */
  protected EList<Or> expOu2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndImpl()
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
    return MyDslPackage.Literals.AND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or getExpOu()
  {
    return expOu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpOu(Or newExpOu, NotificationChain msgs)
  {
    Or oldExpOu = expOu;
    expOu = newExpOu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.AND__EXP_OU, oldExpOu, newExpOu);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpOu(Or newExpOu)
  {
    if (newExpOu != expOu)
    {
      NotificationChain msgs = null;
      if (expOu != null)
        msgs = ((InternalEObject)expOu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.AND__EXP_OU, null, msgs);
      if (newExpOu != null)
        msgs = ((InternalEObject)newExpOu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.AND__EXP_OU, null, msgs);
      msgs = basicSetExpOu(newExpOu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AND__EXP_OU, newExpOu, newExpOu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Or> getExpOu2()
  {
    if (expOu2 == null)
    {
      expOu2 = new EObjectContainmentEList<Or>(Or.class, this, MyDslPackage.AND__EXP_OU2);
    }
    return expOu2;
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
      case MyDslPackage.AND__EXP_OU:
        return basicSetExpOu(null, msgs);
      case MyDslPackage.AND__EXP_OU2:
        return ((InternalEList<?>)getExpOu2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.AND__EXP_OU:
        return getExpOu();
      case MyDslPackage.AND__EXP_OU2:
        return getExpOu2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.AND__EXP_OU:
        setExpOu((Or)newValue);
        return;
      case MyDslPackage.AND__EXP_OU2:
        getExpOu2().clear();
        getExpOu2().addAll((Collection<? extends Or>)newValue);
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
      case MyDslPackage.AND__EXP_OU:
        setExpOu((Or)null);
        return;
      case MyDslPackage.AND__EXP_OU2:
        getExpOu2().clear();
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
      case MyDslPackage.AND__EXP_OU:
        return expOu != null;
      case MyDslPackage.AND__EXP_OU2:
        return expOu2 != null && !expOu2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AndImpl
