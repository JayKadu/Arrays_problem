
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str = "JayKadu";
        int n = 3;
        zigZag(str,n);
	}
	public static void zigZag(String str,int n){
	    if(n==1){
	        System.out.println(str);
	        return;
	    }
	    
	    char[] charArray= str.toCharArray();
	    int length=str.length();
	    
	    String[] arr= new String[n];
	    Arrays.fill(arr,"");
	    
	    int row=0;
	    boolean down=true;
	    
	    for(int i=0;i<length;i++){
	        arr[row]+=charArray[i];
	        
	        if(row==n-1){
	            down=false;
	        }
	        else if(row==0){
	            down=true;
	        }
	        
	        if(down){
	            row++;
	        }else{
	            row--;
	        }
	    }
	    for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i]);
        }
	}
}
