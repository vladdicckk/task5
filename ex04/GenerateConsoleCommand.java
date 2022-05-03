package ex04;

import ex02.View;

/**
 * шаблон Command
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class GenerateConsoleCommand implements ConsoleCommand {

    private View view;

    public GenerateConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public char getKey() {
        return 'g';
    }

    @Override
    public String toString() {
        return "'g'enerate";
    }

    @Override
    public void execute() {
        System.out.println("Random generation.");
        view.viewInit();
        view.viewShow();
    }
}