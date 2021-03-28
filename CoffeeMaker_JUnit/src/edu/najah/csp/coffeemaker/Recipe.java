package edu.najah.csp.coffeemaker;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

/**
 * @author Eng
 */
public class Recipe {
    private String name;
    private float price;
    private float amtCoffee;
    private float amtMilk;
    private float amtSugar;
    private float amtChocolate;
    
    /**
     * Creates a default recipe for the coffee maker.
     */
    public Recipe() {
    	this.name = "";
    	this.price = 0;
    	this.amtCoffee = 0;
    	this.amtMilk = 0;
    	this.amtSugar = 0;
    	this.amtChocolate = 0;
    }
    
    /**
	 * @return   Returns the amtChocolate.
	 */
    public float getAmtChocolate() {
		return amtChocolate;
	}
    /**
	 * @param amtChocolate   The amtChocolate to set.
	 */
    public void setAmtChocolate(String chocolate) throws RecipeException,NumberFormatException {
    	float amtChocolate = 0;
    	try {
    		amtChocolate = Float.parseFloat(chocolate);
    	} catch (NumberFormatException e) {
    		// wrong message and exception, should be numberFormatException
    		//throw new RecipeException("Units of chocolate must be a positive integer");
    		throw new NumberFormatException("Error occured in parsing string to int");
    	}
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} else {
			throw new RecipeException("Units of chocolate must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtCoffee.
	 */
    public float getAmtCoffee() {
		return amtCoffee;
	}
    /**
	 * @param amtCoffee   The amtCoffee to set.
	 */
    public void setAmtCoffee(String coffee) throws RecipeException,NumberFormatException {
    	float amtCoffee = 0;
    	try {
    		amtCoffee = Float.parseFloat(coffee);
    	} catch (NumberFormatException e) {
    		// wrong message and exception, should be numberFormatException
    		//throw new RecipeException("Units of coffee must be a positive integer");
    		throw new NumberFormatException("Error occured in parsing string to int");
    	}
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} else {
			throw new RecipeException("Units of coffee must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtMilk.
	 */
    public float getAmtMilk() {
		return amtMilk;
	}
    /**
	 * @param amtMilk   The amtMilk to set.
	 */
    public void setAmtMilk(String milk) throws RecipeException{
    	float amtMilk = 0;
    	try {
    		amtMilk = Float.parseFloat(milk);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error occured in parsing string to int");
    	}
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} else {
			throw new RecipeException("Units of milk must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtSugar.
	 */
    public float getAmtSugar() {
		return amtSugar;
	}
    /**
	 * @param amtSugar   The amtSugar to set.
	 */
    public void setAmtSugar(String sugar) throws RecipeException {
    	float amtSugar = 0;
    	try {
    		amtSugar = Float.parseFloat(sugar);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error occured in parsing string to int");
    	}
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} else {
			throw new RecipeException("Units of sugar must be a positive integer");
		}
	}
    /**
	 * @return   Returns the name.
	 */
    public String getName() {
		return name;
	}
    /**
	 * @param name   The name to set.
	 */
    public void setName(String name) throws RecipeException  {
    	if(name != null) {
    		this.name = name;
    	}
    	else
    		throw new RecipeException("Cannot set name to 'null' ");
	}
    /**
	 * @return   Returns the price.
	 */
    public float getPrice() {
		return price;
	}
    /**
	 * @param price   The price to set.
	 */
    public void setPrice(String price) throws RecipeException{
    	float amtPrice = 0;
    	try {
    		amtPrice = Float.parseFloat(price);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error occured in parsing string to int");
    	}
		if (amtPrice >= 0) {
			this.price = amtPrice;
		} else {
			throw new RecipeException("Price must be a positive integer");
		}
	} 
    
    /**
     * Returns the name of the recipe.
     * @return String
     */
    public String toString() {
    	return "The recipe is: "+name+", its price: "+price
    			+", it includes these ingredients: coffee= "+amtCoffee
    			+", Sugar: "+amtSugar+", Milk: "+amtMilk+", Chocolate: "+amtChocolate;
    }/*
    public String toString() {
    	return name+price+amtChocolate+amtCoffee+amtSugar+amtMilk;
    }*/

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Recipe other = (Recipe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
