class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
