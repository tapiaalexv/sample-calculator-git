package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();

        int addition = c.addition(4,7);
        System.out.println("c.addition(4,7) -> "+addition);

        int substraction = c.subtraction(7,1);
        System.out.println("c.substraction(7,1) -> "+substraction);

        System.out.println("\nMetodologias Agiles\n\n");
        System.out.println("\n*** Caceres Gabriel ***\n");
        System.out.println("\n*** Tapia Alexis ***\n");
        System.out.println("\n*** Yamberla Justin ***\n");

    }
}
