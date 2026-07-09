import java.util.*; 

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length();
        int n = grid[0].length(); 

        Queue<int[]> q = new LinkedList<>(); 
        int fresh = 0; 

        for(int i = 0; i<m.length(); i++){
            for(int j = 0; j<n.length(); j++){
                if(grid[i][j] == 2){
                    q.add(new int[] {i , j}); 
                } else if (grid[i][j] == 1) {
                    fresh++; 
                }
            }
        }

        if(fresh = 0) return 0; 

        int minutes = 0; 
        int[][] directions = {{1,0} , {-1,0} , {0, 1} , {0 ,-1} }; 

        while(!queue.isEmpty()){
            int size = queue.size(); 
            boolean rottenThisMinute = false; 

        for(int i = 0; i<size; i++){
            int [] orange = queue.poll(); 
            int r = orange[0];
            int c = orange[1]; 

            for(int[] dir : directions){
                int nr = r + dir[0]; 
                int nc = c + dir[1]; 

                if(nr>0 && nc>0 && nr<rows && nc<cols && grid[nr][nc] == 1){
                    grid[nr][nc] == 2;
                    minutes--; 
                    queue.add(new int[] {i , j});
                    rottenThisMinute = true; 
                }
            }
        }

        if(rottenThisMinute){
            minutes++; 
        }
    } 

    
     return (fresh == 0 )? minutes: -1; 
        }
    }
 






        