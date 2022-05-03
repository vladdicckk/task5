package ex04;

import ex02.Item2d;

/**
 * шаблон Command
 *
 * @author Skorik Artem
 * @version 1.0
 */
public class ChangeItemCommand implements Command {

    private Item2d item;

    private double offset;

    public Item2d setItem(Item2d item) {
        return this.item = item;
    }

    public Item2d getItem() {
        return item;
    }

    public double setOffset(double offset) {
        return this.offset = offset;
    }

    public double getOffset() {
        return offset;
    }

    @Override
    public void execute() {
        item.setY(item.getY() * offset);
    }
}