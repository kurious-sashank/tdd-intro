package sas.tut.math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OperationsTest {

  @InjectMocks private Operations operations;

  @Test
  public void testAddition() {
    // arrange
    // set up your story & data points
    Integer a = 1;
    Integer b = 1;
    Integer expected = 2;
    // act
    // Write the invocation here
    Integer actual = operations.add(a, b);

    // assert
    System.out.println("Expected : " + expected);
    System.out.println("Actual : " + actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testAddition_whenInputsNull_thenReturnNull() {
    // arrange
    // set up your story & data points
    Integer a = null;
    Integer b = 1;
    // act
    // Write the invocation here
    Integer actual = operations.add(a, b);

    // assert
    System.out.println("Actual : " + actual);
    Assert.assertNull(actual);
  }
}
