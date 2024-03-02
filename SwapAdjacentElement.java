public class Main
{
  static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
  }
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		for(int i=0;i<arr.length-1;i++){
		    if(i%2==0){
		        swap(arr, i, i+1);
		    }
		}
		for(int c: arr){
		    System.out.print(c+ " ");
		}
	}
}
