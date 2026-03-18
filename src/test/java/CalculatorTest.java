import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void addTest(){
        int result = calculator.add(2,3);
        System.out.println("Addition Result : "+ result);
        assertEquals(5, result);
    }

    @Test
    public void multiplyTest(){
        int result = calculator.multiply(2,3);
        System.out.println("Multiplication Result : "+ result);
        assertEquals(6, result);
    }

}
