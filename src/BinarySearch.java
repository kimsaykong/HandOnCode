public class BinarySearch {

    public boolean searchSortedArray(int[] sortedArray,int target,int lowIndex, int highIndex){
        int midIndex = (lowIndex+highIndex)/2;
        if (lowIndex>highIndex)return false;
        if (target == sortedArray[midIndex]) return true;
        if (sortedArray[midIndex]<target){
            return searchSortedArray(sortedArray,target,midIndex+1,highIndex);
        }else{
            return searchSortedArray(sortedArray,target,lowIndex,midIndex+1);
        }
    }
    public int searchIndexSortedArray(int[] sortedArray,int target,int lowIndex,int highIndex){
        int midIndex = (lowIndex+highIndex)/2;
        if (lowIndex > highIndex) return -1;
        if (sortedArray[midIndex]==target) return midIndex;
        if (target<sortedArray[midIndex]){
            return searchIndexSortedArray(sortedArray,target,lowIndex,midIndex-1);
        }
        else{
            return searchIndexSortedArray(sortedArray,target,midIndex+1,highIndex);
        }
    }
}
