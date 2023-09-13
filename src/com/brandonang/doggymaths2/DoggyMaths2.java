package com.brandonang.doggymaths2;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class DoggyMaths2 extends AndroidNonvisibleComponent {

  public DoggyMaths2(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public int AddThreeNumbers(int num1, int num2, int num3){
    return num1 + num2 + num3;
  }

  @SimpleFunction
  public int SubtractThreeNumbers(int num1, int num2, int num3){
    return num1 - num2 - num3;
  }

  @SimpleFunction
  public int MultiplyThreeNumbers(int num1, int num2, int num3){
    return num1 * num2 * num3;
  }

  @SimpleFunction
  public int DivideThreeNumbers(int num1, int num2, int num3){
    return num1 * num2 * num3;
  }

   @SimpleFunction
  public int AddFourNumbers(int num1, int num2, int num3, int num4){
    return num1 + num2 + num3 + num4;
  }

  @SimpleFunction
  public int SubtractFourNumbers(int num1, int num2, int num3, int num4){
    return num1 - num2 - num3 - num4;
  }

  @SimpleFunction
  public int MultiplyFourNumbers(int num1, int num2, int num3, int num4){
    return num1 * num2 * num3 * num4;
  }

  @SimpleFunction
  public int DivideFourNumbers(int num1, int num2, int num3, int num4){
    return num1 / num2 / num3 / num4;
  }
}
