import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
/**
 * Created by Shadowside on 19.05.2016.
 */
public class list_test {
    @Test
    public void testAddOneItem() {
        list_class list = new list_class();
        list.add(3);
        assertEquals(3, list.get(0));
    }

    @Test
    public void testAddSecondItem() {
        list_class list = new list_class();
        list.add(3);
        list.add(5);
        assertEquals(5, list.get(1));
    }

    @Test
    public void testFirstItemRemainsAfterAddingSecond() {
        list_class list = new list_class();
        list.add(3);
        list.add(5);
        assertEquals(3, list.get(0));
    }
}
