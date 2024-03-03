import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> al = new ArrayList<>();
		int i=0;
		int j=0;
		while(i<n && j<m){
			int num1 = arr1.get(i);
            int num2 = arr2.get(j);
			if (num1 == num2) {
                al.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
		}
		
		
		return al;
	}
}
