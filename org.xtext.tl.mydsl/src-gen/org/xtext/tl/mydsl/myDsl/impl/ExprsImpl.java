/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.Expr;
import org.xtext.tl.mydsl.myDsl.Exprs;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprsImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprsImpl#getExpL <em>Exp L</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprsImpl extends MinimalEObjectImpl.Container implements Exprs
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expr exp;

  /**
   * The cached value of the '{@link #getExpL() <em>Exp L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpL()
   * @generated
   * @ordered
   */
  protected Exprs expL;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprsImpl()
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
    return MyDslPackage.Literals.EXPRS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expr newExp, NotificationChain msgs)
  {
    Expr oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expr newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprs getExpL()
  {
    return expL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpL(Exprs newExpL, NotificationChain msgs)
  {
    Exprs oldExpL = expL;
    expL = newExpL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXP_L, oldExpL, newExpL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpL(Exprs newExpL)
  {
    if (newExpL != expL)
    {
      NotificationChain msgs = null;
      if (expL != null)
        msgs = ((InternalEObject)expL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXP_L, null, msgs);
      if (newExpL != null)
        msgs = ((InternalEObject)newExpL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXP_L, null, msgs);
      msgs = basicSetExpL(newExpL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXP_L, newExpL, newExpL));
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
      case MyDslPackage.EXPRS__EXP:
        return basicSetExp(null, msgs);
      case MyDslPackage.EXPRS__EXP_L:
        return basicSetExpL(null, msgs);
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
      case MyDslPackage.EXPRS__EXP:
        return getExp();
      case MyDslPackage.EXPRS__EXP_L:
        return getExpL();
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
      case MyDslPackage.EXPRS__EXP:
        setExp((Expr)newValue);
        return;
      case MyDslPackage.EXPRS__EXP_L:
        setExpL((Exprs)newValue);
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
      case MyDslPackage.EXPRS__EXP:
        setExp((Expr)null);
        return;
      case MyDslPackage.EXPRS__EXP_L:
        setExpL((Exprs)null);
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
      case MyDslPackage.EXPRS__EXP:
        return exp != null;
      case MyDslPackage.EXPRS__EXP_L:
        return expL != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprsImpl
