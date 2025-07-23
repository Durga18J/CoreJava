// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void ascedingOrder(int[]arr){
        for(int i=0;i<arr.length;i++){
            int temp =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[]arr ={3,2,5,8,1};
        ascedingOrder(arr);
    }
}
