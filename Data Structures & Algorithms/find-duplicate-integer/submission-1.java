class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            if(arr[i] == arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
