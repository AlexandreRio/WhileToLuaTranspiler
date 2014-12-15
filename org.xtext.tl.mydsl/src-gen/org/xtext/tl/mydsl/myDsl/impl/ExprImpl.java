/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.And;
import org.xtext.tl.mydsl.myDsl.Expr;
import org.xtext.tl.mydsl.myDsl.ExprSimple;
import org.xtext.tl.mydsl.myDsl.ExprTerm;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprImpl#getExprSimple <em>Expr Simple</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprImpl#getExpEt <em>Exp Et</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprImpl#getExpTerminale <em>Exp Terminale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExprSimple() <em>Expr Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSimple()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSimple;

  /**
   * The cached value of the '{@link #getExpEt() <em>Exp Et</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpEt()
   * @generated
   * @ordered
   */
  protected And expEt;

  /**
   * The cached value of the '{@link #getExpTerminale() <em>Exp Terminale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpTerminale()
   * @generated
   * @ordered
   */
  protected ExprTerm expTerminale;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return MyDslPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSimple()
  {
    return exprSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSimple(ExprSimple newExprSimple, NotificationChain msgs)
  {
    ExprSimple oldExprSimple = exprSimple;
    exprSimple = newExprSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXPR_SIMPLE, oldExprSimple, newExprSimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSimple(ExprSimple newExprSimple)
  {
    if (newExprSimple != exprSimple)
    {
      NotificationChain msgs = null;
      if (exprSimple != null)
        msgs = ((InternalEObject)exprSimple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXPR_SIMPLE, null, msgs);
      if (newExprSimple != null)
        msgs = ((InternalEObject)newExprSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXPR_SIMPLE, null, msgs);
      msgs = basicSetExprSimple(newExprSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXPR_SIMPLE, newExprSimple, newExprSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And getExpEt()
  {
    return expEt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpEt(And newExpEt, NotificationChain msgs)
  {
    And oldExpEt = expEt;
    expEt = newExpEt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_ET, oldExpEt, newExpEt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpEt(And newExpEt)
  {
    if (newExpEt != expEt)
    {
      NotificationChain msgs = null;
      if (expEt != null)
        msgs = ((InternalEObject)expEt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_ET, null, msgs);
      if (newExpEt != null)
        msgs = ((InternalEObject)newExpEt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_ET, null, msgs);
      msgs = basicSetExpEt(newExpEt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_ET, newExpEt, newExpEt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTerm getExpTerminale()
  {
    return expTerminale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpTerminale(ExprTerm newExpTerminale, NotificationChain msgs)
  {
    ExprTerm oldExpTerminale = expTerminale;
    expTerminale = newExpTerminale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_TERMINALE, oldExpTerminale, newExpTerminale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpTerminale(ExprTerm newExpTerminale)
  {
    if (newExpTerminale != expTerminale)
    {
      NotificationChain msgs = null;
      if (expTerminale != null)
        msgs = ((InternalEObject)expTerminale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_TERMINALE, null, msgs);
      if (newExpTerminale != null)
        msgs = ((InternalEObject)newExpTerminale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_TERMINALE, null, msgs);
      msgs = basicSetExpTerminale(newExpTerminale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_TERMINALE, newExpTerminale, newExpTerminale));
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
      case MyDslPackage.EXPR__EXPR_SIMPLE:
        return basicSetExprSimple(null, msgs);
      case MyDslPackage.EXPR__EXP_ET:
        return basicSetExpEt(null, msgs);
      case MyDslPackage.EXPR__EXP_TERMINALE:
        return basicSetExpTerminale(null, msgs);
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
      case MyDslPackage.EXPR__EXPR_SIMPLE:
        return getExprSimple();
      case MyDslPackage.EXPR__EXP_ET:
        return getExpEt();
      case MyDslPackage.EXPR__EXP_TERMINALE:
        return getExpTerminale();
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
      case MyDslPackage.EXPR__EXPR_SIMPLE:
        setExprSimple((ExprSimple)newValue);
        return;
      case MyDslPackage.EXPR__EXP_ET:
        setExpEt((And)newValue);
        return;
      case MyDslPackage.EXPR__EXP_TERMINALE:
        setExpTerminale((ExprTerm)newValue);
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
      case MyDslPackage.EXPR__EXPR_SIMPLE:
        setExprSimple((ExprSimple)null);
        return;
      case MyDslPackage.EXPR__EXP_ET:
        setExpEt((And)null);
        return;
      case MyDslPackage.EXPR__EXP_TERMINALE:
        setExpTerminale((ExprTerm)null);
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
      case MyDslPackage.EXPR__EXPR_SIMPLE:
        return exprSimple != null;
      case MyDslPackage.EXPR__EXP_ET:
        return expEt != null;
      case MyDslPackage.EXPR__EXP_TERMINALE:
        return expTerminale != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
