class Solution {
    public String convertDateToBinary(String date) {

        String arr[] = date.split("-");

        StringBuilder sb = new StringBuilder();
        
        int x = Integer.parseInt(arr[0]);
        String year = Integer.toBinaryString(x);
        sb.append(year);
        sb.append("-");

        int y = Integer.parseInt(arr[1]);
        String month = Integer.toBinaryString(y);
         sb.append(month);
        sb.append("-");

        int z = Integer.parseInt(arr[2]);
        String day = Integer.toBinaryString(z);
         sb.append(day);
        

        // String ans = year+"-"+month+"-"day;

        return sb.toString();

        
        
    }
}