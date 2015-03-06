package calc;

public class NumberBinary extends Number {

    public NumberBinary(String stringNumber){
        super(stringNumber);
        this.numberType = NumberType.BINARY;
    }
    
    @Override
    public int convertToArabian() {
        
        return Integer.parseInt(stringNumber, 2);
    }

     @Override
    public Number convertFromArabian() {
         Integer i = new Integer(stringNumber);
         String str = Integer.toBinaryString(i);
         NumberBinary number  = new NumberBinary(str);
         return number;
    }

}
