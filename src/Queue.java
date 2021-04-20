/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    int size = 0;
    String first;

    public Queue() {

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
