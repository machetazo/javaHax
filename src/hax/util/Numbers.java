package hax.util;

import java.util.Random;

/**
 * Useful class with commonly used methods related to numbers and math in Java.
 *
 * @author Machetazo
 * @version 0.1 December 2016
 */
public class Numbers{

    /**
     * Generates a random integer
     *
     * @param start start of generation interval.
     * @param end end of generation interval.
     * @return random int.
     */
    public static int random(int start, int end){
        Random random = new Random();
        double preValue = random.nextDouble();
        int value = (int) (Math.abs(preValue) * (end - start) + start);
        return value;
    }

    /**
     * Finds the average of an n amount of numbers.
     *
     * @param numbers numbers to be averaged.
     * @return average of the numbers.
     */
    public static double average(double... numbers){
        double result = 0;

        for(int i=0 ; i<numbers.length ; i++){
            double n = numbers[i];
            result = result + n;
        }

        return result/numbers.length;

    }

    /**
     * Converts a numeric value (int) into a string.
     *
     * @param number int that will be converted into a string.
     * @return string of the number.
     */
    public static String _str(int number){
        return String.valueOf(number);
    }

    /**
     * Converts a numeric value (double) into a string.
     *
     * @param number double that will be converted into a string.
     * @return string of the number.
     */
    public static String _str(double number){
        return String.valueOf(number);
    }

    /**
     * Converts a String into an int.
     *
     * @param number String version of an int.
     * @return numeric value of the string.
     */
    public static int _int(String number){
        try{
            return Integer.parseInt(number);
        } catch(NumberFormatException e){
            Runtime.error(e);
            return -1;
        }
    }

    /**
     * Converts a String into a double.
     *
     * @param number String version of an int.
     * @return numeric value of the string.
     */
    public static double _double(String number){
        try{
            return Double.parseDouble(number);
        } catch(NumberFormatException e){
            Runtime.error(e);
            return -1;
        }
    }

    /**
     * Returns true if number is even, otherwise return false
     *
     * @param number number to be analyzed
     * @return true if number is even, otherwise return false
     */
    public static boolean isEven(int number){
        return (number % 2 == 0);
    }

    /**
     * Returns true if number is odd, otherwise return false
     *
     * @param number number to be analyzed
     * @return true if number is odd, otherwise return false
     */
    public static boolean isOdd(int number){
        return (!isEven(number));
    }

}
