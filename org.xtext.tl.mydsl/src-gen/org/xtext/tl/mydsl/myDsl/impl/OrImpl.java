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

import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.Not;
import org.xtext.tl.mydsl.myDsl.Or;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.OrImpl#getExpNon <em>Exp Non</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.OrImpl#getExpNon2 <em>Exp Non2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrImpl extends MinimalEObjectImpl.Container implements Or
{
  /**
   * The cached value of the '{@link #getExpNon() <em>Exp Non</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpNon()
   * @generated
   * @ordered
   */
  protected Not expNon;

  /**
   * The cached value of the '{@link #getExpNon2() <em>Exp Non2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpNon2()
   * @generated
   * @ordered
   */
  protected EList<Not> expNon2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrImpl()
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
    return MyDslPackage.Literals.OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not getExpNon()
  {
    return expNon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpNon(Not newExpNon, NotificationChain msgs)
  {
    Not oldExpNon = expNon;
    expNon = newExpNon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OR__EXP_NON, oldExpNon, newExpNon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpNon(Not newExpNon)
  {
    if (newExpNon != expNon)
    {
      NotificationChain msgs = null;
      if (expNon != null)
        msgs = ((InternalEObject)expNon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OR__EXP_NON, null, msgs);
      if (newExpNon != null)
        msgs = ((InternalEObject)newExpNon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OR__EXP_NON, null, msgs);
      msgs = basicSetExpNon(newExpNon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OR__EXP_NON, newExpNon, newExpNon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Not> getExpNon2()
  {
    if (expNon2 == null)
    {
      expNon2 = new EObjectContainmentEList<Not>(Not.class, this, MyDslPackage.OR__EXP_NON2);
    }
    return expNon2;
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
      case MyDslPackage.OR__EXP_NON:
        return basicSetExpNon(null, msgs);
      case MyDslPackage.OR__EXP_NON2:
        return ((InternalEList<?>)getExpNon2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.OR__EXP_NON:
        return getExpNon();
      case MyDslPackage.OR__EXP_NON2:
        return getExpNon2();
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
      case MyDslPackage.OR__EXP_NON:
        setExpNon((Not)newValue);
        return;
      case MyDslPackage.OR__EXP_NON2:
        getExpNon2().clear();
        getExpNon2().addAll((Collection<? extends Not>)newValue);
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
      case MyDslPackage.OR__EXP_NON:
        setExpNon((Not)null);
        return;
      case MyDslPackage.OR__EXP_NON2:
        getExpNon2().clear();
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
      case MyDslPackage.OR__EXP_NON:
        return expNon != null;
      case MyDslPackage.OR__EXP_NON2:
        return expNon2 != null && !expNon2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OrImpl
