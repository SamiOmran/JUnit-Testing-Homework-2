package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeBookTest_AddRecipe {
	@Test // case 1. adding one recipe to the book
	public void testAddRecipe1() {
		boolean expected = true, actual;
		RecipeBook book = new RecipeBook();
		Recipe recipe = new Recipe();
		
		actual = book.addRecipe(recipe);
		assertTrue(actual == expected);
	}
	
	@Test // case 2. adding similar Recipes
	public void testAddRecipe2() {
		boolean expected = true, actual;
		RecipeBook book = new RecipeBook();
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();

		book.addRecipe(recipe1);
		actual = book.addRecipe(recipe2);
		assertFalse(actual == expected);
	}
	
	@Test // case 3. adding recipe to full book, but first we need to full the book 
	public void testAddRecipe3() throws RecipeException {
		boolean expected = true, actual;
		RecipeBook book = new RecipeBook();
		
		for(int i=0;i<4;i++) {
			Recipe recipe = new Recipe();
			recipe.setName(" "+i);
			book.addRecipe(recipe);
		}
		
		Recipe overload_recipe = new Recipe();
		overload_recipe.setName("5");
		actual = book.addRecipe(overload_recipe);
		assertFalse(actual == expected);
	}
}
