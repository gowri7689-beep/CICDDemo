
    import static org.junit.Assert.assertEquals;
    import org.junit.Test;

    public class CalculatorTest {

        @Test
        public void testAdd() {
            Calculator calculator = new Calculator();
            int result = calculator.add1(3, 2);
            assertEquals("The add method should return the sum of 3 and 2", 5, result);
        }
    
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub1(3, 2);
        assertEquals("The sub method should return the sum of 3 and 2", 1, result);
    }
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.sub1(3, 2);
        assertEquals("The multiply method should return the sum of 3 and 4",5, result);
    }
}
