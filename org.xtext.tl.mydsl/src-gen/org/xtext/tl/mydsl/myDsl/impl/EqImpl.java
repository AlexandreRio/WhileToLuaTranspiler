/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.Eq;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.EqImpl#getExprEq1 <em>Expr Eq1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.EqImpl#getExprEq2 <em>Expr Eq2</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.EqImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqImpl extends MinimalEObjectImpl.Container implements Eq
{
  /**
   * The cached value of the '{@link #getExprEq1() <em>Expr Eq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprEq1()
   * @generated
   * @ordered
   */
  protected EObject exprEq1;

  /**
   * The cached value of the '{@link #getExprEq2() <em>Expr Eq2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprEq2()
   * @generated
   * @ordered
   */
  protected EObject exprEq2;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EObject exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqImpl()
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
    return MyDslPackage.Literals.EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExprEq1()
  {
    return exprEq1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprEq1(EObject newExprEq1, NotificationChain msgs)
  {
    EObject oldExprEq1 = exprEq1;
    exprEq1 = newExprEq1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXPR_EQ1, oldExprEq1, newExprEq1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprEq1(EObject newExprEq1)
  {
    if (newExprEq1 != exprEq1)
    {
      NotificationChain msgs = null;
      if (exprEq1 != null)
        msgs = ((InternalEObject)exprEq1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXPR_EQ1, null, msgs);
      if (newExprEq1 != null)
        msgs = ((InternalEObject)newExprEq1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXPR_EQ1, null, msgs);
      msgs = basicSetExprEq1(newExprEq1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXPR_EQ1, newExprEq1, newExprEq1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExprEq2()
  {
    return exprEq2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprEq2(EObject newExprEq2, NotificationChain msgs)
  {
    EObject oldExprEq2 = exprEq2;
    exprEq2 = newExprEq2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXPR_EQ2, oldExprEq2, newExprEq2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprEq2(EObject newExprEq2)
  {
    if (newExprEq2 != exprEq2)
    {
      NotificationChain msgs = null;
      if (exprEq2 != null)
        msgs = ((InternalEObject)exprEq2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXPR_EQ2, null, msgs);
      if (newExprEq2 != null)
        msgs = ((InternalEObject)newExprEq2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXPR_EQ2, null, msgs);
      msgs = basicSetExprEq2(newExprEq2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXPR_EQ2, newExprEq2, newExprEq2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(EObject newExp, NotificationChain msgs)
  {
    EObject oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(EObject newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQ__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQ__EXP, newExp, newExp));
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
      case MyDslPackage.EQ__EXPR_EQ1:
        return basicSetExprEq1(null, msgs);
      case MyDslPackage.EQ__EXPR_EQ2:
        return basicSetExprEq2(null, msgs);
      case MyDslPackage.EQ__EXP:
        return basicSetExp(null, msgs);
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
      case MyDslPackage.EQ__EXPR_EQ1:
        return getExprEq1();
      case MyDslPackage.EQ__EXPR_EQ2:
        return getExprEq2();
      case MyDslPackage.EQ__EXP:
        return getExp();
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
      case MyDslPackage.EQ__EXPR_EQ1:
        setExprEq1((EObject)newValue);
        return;
      case MyDslPackage.EQ__EXPR_EQ2:
        setExprEq2((EObject)newValue);
        return;
      case MyDslPackage.EQ__EXP:
        setExp((EObject)newValue);
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
      case MyDslPackage.EQ__EXPR_EQ1:
        setExprEq1((EObject)null);
        return;
      case MyDslPackage.EQ__EXPR_EQ2:
        setExprEq2((EObject)null);
        return;
      case MyDslPackage.EQ__EXP:
        setExp((EObject)null);
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
      case MyDslPackage.EQ__EXPR_EQ1:
        return exprEq1 != null;
      case MyDslPackage.EQ__EXPR_EQ2:
        return exprEq2 != null;
      case MyDslPackage.EQ__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //EqImpl
