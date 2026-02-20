class Solution {
    public static void helper(String num,ArrayList<Integer> list){
        // long sum=0;
        for(char c:num.toCharArray()){
            int digit=c-'0';
            // sum=sum*10+rem;
            list.add(digit);
        }
    }
    public String addStrings(String num1, String num2) {
        // so we can't use directly the parse or valeuof functions -- its clealrly stated
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        helper(num1,list1);
        helper(num2,list2);
        Collections.reverse(list1);
        Collections.reverse(list2);
        //now add the numbers by index and solve the carry part also
        StringBuilder sb=new StringBuilder("");
        if(list1.size()==0 && list2.size()==0) return "";
        if(list1.size()==0){
            Collections.reverse(list2);
            for(int i=0;i<list2.size();i++) sb.append(list2.get(i));
            return sb.toString();
        }
        if(list2.size()==0){
            Collections.reverse(list1);
            for(int i=0;i<list1.size();i++) sb.append(list1.get(i));
            return sb.toString();
        }
        int i=0;
        int carry=0;
        while(i<list1.size() || i<list2.size() || carry!=0){
            int d1=i<list1.size()?list1.get(i):0;
            int d2=i<list2.size()?list2.get(i):0;
            int sum=d1+d2+carry;
            sb.append(sum%10);
            carry=sum/10;
            i++;
        }
        return sb.reverse().toString();
    }
}