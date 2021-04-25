/***
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
***/

class Solutionreverse {
    public int reverse(int x) {
        int num, rem, rev; 
        Long sum = new Long(0);
        num =x;
        {
          while(num!=0)
           {
            rem= num%10;
            num=num/10;
            sum= sum*10+rem;
           }
        }
        if(sum<Integer.MAX_VALUE && sum>Integer.MIN_VALUE)
        rev = sum.intValue();
        else
            rev = 0;
        return rev;
    }
        
}
