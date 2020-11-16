package cn.red.calculation;

public class Usecalculation {

    public double calculate(double x, String operate, double y) {
        double answer =0;
        if("+".equals(operate)){
             answer=x+y;
        }else if ("-".equals(operate)){
             answer=x-y;
        }else if ("*".equals(operate)){
             answer=x*y;
        } else if ("/".equals(operate)){
             answer=x/y;
        }
        return answer;
    }
}
