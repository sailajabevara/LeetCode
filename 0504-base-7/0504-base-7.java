class Solution {
    public String convertToBase7(int num) {
        String result="";
        
        if(num==0)
        return "0";
        boolean isNegative=num<0;// Checking sign....
        num=Math.abs(num);//Convert to positive to do the work...
        
            while(num>0){
                int rem=num%7;
                result=rem+result;
                num/=7;
            }
            if(isNegative)
            result="-"+result;
            return result;
        
              
    }
}