
package javaapplication39;
import java.util.ArrayList;
import java.util.Scanner;
//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsf/question-224004

public class JavaApplication39 {

    
    public static void main(String[] args) {
        //https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsf/question-224004
        
        class Product {
            private String code;
            private String description;
            private double price;
            public Product(){
                this.code = "";
                this.description = "";
                this.price = 0;}
            
            public Product (String code, String description, double price){
                this.code = code;
                this.description = description;
                this.price = price;}
            
            public String getCode(){
                return code;}
            
            public void setCode(String code){
                this.code = code;
            }
            
            public String getdescription(String description){
                this.description = description;
                return description;
            }
            public void setDescription(String description){
                this.description = description;
            }
            
            public double getPrice()
            {
                return price;
            }
            public void setPrice(double price){
                this.price = price;
            }
            
            @Override
            public String toString (){
                return "Product code:"+ this.code + "\n" + "Product description: " + this.description + "\n" + "Product price : " + this.price + "\n";
                        }
            
                        }
                    }
        
        }
          class ProductsProject {
	private static int getProductByCode(ArrayList<Product> products, String code) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getCode().compareTo(code) == 0) {
				return i;
                                
                                
                                
                                
			}
		}
		return -1;
	}


	/**
	 * Main method
	 * 
	 * @param args
	 */
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
}
 //https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-235809
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
	    
	}
}
//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-237600
public class Main {


	


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ch = -1;
		while (ch != 6) {
			System.out.println("1. Desktop Computer.");
			System.out.println("2. Laptop.");
			System.out.println("3. Tablet.");
			System.out.println("4. Printer.");
			System.out.println("5. Gaming Console.");
			System.out.println("6. Exit.");
			System.out.print("Select the product category: ");
			ch = in.nextInt();
			in.nextLine();
			if (ch == 1) {
				System.out.println("You have selected Desktop Computer.");	
			} else if (ch == 2) {
				System.out.println("You have selected Laptop.");
			} else if (ch == 3) {
				System.out.println("You have selected Tablet.");
			} else if (ch == 4) {
				System.out.println("You have selected Printer.");
			} else if (ch == 5) {
				System.out.println("You have selected Gaming Console.");
			} else if (ch == 6) {
			
			} else {
				System.out.println("Wrong selection.");
			}
		}
		in.close();
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

//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-235919
  public class Product 
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String c;
		int warranty=0;
		while( true ){
    		System.out.println("Select between the following product warranty: ");
    		System.out.println("1-Applies a six-month product warranty.\nAny other key applies a two-year warranty.");
    	    c=in.next();
    	    
    	    if (c=="1"){
    	        warranty=6;
    	        System.out.println("Product details have been successfully saved");
    	        break;
    	    }
    	    else{
    	        warranty=24; //2years
    	        System.out.println("Product details have been successfully saved");
    	        break;
    	    }
    	         
		}
		
	    
	}
}
public class Product {
    private String name;
    private double price;
    private String manufacturer;

    public Product(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}



//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-238183
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the product: ");
        String name = in.nextLine();
        System.out.print("Enter the price of the product: ");
        double price = Double.parseDouble(in.nextLine());
        System.out.print("Enter the manufacturer of the product: ");
        String manufacturer = in.nextLine();
        Product product = new Product(name, price, manufacturer);
        System.out.println("The product details have been successfully saved");
    }
}  

//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-235922
                    public class Main
{
    public static void Search(int[] arr, int k){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == k){    
                System.out.println("The product is found.");
                break;
            }    
        }    
        System.out.println("The product is not found.");    
    }   
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int[] arr= {121,122,123,124,125,126,127};  
		System.out.println("Enter the product code to search:");
		int product_code=in.nextInt();
		
		Search(arr,product_code);
		
	}
}
 //https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-239045          
 public class Main
{
	public static void main(String[] args){
		int code,option,option2;
		System.out.print("Choose an option \n1.Delete a product\n2.Update details of a product: ");
		Scanner input=new Scanner(System.in);
		option=input.nextInt();
		if(option==1)
		{
			//Scanner input=new Scanner(System.in);
			System.out.print("Enter the product code: ");
			code=input.nextInt();
			System.out.print("Are you sure you want to delete the product?\n1.Yes\n2.No\n");
			option=input.nextInt();
			if(option==1){
				System.out.print("The product deleted successfully");
			}
			else{
				System.out.print("The product not deleted.");
			}
		}
		else if(option==2)
		{int option3;
		    
			System.out.print("Enter the product code: ");
			code=input.nextInt();
			System.out.print("Choose an update to perform\n1.Update the product warranty\n2.Update the product price\n3.Update the product stock \nlevel ");
			option3=input.nextInt();
			if(option3==1)
			{
				System.out.print("Are you sure you want to update the product warranty?\n1.Yes\n2.No\n");
               option=input.nextInt();
			 if(option==1){
				System.out.print("Waranty updated successfully");
			}
			else{
				System.out.print("Warranty not updated.");	
			}
		}
		
		else if(option3==2)
		{
			System.out.print("Are you sure you want to update the product price?\n1.Yes\n2.No\n");
		option=input.nextInt();
			if(option==1){
				System.out.print("Price updated successfully");
			}
			else{
				System.out.print("Price not updated.");	
			}	
		}
		
       else if(option3==3)
       {
       		System.out.print("Are you sure you want to update the product stock level?1.Yes\n2.No\n");
		    option=input.nextInt();
			if(option==1){
				System.out.print("Product stock level updated successfully");
			}
			else{
				System.out.print("Product stock level not updated.");	
			}	
	   }
	   else{
	   	System.out.print("Invalid option!");
	   }
	}
	else{
		System.out.print("Invalid option!");
	}
	
	
}}         
class Product{
private String code;
private String name;
private String categeory;
private int warranty;
private int price;
private int stockLevels;
private String supplier;

public Product() {
}

public Product(String code, String name, String categeory, int warranty, int price, int stockLevels, String supplier) {
this.code = code;
this.name = name;
this.categeory = categeory;
this.warranty = warranty;
this.price = price;
this.stockLevels = stockLevels;
this.supplier = supplier;
}

public void setCode(String code) {
this.code = code;
}

public void setName(String name) {
this.name = name;
}

public void setCategeory(String categeory) {
this.categeory = categeory;
}

public void setWarranty(int warranty) {
this.warranty = warranty;
}

public void setPrice(int price) {
this.price = price;
}

public void setStockLevels(int stockLevels) {
this.stockLevels = stockLevels;
}

public void setSupplier(String supplier) {
this.supplier = supplier;
}

public String getCode() {
return code;
}

public String getName() {
return name;
}

public String getCategeory() {
return categeory;
}

public int getWarranty() {
return warranty;
}

public int getPrice() {
return price;
}

public int getStockLevels() {
return stockLevels;
}

public String getSupplier() {
return supplier;
}

@Override
public String toString() {
  
return "Product{" + "code=" + code + ", name=" + name + ", categeory=" + categeory + ", warranty=" + warranty + ", price=" + price + ", stockLevels=" + stockLevels + ", supplier=" + supplier + '}';
}
  
  
}
//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/web-dev/question-238290
public class NewClass2 {
static ArrayList<Product> list;
public static void main(String str[]){
int choice;
// Declaring the ArrayList
list = new ArrayList<Product>();
do{
displayMenu();
Scanner sc = new Scanner(System.in);
System.out.print("Enter choice : ");
choice = sc.nextInt();
  
switch(choice){
case 1:
Product newProduct = createProduct();
list.add(newProduct);
break;
case 2:
serachProduct();
break;
case 3:
updateProduct();
break;
case 4:
deleteProduct();
break;
}
System.out.print("Enter (1) to lanch menu or any other key to exit : ");
choice = sc.nextInt();
  

}while(choice==1);
  
}
public static void displayMenu(){
System.out.println(" 1-> Insert Item ");
System.out.println(" 2-> Serach Item ");
System.out.println(" 3-> Update Item ");
System.out.println(" 4-> Delate Item ");
}

private static Product createProduct() {
Product newProduct = new Product();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Product code : ");
newProduct.setCode(sc.next());
System.out.print("Enter the Product Name : ");
newProduct.setName(sc.next());
System.out.print("Enter the Product category : ");
newProduct.setCategeory(sc.next());
System.out.print("Enter the Product warranty : ");
newProduct.setWarranty(sc.nextInt());
System.out.print("Enter the Product price : ");
newProduct.setPrice(sc.nextInt());
System.out.print("Enter the Product Stock Levels : ");
newProduct.setStockLevels(sc.nextInt());
System.out.print("Enter the Product suppiler : ");
newProduct.setSupplier(sc.next());
  
return newProduct;
}

private static void serachProduct() {
Scanner sc = new Scanner(System.in);
String code;
int productFound =0;
System.out.print("Please enter the code to search : ");
code = sc.next();
for(int i = 0;i<list.size();i++){
if(list.get(i).getCode().equalsIgnoreCase(code)){
productFound++;
System.out.println("***************************************************************************************");
System.out.println("PRODUCT SERACH RESULTS");
System.out.println("***************************************************************************************");
System.out.println("PRODUCT CODE : "+list.get(i).getCode()) ;
System.out.println("PRODUCT NAME : "+list.get(i).getName());
System.out.println("PRODUCT CATEGEORY : "+list.get(i).getCategeory());
System.out.println("PRODUCT WARRANTY : "+list.get(i).getWarranty()+" years");
System.out.println("PRODUCT PRICE : R "+list.get(i).getPrice());
System.out.println("PRODUCT STOCK LEVELS : "+list.get(i).getStockLevels());
System.out.println("PRODUCT SUPPILER : "+list.get(i).getSupplier());
System.out.println("***************************************************************************************");
}
}
if( productFound == 0){
System.out.println("The product cannot be located. Invalid product");
}

}

private static void deleteProduct() {
Scanner sc = new Scanner(System.in);
String code;
String confirm;
System.out.print("Please enter the code for delete the product : ");
code = sc.next();
int productFound =0;
for(int i = 0;i<list.size();i++){
if(list.get(i).getCode().equalsIgnoreCase(code)){
productFound++;
System.out.print("Confirm that you want to delete the product(Yes/No) : ");
confirm = sc.next();
if(confirm.equalsIgnoreCase("YES")){
list.remove(i);
System.out.println("The product code "+ code+ " has been successfully deleted.");
}else{
System.out.println("The product code "+ code+ " can not deleted.");
}
}
}
if( productFound == 0){
System.out.println("The product cannot be located. Invalid product");
}

}

private static void updateProduct() {
Scanner sc = new Scanner(System.in);
String code;
int productFound =0;
String confirm;
System.out.print("Please enter the code to update the product : ");
code = sc.next();
for(int i = 0;i<list.size();i++){
if(list.get(i).getCode().equalsIgnoreCase(code)){
productFound++;
System.out.print("Updtae the product warranty(Yes/No): ");
confirm = sc.next();
if(confirm.equalsIgnoreCase("YES")){
System.out.print("Updated warranty : ");
list.get(i).setWarranty(sc.nextInt());
System.out.println("The warranty of product code "+ code+ " has been successfully updated.");
}

System.out.print("Updtae the product price(Yes/No) : ");
confirm = sc.next();
if(confirm.equalsIgnoreCase("YES")){
System.out.print("Updated price : ");
list.get(i).setPrice(sc.nextInt());
System.out.println("The price of product code "+ code+ " has been successfully updated.");
}
System.out.print("Updtae the product stock level(Yes/No) : ");
confirm = sc.next();
if(confirm.equalsIgnoreCase("YES")){
System.out.print("Updated stock level : ");
list.get(i).setStockLevels(sc.nextInt());
System.out.println("The stock level of product code "+ code+ " has been successfully updated.");
}
}
}
if( productFound == 0){
System.out.println("The product cannot be located. Invalid product");
}

}
}   
//https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-239074
//class Product
public class Main {
 public void SearchProduct() {
    System.out.println("The product found!");
  }
 public void SaveProduct() {
    System.out.println("The product successfully saved!");
  }
 public void UpdateProduct() {
    System.out.println("The value of the product successfully updated!");
  }
 public void DeleteProduct() {
    System.out.println("The product deleted!");
  }
 public void DisplayMenu() {
    System.out.println("This is the menu!");
  }
 public void CaptureProduct(){
    System.out.println("The product has been captured!");
  }
 public void ExitApplication() {
  }
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
  public static void main(String[] args) {
      int option;
    System.out.print("Choose the operation to perform:\n1.SearchProduct\n2.UpdateProduct\n3.DeleteProduct\n4.DisplayMenu\n5.Capture the product\n6.Exit the application ");
     Scanner input=new Scanner (System.in);
    option=input.nextInt();
    Main myProduct = new Main();
    if(option==1){
    myProduct.SearchProduct(); }
    else if(option==2){
    myProduct.UpdateProduct();}
    else if(option==3){
    myProduct.DeleteProduct();}
    else if(option==4){
    myProduct.DisplayMenu();}
    else if(option==5){
    myProduct.CaptureProduct();}
    else if(option==6){
    myProduct.ExitApplication();}
      else{
          System.out.print("Invalid option!");}
      }
  }            
        
    
    
