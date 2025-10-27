package level1.exceptions;

public class NegativeSalaryException extends Exception{

    public NegativeSalaryException() {
        System.err.println("Salary can't be zero or negative");
    }
}
