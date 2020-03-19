package com.example.calculator;

public class CalculatorModel {
  private   int firstArg;
   private int secondArg;

    StringBuilder inputStr = new StringBuilder();

    private State state;

    private int actionSelected;

    public CalculatorModel() {
        state = State.firstArgInput;
    }

    private enum State{
        firstArgInput,
        secondArgInput,
        resultShow;
    }
    public void onNumPressed(int buttonId){// реакция на нажатие кнопки с цифрой

        if (state == State.resultShow){
            state = State.firstArgInput;
        }
if (inputStr.length() < 10) {
switch (buttonId){
    case R.id.zero:
        if (inputStr.length() != 0){
            inputStr.append("0");
        }break;
    case R.id.one:
            inputStr.append("1");
        break;
    case R.id.two:
        inputStr.append("2");
        break;
    case R.id.three:
        inputStr.append("3");
        break;
    case R.id.four:
        inputStr.append("4");
        break;
    case R.id.five:
        inputStr.append("5");
        break;
    case R.id.six:
        inputStr.append("6");
        break;
    case R.id.seven:
        inputStr.append("7");
        break;
    case R.id.eight:
        inputStr.append("8");
        break;case R.id.nine:
        inputStr.append("9");
        break;

}
}
    }
    public void onActionPressed(int actionId) {// реакция на кнопки арифметических действий и равно

        if (actionId == R.id.equals && state == State.secondArgInput) {
secondArg = Integer.parseInt(inputStr.toString());
state = State.resultShow;
inputStr.setLength(0);
            inputStr.setLength(0);
            switch (actionSelected) {
                case R.id.plus:
                    inputStr.append(firstArg + secondArg);
                    break;
                case R.id.minus:
                    inputStr.append(firstArg - secondArg);
                    break;
                case R.id.multiplication:
                    inputStr.append(firstArg * secondArg);
                    break;
                case R.id.division:
                    inputStr.append(firstArg / secondArg);
                    break;


            }
        } else if (inputStr.length() > 0 && state
                == State.firstArgInput) {
            firstArg = Integer.parseInt(inputStr.toString());
        state = State.secondArgInput;
        inputStr.setLength(0);
        switch (actionId) {
                case R.id.plus:
                    actionSelected = R.id.plus;
                    break;
                case R.id.minus:
                    actionSelected = R.id.minus;
                    break;
                case R.id.multiplication:
                    actionSelected = R.id.multiplication;
                    break;
                case R.id.division:
                    actionSelected = R.id.division;
                    break;


            }
        }
    }

    public String getText(){
        return inputStr.toString();
    }


}
