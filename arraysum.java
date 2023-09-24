public class arraysum {
    public static void main (String[] args){
        int[]arr = {45,67,34,76,1};
        int sum=0;
        for (int element:arr){
            sum = sum+element;
            
        }
        System.out.println("The sum of elements of array is " +sum/arr.length);
    }
}
