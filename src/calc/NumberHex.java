package calc;

public class NumberHex extends Number {

    public NumberHex(String stringNumber){
        super(stringNumber);
        this.numberType = NumberType.HEX;
    }
    @Override
    public int convertToArabian() {
        
        return Integer.parseInt(stringNumber, 16);
    }

    @Override
    public Number convertFromArabian() {
        Integer i = new Integer(stringNumber);
        String str = Integer.toHexString(i);
        NumberHex number  = new NumberHex(str);
        return number;
    }

}
