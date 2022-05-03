package ex04;

import ex02.View;
import ex03.ViewableTable;

import java.awt.*;

/**
 * Шаблон Singleton
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class Application {

    private static Application instance = new Application();

    private Application() {
    }

    public static Application getInstance() {
        return instance;
    }

    private View view = new ViewableTable().getView();

    private Menu menu = new Menu();

    public void run() {
        menu.add(new ViewConsoleCommand(view));
        menu.add(new GenerateConsoleCommand(view));

        menu.add(new ChangeConsoleCommand(view));
        menu.add(new SaveConsoleCommand(view));
        menu.add(new RestoreConsoleCommand(view));
        menu.execute();
    }
}