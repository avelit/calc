package calc;

public abstract class OperationService {

    public OperationService() {}

    public static int Operate(char Operation,Number FirstNumber,Number SecondNumber) {

        switch (Operation) {
        case '+':
            return sum(FirstNumber, SecondNumber);
        default:
            break;
        }
        return 0;
    }

    public static int sum(Number FirstNumber, Number SecondNumber) {
        return FirstNumber.convertToArabian() + SecondNumber.convertToArabian();
    }

    public static Number numberMap(String number,String type){
        
        Number resultNumber;
        
        switch (type) {
        case "":
            resultNumber = new NumberArabian(number);
            break;
        case "r":
            resultNumber = new NumberRomean(number);
            break;
        case "16":
            resultNumber = new NumberHex(number);
            break;
        case "2":
            resultNumber = new NumberBinary(number);
            break;
        default:
            resultNumber = new NumberArabian(number);
            break;
        }
        return resultNumber;
        
    };
}
