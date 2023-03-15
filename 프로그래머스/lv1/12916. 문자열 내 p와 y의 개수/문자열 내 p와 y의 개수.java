class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] arr = s.toLowerCase().split("");
        
        int pNum=0;
        int yNum =0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p")){
                pNum++;
            }else if(arr[i].equals("y")){
                yNum++;
            }
        }
        
        if(pNum != yNum){
            answer = false;
        }

        return answer;
    }
}