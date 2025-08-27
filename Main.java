package com.inventorymanagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		InventoryService service=new InventoryService();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("/-------WELCOME --------");
		System.out.println("1.Add a product to our inventory");
		System.out.println("2.Update your inventory");
		System.out.println("3.Delete from your inventory");
		System.out.println("4.See all products");
		System.out.println("5.exit");
		System.out.println("Enter your choice");
		
		int option=sc.nextInt();
		 
		switch(option) {
		case 1:service.addProduct();
			  break;
		case 2:service.updateProduct();
			  break;
		case 3:service.deleteProduct();
			  break;
		case 4:service.viewProducts();
			  break;
		case 5:System.out.println("Exiting......");
		       return ;
		 default:System.out.println("Invalid choice");
		}
	}
} 

}
