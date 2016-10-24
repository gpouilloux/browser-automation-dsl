/**
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.tests;

import com.google.inject.Inject;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest;
import fr.minesnantes.browserautomation.tests.SeleniumDSLInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SeleniumDSLInjectorProvider.class)
@SuppressWarnings("all")
public class SeleniumDSLParsingTest {
  @Inject
  private ParseHelper<SeleniumTest> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final SeleniumTest result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}