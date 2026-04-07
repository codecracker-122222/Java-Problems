public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        if(arr.length < 2){
            System.out.println("Invalid array");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int nums : arr){
            if(nums > largest){
                secondlargest = largest;
                largest = nums;
            }
            else if(nums > secondlargest && nums != secondlargest){
                secondlargest = largest;
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("No second largest element in an array");
        }
        else{
            System.out.println(secondlargest);
        }
    }
}
