/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Path: company/google/SpiralMatrix.java
//Link: https://github.com/kdn251/interviews/blob/master/company/google/SpiralMatrix.java

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SpiralMatrixTest {
    

    /**
     * Test of spiralOrder method, of class SpiralMatrix.
     */
    @Test
    public void testSpiralOrder() {
        //Input:
        //[
            //[ 1, 2, 3 ],
            //[ 4, 5, 6 ],
            //[ 7, 8, 9 ]
        //]
        int m = 3;
        int n = 3;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1,2,3,6,9,8,7,4,5};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    @Test
    public void testSpiralOrder2() {
        //Input:
        //[
            //[1, 2, 3, 4],
            //[5, 6, 7, 8],
            //[9,10,11,12]
        //]
        int m = 3;
        int n = 4;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        
        //Output
        int[] r = {1,2,3,4,8,12,11,10,9,5,6,7};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    @Test
    public void testSpiralOrder3() {
        //Input:
        //[
            //[1],
            //[2],
            //[3],
            //[4],
            //[5]
        //]
        int m = 5;
        int n = 1;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1,2,3,4,5};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    @Test
    public void testSpiralOrder4() {
        //Input:
        //[
            //[1, 2, 3, 4, 5]
        //]
        int m = 1;
        int n = 5;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1,2,3,4,5};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    @Test
    public void testSpiralOrder5() {
        //Input:
        //[
//            [1	2	3	],
//            [4	5	6	],
        //]
        int m = 2;
        int n = 3;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1, 2, 3, 6, 5, 4};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    @Test
    public void testSpiralOrder6() {
        //Input:
        //[
//            [1	2	],
//            [3	4	],
//            [5	6	],
        //]
        int m = 3;
        int n = 2;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1, 2, 4, 6, 5, 3};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
    
    public void testSpiralOrder7() {
        //Input:
        //[
//            [1	2	3	4	5	],
//            [6	7	8	9	10	],
//            [11	12	13	14	15	],
//            [16	17	18	19	20	],
//            [21	22	23	24	25	],
        //]
        int m = 3;
        int n = 2;
        int[][] input = new int[m][n];
        int c = 1;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                input[i][j] = c;
                c++;
            }
        }
        //Output
        int[] r = {1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13};
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<m*n;i++){
            result.add(r[i]);
        }
        assertArrayEquals(result.toArray(),SpiralMatrix.spiralOrder(input).toArray());
    }
}
