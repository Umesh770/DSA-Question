class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        char[] arr=s.toCharArray();
        backtrack(arr,0);
        return ans;
    }
    public void backtrack(char[] arr,int index){

        if(index==arr.length){
            ans.add(new String(arr));
            return;
        }

        if(Character.isLetter(arr[index])){

            arr[index]=Character.toLowerCase(arr[index]);
            backtrack(arr,index+1);

            arr[index]=Character.toUpperCase(arr[index]);
            backtrack(arr,index+1);
        }
        else{
            backtrack(arr,index+1);
        }
    }
}