package calc;

public class NumberHex extends Number {

    public NumberHex(String stringNumber){
        super(stringNumber);
        this.numberType = NumberType.HEX;
    }
    @Override
    public int convertToArabian() {
        
        int result = 0;
        final int length = stringNumber.length();
        for (int i = 0 ; i < length ; i++) {
            result+=Character.getNumericValue(stringNumber.charAt(length - i - 1)) * Math.pow(16, i);
        }
        return result;
    }

    @Override
    public Number convertFromArabian() {
        Integer i = new Integer(stringNumber);
        String str = Integer.toHexString(i);
        NumberHex number  = new NumberHex(str);
        return number;
    }

}
