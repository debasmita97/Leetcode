/*****
You are given an array rectangles where rectangles[i] = [li, wi] represents the ith rectangle of length li and width wi.

You can cut the ith rectangle to form a square with a side length of k if both k <= li and k <= wi. For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.

Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.

Return the number of rectangles that can make a square with a side length of maxLen.

 

Example 1:

Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
Output: 3
Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
The largest possible square is of length 5, and you can get it out of 3 rectangles.
Example 2:

Input: rectangles = [[2,3],[3,7],[4,3],[3,7]]
Output: 3
*****/

class SolutioncountGoodRectangles {
    public int countGoodRectangles(int[][] rectangles) {
        int length = rectangles.length;
        int [] sides = new int[length];
        int countGoodRectangles = 0;
        for(int i =0; i<length; i++)
        {
            for(int j=0;j<1;j++)
            {
                if(rectangles[i][j]>rectangles[i][j+1])
                    sides[i] = rectangles[i][j+1];
                else
                    sides[i] = rectangles[i][j];
            }
        }
        int max=sides[0];
        for(int i=1;i<sides.length;i++)
        {
           
            if(sides[i]>max)
                max = sides[i];
        }
        for(int i=0;i<sides.length;i++)
        {
           
            if(sides[i]==max)
              countGoodRectangles++;  
        }
        return countGoodRectangles;
    }
}
