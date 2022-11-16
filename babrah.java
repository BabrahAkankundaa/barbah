import java.util.Scanner;
public class babrah {

	public static void main(String[] args) {

		String student_name;
        int marks[] = new int[8];
        int i;
        double sum = 0, Average;
       Scanner input  = new Scanner(System.in);
		
       System.out.println("  ========UNIVERSITY GRADING SYSTEM  BY BABRA========  ");
   	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
   	System.out.println("Enter marks for the following Eight course units ");
   	
   	
   	
   	System.out.print("Enter student's name: ");
 	student_name = input.nextLine();
        for(i=0; i<8; i++) { 
        		
           System.out.print("Enter Mark for course unit ("+(i+1)+"):");
           marks[i] = input.nextInt();
           sum = sum + marks[i];
        }

        Average = sum / 8;
    	System.out.println(" ");
    	System.out.println(" ");
        System.out.print("Dear "+ student_name  + ", Your Final Grade is  ");
        if( Average >= 80)
        {
            System.out.print("A");
        }
        else if( Average >= 60 &&  Average <80)
        {
           System.out.print("B");
        } 
        else if( Average >=40 &&  Average <60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }

	
	
		input.close();

	
	
	}

	}


