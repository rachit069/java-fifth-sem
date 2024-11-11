class Fibo{
    public static void main(String args[]){
        int arr[] = new int[5];
        int n = 5;
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        for(int i = 2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
};