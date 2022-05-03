package ex04;

import ex02.View;

/**
 * шаблон Command
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class ViewConsoleCommand implements ConsoleCommand {

    private View view;

    public ViewConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public char getKey() {
        return 'v';
    }

    @Override
    public String toString() {
        return "'v'iew";
    }

    @Override
    public void execute() {
        System.out.println("View current.");
        view.viewShow();
    }
}