/*
* Runtime: 1ms -> Beats 71.24% of users with Java
* Memory: 42.50MB -> Beats 69.33% of user with Java
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1));

        if (rowIndex == 0) return list.get(0);

        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);

            list.add(curr);
        }

        return list.get(rowIndex);
    }
}