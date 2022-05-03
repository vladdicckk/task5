package ex04;

import ex02.View;

/**
 * шаблон Command
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class RestoreConsoleCommand implements ConsoleCommand {

    private View view;

    public RestoreConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public char getKey() {
        return 'r';
    }

    @Override
    public String toString() {
        return "'r'estore";
    }

    @Override
    public void execute() {
        System.out.println("Restore last saved.");
        try {
            view.viewRestore();
        } catch (Exception e) {
            System.err.println("Serialization error: " + e);
        }
        view.viewShow();
    }
}