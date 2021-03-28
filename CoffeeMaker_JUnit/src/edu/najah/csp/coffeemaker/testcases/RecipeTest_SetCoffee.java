package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_SetCoffee {

	@Test
	public void testSetAmtCoffee_10() throws NumberFormatException, RecipeException {
		double  expected = 10;
		double  actual;
		String units = "10";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();
		
		assertTrue(actual == expected);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtCoffee_Minus() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "-50";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();
		
		assertTrue(actual == expected);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffee_Invalid() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "sami";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(units);
		actual = recipe.getAmtChocolate();
		
		assertTrue(actual == expected);
	}

}
