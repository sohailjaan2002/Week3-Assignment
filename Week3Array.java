package java18project;

public class Week3Array {

	public static void main(String[] args) {
		
		
	//2.Create an array of String called names that contains the following
		//values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		// a: Use a loop to iterate through the array and calculate the average 
		//number of letters per name. Print the result to the console.

		String[] names = {"Sam" ,"Tommy", "Tim", "Sally", "Buck","Bob"};
		
		 int sumOfLetters = 0;
				 
         for(String name : names) {
        	 sumOfLetters += name.length();
		}
		  System.out.println("Average numbers of letters/name="+" "+sumOfLetters/names.length);
		  
		  //b.	Use a loop to iterate through the array again and concatenate all the names
		  //    together, separated by spaces, and print the result to the console.
		    
			   String nameTogether=" ";
			   for (String name : names) {
				   nameTogether += name+" ";
			   }
			   
			   System.out.println(nameTogether);
			   
		  // Access the last element of any array
			   System.out.println("This is for Question 3: " + names [names.length-1]);
		// Access the first element of any array
			   System.out.println("This is for Question 4: " + names [0]);
		
			//Question : 5
			   int[] nameLengths = new int[names.length];
			    for(int i = 0; i < names.length; i++) {
			    	nameLengths[i] += names[i].length();

			    }
			        for (int length : nameLengths) {
			        	System.out.println("This is for Question 5: " + length);
			        	}
			        
			   // Question : 6
			        
			        int sum = 0;
			        for(int namelength :nameLengths ) {
			        	
			        	sum += namelength;
			        }
			        
			        System.out.println("The Sum of all the elements in nameLengths = "+ ""+sum);
			        
			      // Question 7
			        
			        System.out.println("This is for Question 7: " + stringInteger("Hello", 3));
			        
			    //Question 8
			        
			        
			      System.out.println(creatingFullName("Sohail", "Khan"));
			        
			        
			     //Question 9
			        
			        int [] ArrayOfnumbers = {12, 23, 30, 40, 50};
					
					int sum1 = 0;
					
					for(int arrayofnumber:ArrayOfnumbers ) {
						
						sum1 += arrayofnumber;}
					System.out.println("This is for question 9 :"+ sumOfnumbers(sum1, 100));
					
					
				//Question 10 
					
					double [] doubleNumberArray = {20.5, 5.6, 10.5, 22.3, 15.0};
						
						System.out.println("The average for question 10 =" +" "+doubleAverage(doubleNumberArray));
						
				//Question 11
						
						double[] doubleArray1 = {12.1,20.3,10.4,15.0,13.9,50.0};
						double[] doubleArray2= {9.2,13.9,10.0};
						
						System.out.println("This is for question 11:"+" "+avgOftwoDoubleArrays(doubleArray1,doubleArray2));
						
				//Question 12
						
						boolean isHotOutside = true;
						double moneyInPocket = 33;
						
						System.out.println("This is for question 12:"+" "+willBuyDrink(isHotOutside,moneyInPocket));
						
						
		//the method I created will take an employee name His/her department  and add them together.
		//With the help of this method we can keep track of employee and their departments.				
						
						System.out.println(employeeNameDepartment("Name = Stacy", "Department = HR"));
					}
					
					// Method declaration for Question 7
					public static String stringInteger(String word, int n) {
						
						String print = "";
						
						for(int i = 0; i < n; i++ ){
							
							print += word;
						}
						return print;
					}
					// Method Declaration Question: 8
					public static String creatingFullName(String firstName, String lastName) {
						return firstName + " " + lastName;
					}
					
					// Method Declaration Question: 9
					
					public static boolean sumOfnumbers(int sumofnumbers , int greaterthan100) {
						
						return sumofnumbers > greaterthan100;
					}
					
					// Method Declaration Question: 10
					
					public static double doubleAverage(double[] numbers){
						  double sum = 0;
						  for (double number : numbers) {
							  sum += number;
							  }
						  return sum / numbers.length;
						}
					
					//Method Declaration Question: 11
					
					public static boolean avgOftwoDoubleArrays(double[] array1, double[] array2) {
						
						double sum = 0;
						for(double i: array1) {
							
							sum += i;
							sum=sum/array1.length;
						}
							double sum1=0;
							
							for(double j: array2) {
								
								sum1 += j;
								sum1= sum1/array2.length;
								
								}
							return sum > sum1;
							
						}
					//Method Declaration Question: 12
					
					public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
						
						if (isHotOutside == true && moneyInPocket > 10.50) {
					
								return true;
								}
						
								else {
										return false;
									}
					
								}
					
					//Method Declaration Question: 13
					
					public static String employeeNameDepartment(String name, String department) {
						return name + " : " + department;
					}

}

					
					


