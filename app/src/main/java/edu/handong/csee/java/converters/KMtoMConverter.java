package edu.handong.csee.java.converters;

public class KMtoMConverter implements Convertible {
    private double value;
    private double result;

    public void setFromValue(double fromValue){
        value = fromValue;
    }

    public double getValue(){
        return value;
    }

    public void convert(){
        result = getValue() * 1000;
    }

    public double getConvertedValue(){
        return result;
    }
}

