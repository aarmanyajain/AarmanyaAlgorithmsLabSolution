import java.util.Scanner;

public class TransactionCounter {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array  ");
        int noOfTransactions = sc.nextInt();
        
        System.out.println("Enter the values of array ");
        int arr[] = new int [noOfTransactions];
        
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        	 System.out.println("Enter the total no of targets that needs to be achieved ");
        	 
        	 int noOfTargets = sc.nextInt();
        	 
        	 while(noOfTargets-- != 0) {
        		 
        		 System.out.println("Enter the value of target ");
        		 long targetValue = sc.nextInt();
        		 
        		// System.out.println(targetValue);
        		 boolean isTargetAchieved = false;
        		 long sum = 0;
        		 for(int i=0; i< arr.length; i++) {
        			 sum=sum+arr[i];
        			 if(sum>=targetValue) {
        				 System.out.println("Target achieved after transaction 3"
        				 		+ "3"+ (i+1));
        				 isTargetAchieved = true;
        				 break;
        			 }
        			 
        		 }
        		 if (isTargetAchieved == false) {
        			 System.out.println("your target is not achieved");
        		 }
        	 }
        }
        }


