package calc;

public class NumberArabian extends Number {
    public NumberArabian(String stringNumber){
        super(stringNumber);
        this.numberType = NumberType.ARABIAN;
    }
}
