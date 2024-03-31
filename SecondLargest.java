
class SecondLargest {
    public static void main(String args[]) {
        int arr[] = {3, 6, 5, 6, 2};
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // First pass: Find the largest element
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest){
                secondLargest = num;
            }
        }
        
        // Check if a second largest element was found
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }
}
