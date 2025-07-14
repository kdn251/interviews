package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;


public class DuplicateSumArra {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,2,4,4,4,5,9,9,10,10,10};
		HashMap<Integer, Integer> mp=new HashMap<Integer,Integer>();
		for(int i:arr) {
			if(mp.containsKey(i))
				mp.put(i,mp.get(i)+1);
			else
				mp.put(i,1);
		}
		int[] sum=new int[mp.size()];
		int count=0;
		//System.out.println(mp);
		for(Map.Entry<Integer,Integer> entry:mp.entrySet()) {
			if(entry.getValue()==1)
			sum[count]=entry.getKey();
			else
				sum[count]=entry.getKey()*entry.getValue();
		
			count++;
		}
		
		for(int i:sum) {
			System.out.print(i+",");
			
		}
		
		
	}

}
