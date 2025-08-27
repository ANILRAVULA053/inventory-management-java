package com.inventorymanagement;

import java.util.List;
import java.util.Scanner;

public class InventoryService {

		 Scanner sc=new Scanner(System.in);
		 UpdateProduct  update =new UpdateProduct();
		public void addProduct() {
			try {
			System.out.println("Enter the name of the product..");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter the category of the product..");
			String category=sc.next();
			sc.nextLine();
			System.out.println("Enter the price of the product..");
			double price=sc.nextDouble();
			System.out.println("Enter the Quantity of the product..");
			int quantity=sc.nextInt();
			Product product=new Product(name,category,price,quantity);
			update.addProduct(product);
			System.out.println("----product added successfully-----");
			}
			catch(Exception e) {
				System.out.println("Error in adding product"+e.getMessage());
			}
		}
		
       public void updateProduct() {
    	   try {
    		   System.out.println("Enter the name of the product");
    		   String name=sc.next();
    		   System.out.println("Enter the new quantity");
    		   int quantity=sc.nextInt();
    		   System.out.println("Enter the new price ");
    		   double price=sc.nextDouble();
    		   
    		   if(update.updateProduct(name,price,quantity))
    		     System.out.println("Product updated successfully");
    		   else
    			   System.out.println(" product not found ");
    	   }
    	   catch(Exception e) {
    		   System.out.println("Error"+e.getMessage());
    	   }
       }
       
       public void deleteProduct() {
    	   try {
    		   System.out.println("Enter the name of the product");
    		   String name=sc.next();
    		   if(update.deleteProduct(name))
    			   System.out.println("Deleted successfully");
    		   else {
    			   System.out.println("Product not found");
    		   }
    	   }
    	   catch(Exception e) {
    		   System.out.println("Error :"+e.getMessage());
    	   }
       }
       
       public void viewProducts() {
    	   try{
    		   List<Product> list=update.getAllProducts();
    	       for(Product p : list)
    		   System.out.println(p);
    	   }
    	   catch(Exception e) {
    		   System.out.println("Error"+e.getMessage());
    	   }
       }
       
	}


