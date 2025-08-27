package com.inventorymanagement;

public class Product {

	
		private String name;
		private String category;
		private double price;
		private int quantity;
		Product(){
			
		}
		public Product(String name,String category,double price,int quantity) {
			this.name=name;
			this.category=category;
			this.price=price;
			this.quantity=quantity;
		}
		
    public void setName(String name) {
      this.name=name;
    }
    public String getName() {
      return name;
    }
    public void setCategory(String category) {
    this.category=category;
    }
   public String getCategory() {
    return category;
   }
   public void setPrice(double  price) {
   this.price=price;
   }
   public double getPrice() {
   return price;
  }
    
   public void setQuantity(int quantity) {
	   this.quantity=quantity;
	}
	   public int getQuantity() {
	   return quantity;
   }

	   @Override
	   public String toString() {
	        return name + " | " + category + " | " + quantity + " | " + price;
	    }
	   
}
