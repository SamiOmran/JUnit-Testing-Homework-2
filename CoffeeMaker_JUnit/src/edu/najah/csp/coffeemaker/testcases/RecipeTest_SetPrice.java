package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_SetPrice {
	@Test
	public void testSetPrice_10() throws RecipeException {
		double  expected = 10;
		double  actual;
		String units = "10";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(units);
		actual = recipe.getPrice();
		
		assertTrue(actual == expected);
	}
	
	@Test(expected=RecipeException.class)
	public void testSetPrice_Minus() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "-1";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(units);
		actual = recipe.getPrice();

		assertTrue(actual == expected);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetPrice_Invalid() throws RecipeException {
		double  expected = 0;
		double  actual;
		String units = "sami";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(units);
		actual = recipe.getPrice();

		assertTrue(actual == expected);
	}
}
