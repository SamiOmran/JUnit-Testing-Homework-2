package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_SetChocolate {
	@Test
	public void testSetAmtChocolate_10() throws RecipeException {
		float  expected = 10, actual;
		String units = "10";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();
		
		assertTrue(actual == expected);
	}
	
	@Test(expected=RecipeException.class)
	public void testSetAmtChocolate_Minus() throws RecipeException {
		float  expected = 0,actual;
		String units = "-1";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();

		assertTrue(actual == expected);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolate_Invalid() throws RecipeException {
		float  expected = 0, actual;
		String units = "sami";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();

		assertTrue(actual == expected);
	}
}
