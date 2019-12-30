package sas.tut.math;

public class Operations {
  // null returning method
  public Integer add(Integer a, Integer b) {
    Integer result = null;
    if (a == null || b == null) {
      return result;
    }
    result = a + b;
    return result;
  }
}
