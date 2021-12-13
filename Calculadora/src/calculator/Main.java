package calculator;

public class Main {
    public static void main(String[] args) {

        Cos cos = new Cos();
        System.out.println("EL coseno es: " + cos.Cos(3));

        Division division = new Division();
        System.out.println("La división es: " + division.division(4,0));

        Factorial factorial = new Factorial();
        System.out.println("EL factorial es igual a: " + factorial.Factorial(3));

        Multiplication multiplication = new Multiplication();
        System.out.println("La multiplicación es igual a: " + multiplication.multiplication(2,2));

        Pi pi = new Pi();
        System.out.println("EL resultado de Pi por el numero es: " + pi.Pi(2));

        Pow pow = new Pow();
        System.out.println("El numero elevado es igual a: " + pow.power(2,3));

        Sin sin = new Sin();
        System.out.println("El seno es igual a:" + sin.Sin(3));

        Subtraction subtraction = new Subtraction();
        System.out.println("La resta es igual a : " + subtraction.subtraction(3, 9));

        Sum sum = new Sum();
        System.out.println("La suma es: " + sum.Sum(2, 2));

        Tan tan = new Tan();
        System.out.println("La tangente es igual a: " + tan.Tan(3));
    }
}
