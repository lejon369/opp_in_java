public class print3 {
    public  static void main(String[] args){
        //outer loop
        int n=4;
        for(int i=0; i<=n;i++){

            // iner loop
            for (int j=1; j<n-i; j++) {
                System.out.print(" ");
            }

            //inner loop print --->>>>
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
System.out.println();
        }
    }
}
