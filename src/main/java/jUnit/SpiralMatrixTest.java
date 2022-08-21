package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//Example 1:
//
//Input:
//[
//[ 1, 2, 3 ],
//[ 4, 5, 6 ],
//[ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]
//Example 2:
//
//Input:
//[
//[1, 2, 3, 4],
//[5, 6, 7, 8],
//[9,10,11,12]
//]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import org.junit.jupiter.api.Test;

import company.microsoft.SpiralMatrix;

class SpiralMatrixTest {

	/* assuming the spiral is in clockwise direction */
	@Test
	void testClockwise() {
		SpiralMatrix testSM = new SpiralMatrix();

		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 } 
				};

		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		res.add(2);
		res.add(3);
		res.add(6);
		res.add(5);
		res.add(4);

		assertEquals(res, testSM.spiralOrder(matrix));
	}
	
	/* assuming the spiral is not in clockwise direction */
	@Test
	void testAntiClockwise() {
		SpiralMatrix testSM = new SpiralMatrix();

		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 } 
				};

		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		res.add(4);
		res.add(5);
		res.add(6);
		res.add(3);
		res.add(2);

		assertEquals(res, testSM.spiralOrder(matrix));
	}
	

}
