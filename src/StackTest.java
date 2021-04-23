import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void shouldBeAbleToCreateStack() {
        new Stack();
    }
    @Test
    public void createdStackShouldBeEmpty() {
        Stack l = new Stack();
        assertEquals(true, l.isEmpty());
    }

    @Test
    public void createdStackShouldHaveSizeZero() {
        Stack l = new Stack();
        assertEquals(0, l.size());
    }

}
