/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL.util;

import fr.minesnantes.browserautomation.seleniumDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage
 * @generated
 */
public class SeleniumDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SeleniumDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SeleniumDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SeleniumDSLPackage.SELENIUM_TEST:
      {
        SeleniumTest seleniumTest = (SeleniumTest)theEObject;
        T result = caseSeleniumTest(seleniumTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.MAIN_PROCEDURE:
      {
        MainProcedure mainProcedure = (MainProcedure)theEObject;
        T result = caseMainProcedure(mainProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = caseInstruction(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = caseInstruction(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseInstruction(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.TICK:
      {
        Tick tick = (Tick)theEObject;
        T result = caseTick(tick);
        if (result == null) result = caseInstruction(tick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.NAVIGATE:
      {
        Navigate navigate = (Navigate)theEObject;
        T result = caseNavigate(navigate);
        if (result == null) result = caseInstruction(navigate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.READ:
      {
        Read read = (Read)theEObject;
        T result = caseRead(read);
        if (result == null) result = caseInstruction(read);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.ASSERT:
      {
        Assert assert_ = (Assert)theEObject;
        T result = caseAssert(assert_);
        if (result == null) result = caseInstruction(assert_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SeleniumDSLPackage.CALL_PROCEDURE:
      {
        CallProcedure callProcedure = (CallProcedure)theEObject;
        T result = caseCallProcedure(callProcedure);
        if (result == null) result = caseInstruction(callProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selenium Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selenium Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeleniumTest(SeleniumTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainProcedure(MainProcedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTick(Tick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigate(Navigate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRead(Read object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssert(Assert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallProcedure(CallProcedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SeleniumDSLSwitch
