/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL.impl;

import fr.minesnantes.browserautomation.seleniumDSL.CallProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallProcedureImpl extends InstructionImpl implements CallProcedure
{
  /**
   * The default value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureName()
   * @generated
   * @ordered
   */
  protected static final String PROCEDURE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureName()
   * @generated
   * @ordered
   */
  protected String procedureName = PROCEDURE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallProcedureImpl()
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
    return SeleniumDSLPackage.Literals.CALL_PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcedureName()
  {
    return procedureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedureName(String newProcedureName)
  {
    String oldProcedureName = procedureName;
    procedureName = newProcedureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDSLPackage.CALL_PROCEDURE__PROCEDURE_NAME, oldProcedureName, procedureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, SeleniumDSLPackage.CALL_PROCEDURE__PARAMETERS);
    }
    return parameters;
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
      case SeleniumDSLPackage.CALL_PROCEDURE__PROCEDURE_NAME:
        return getProcedureName();
      case SeleniumDSLPackage.CALL_PROCEDURE__PARAMETERS:
        return getParameters();
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
      case SeleniumDSLPackage.CALL_PROCEDURE__PROCEDURE_NAME:
        setProcedureName((String)newValue);
        return;
      case SeleniumDSLPackage.CALL_PROCEDURE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
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
      case SeleniumDSLPackage.CALL_PROCEDURE__PROCEDURE_NAME:
        setProcedureName(PROCEDURE_NAME_EDEFAULT);
        return;
      case SeleniumDSLPackage.CALL_PROCEDURE__PARAMETERS:
        getParameters().clear();
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
      case SeleniumDSLPackage.CALL_PROCEDURE__PROCEDURE_NAME:
        return PROCEDURE_NAME_EDEFAULT == null ? procedureName != null : !PROCEDURE_NAME_EDEFAULT.equals(procedureName);
      case SeleniumDSLPackage.CALL_PROCEDURE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (ProcedureName: ");
    result.append(procedureName);
    result.append(", Parameters: ");
    result.append(parameters);
    result.append(')');
    return result.toString();
  }

} //CallProcedureImpl