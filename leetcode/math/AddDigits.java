//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

//For example:
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?

class AddDigits {
    public int addDigits(int num) {
        if (num % 9 != 0) {
            return num % 9;
        }
        if (num != 0) {
            return 9;
        }
        return 0;
        // The one digit is the remainder of the number when divided by 9, but if the remainder is 0, the resulting digit is 9 unless the number is 0
    }
}
