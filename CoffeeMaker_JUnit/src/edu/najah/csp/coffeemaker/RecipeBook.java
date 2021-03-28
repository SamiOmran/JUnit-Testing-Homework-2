package edu.najah.csp.coffeemaker;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeBook {
	
	/** Array of recipes in coffee maker*/
	private Recipe [] recipeArray;
	/** Number of recipes in coffee maker */
	private final int NUM_RECIPES = 4; 
	
	/**
	 * Default constructor for a RecipeBook.
	 */
	public RecipeBook() {
		recipeArray = new Recipe[NUM_RECIPES];
	}
	
	/**
	 * Returns the recipe array.
	 * @param r
	 * @return Recipe[]
	 */
	public synchronized Recipe[] getRecipes() {
		return recipeArray;
	}
	
	public synchronized boolean addRecipe(Recipe r) {
		//Assume recipe doesn't exist in the array until 
		//find out otherwise
		
		boolean exists = false;
	
		//Check that recipe doesn't already exist in array
		for (int i = 0; i < recipeArray.length; i++ ) {
			if (r.equals(recipeArray[i])) {
				//exists = true; 
				/****
				 * No need for variable exists, we just return false 
				 * when we found the recipe exists, so no recipe added
				 */
				return false;
			}
		}
		//Assume recipe cannot be added until find an empty
		//spot
		boolean added = false;
		//Check for first empty spot in array
		
		/***
		 * since we don't need variable exists, 
		 * no need for this if statement
		 */
		//if (!exists) { 
			for (int i = 0; i < recipeArray.length && !added; i++) {
				if (recipeArray[i] == null) {
					recipeArray[i] = r;
					added = true;
				}
			}
		//}
		return added;
	}

	/**
	 * Returns the name of the recipe deleted at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToDelete
	 * @return String
	 */
	public synchronized String deleteRecipe(int recipeToDelete) {
		/***
		 *  first check if the index is within the book range
		 */
		if(recipeToDelete >= NUM_RECIPES ) {
			return null;
		}
		
		if (recipeArray[recipeToDelete] != null) {
			String recipeName = recipeArray[recipeToDelete].getName();
			recipeArray[recipeToDelete] = new Recipe();
			return recipeName;
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the name of the recipe edited at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToEdit
	 * @param newRecipe
	 * @return String
	 * @throws RecipeException 
	 */
	public synchronized String editRecipe(int recipeToEdit, Recipe newRecipe)/* throws RecipeException*/ {
		/***
		 *  first check if the index is within the book range
		 */
		if(recipeToEdit >= NUM_RECIPES )
			return null;
			
		if (recipeArray[recipeToEdit] != null) {
			String recipeName = recipeArray[recipeToEdit].getName();
			// newRecipe.setName(""); Its wrong to set the new Recipe's name to empty string
			recipeArray[recipeToEdit] = newRecipe;
			return recipeName;
		} else {
			return null;
		}
	}

}
