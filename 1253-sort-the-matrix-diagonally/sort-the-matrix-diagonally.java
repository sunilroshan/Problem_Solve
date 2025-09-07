class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) { //row

            diag(mat, i, 0);
        }

        for(int i = 1; i < m; i++){
            diag(mat,0,i);
        }

        return mat;

    }

    public static void diag(int[][] mat, int r, int c) {

        int n = mat.length;
        int m = mat[0].length;

        ArrayList<Integer> l = new ArrayList<>();

        int i = r;
        int j = c;

        while (i < n && j < m) {
            l.add(mat[i++][j++]);
            
        }

        Collections.sort(l);

        int k = 0;

         i = r;
         j = c;

        while (k < l.size()) {
            mat[i++][j++] = l.get(k);
            
            k++;
        }

    }
}