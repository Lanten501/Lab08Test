package edu.handong.csee.java.converters;


public class AllConverter{

    private double value;
    private String measure;
    private double result1, result2;

    /**
     * Method that will return the first part of the input
     * @param fromValue
     * @return
     */
 
    public AllConverter setFromValue(double fromValue){
        this.value = fromValue;
        return this;
    }

    /**
     * Method that will return the second part of the input
     * @param originalMeasure
     * @return
     */

    public AllConverter setOriginalMeasure(String originalMeasure){
        this.measure = originalMeasure;
        return this;
    }

    /**
     * Method that will do the respective convertion
     * depending on first and second part of the input
     */
    public void convertAndPrintOut(){
        if(measure=="KM"){
            result1 = value * 1000;
            result2 = value * 0.6;
            System.out.println(value + measure + "to" + result1 + "M");
            System.out.println(value + measure + "to" + result2 + "M");
        } else if(measure=="TON"){
            result1 = value * 1000;
            result2 = value * 1000000;
            System.out.println(value + measure + "to" + result1 + "M");
            System.out.println(value + measure + "to" + result2 + "M");
        }
    }
    

}