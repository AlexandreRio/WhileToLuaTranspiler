/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.ExprTerm;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl#getTermVar <em>Term Var</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl#getTermSym <em>Term Sym</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprTermImpl extends MinimalEObjectImpl.Container implements ExprTerm
{
  /**
   * The default value of the '{@link #getTermVar() <em>Term Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermVar()
   * @generated
   * @ordered
   */
  protected static final String TERM_VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTermVar() <em>Term Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermVar()
   * @generated
   * @ordered
   */
  protected String termVar = TERM_VAR_EDEFAULT;

  /**
   * The default value of the '{@link #getTermSym() <em>Term Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermSym()
   * @generated
   * @ordered
   */
  protected static final String TERM_SYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTermSym() <em>Term Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermSym()
   * @generated
   * @ordered
   */
  protected String termSym = TERM_SYM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprTermImpl()
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
    return MyDslPackage.Literals.EXPR_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTermVar()
  {
    return termVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermVar(String newTermVar)
  {
    String oldTermVar = termVar;
    termVar = newTermVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_TERM__TERM_VAR, oldTermVar, termVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTermSym()
  {
    return termSym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermSym(String newTermSym)
  {
    String oldTermSym = termSym;
    termSym = newTermSym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_TERM__TERM_SYM, oldTermSym, termSym));
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
      case MyDslPackage.EXPR_TERM__TERM_VAR:
        return getTermVar();
      case MyDslPackage.EXPR_TERM__TERM_SYM:
        return getTermSym();
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
      case MyDslPackage.EXPR_TERM__TERM_VAR:
        setTermVar((String)newValue);
        return;
      case MyDslPackage.EXPR_TERM__TERM_SYM:
        setTermSym((String)newValue);
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
      case MyDslPackage.EXPR_TERM__TERM_VAR:
        setTermVar(TERM_VAR_EDEFAULT);
        return;
      case MyDslPackage.EXPR_TERM__TERM_SYM:
        setTermSym(TERM_SYM_EDEFAULT);
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
      case MyDslPackage.EXPR_TERM__TERM_VAR:
        return TERM_VAR_EDEFAULT == null ? termVar != null : !TERM_VAR_EDEFAULT.equals(termVar);
      case MyDslPackage.EXPR_TERM__TERM_SYM:
        return TERM_SYM_EDEFAULT == null ? termSym != null : !TERM_SYM_EDEFAULT.equals(termSym);
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
    result.append(" (termVar: ");
    result.append(termVar);
    result.append(", termSym: ");
    result.append(termSym);
    result.append(')');
    return result.toString();
  }

} //ExprTermImpl
