//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

//For example:
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?
// I am able to solve without using the extra while loop.

class AddDigits {
    public int addDigits(int num) {
        int x = 0, y = 0;
        int sum = 0;
        while(num >=10) {
            x = num % 10;
            y = num / 10;
            sum = x+y;
            num = sum;
        }
        
        return num;
    }
}

