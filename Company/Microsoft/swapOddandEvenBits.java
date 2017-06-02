// Given an positive integer , swap all odd bits with even bits and vice versa.
// for example :
// 1. number = 8 (00001000) it should be converted to 4 (00000100)
// 2. number = 13 (0001101) it should be converted to 14 (00001110)

public class Solution {

    public int swappingBits(int num) {
        if(num <= 0)
        	return 0;
        // get all even bits
        int evenBits = num &  0xAAAAAAAA;
        // get all odd bits 
        int oddBits = num & 0x55555555;
        evenBits >>=1; // Right shift
        oddBits <<=1;  // Left shift
        return (evenBits | oddBits);
    }

}


