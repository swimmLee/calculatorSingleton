
package singleton.work;

public class ThreadSafeCalcTool {
    
    private static int totalBMICalculated = 0;
    private static int numberOfCaculations = 0;
    
    private static ThreadSafeCalcTool instance;
    
    private ThreadSafeCalcTool() {
    }

    public static ThreadSafeCalcTool getInstance() {
        
        if(instance == null){
            synchronized (ThreadSafeCalcTool.class){
                if ( instance == null){
                    instance = new ThreadSafeCalcTool();
                }
            }
        }
        return instance;
    }
    
    public static double tsCalcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCaculations++;

        return bmi;
    }   

    public static double tsAverageBMI() {
        return totalBMICalculated / numberOfCaculations;
    }
}
