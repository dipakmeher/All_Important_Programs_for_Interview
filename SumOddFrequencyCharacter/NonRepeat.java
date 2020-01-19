class NonRepeat 
{ 
	static final int NO_OF_CHARS = 256; 
	static char count[] = new char[NO_OF_CHARS]; 
	
	/* calculate count of characters 
	in the passed string */
	static void getCharCountArray(int arr[]) 
	{ 
		for (int i = 0; i < arr.length; i++) 
			count[arr[i]]++; 
	} 
	
	/* The method returns index of first non-repeating 
	character in a string. If all characters are repeating 
	then returns -1 */
	static int firstNonRepeating(int arr[],int n) 
	{ 
		getCharCountArray(arr); 
        int sum = 0, i; 
        
        for (i = 0; i < count.length; i++) 
		{ 
			System.out.print(" "+count[i]);
		} 
	
		for (i = 0; i < arr.length; i++) 
		{ 
			if (count[arr[i]]%2 != 0) 
			{ 
                sum = sum + (count[arr[i]]*arr[i]);
			} 
		} 
		
	return sum; 
	} 

	// Driver method 
	public static void main (String[] args) 
	{ 
        int arr[] = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3}; 
        int n = arr.length;
		int sum = firstNonRepeating(arr , n); 
		
		System.out.println("Sum = "+ sum); 
	} 
} 