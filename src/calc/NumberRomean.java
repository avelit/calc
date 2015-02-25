package calc;

public class NumberRomean extends Number {

    private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10,
            9, 5, 4, 1 };

    private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I" };

    public NumberRomean(String stringNumber) {
        super(stringNumber);
        this.numberType = NumberType.ROMEAN;
    }

    @Override
    public int convertToArabian() {

        stringNumber = stringNumber.toUpperCase();

        int i = 0;
        int arabic = 0;
        while (i < stringNumber.length()) {

            char letter = stringNumber.charAt(i);
            int number = letterToNumber(letter);

            i++;

            if (i == stringNumber.length()) {
                arabic += number;
            } else {
                int nextNumber = letterToNumber(stringNumber.charAt(i));
                if (nextNumber > number) {
                    arabic += (nextNumber - number);
                    i++;
                } else {
                    arabic += number;
                }
            }

        }
        return arabic;
    }

    @Override
    public Number convertFromArabian() {

        String roman = "";
        int N = new Integer(stringNumber);
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return new NumberRomean(roman);

    }

    private int letterToNumber(char letter) {
        switch (letter) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return -1;
        }
    }

}
