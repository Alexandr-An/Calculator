package com.example.calculator;

public class CalculatorModel {
  private   int firstArg;
   private int secondArg;

    StringBuilder inputStr = new StringBuilder();

    private State state;

    public CalculatorModel() {
        state = State.firstArgInput;
    }

    private enum State{
        firstArgInput,
        secondArgInput,
        resultShow;
    }
    public void onNumPressed(int buttonId){

    }
    public void onActionPressed(int actionId){

    }


}
