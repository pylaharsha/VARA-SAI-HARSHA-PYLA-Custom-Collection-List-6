package epam.com.Collection_List;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        ListOperations<Integer> myList=new ListOperations<Integer>();
   	 
   	 //Add elements
   	 myList.add(1);
   	 myList.add(2);
   	 myList.add(3);
   	myList.add(4);
  	 myList.add(5);
  	 myList.add(6);
  	myList.add(7);
  	 myList.add(8);
  	 myList.add(9);
  	 myList.add(10);
  	 
  	
  	    	System.out.println("Initial myList");
  	        System.out.println(myList);
  	        int count=1;
  	        while(count == 1) {
  	        	System.out.println("\n*** myList Operations ***");
  	            System.out.println("\n1.Add 2.Remove 3.fetch 4.Print myList");
  	            System.out.println("Enter your choice");
  	        	int ch = s.nextInt();
  		        switch(ch) {
  		        case 1:
  		        	System.out.println("Enter a number to add");
  		        	int n=s.nextInt();
  		        	myList.add(n);
  		        	break;
  		        case 2:
  		        	System.out.println("Enter a index to remove");
  		        	int index=s.nextInt();
  		        	System.out.println(myList.remove(index));
  		        	break;
  		        case 3:
  		        	System.out.println("Enter a index to get a value");
  		        	int ind=s.nextInt();
  		        	System.out.println(myList.get(ind));
  		        	break;
  		        case 4:
  		        	System.out.println(myList);
  		        	break;
  		        default:
  		        	System.out.println("Select a valid operation...!\n");
  		        	break;
  		        }
  		        System.out.println("\nDo you want to continue(1/2):");
  		        System.out.println("1.Yes\n2.No");
  		        int cn1 = s.nextInt();
  		        count =cn1;
  	        }

    }
}
