/**
 */
package org.xtext.tl.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tl.mydsl.myDsl.Command;
import org.xtext.tl.mydsl.myDsl.Commands;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getVarL <em>Var L</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getExpL <em>Exp L</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.impl.CommandImpl#getC2 <em>C2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The default value of the '{@link #getVarL() <em>Var L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarL()
   * @generated
   * @ordered
   */
  protected static final String VAR_L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarL() <em>Var L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarL()
   * @generated
   * @ordered
   */
  protected String varL = VAR_L_EDEFAULT;

  /**
   * The default value of the '{@link #getExpL() <em>Exp L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpL()
   * @generated
   * @ordered
   */
  protected static final String EXP_L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpL() <em>Exp L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpL()
   * @generated
   * @ordered
   */
  protected String expL = EXP_L_EDEFAULT;

  /**
   * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected static final String NOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected String nom = NOM_EDEFAULT;

  /**
   * The default value of the '{@link #getExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected static final String EXP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected String exp = EXP_EDEFAULT;

  /**
   * The cached value of the '{@link #getC1() <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC1()
   * @generated
   * @ordered
   */
  protected Commands c1;

  /**
   * The default value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected static final String EXP1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected String exp1 = EXP1_EDEFAULT;

  /**
   * The default value of the '{@link #getExp2() <em>Exp2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected static final String EXP2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected String exp2 = EXP2_EDEFAULT;

  /**
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected Commands c2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return MyDslPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarL()
  {
    return varL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarL(String newVarL)
  {
    String oldVarL = varL;
    varL = newVarL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__VAR_L, oldVarL, varL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpL()
  {
    return expL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpL(String newExpL)
  {
    String oldExpL = expL;
    expL = newExpL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__EXP_L, oldExpL, expL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNom()
  {
    return nom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNom(String newNom)
  {
    String oldNom = nom;
    nom = newNom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__NOM, oldNom, nom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(String newExp)
  {
    String oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__EXP, oldExp, exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC1()
  {
    return c1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC1(Commands newC1, NotificationChain msgs)
  {
    Commands oldC1 = c1;
    c1 = newC1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__C1, oldC1, newC1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC1(Commands newC1)
  {
    if (newC1 != c1)
    {
      NotificationChain msgs = null;
      if (c1 != null)
        msgs = ((InternalEObject)c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__C1, null, msgs);
      if (newC1 != null)
        msgs = ((InternalEObject)newC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__C1, null, msgs);
      msgs = basicSetC1(newC1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__C1, newC1, newC1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp1(String newExp1)
  {
    String oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__EXP1, oldExp1, exp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp2(String newExp2)
  {
    String oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__EXP2, oldExp2, exp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC2()
  {
    return c2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC2(Commands newC2, NotificationChain msgs)
  {
    Commands oldC2 = c2;
    c2 = newC2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__C2, oldC2, newC2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC2(Commands newC2)
  {
    if (newC2 != c2)
    {
      NotificationChain msgs = null;
      if (c2 != null)
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__C2, newC2, newC2));
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
      case MyDslPackage.COMMAND__C1:
        return basicSetC1(null, msgs);
      case MyDslPackage.COMMAND__C2:
        return basicSetC2(null, msgs);
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
      case MyDslPackage.COMMAND__VAR_L:
        return getVarL();
      case MyDslPackage.COMMAND__EXP_L:
        return getExpL();
      case MyDslPackage.COMMAND__NOM:
        return getNom();
      case MyDslPackage.COMMAND__EXP:
        return getExp();
      case MyDslPackage.COMMAND__C1:
        return getC1();
      case MyDslPackage.COMMAND__EXP1:
        return getExp1();
      case MyDslPackage.COMMAND__EXP2:
        return getExp2();
      case MyDslPackage.COMMAND__C2:
        return getC2();
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
      case MyDslPackage.COMMAND__VAR_L:
        setVarL((String)newValue);
        return;
      case MyDslPackage.COMMAND__EXP_L:
        setExpL((String)newValue);
        return;
      case MyDslPackage.COMMAND__NOM:
        setNom((String)newValue);
        return;
      case MyDslPackage.COMMAND__EXP:
        setExp((String)newValue);
        return;
      case MyDslPackage.COMMAND__C1:
        setC1((Commands)newValue);
        return;
      case MyDslPackage.COMMAND__EXP1:
        setExp1((String)newValue);
        return;
      case MyDslPackage.COMMAND__EXP2:
        setExp2((String)newValue);
        return;
      case MyDslPackage.COMMAND__C2:
        setC2((Commands)newValue);
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
      case MyDslPackage.COMMAND__VAR_L:
        setVarL(VAR_L_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__EXP_L:
        setExpL(EXP_L_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__NOM:
        setNom(NOM_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__EXP:
        setExp(EXP_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__C1:
        setC1((Commands)null);
        return;
      case MyDslPackage.COMMAND__EXP1:
        setExp1(EXP1_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__EXP2:
        setExp2(EXP2_EDEFAULT);
        return;
      case MyDslPackage.COMMAND__C2:
        setC2((Commands)null);
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
      case MyDslPackage.COMMAND__VAR_L:
        return VAR_L_EDEFAULT == null ? varL != null : !VAR_L_EDEFAULT.equals(varL);
      case MyDslPackage.COMMAND__EXP_L:
        return EXP_L_EDEFAULT == null ? expL != null : !EXP_L_EDEFAULT.equals(expL);
      case MyDslPackage.COMMAND__NOM:
        return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
      case MyDslPackage.COMMAND__EXP:
        return EXP_EDEFAULT == null ? exp != null : !EXP_EDEFAULT.equals(exp);
      case MyDslPackage.COMMAND__C1:
        return c1 != null;
      case MyDslPackage.COMMAND__EXP1:
        return EXP1_EDEFAULT == null ? exp1 != null : !EXP1_EDEFAULT.equals(exp1);
      case MyDslPackage.COMMAND__EXP2:
        return EXP2_EDEFAULT == null ? exp2 != null : !EXP2_EDEFAULT.equals(exp2);
      case MyDslPackage.COMMAND__C2:
        return c2 != null;
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
    result.append(" (varL: ");
    result.append(varL);
    result.append(", expL: ");
    result.append(expL);
    result.append(", nom: ");
    result.append(nom);
    result.append(", exp: ");
    result.append(exp);
    result.append(", exp1: ");
    result.append(exp1);
    result.append(", exp2: ");
    result.append(exp2);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
