package Arrays;

public class BinarySearch {
    public static void main(String [] args){
        int arr[] = {2,4,6,7,8,10,12,14,16};
        int key = 12;
        boolean found = false;
        int start = 0, end = arr.length - 1 ;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                found = true;
                break;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
        }
        if(!found){
            System.out.println("NOT FOUND"+ key);
        }else{
            System.out.println("Found at index: " +start);
        }
    }
}
