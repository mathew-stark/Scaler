public class Subarrays {
    public static void main(String args[]){
        int[] array  = new int[3];
        array[0]=2;
        array[1]=8;
        array[2]=9;
        int n=array.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.println(array[k]);
                }
                System.out.println('\t');
            }
        }
    }
}
