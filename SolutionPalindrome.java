/***
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false
***/

class SolutionPalindrome {
    public boolean isPalindrome(int x) 
    {
        int num,rem,sum=0, flag=0;
        //int [] temp = new int[];
        num=x;
        if(num>=0)
        {
         while(num!=0)
         {
            rem=num%10;
            num=num/10;
            sum=sum*10+rem;
         }
             if(sum==x)
                 flag=1;
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}
