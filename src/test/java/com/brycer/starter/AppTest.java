package com.brycer.starter;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    App testApp = new App();
    String fileContents = testApp.readFile();
    assertTrue(true);
  }
}
