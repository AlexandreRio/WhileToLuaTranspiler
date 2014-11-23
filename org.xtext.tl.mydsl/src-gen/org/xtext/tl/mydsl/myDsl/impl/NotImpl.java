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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.tl.mydsl.myDsl.Eq;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.Not;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.NotImpl#getNon <em>Non</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.NotImpl#getExpEq <em>Exp Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotImpl extends MinimalEObjectImpl.Container implements Not
{
  /**
   * The cached value of the '{@link #getNon() <em>Non</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNon()
   * @generated
   * @ordered
   */
  protected EList<String> non;

  /**
   * The cached value of the '{@link #getExpEq() <em>Exp Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpEq()
   * @generated
   * @ordered
   */
  protected Eq expEq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotImpl()
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
    return MyDslPackage.Literals.NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNon()
  {
    if (non == null)
    {
      non = new EDataTypeEList<String>(String.class, this, MyDslPackage.NOT__NON);
    }
    return non;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eq getExpEq()
  {
    return expEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpEq(Eq newExpEq, NotificationChain msgs)
  {
    Eq oldExpEq = expEq;
    expEq = newExpEq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NOT__EXP_EQ, oldExpEq, newExpEq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpEq(Eq newExpEq)
  {
    if (newExpEq != expEq)
    {
      NotificationChain msgs = null;
      if (expEq != null)
        msgs = ((InternalEObject)expEq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NOT__EXP_EQ, null, msgs);
      if (newExpEq != null)
        msgs = ((InternalEObject)newExpEq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NOT__EXP_EQ, null, msgs);
      msgs = basicSetExpEq(newExpEq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NOT__EXP_EQ, newExpEq, newExpEq));
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
      case MyDslPackage.NOT__EXP_EQ:
        return basicSetExpEq(null, msgs);
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
      case MyDslPackage.NOT__NON:
        return getNon();
      case MyDslPackage.NOT__EXP_EQ:
        return getExpEq();
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
      case MyDslPackage.NOT__NON:
        getNon().clear();
        getNon().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.NOT__EXP_EQ:
        setExpEq((Eq)newValue);
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
      case MyDslPackage.NOT__NON:
        getNon().clear();
        return;
      case MyDslPackage.NOT__EXP_EQ:
        setExpEq((Eq)null);
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
      case MyDslPackage.NOT__NON:
        return non != null && !non.isEmpty();
      case MyDslPackage.NOT__EXP_EQ:
        return expEq != null;
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
    result.append(" (non: ");
    result.append(non);
    result.append(')');
    return result.toString();
  }

} //NotImpl
