/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL.impl;

import fr.minesnantes.browserautomation.seleniumDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumDSLFactoryImpl extends EFactoryImpl implements SeleniumDSLFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SeleniumDSLFactory init()
  {
		try {
			SeleniumDSLFactory theSeleniumDSLFactory = (SeleniumDSLFactory)EPackage.Registry.INSTANCE.getEFactory(SeleniumDSLPackage.eNS_URI);
			if (theSeleniumDSLFactory != null) {
				return theSeleniumDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeleniumDSLFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeleniumDSLFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SeleniumDSLPackage.SELENIUM_TEST: return createSeleniumTest();
			case SeleniumDSLPackage.PROCEDURE: return createProcedure();
			case SeleniumDSLPackage.MAIN_PROCEDURE: return createMainProcedure();
			case SeleniumDSLPackage.INSTRUCTION: return createInstruction();
			case SeleniumDSLPackage.CLICK: return createClick();
			case SeleniumDSLPackage.FILL: return createFill();
			case SeleniumDSLPackage.SELECT: return createSelect();
			case SeleniumDSLPackage.TICK: return createTick();
			case SeleniumDSLPackage.NAVIGATE: return createNavigate();
			case SeleniumDSLPackage.READ: return createRead();
			case SeleniumDSLPackage.ASSERT: return createAssert();
			case SeleniumDSLPackage.CALL_PROCEDURE: return createCallProcedure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeleniumTest createSeleniumTest()
  {
		SeleniumTestImpl seleniumTest = new SeleniumTestImpl();
		return seleniumTest;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Procedure createProcedure()
  {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MainProcedure createMainProcedure()
  {
		MainProcedureImpl mainProcedure = new MainProcedureImpl();
		return mainProcedure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Instruction createInstruction()
  {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Click createClick()
  {
		ClickImpl click = new ClickImpl();
		return click;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Fill createFill()
  {
		FillImpl fill = new FillImpl();
		return fill;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Select createSelect()
  {
		SelectImpl select = new SelectImpl();
		return select;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tick createTick()
  {
		TickImpl tick = new TickImpl();
		return tick;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Navigate createNavigate()
  {
		NavigateImpl navigate = new NavigateImpl();
		return navigate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Read createRead()
  {
		ReadImpl read = new ReadImpl();
		return read;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Assert createAssert()
  {
		AssertImpl assert_ = new AssertImpl();
		return assert_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CallProcedure createCallProcedure()
  {
		CallProcedureImpl callProcedure = new CallProcedureImpl();
		return callProcedure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeleniumDSLPackage getSeleniumDSLPackage()
  {
		return (SeleniumDSLPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SeleniumDSLPackage getPackage()
  {
		return SeleniumDSLPackage.eINSTANCE;
	}

} //SeleniumDSLFactoryImpl
