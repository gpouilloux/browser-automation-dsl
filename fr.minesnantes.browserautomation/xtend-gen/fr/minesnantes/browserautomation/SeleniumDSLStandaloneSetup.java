/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation;

import fr.minesnantes.browserautomation.SeleniumDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SeleniumDSLStandaloneSetup extends SeleniumDSLStandaloneSetupGenerated {
  public static void doSetup() {
    SeleniumDSLStandaloneSetup _seleniumDSLStandaloneSetup = new SeleniumDSLStandaloneSetup();
    _seleniumDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}