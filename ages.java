package ages.week4ArraysAndMethods;

class ages{
	
	// Subtract first and last element of the array.
	public static int subtract(int arr[])
	{
		int last = 0, first = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(i == 0)
			{
				first = arr[i];
			}
			else
			{
				last = arr[i];
			}
		}
		return last-first;
	}
	
	// Calculate sum of array elements
	public static int calculatesum(int arr[])
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	
	// Concatenate string with arguments as a word and integer
	public static String Concatenate(String word, int n)
	{
		String answer = "";
		for(int i = 0; i < n; i++)
		{
			answer += word;
		}
		
		return answer;
	} 
	
	// Concatenate two strings with a space
	public static String ConcatenateFirstLast(String first, String last)
	{
		return first + " " + last;
	}
	
	// Check if sum of array element is > 100
	public static boolean isGreaterthan(int arr[])
	{
		
	// Call calculatesum method to calculate the sum
	int sum = calculatesum(arr);
		
	// if > 100 return true
	if(sum>100)
		{
			return true;
		}
	
	return false;
	}
	
	// Find avg of array of double
	public static double Averagedouble(double arr[])
	{
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	// Check if avg of first array is >
	public static boolean isGreaterAverage(double array1[],double array2[])
	{
		
	// Calculate average and then compare
	double avg1 = Averagedouble(array1);
	double avg2 = Averagedouble(array2);
		if(avg1 > avg2)
		{
			return true;
		}
		return false;
	}
	
	// willBuyDrink method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		
	// If it is hot outside and money in pocket is greater than $10.50 return true.
		if(isHotOutside == true && moneyInPocket > 10.50)
		{
			return true;
		}
		return false;
	}
	public static void main(String []argv)
	{
		
	// Create an array 
    int[] arr = new int[] {3,9,23,64,2,8,28,93};
         
    // Subtract first and last element
    int diff1 = subtract(arr);
         
         System.out.println("The sum of the first and last elements is " + diff1 + ".");
         
    // Add new element to array
    int[] arr1 = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 10};
         
    // Again calculate difference and print result
    int diff2 = subtract(arr1);
         System.out.println("The sum of the first and last elements after adding an element is " + diff2 + ".");
         
    // Calculate the average of ages
    int sum = 0;
    sum = calculatesum(arr1);
         
    // Average is sum / by length of array
    int average=sum/arr1.length;
    
    // Print the result
         System.out.println("The average is " + average + ".");
         
    // Create array of string (name)
    String name[]={"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
         
    // Calculate avg number of letters per name 
    // Count the number of characters in each string and then / it by array size
    int count = 0;
    for(int i = 0; i < name.length; i++)
         {
         	String temp = name[i];
         	count += temp.length();
         }
         int apword = count / name.length;
         System.out.println("The average number of letters per name is " + apword + ".");
     
     // Concatenate all the names together with a space after each String
         String concat = "";
         for(int i = 0; i < name.length; i++)
         {
         	concat += name[i];
         	concat += " ";
         }
         System.out.println("The concatenation of all Strings is " + concat + ".");
         
         // New array named (nameLengths) for keeping record of length of each String in name array
         int []nameLengths = new int[name.length];
         for(int i = 0; i < name.length; i++)
         {
         	String temp = name[i];
         	nameLengths[i] = temp.length();
         }
         // Calculate the sum of all elements in nameLengths array
         int sumLength = calculatesum(nameLengths);
         
         System.out.println("The sum of nameLengths Array is "+ sumLength + ".");
         
         // Call the Concatenate() method to add up the strings
         String conc1 = Concatenate("Hello",3);
         System.out.println("The concatenation of string after calling Concatenate method is "+ conc1 + ".");
         
         // Call the method to concatenate first name and last name with a space 
         String conc2 = ConcatenateFirstLast("Xyz", "Last Xyz");
         System.out.println("The concatenation of First and last name " + conc2 + ".");
         
         // Check if array arr have sum greater than 100 by calling isGreater function
         if(isGreaterthan(arr))
         {
         	System.out.println("The sum is > than 100.");
         }
         else
         {
         	System.out.println("The sum is < than 100");
         }
         // Find the average of array of double
         double[] darray = new double[] {1.6,9.0,5.4,3,12.7,0.99};
         double avgdouble = Averagedouble(darray);
         System.out.println("The average of array of double is " + avgdouble + ".");
         
         // Check if first array have average greater than second.
          double[] darray1 = new double[] {1.0,7.0,5.4,3,12.7};
         if(isGreaterAverage(darray, darray1))
         {
         	System.out.println("The average of first array is > second.");
         }
         else
         {
         	System.out.println("The average of first array is < second.");
         }
         
         // Call willBuyDrink method 
         if(willBuyDrink(true,11.76))
         {
         	System.out.println("You can buy a drink.");
         }
         else
         {
         	System.out.println("You cannot buy Drink!!");
         }
	}
}

