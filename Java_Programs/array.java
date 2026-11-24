import java.util.Arrays;

public class array {
    public static void main(String[] args) {
    //     int arr[][] = new int[3][4];
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<4;j++){
    //             arr[i][j] = (int)(Math.random()*100);   //regular 3-d array
    //             //System.out.println(arr[i][j]);
    //         }
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<4;j++){
    //             System.out.print(arr[i][j]+" ");
    //         }System.out.println();
    //     }
    //     //System.out.println(Arrays.toString(arr));

    int arr[][] = new int[3][];
    arr[0] = new int[3];
    arr[1] = new int[2];
    arr[2] = new int[4];
    
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*100);   //jagged array
                //System.out.println(arr[i][j]);
            }
        }

        int sum =0;
        int largestNum = 0;
        int smallestNum = 0;
        for(int n[]:arr){
            for(int m:n){
                sum+=m;                  //sum of the array numbers
                if(largestNum<m){        //largest number in the array
                    largestNum = m;
                }
                smallestNum = m;
                if(smallestNum>m){        //largest number in the array
                    smallestNum = m;
                }
                
                System.out.print(m+" ");
            }System.out.println();
        }

        // public int[] evenOrOdd(int n){
            
        // }

        System.out.println(sum);
        System.out.println(largestNum);
        System.out.println(smallestNum);
        //System.out.println(Arrays.toString(arr));
    
    }
}
