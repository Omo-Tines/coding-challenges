package Singleton;

public class Solution {

	public static int run(int[] student_list) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
		
		
		int single_student_number = 0;
		for(int i : student_list){
			single_student_number^=i;
		}
		return single_student_number;
	}
}
