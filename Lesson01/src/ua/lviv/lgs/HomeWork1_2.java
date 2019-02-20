package ua.lviv.lgs;

public class HomeWork1_2 {
	public static void main(String[] args) {
		
		int[] array = {20,8,46,32,45,89,120,156,890,410};
		
		int max = array[array.length - 1];
		int min = array[array.length - 1];
		
		for (int i=0; i < array.length; i++) {
		    if (array[i] > max) {
		        max = array[i]; 
		    } else if (array[i] < min) {
		        min = array[i];
		    }
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		
		/*
		 * int max = array[0];
		 * for (int i=0; i<array.length;i++){
		 * 	if(array[i] > max)
		 * }
		 */
}
}
