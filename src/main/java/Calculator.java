

public class Calculator {
    public double divide;
    private int valueOne;
    private int valuetwo;

    private double value3;
    private double value4;



    public Calculator(int valueOne, int valuetwo, double value3, double value4){
       this.valueOne =valueOne;
       this.valuetwo = valuetwo;
       this.value3 = value3;
       this.value4 = value4;

    }


    public int add() {
        int addResult = valueOne + valuetwo;
        return addResult;
    }

    public int subtract() {
        int subttractResult = valuetwo- valueOne;
        return  subttractResult;
    }
    public int multiply(){
        int multiplyResult = valuetwo * valueOne;
        return multiplyResult;
    }
    public double devide(){
        double divideResult =  value3/value4;
        return divideResult;
    }
}
