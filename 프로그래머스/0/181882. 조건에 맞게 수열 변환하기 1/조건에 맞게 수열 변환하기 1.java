class Solution {
    public int[] solution(int[] arr) {
        int[] newArr = new int[arr.length];
        
        for(int i = 0; i < newArr.length; i++){
            if( arr[i] >= 50 && arr[i] % 2 == 0 ){
                arr[i] = arr[i] / 2;
                newArr[i] = arr[i];
            } else if( arr[i] < 50 && arr[i] % 2 != 0 ) {
                arr[i] = arr[i] * 2;
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i];
            }
            
        }
        
        int[] answer = newArr;
        
        return answer;
    }
}