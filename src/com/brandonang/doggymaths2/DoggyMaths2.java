package com.brandonang.doggymaths2;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;

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
}