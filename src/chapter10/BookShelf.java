package chapter10;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) { // 배열에 요소 추가
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
