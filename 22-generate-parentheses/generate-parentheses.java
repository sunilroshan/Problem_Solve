class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> ans = new ArrayList<>();
        para(n,0,0,"",ans);

        return ans;
        
    }

    public static void para(int n,int ob,int cl,String s,ArrayList<String> ans){

        if(s.length() == n*2){

            ans.add(s);
            return;
            
        }

        if(ob < n){
            para(n,ob + 1,cl,s + "(",ans);
        }

        if(cl < ob){
            para(n,ob,cl + 1,s + ")",ans);;
        }

    }
}