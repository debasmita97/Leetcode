/*****
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:

Input: s = "MerryChristmas"
Output: false
Example 4:

Input: s = "AbCdEfGh"
Output: true
*****/

class SolutionhalvesAreAlike {
    public boolean halvesAreAlike(String s) {
      String a = s.substring(0,(((s.length())/2)));
      String b = s.substring(((s.length())/2),s.length());
      int vowelCountA = vowelCount(a);
      int vowelCountB = vowelCount(b);
      return (vowelCountA == vowelCountB) ? true : false;
            
    }
    public int vowelCount(String string)
    {
        int vowelCount = 0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'  ||string.charAt(i)=='u'||string.charAt(i)=='A'||string.charAt(i)=='E'||string.charAt(i)=='I'||string.charAt(i)=='O'||string.charAt(i)=='U')
                
                vowelCount++;
        }
        return vowelCount;
    }
}
}
