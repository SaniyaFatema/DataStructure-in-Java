class SecondSmallest {
    public static void main(String args[]) {
        int arr[] = {3, 6, 5, 6, 2};
        
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        // First pass: Find the smallest element
        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num > firstSmallest) {
                secondSmallest = num;
            }
        }
        
        // Check if a second smallest element was found
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }
}






