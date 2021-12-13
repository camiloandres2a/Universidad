package calculator;


public class Factorial {
    private int factorial = 1;

    public int Factorial(int number){
        for(int i = number; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }

}


