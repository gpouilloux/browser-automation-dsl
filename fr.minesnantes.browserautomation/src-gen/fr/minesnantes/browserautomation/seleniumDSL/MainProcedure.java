/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.seleniumDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.minesnantes.browserautomation.seleniumDSL.MainProcedure#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage#getMainProcedure()
 * @model
 * @generated
 */
public interface MainProcedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link fr.minesnantes.browserautomation.seleniumDSL.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage#getMainProcedure_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // MainProcedure