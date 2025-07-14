// You are given an n x n 2D matrix representing an image.

// Rotate the image by 90 degrees (clockwise).

// Follow up:
    // Transpose and Swap the rows and Coloumns 

public class RotateImage {
    public static void RotatedMatrix(int[][] arr) {
        //1.Transpose the Matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //2.Swapping the rows and columns
        for(int i=0;i<arr.length;i++){
            int li=0; //left Index
            int ri=arr.length-1; //Right Index
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Rotation of Matrix");
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        RotatedMatrix(arr);
        for(var matrix:arr){
            System.out.println(Arrays.toString(matrix));
        }
    }
}
