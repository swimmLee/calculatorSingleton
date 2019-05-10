package singleton.work;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + CalcTool.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + CalcTool.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + CalcTool.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + CalcTool.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + CalcTool.averageBMI());
        System.out.println("");
        
        System.out.println("The Enumm Singleton Way");
        
        System.out.println("Bob weighs " + 295 + " pounds and is " + 70 + " inches tall with a BMI of " + EnumCalcTool.enumCalcBMI(70, 295, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 184 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + EnumCalcTool.enumCalcBMI(1.7, 184, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 235 + " pounds and is " + 63 + " inches tall with a BMI of " + EnumCalcTool.enumCalcBMI(63, 235, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 241 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + EnumCalcTool.enumCalcBMI(2.1, 241, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + EnumCalcTool.enumAverageBMI());
        System.out.println("");
        
        
        System.out.println("The Double Lock Thread Safe Way");
        ThreadSafeCalcTool.getInstance();
        System.out.println("Bob weighs " + 225 + " pounds and is " + 70 + " inches tall with a BMI of " + ThreadSafeCalcTool.tsCalcBMI(70, 225, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 104 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + ThreadSafeCalcTool.tsCalcBMI(1.7, 104, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 165 + " pounds and is " + 63 + " inches tall with a BMI of " + ThreadSafeCalcTool.tsCalcBMI(63, 165, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 161 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + ThreadSafeCalcTool.tsCalcBMI(2.1, 161, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + ThreadSafeCalcTool.tsAverageBMI());

    }
}
