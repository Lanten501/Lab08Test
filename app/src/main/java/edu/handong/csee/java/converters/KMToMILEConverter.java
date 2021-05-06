package edu.handong.csee.java.converters;

public class KMToMILEConverter implements Convertible{

    private double value;
    private double result;

    public void setFromValue(double fromValue){
        value = fromValue;
    }

    public double getValue(){
        return value;
    }

    public void convert(){
        result = getValue() * 0.6;
    }

    public double getConvertedValue(){
        return result;
    }
    
}
