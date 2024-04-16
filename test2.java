import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexProgramTest {

    @Test
    public void testCalculateSum() {
        int[] numbers = {10, 20, 30, 40, 50};
        int expectedSum = 150;
        assertEquals(expectedSum, ComplexProgram.calculateSum(numbers));
    }

    @Test
    public void testFindMax() {
        int[] numbers = {10, 20, 30, 40, 50};
        int expectedMax = 50;
        assertEquals(expectedMax, ComplexProgram.findMax(numbers));
    }

    @Test
    public void testPrintEvenNumbers() {
        int[] numbers = {10, 20, 30, 40, 50};
        String expectedOutput = "10 20 30 40 50 ";
        assertEquals(expectedOutput, captureOutput(() -> ComplexProgram.printEvenNumbers(numbers)));
    }

    // Phương thức này được sử dụng để bắt kết quả của việc in ra console
    private String captureOutput(Runnable action) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        action.run();
        System.setOut(System.out);
        return outContent.toString();
    }
}
