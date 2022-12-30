package leetcode.task724;

public class PivotIndexTest {
    public static void main(String[] args) {
        int[][] testData = {{-1,-1,0,1,1,0}};

        for (int i = 0; i < testData.length; i++) {
                System.out.println(PivotIndex.pivotIndex(testData[i]));
        }
    }
}
