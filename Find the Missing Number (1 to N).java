public class MissingNumber{
    public static int findMissingNumber(int[] arr,int n){
     int expectedSum = n*(n+1)/2;
     int actualSum = 0;
     for(int num : arr){
        actualSum += num;
     }
     return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int []arr1 = {1,2,4,5};
        int n1 = 5;
        System.out.println(findMissingNumber(arr1, n1));

        int []arr2 = {2,3,1,4,6};
        int n2 = 6;
        System.out.println(findMissingNumber(arr2, n2));
               
    }
}
