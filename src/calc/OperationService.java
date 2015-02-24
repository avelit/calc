package calc;

public class OperationService {

    String Operation;
    Number FirstNumber;
    Number SecondNumber;

    public OperationService(String Operation, Number FirstNumber,
            Number SecondNumber) {
        this.Operation = Operation;
        this.FirstNumber = FirstNumber;
        this.SecondNumber = SecondNumber;
    }

    public int Operate() {

        switch (Operation) {
        case "+":
            return sum(FirstNumber, SecondNumber);
        default:
            break;
        }
        return 0;
    }

    public int sum(Number FirstNumber, Number SecondNumber) {
        return FirstNumber.convertToArabian() + SecondNumber.convertToArabian();
    }
}
