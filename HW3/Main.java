package HW3;

import HW3.model.excersize.ExcersizeFactory;
import HW3.model.excersize.IExcersizeFactory;
import HW3.model.workout.Workout;
import HW3.view.ConsoleView;
import HW3.view.IView;

public class Main {
    public static void main(String[] args) {
        // Разработать одну или несколько программ на выбранном языке программирования
        // (например, Java или Python), демонстрирующих применение принципов SOLID.
        // Сопроводить разработку созданием UML-диаграммы,
        // которая будет отображать ключевые компоненты системы и их взаимосвязи.
        Workout workout = new Workout();
        IExcersizeFactory iExcersizeFactory = new ExcersizeFactory();
        IView iView = new ConsoleView(workout, iExcersizeFactory);
        iView.run();

    }
}
