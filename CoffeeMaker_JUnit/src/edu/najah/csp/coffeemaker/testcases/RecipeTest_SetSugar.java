package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_SetSugar {

	@Test
	public void testSetAmtSugar_10() throws RecipeException {
		double  expected = 10;
		double  actual;
		String units = "10";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(units);
		actual = recipe.getAmtSugar();
		
		assertTrue(actual == expected);
	}

	@Test(expected=RecipeException.class)
	public void testSetAmtSugar_Minus() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "-1";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(units);
		actual = recipe.getAmtSugar();

		assertTrue(actual == expected);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugar_Invalid() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "sami";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(units);
		actual = recipe.getAmtSugar();

		assertTrue(actual == expected);
	}
}
