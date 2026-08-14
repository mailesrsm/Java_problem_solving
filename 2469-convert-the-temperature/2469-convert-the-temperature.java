class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin=celsius+273.15;
        double fahrenhiet=celsius*1.80+32;
        double[] convert={kelvin,fahrenhiet};
        return convert;

    }
}