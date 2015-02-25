package calc;

public abstract class Number {

    public NumberType numberType;
    public String stringNumber;
    
    public Number(String stringNumber){
        this.stringNumber = stringNumber;
    }
    
    public Number(){
    }
    
    public int convertToArabian() {
        return new Integer(stringNumber);
    }

    public Number convertFromArabian() {
        NumberArabian number  = new NumberArabian(stringNumber);
        return number;
    }
    
}
