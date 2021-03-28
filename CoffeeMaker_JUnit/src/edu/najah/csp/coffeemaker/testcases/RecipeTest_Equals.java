package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_Equals {

	@Test // case 1. send Recipe object
	public void testEqualsObjectRecipe1() {
		boolean expected = true,actual;
		Recipe recipe = new Recipe();
		
		actual = recipe.equals(recipe);
		assertTrue(actual == expected);
	}
	
	@Test // case 2. send null
	public void testEqualsObjectNull2() {
		boolean expected = false, actual;
		Recipe recipe = new Recipe();

		actual = recipe.equals(null);
		assertTrue(expected == actual);
	}
	
	@Test // case 3. send object from type Object(different object from Recipe)
	public void testEqualsObjectdifferent3() {
		boolean expected = false, actual;
		Recipe recipe = new Recipe();
		Object object = new Object();
		
		actual = recipe.equals(object);
		assertTrue(expected == actual);
	}
	
	@Test // case 4. check different 2 Recipes v1
	public void testEqualsObjectRecipe4() throws RecipeException {
		boolean expected = false, actual;
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();

		recipe1.setName("Nescafe");
		
		actual = recipe1.equals(recipe2);
		assertTrue(expected == actual);
	}
	
	@Test // case 5. check different 2 Recipes v2
	public void testEqualsObjectRecipe5() throws RecipeException {
		boolean expected = false, actual;
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();

		recipe2.setName("Nescafe");
		
		actual = recipe1.equals(recipe2);
		assertTrue(expected == actual);
	}
	
	@Test // case 6. Check same 2 Recipes 
	public void testEqualsObjectRecipe6() throws RecipeException {
		boolean expected = true, actual;
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();
		
		recipe1.setName("Nescafe");
		recipe2.setName("Nescafe");
		
		actual = recipe1.equals(recipe2);
		assertTrue(expected == actual);
	}

}
