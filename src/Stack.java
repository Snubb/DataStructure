public class Stack {
    int size = 0;
    String first;

    public Stack() {

    }

    public void enqueue(String text) {
        if (size == 0) {
            first = text;
        }
        size++;
    }

    public String dequeue() {
        size--;
        return first;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }
}
