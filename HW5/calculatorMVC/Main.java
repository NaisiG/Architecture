package HW5.calculatorMVC;

import HW5.calculatorMVC.view.ConsoleView;
import HW5.calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}
