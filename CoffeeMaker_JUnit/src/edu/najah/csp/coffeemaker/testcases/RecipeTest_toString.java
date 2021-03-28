package edu.najah.csp.coffeemaker.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class RecipeTest_toString {

	@Test
	public void testToString() {
		Recipe recipe = new Recipe();
		assertNotNull(recipe.toString());
	}

}
