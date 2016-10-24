/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SeleniumDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "seleniumDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.minesnantes.fr/browserautomation/SeleniumDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "seleniumDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SeleniumDSLPackage eINSTANCE = fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumTestImpl <em>Selenium Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumTestImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getSeleniumTest()
   * @generated
   */
  int SELENIUM_TEST = 0;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELENIUM_TEST__PROCEDURES = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELENIUM_TEST__MAIN = 1;

  /**
   * The number of structural features of the '<em>Selenium Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELENIUM_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ProcedureImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__INSTRUCTIONS = 2;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.MainProcedureImpl <em>Main Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.MainProcedureImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getMainProcedure()
   * @generated
   */
  int MAIN_PROCEDURE = 2;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PROCEDURE__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Main Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PROCEDURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.InstructionImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 3;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ClickImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getClick()
   * @generated
   */
  int CLICK = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.FillImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getFill()
   * @generated
   */
  int FILL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.NavigateImpl <em>Navigate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.NavigateImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getNavigate()
   * @generated
   */
  int NAVIGATE = 6;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE__URL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Navigate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ReadImpl <em>Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ReadImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getRead()
   * @generated
   */
  int READ = 7;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ__NAME = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl <em>Assert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getAssert()
   * @generated
   */
  int ASSERT = 8;

  /**
   * The feature id for the '<em><b>Search</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__SEARCH = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__NAME = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl <em>Call Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl
   * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getCallProcedure()
   * @generated
   */
  int CALL_PROCEDURE = 9;

  /**
   * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PROCEDURE__PROCEDURE_NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PROCEDURE__PARAMETERS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PROCEDURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest <em>Selenium Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selenium Test</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest
   * @generated
   */
  EClass getSeleniumTest();

  /**
   * Returns the meta object for the containment reference list '{@link fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest#getProcedures()
   * @see #getSeleniumTest()
   * @generated
   */
  EReference getSeleniumTest_Procedures();

  /**
   * Returns the meta object for the containment reference '{@link fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest#getMain()
   * @see #getSeleniumTest()
   * @generated
   */
  EReference getSeleniumTest_Main();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the attribute list '{@link fr.minesnantes.browserautomation.seleniumDSL.Procedure#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Procedure#getParameters()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link fr.minesnantes.browserautomation.seleniumDSL.Procedure#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Procedure#getInstructions()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Instructions();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.MainProcedure <em>Main Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Procedure</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.MainProcedure
   * @generated
   */
  EClass getMainProcedure();

  /**
   * Returns the meta object for the containment reference list '{@link fr.minesnantes.browserautomation.seleniumDSL.MainProcedure#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.MainProcedure#getInstructions()
   * @see #getMainProcedure()
   * @generated
   */
  EReference getMainProcedure_Instructions();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Click
   * @generated
   */
  EClass getClick();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Click#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Click#getName()
   * @see #getClick()
   * @generated
   */
  EAttribute getClick_Name();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Fill#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Fill#getName()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Fill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Fill#getValue()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Value();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Navigate <em>Navigate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigate</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Navigate
   * @generated
   */
  EClass getNavigate();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Navigate#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Navigate#getUrl()
   * @see #getNavigate()
   * @generated
   */
  EAttribute getNavigate_Url();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Read
   * @generated
   */
  EClass getRead();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Read#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Read#getVariable()
   * @see #getRead()
   * @generated
   */
  EAttribute getRead_Variable();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Read#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Read#getName()
   * @see #getRead()
   * @generated
   */
  EAttribute getRead_Name();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Assert
   * @generated
   */
  EClass getAssert();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Assert#getSearch <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Search</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Assert#getSearch()
   * @see #getAssert()
   * @generated
   */
  EAttribute getAssert_Search();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Assert#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Assert#getValue()
   * @see #getAssert()
   * @generated
   */
  EAttribute getAssert_Value();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.Assert#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.Assert#getName()
   * @see #getAssert()
   * @generated
   */
  EAttribute getAssert_Name();

  /**
   * Returns the meta object for class '{@link fr.minesnantes.browserautomation.seleniumDSL.CallProcedure <em>Call Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Procedure</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.CallProcedure
   * @generated
   */
  EClass getCallProcedure();

  /**
   * Returns the meta object for the attribute '{@link fr.minesnantes.browserautomation.seleniumDSL.CallProcedure#getProcedureName <em>Procedure Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Procedure Name</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.CallProcedure#getProcedureName()
   * @see #getCallProcedure()
   * @generated
   */
  EAttribute getCallProcedure_ProcedureName();

  /**
   * Returns the meta object for the attribute list '{@link fr.minesnantes.browserautomation.seleniumDSL.CallProcedure#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see fr.minesnantes.browserautomation.seleniumDSL.CallProcedure#getParameters()
   * @see #getCallProcedure()
   * @generated
   */
  EAttribute getCallProcedure_Parameters();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SeleniumDSLFactory getSeleniumDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumTestImpl <em>Selenium Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumTestImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getSeleniumTest()
     * @generated
     */
    EClass SELENIUM_TEST = eINSTANCE.getSeleniumTest();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELENIUM_TEST__PROCEDURES = eINSTANCE.getSeleniumTest_Procedures();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELENIUM_TEST__MAIN = eINSTANCE.getSeleniumTest_Main();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ProcedureImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__PARAMETERS = eINSTANCE.getProcedure_Parameters();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__INSTRUCTIONS = eINSTANCE.getProcedure_Instructions();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.MainProcedureImpl <em>Main Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.MainProcedureImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getMainProcedure()
     * @generated
     */
    EClass MAIN_PROCEDURE = eINSTANCE.getMainProcedure();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_PROCEDURE__INSTRUCTIONS = eINSTANCE.getMainProcedure_Instructions();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.InstructionImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ClickImpl <em>Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ClickImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getClick()
     * @generated
     */
    EClass CLICK = eINSTANCE.getClick();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLICK__NAME = eINSTANCE.getClick_Name();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.FillImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__NAME = eINSTANCE.getFill_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__VALUE = eINSTANCE.getFill_Value();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.NavigateImpl <em>Navigate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.NavigateImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getNavigate()
     * @generated
     */
    EClass NAVIGATE = eINSTANCE.getNavigate();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIGATE__URL = eINSTANCE.getNavigate_Url();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.ReadImpl <em>Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.ReadImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getRead()
     * @generated
     */
    EClass READ = eINSTANCE.getRead();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ__VARIABLE = eINSTANCE.getRead_Variable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ__NAME = eINSTANCE.getRead_Name();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl <em>Assert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.AssertImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getAssert()
     * @generated
     */
    EClass ASSERT = eINSTANCE.getAssert();

    /**
     * The meta object literal for the '<em><b>Search</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERT__SEARCH = eINSTANCE.getAssert_Search();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERT__VALUE = eINSTANCE.getAssert_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERT__NAME = eINSTANCE.getAssert_Name();

    /**
     * The meta object literal for the '{@link fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl <em>Call Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.CallProcedureImpl
     * @see fr.minesnantes.browserautomation.seleniumDSL.impl.SeleniumDSLPackageImpl#getCallProcedure()
     * @generated
     */
    EClass CALL_PROCEDURE = eINSTANCE.getCallProcedure();

    /**
     * The meta object literal for the '<em><b>Procedure Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_PROCEDURE__PROCEDURE_NAME = eINSTANCE.getCallProcedure_ProcedureName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_PROCEDURE__PARAMETERS = eINSTANCE.getCallProcedure_Parameters();

  }

} //SeleniumDSLPackage
