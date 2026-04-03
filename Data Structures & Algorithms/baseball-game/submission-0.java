class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int ans=0;
        for(String op:operations){
            if(op.equals("+")){
                int top=s.pop();
                int sum=s.peek()+top;
                s.push(top);
                s.push(sum);
            }
            else if(op.equals("C")) s.pop();
            else if(op.equals("D")){
                s.push(s.peek()*2);
            }else{
                s.push(Integer.parseInt(op));
            }
        }
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }
}