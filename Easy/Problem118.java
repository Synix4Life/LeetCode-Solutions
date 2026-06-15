/*
* Runtime: 1ms -> Beats 94.10% of users with Java
* Memory: 43.47MB -> Beats 51.21% of user with Java
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) return list;

        list.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);

            list.add(curr);
        }

        return list;
    }
}