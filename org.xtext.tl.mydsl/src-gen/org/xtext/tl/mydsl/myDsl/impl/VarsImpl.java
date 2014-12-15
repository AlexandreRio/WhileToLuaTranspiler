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
import org.xtext.tl.mydsl.myDsl.Vars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.VarsImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.VarsImpl#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarsImpl extends MinimalEObjectImpl.Container implements Vars
{
  /**
   * The default value of the '{@link #getV1() <em>V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected static final String V1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected String v1 = V1_EDEFAULT;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected EList<Vars> v2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarsImpl()
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
    return MyDslPackage.Literals.VARS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(String newV1)
  {
    String oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VARS__V1, oldV1, v1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Vars> getV2()
  {
    if (v2 == null)
    {
      v2 = new EObjectContainmentEList<Vars>(Vars.class, this, MyDslPackage.VARS__V2);
    }
    return v2;
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
      case MyDslPackage.VARS__V2:
        return ((InternalEList<?>)getV2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VARS__V1:
        return getV1();
      case MyDslPackage.VARS__V2:
        return getV2();
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
      case MyDslPackage.VARS__V1:
        setV1((String)newValue);
        return;
      case MyDslPackage.VARS__V2:
        getV2().clear();
        getV2().addAll((Collection<? extends Vars>)newValue);
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
      case MyDslPackage.VARS__V1:
        setV1(V1_EDEFAULT);
        return;
      case MyDslPackage.VARS__V2:
        getV2().clear();
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
      case MyDslPackage.VARS__V1:
        return V1_EDEFAULT == null ? v1 != null : !V1_EDEFAULT.equals(v1);
      case MyDslPackage.VARS__V2:
        return v2 != null && !v2.isEmpty();
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
    result.append(" (v1: ");
    result.append(v1);
    result.append(')');
    return result.toString();
  }

} //VarsImpl
