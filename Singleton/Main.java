package Singleton;

public class Main {
    public static void main(String[] args) {
        // Define the input array
        int[] student_list = {1, 2, 3, 4, 6, 7, 8, 8, 7, 5, 4, 3, 2, 1, 6};
        
        // Call the static run method from the Solution class
        int result = Solution.run(student_list); // Assuming `Solution.run` returns an integer
        System.out.println("The single student is: " + result); // Print the result
    }
}
