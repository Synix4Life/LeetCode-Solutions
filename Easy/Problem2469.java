/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 40.34MB -> Beats 99.33% of user with Java
*/

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15, celsius*1.80+32.00};
    }
}
