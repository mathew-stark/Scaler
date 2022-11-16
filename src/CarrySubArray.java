public class CarrySubArray {
    public static void main(String args[]){
        int[] array  = new int[3];
        array[0]=2;
        array[1]=8;
        array[2]=9;
        int n=array.length;
        int tsum=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=array[j];
                tsum+=sum;
            }
            System.out.println(sum);
        }
        System.out.println(tsum);
    }
}
