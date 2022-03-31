import java.util.Scanner;
public class ChristmasTree {
	
	

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the height of tree: ");
	        // this will read the length of height of Christmas tree and ask to enter the number 
	        int h = sc.nextInt();

	        for (int i = 1; i <= h; i++) {
	            for (int j = h - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	                // this will print the Christmas tree pattern with entered height
	            }
	            System.out.println();
	        }


	    }
	}


