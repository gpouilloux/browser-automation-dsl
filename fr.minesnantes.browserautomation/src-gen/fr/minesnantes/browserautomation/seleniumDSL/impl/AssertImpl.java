/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL.impl;

import fr.minesnantes.browserautomation.seleniumDSL.Assert;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertImpl extends InstructionImpl implements Assert
{
  /**
   * The default value of the '{@link #getSearch() <em>Search</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected static final String SEARCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSearch() <em>Search</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected String search = SEARCH_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertImpl()
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
    return SeleniumDSLPackage.Literals.ASSERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSearch()
  {
    return search;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearch(String newSearch)
  {
    String oldSearch = search;
    search = newSearch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDSLPackage.ASSERT__SEARCH, oldSearch, search));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDSLPackage.ASSERT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumDSLPackage.ASSERT__NAME, oldName, name));
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
      case SeleniumDSLPackage.ASSERT__SEARCH:
        return getSearch();
      case SeleniumDSLPackage.ASSERT__VALUE:
        return getValue();
      case SeleniumDSLPackage.ASSERT__NAME:
        return getName();
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
      case SeleniumDSLPackage.ASSERT__SEARCH:
        setSearch((String)newValue);
        return;
      case SeleniumDSLPackage.ASSERT__VALUE:
        setValue((String)newValue);
        return;
      case SeleniumDSLPackage.ASSERT__NAME:
        setName((String)newValue);
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
      case SeleniumDSLPackage.ASSERT__SEARCH:
        setSearch(SEARCH_EDEFAULT);
        return;
      case SeleniumDSLPackage.ASSERT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SeleniumDSLPackage.ASSERT__NAME:
        setName(NAME_EDEFAULT);
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
      case SeleniumDSLPackage.ASSERT__SEARCH:
        return SEARCH_EDEFAULT == null ? search != null : !SEARCH_EDEFAULT.equals(search);
      case SeleniumDSLPackage.ASSERT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SeleniumDSLPackage.ASSERT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (Search: ");
    result.append(search);
    result.append(", Value: ");
    result.append(value);
    result.append(", Name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AssertImpl
