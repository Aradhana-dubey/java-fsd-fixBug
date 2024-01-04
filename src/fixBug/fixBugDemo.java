package fixBug;

import java.util.Arrays;

public class fixBugDemo {
	
	
	// Function  performing linear search
	public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return the index if the key element is found
            }
        }
        return -1;  // Return -1 if the key element is not found
    }

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        
        //function calling linear Search
        int result = linearSearch(arr, target);
        System.out.println("Index of " + target + ": " + result);
        
     // Original array
        int[] Array = {5, 3, 8, 1, 7};

        // Sorting the array
        Arrays.sort(Array);

        
        System.out.print("Sorted Array: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }
		

	
		       }
		}



	


