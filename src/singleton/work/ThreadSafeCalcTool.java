
package singleton.work;

public class ThreadSafeCalcTool {
    
    private static int totalBMICalculated = 0;
    private static int numberOfCaculations = 0;
    
    public static CalcTool instance;

    public static double getBMI(double height, double weight, MeasurementSystem system) {
        double bmi = 0;
        if(instance == null){
            synchronized (CalcTool.class){
                if ( instance == null){
                    instance = new CalcTool();
                }
                bmi = instance.calcBMI(height, weight, system);
                
                totalBMICalculated += bmi;
                numberOfCaculations++;
            }
        }
        return bmi;
    }
    /*
    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCaculations++;

        return bmi;
    }   */

    public static double averageBMI() {
        return totalBMICalculated / numberOfCaculations;
    }
}
