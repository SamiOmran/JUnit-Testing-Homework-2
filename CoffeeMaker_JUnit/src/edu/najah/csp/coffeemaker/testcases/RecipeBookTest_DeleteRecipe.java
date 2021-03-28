package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeBookTest_DeleteRecipe {
	RecipeBook book = new RecipeBook(); // global object, so we can use it in all methods
	
	/***
	 *  case 1. delete existing recipe, but we need to insert one to the book
	 */
	@Test
	public void testDeleteRecipe1() throws RecipeException {
		String expected_name = "Hot Chocolate";
		String actual_name;
		Recipe recipe1 = new Recipe();
		
		recipe1.setName("Hot Chocolate");
		book.addRecipe(recipe1);
		actual_name = book.deleteRecipe(0);
		assertTrue(expected_name == actual_name);
	}
	
	/***
	 *  case 2. send empty index (no recipe found)
	 */
	@Test
	public void testDeleteRecipe2() {
		String result;
		
		result=book.deleteRecipe(0);
		assertNull(result);
	}
	
	/***
	 *  case 3. send index of the array range
	 */	
	@Test
	public void testDeleteRecipe3() {
		String result = book.deleteRecipe(10);
		assertNull(result);
}

}
