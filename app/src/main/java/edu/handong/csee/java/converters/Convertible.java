package edu.handong.csee.java.converters;

public interface Convertible {

    /**
     * Method that will evaluate the second part of the input
     * @param fromValue
     */

    public void setFromValue(double fromValue);

    /**
     * Method that will return the second part of the input
     * and use it for calculating the convertion
     * @return
     */
    public double getConvertedValue();

    /**
     * Method that will use getConvertedValue
     * to do the convertion.
     */
    public void convert();

}
