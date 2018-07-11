package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author TinaGVI
* @version $Id$
* @since 0.1
*/
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	@Test
    public void whenSubtractOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 1D - 1D;
        assertThat(result, is(expected));
    }
		@Test
    public void whenDivOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D / 1D;
        assertThat(result, is(expected));
    }
			@Test
    public void whenMultipleOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D * 1D;
        assertThat(result, is(expected));
    }
}
/**
* Test echo.
*/ //@Test
/*public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Tina";
    String expect = "Echo, echo, echo : Tina";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}

}*/