class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit because we need to add 1
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is less than 9,
            // simply add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, it becomes 0
            // and carry 1 goes to the previous digit
            digits[i] = 0;
        }
        // If all digits were 9, we need one extra digit
        // Example: [9,9,9] → [1,0,0,0]
        int[] result = new int[digits.length + 1];
        // The first digit becomes 1
        result[0] = 1;

        return result;
    }
}