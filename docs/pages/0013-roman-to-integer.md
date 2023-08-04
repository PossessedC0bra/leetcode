# 13. Roman to Integer

```java copy showLineNumbers filename="Solution.java"
class Solution {
    private static final int[] VALUES = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] VALUE_STRINGS = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public int romanToInt(String s) {
        int strIndex = s.length();
        int valIndex = 0;
        int res = 0;
        while (strIndex > 0 && valIndex < VALUES.length) {
            String valString = VALUE_STRINGS[valIndex];

            if (strIndex - valString.length() < 0) {
                valIndex++;
                continue;
            }

            String compare = s.substring(strIndex - valString.length(), strIndex);
            if (compare.equals(valString)) {
                res += VALUES[valIndex];
                strIndex -= valString.length();
            } else {
                valIndex++;
            }
        }

        return res;
    }
}
