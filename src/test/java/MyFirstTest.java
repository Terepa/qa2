import org.junit.jupiter.api.Test;

public class MyFirstTest {
    private int globarVar = 10;




    @Test
    public void firstTest() {
        System.out.println("Hello corona");
        int sum = sumTwoDigits(15,20);
        System.out.println("Aaaand the sum is: " + sum);
        System.out.println(sumTwoDigits(3,8));
    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
