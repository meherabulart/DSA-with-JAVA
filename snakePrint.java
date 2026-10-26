public class snakePrint {
    public static void main(String[] args) {
        int [][] arr ={{5,6,7,8},{3,4,5,2},{4,5,3,4},{4,3,1,4}};
        for (int i=0; i<arr.length;i++)
        {   if(i%2==0){

            for (int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
        }

            }
            else{

            for (int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
        }

            }
            System.out.println();
        }
    }
}
