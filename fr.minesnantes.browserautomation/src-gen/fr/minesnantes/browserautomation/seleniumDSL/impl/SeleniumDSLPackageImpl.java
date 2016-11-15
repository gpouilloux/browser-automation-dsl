/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL.impl;

import fr.minesnantes.browserautomation.seleniumDSL.Assert;
import fr.minesnantes.browserautomation.seleniumDSL.CallProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Click;
import fr.minesnantes.browserautomation.seleniumDSL.Fill;
import fr.minesnantes.browserautomation.seleniumDSL.Instruction;
import fr.minesnantes.browserautomation.seleniumDSL.MainProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Navigate;
import fr.minesnantes.browserautomation.seleniumDSL.Procedure;
import fr.minesnantes.browserautomation.seleniumDSL.Read;
import fr.minesnantes.browserautomation.seleniumDSL.Select;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLFactory;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest;
import fr.minesnantes.browserautomation.seleniumDSL.Tick;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumDSLPackageImpl extends EPackageImpl implements SeleniumDSLPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass seleniumTestEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass procedureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mainProcedureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass instructionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass clickEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass fillEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass selectEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tickEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass navigateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass readEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass assertEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass callProcedureEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SeleniumDSLPackageImpl()
  {
		super(eNS_URI, SeleniumDSLFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SeleniumDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SeleniumDSLPackage init()
  {
		if (isInited) return (SeleniumDSLPackage)EPackage.Registry.INSTANCE.getEPackage(SeleniumDSLPackage.eNS_URI);

		// Obtain or create and register package
		SeleniumDSLPackageImpl theSeleniumDSLPackage = (SeleniumDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeleniumDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeleniumDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSeleniumDSLPackage.createPackageContents();

		// Initialize created meta-data
		theSeleniumDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeleniumDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeleniumDSLPackage.eNS_URI, theSeleniumDSLPackage);
		return theSeleniumDSLPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSeleniumTest()
  {
		return seleniumTestEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSeleniumTest_Procedures()
  {
		return (EReference)seleniumTestEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSeleniumTest_Main()
  {
		return (EReference)seleniumTestEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProcedure()
  {
		return procedureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProcedure_Name()
  {
		return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProcedure_Parameters()
  {
		return (EAttribute)procedureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProcedure_Instructions()
  {
		return (EReference)procedureEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMainProcedure()
  {
		return mainProcedureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMainProcedure_Instructions()
  {
		return (EReference)mainProcedureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInstruction()
  {
		return instructionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getClick()
  {
		return clickEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getClick_Type()
  {
		return (EAttribute)clickEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getClick_Value()
  {
		return (EAttribute)clickEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFill()
  {
		return fillEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFill_Name()
  {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFill_Value()
  {
		return (EAttribute)fillEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSelect()
  {
		return selectEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSelect_Name()
  {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSelect_Value()
  {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTick()
  {
		return tickEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTick_Name()
  {
		return (EAttribute)tickEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNavigate()
  {
		return navigateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNavigate_Url()
  {
		return (EAttribute)navigateEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRead()
  {
		return readEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRead_Variable()
  {
		return (EAttribute)readEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRead_Name()
  {
		return (EAttribute)readEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssert()
  {
		return assertEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAssert_Search()
  {
		return (EAttribute)assertEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAssert_Value()
  {
		return (EAttribute)assertEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAssert_Name()
  {
		return (EAttribute)assertEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCallProcedure()
  {
		return callProcedureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCallProcedure_ProcedureName()
  {
		return (EAttribute)callProcedureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCallProcedure_Parameters()
  {
		return (EAttribute)callProcedureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeleniumDSLFactory getSeleniumDSLFactory()
  {
		return (SeleniumDSLFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		seleniumTestEClass = createEClass(SELENIUM_TEST);
		createEReference(seleniumTestEClass, SELENIUM_TEST__PROCEDURES);
		createEReference(seleniumTestEClass, SELENIUM_TEST__MAIN);

		procedureEClass = createEClass(PROCEDURE);
		createEAttribute(procedureEClass, PROCEDURE__NAME);
		createEAttribute(procedureEClass, PROCEDURE__PARAMETERS);
		createEReference(procedureEClass, PROCEDURE__INSTRUCTIONS);

		mainProcedureEClass = createEClass(MAIN_PROCEDURE);
		createEReference(mainProcedureEClass, MAIN_PROCEDURE__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		clickEClass = createEClass(CLICK);
		createEAttribute(clickEClass, CLICK__TYPE);
		createEAttribute(clickEClass, CLICK__VALUE);

		fillEClass = createEClass(FILL);
		createEAttribute(fillEClass, FILL__NAME);
		createEAttribute(fillEClass, FILL__VALUE);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__NAME);
		createEAttribute(selectEClass, SELECT__VALUE);

		tickEClass = createEClass(TICK);
		createEAttribute(tickEClass, TICK__NAME);

		navigateEClass = createEClass(NAVIGATE);
		createEAttribute(navigateEClass, NAVIGATE__URL);

		readEClass = createEClass(READ);
		createEAttribute(readEClass, READ__VARIABLE);
		createEAttribute(readEClass, READ__NAME);

		assertEClass = createEClass(ASSERT);
		createEAttribute(assertEClass, ASSERT__SEARCH);
		createEAttribute(assertEClass, ASSERT__VALUE);
		createEAttribute(assertEClass, ASSERT__NAME);

		callProcedureEClass = createEClass(CALL_PROCEDURE);
		createEAttribute(callProcedureEClass, CALL_PROCEDURE__PROCEDURE_NAME);
		createEAttribute(callProcedureEClass, CALL_PROCEDURE__PARAMETERS);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clickEClass.getESuperTypes().add(this.getInstruction());
		fillEClass.getESuperTypes().add(this.getInstruction());
		selectEClass.getESuperTypes().add(this.getInstruction());
		tickEClass.getESuperTypes().add(this.getInstruction());
		navigateEClass.getESuperTypes().add(this.getInstruction());
		readEClass.getESuperTypes().add(this.getInstruction());
		assertEClass.getESuperTypes().add(this.getInstruction());
		callProcedureEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes and features; add operations and parameters
		initEClass(seleniumTestEClass, SeleniumTest.class, "SeleniumTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeleniumTest_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, SeleniumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeleniumTest_Main(), this.getMainProcedure(), null, "main", null, 0, 1, SeleniumTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedure_Parameters(), ecorePackage.getEString(), "Parameters", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedure_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainProcedureEClass, MainProcedure.class, "MainProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainProcedure_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, MainProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clickEClass, Click.class, "Click", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClick_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Click.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClick_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Click.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFill_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFill_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tickEClass, Tick.class, "Tick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTick_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigateEClass, Navigate.class, "Navigate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigate_Url(), ecorePackage.getEString(), "url", null, 0, 1, Navigate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRead_Variable(), ecorePackage.getEString(), "Variable", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRead_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssert_Search(), ecorePackage.getEString(), "Search", null, 0, 1, Assert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssert_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Assert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssert_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Assert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callProcedureEClass, CallProcedure.class, "CallProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallProcedure_ProcedureName(), ecorePackage.getEString(), "ProcedureName", null, 0, 1, CallProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallProcedure_Parameters(), ecorePackage.getEString(), "Parameters", null, 0, -1, CallProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SeleniumDSLPackageImpl
