package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeBookTest_EditRecipes {
	RecipeBook book = new RecipeBook(); // global object, so we can use it in different methods
	
	@Test // case 1. edit existing recipe, but first we need to add recipe 
	public void testEditRecipe1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setName("Nescafe");
		book.addRecipe(recipe);
		
		String expected = "Nescafe", actual;
		Recipe newRecipe = new Recipe();
		newRecipe.setName("Ice Tea");
		actual = book.editRecipe(0, newRecipe);
		
		assertTrue(actual == expected);
		// clear the book
		book.deleteRecipe(0);
	}
	
	@Test // case 2. send empty index
	public void testEditRecipe2() {
		Recipe recipe = new Recipe();
		String actual;
		actual = book.editRecipe(0, recipe);
		
		assertNull(actual);
	}
	
	@Test // case 3. send index of the array range
	public void testEditRecipe3() {
		Recipe recipe = new Recipe();
		String actual;
		actual = book.editRecipe(10, recipe);
		assertNull(actual);
	}
	
	
	

}
