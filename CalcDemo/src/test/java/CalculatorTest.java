
    import static org.junit.Assert.assertEquals;
    import org.junit.Test;

    public class CalculatorTest {

        @Test
        public void testAdd1() {
            Calculator calculator = new Calculator();
            int result = calculator.add1(3, 2);
            assertEquals("The add method should return the sum of 3 and 2", 5, result);
        }
    @Test
    public void testSub1() {
        Calculator calculator = new Calculator();
        int result = calculator.sub1(3, 2);
        assertEquals("The sub method should return the sum of 3 and 2", 1, result);
    }
     @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 2);
        assertEquals("The multiply method should return the sum of 3 and 4",6, result);
    }
}
