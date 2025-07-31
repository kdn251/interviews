//Stock Buy and Sell problem
//The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

{
import java.io.*;
import java.util.*;
class Interval {
    int buy;
    int sell;
}
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Stock obj = new Stock();
		    
		    obj.stockBuySell(arr, n);
		    System.out.println();
		}
	}
}

}

class Stock{
    // Function to find the buy and sell days and print them
    static void stockBuySell(int price[], int n) {
        
        
        int i,sum=arr[0],start=0,end=-1,flag=1;
    int value=0;
    for(i=1;i<n;i++)
    {
        if(arr[i]>=arr[i-1] || flag==0)
        {
            if(flag==0)
            {
                start=i;
            }
            flag=1;
            end=i;
        }
        else
        {
         if(start!=end && end!=-1)
         {
         value=1;
         cout<<"("<<start<<" "<<end<<")"<<" ";
         }
         flag=0;
         i--;
        }
        if(i==n-1)
        {
         if(start!=end)
         {
         value=1;
         cout<<"("<<start<<" "<<end<<")"<<" ";
         }  
        }
        
    }
    if(value==0)
    {
        cout<<"No Profit";
    }
    } 
    
}
