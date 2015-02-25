package calc;

public class NumberBinary extends Number {

    public NumberBinary(String stringNumber){
        super(stringNumber);
        this.numberType = NumberType.BINARY;
    }
    
    @Override
    public int convertToArabian() {
        
        int result = 0;
        final int length = stringNumber.length();
        for (int i = 0 ; i < length ; i++) {
            result+=Character.getNumericValue(stringNumber.charAt(length - i - 1)) * Math.pow(2, i);
        }
        return result;
    }

     @Override
    public Number convertFromArabian() {
         Integer i = new Integer(stringNumber);
         String str = Integer.toBinaryString(i);
         NumberBinary number  = new NumberBinary(str);
         return number;
    }

}
