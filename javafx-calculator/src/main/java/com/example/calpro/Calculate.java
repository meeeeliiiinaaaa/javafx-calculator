package com.example.calpro;

public class Calculate {

    public float calculateUnaryNumber(float number1,String operator , String format){
        switch (operator) {

            case "√":
                return (long)Math.sqrt(number1);
            case "Sin":
                if(format.equals("deg")) {
                    return (float) Math.sin(Math.toRadians(number1));
                }
                else {
                    return (float) Math.sin(number1);
                }
            case "Cos":
                if(format.equals("deg")) {
                    return (float) Math.cos(Math.toRadians(number1));
                }
                else {
                    return (float) Math.cos(number1);
                }
            case "Tan":
                if(format.equals("deg")) {
                    return (float) Math.tan(Math.toRadians(number1));
                }
                else {
                    return (float) Math.tan(number1);
                }
            case "Sinh":
                if(format.equals("deg")) {
                    return (float) Math.sinh(Math.toRadians(number1));
                }
                else {
                    return (float) Math.sinh(number1);
                }
            case "Cosh":
                if(format.equals("deg")) {
                    return (float) Math.cosh(Math.toRadians(number1));
                }
                else {
                    return (float) Math.cosh(number1);
                }
            case "Tanh":
                if(format.equals("deg")) {
                    return (float) Math.tanh(Math.toRadians(number1));
                }
                else {
                    return (float) Math.tanh(number1);
                }
            case "aSin":
                if(format.equals("deg")) {
                    return (float)Math.toDegrees(Math.asin(number1));
                }
                else {
                    return (float)(Math.asin(number1));
                }

            case "aCos":
                if(format.equals("deg")) {
                    return (float)Math.toDegrees(Math.acos(number1));
                }
                else {
                    return (float)(Math.acos(number1));
                }
            case "aTan":
                if(format.equals("deg")) {
                    return (float)Math.toDegrees(Math.atan(number1));
                }
                else {
                    return (float)(Math.atan(number1));
                }
            case "e^x":
                return (float) Math.exp(number1);
            case "x^2":
                return number1*number1;
            case "x^3":
                return number1*number1*number1;
            case "Log":
                return (float) Math.log10(number1);
            case "|x|":
                return (float) Math.abs(number1);
            case "ln":
                return (float) Math.log(number1);
            case "1/x":
                return (1/number1);
            case "x!":
                int fact=1;
                for(int i=1;i<=number1;i++)
                    fact=fact*i;
                return fact;
            default:
                break;
        }
        return 0;
    }
    public float calculateBinaryNumber(float number1,float number2,String operator){
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if(number2==0)
                    return 0;
                return number1 / number2;
            case "Mod":
                return number1 % number2;
            case "x^y":
                return (float) Math.pow(number1, number2);
            default:
                break;
        }
        return 0;
    }
}
