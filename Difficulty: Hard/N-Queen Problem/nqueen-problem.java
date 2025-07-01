class Solution {

    static ArrayList<ArrayList<Integer>> ans;
    static ArrayList<Integer> temp;
    
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        
        int[][] chess = new int[n][n];
        
        queen(0, n, chess);
        return ans;
    }
    
    public static void queen(int r, int n, int[][] chess) {
        if(r == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int c = 0; c < n; c++) {
            if(isvalidto_place(r, c, chess)) {
                chess[r][c] = 1;
                temp.add(c + 1);
                
                queen(r + 1, n, chess);
                
                temp.remove(temp.size() - 1);
                chess[r][c] = 0;
            }
        }
    }
    
    public static boolean isvalidto_place(int r, int c, int[][] chess) {
        // Check column
        for(int i = 0; i < r; i++) {
            if(chess[i][c] == 1) return false;
        }
        
        // Check left diagonal
        for(int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if(chess[i][j] == 1) return false;
        }
        
        // Check right diagonal
        for(int i = r - 1, j = c + 1; i >= 0 && j < chess.length; i--, j++) {
            if(chess[i][j] == 1) return false;
        }
        
        return true;
    }
}
