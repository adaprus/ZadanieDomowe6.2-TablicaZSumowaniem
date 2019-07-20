package pl.javastart.app;

import pl.javastart.model.ArrayCalculator;

public class ArrayCalculatorTest {
    public static void main(String[] args) {
        ArrayCalculator arraycalc = new ArrayCalculator();
        int array[] = arraycalc.getNumbers();

        System.out.println("Suma wyrazów 1, 3 i 5 to " + arraycalc.sum(array));
    }
}
