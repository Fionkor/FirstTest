package test;
import org.junit.jupiter.api.Test;
import work.main.Main;



import static org.junit.jupiter.api.Assertions.*;
public class MainTest {

    @Test
    public void testCheckBook(){
        Main main = new Main();
        for (int i = 0; i < 10; i++) {
            int result = main.checkBook();
            assertTrue(result >=0 && result <= 5,
                    "Значение должно буть от 0 до 5, но было: " + result);
        }
    }



}