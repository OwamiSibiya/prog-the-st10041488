/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DISD3
 */
public class NewClass {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ch = -1;
		System.out.print("(1) to launch menu or any other key to exit: ");
		ch = input.nextInt();
		if (ch == 1) {
			ArrayList<Product> products = new ArrayList<Product>();
			String code;
			String description;
			double price;


			while (ch != 6) {
				System.out.println("(1) Capture a new product.");
				System.out.println("(2) Search for a product.");
				System.out.println("(3) Update a product.");
				System.out.println("(4) Delete a product.");
				System.out.println("(5) Print report.");
				System.out.println("(6) Exit Application");
				System.out.print("Your choice: ");
				ch = input.nextInt();
				switch (ch) {
				case 1: {
					input.nextLine();
					System.out.print("Enter product code: ");
					code = input.nextLine();
					System.out.print("Enter product description: ");
					description = input.nextLine();
					System.out.print("Enter product price: ");
					price = input.nextDouble();
					Product newProduct = new Product(code, description, price);
					products.add(newProduct);
					System.out.println("\nProduct has been added.\n");
				}
					break;
				case 2: {
					input.nextLine();
					System.out.print("Enter product code to display: ");
					code = input.nextLine();
					int index = getProductByCode(products, code);
					if (index != -1) {
						System.out.println(products.get(index).toString());
					} else {
						System.out.println("\nWrong product ID.\n");
					}
				}
					break;
				case 3: {
					input.nextLine();
					System.out.print("Enter product code to edit: ");
					code = input.nextLine();
					int index = getProductByCode(products, code);
					if (index != -1) {
						System.out.print("Enter a new product description: ");
						description = input.nextLine();
						System.out.print("Enter a new product price: ");
						price = input.nextDouble();
						Product newProduct = new Product(code, description, price);
						products.remove(index);
						products.add(index, newProduct);
						System.out.println("\nProduct has been updated.\n");
					} else {
						System.out.println("\nWrong product ID.\n");
					}
				}
					break;
				case 4: {
					input.nextLine();
					System.out.print("Enter product code to delete: ");
					code = input.nextLine();
					int index = getProductByCode(products, code);
					if (index != -1) {
						products.remove(index);
						System.out.println("\nProduct has been deleted.\n");
					} else {
						System.out.println("\nWrong product ID.\n");
					}
				}
					break;
				case 5: {
					for (int i = 0; i < products.size(); i++) {
						System.out.println(products.get(i).toString() + "\n");
					}
				}
					break;
				case 6: {
					// exit


				}
					break;


				default: {
					System.out.println("Wrong menu item.");


				}
					break;
				}
			}
		}
		input.close();


	}

    private static int getProductByCode(ArrayList<Product> products, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
           public class Main
{
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	    String [] products=new String [5];
	    System.out.println("Capture & new Soduct");
	    
	    System.out.println("Enter the product code: ");
	    String p_code=in.next();
	    products[0]=p_code;
	    System.out.println("Enter the product nass: ");
	    String p_nass=in.next();
	    products[1]=p_nass;
	    System.out.println("Select product category: \\n1. Laptop \n2. Caming Const");
	    String p_category=in.next();
	    products[2]=p_category;
	    System.out.println("Enter the product warranty: ");
	    String p_warranty=in.next();
	    products[3]=p_warranty;
	    System.out.println("Enter the product price: ");
	    String p_price=in.next();
	    products[4]=p_price;
	    
	    System.out.println("Product code: "+p_code);
	    System.out.println("Product nass: "+p_nass);
	    System.out.println("Product category: "+p_category);
	    System.out.println("Product warranty: "+p_warranty);
	    System.out.println("Product price: "+p_price);
	   // https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-235809
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String category;
        while (true) {
            System.out.println("Chose the category:\nTV\nPhones\nGames");
            category = in.nextLine();
            switch (category) {
                case "TV":
                case "Phones":
                case "Games":
                    System.out.println("Category accepted.");
                    System.exit(0);
                default:
                    System.out.println("Invalid category. Try again.");
            }
        }
    }
}