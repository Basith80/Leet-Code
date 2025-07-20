class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
 ArrayList<Integer> list = new ArrayList<>();
        int valueIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int minValue = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
                if (minValue >= matrix[i][j]) {
                    minValue = matrix[i][j];
                    valueIndex = j;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][valueIndex] > minValue) {
                    break;
                }
                if (j + 1 == matrix.length) {
                    list.add(minValue);
                    break;
                }
            }
        }
        return list;   
     }
}