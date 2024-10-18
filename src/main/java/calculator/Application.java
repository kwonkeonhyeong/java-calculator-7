package calculator;

import calculator.controller.CalculatorController;
import calculator.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CalculatorController controller = new CalculatorController(
                new InputView()
        );
        controller.run();
    }
}
