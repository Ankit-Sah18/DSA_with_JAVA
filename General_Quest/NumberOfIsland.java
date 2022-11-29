
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//  You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3




package General_Quest;

public class NumberOfIsland {

         public static int NoOfIsland(int[][] mat, int n, int m){

              int count=0;

              for(int i=0;i<n;i++)
              {
                for(int j=0;j<m;j++)
                {
                    if(mat[i][j]==1)
                    {
                        CheckNoOfIsland(mat, i,j,n,m);
                        count++;
                    }
                }
              }

              return count;
         }

         public static void CheckNoOfIsland(int[][] mat, int i, int j, int n, int m){

             if(i<0|| j<0 || i==n || j==m || mat[i][j]!=1)
             {
                return ;
             }

             mat[i][j]=2;
             CheckNoOfIsland(mat,i+1,j,n,m);
             CheckNoOfIsland(mat,i-1,j,n,m);
             CheckNoOfIsland(mat,i,j+1,n,m);
             CheckNoOfIsland(mat,i,j-1,n,m);


         }

         public static void main(String[] args) {
            
              int[][]mat={
                   
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,1,0},
                {1,1,0,0,1}
              };

              int x= NoOfIsland(mat,4,5);

              System.out.println(x);
         }
    
}
