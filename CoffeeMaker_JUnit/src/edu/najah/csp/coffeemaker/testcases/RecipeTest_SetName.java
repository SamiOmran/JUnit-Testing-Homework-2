package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_SetName {

	@Test
	public void testSetName_Valid() throws RecipeException{
		String expected_name = "sami";
		String actual_name;
		String name = "sami";
		Recipe recipe = new Recipe();
		
		recipe.setName(name);
		actual_name=recipe.getName();
		
		assertTrue(actual_name == expected_name);
	}
	
	@Test(expected=RecipeException.class)
	public void testSetName_InValid() throws RecipeException {
		String expected_name = "";
		String actual_name;
		Recipe recipe = new Recipe();

		recipe.setName(null);
		actual_name=recipe.getName();
		
		assertTrue(actual_name == expected_name);
	}
	
	@Test
	public void testToString() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setName("Ice tea");
		recipe.setAmtChocolate("9");
		recipe.setAmtCoffee("6");
		recipe.setAmtMilk("3");
		recipe.setAmtSugar("2");
		recipe.setPrice("20");
		
		System.out.println(recipe.toString());
	}


}
