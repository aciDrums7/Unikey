package it.unikey.primecalculator.utilities;

public abstract class IntArrayUtil {

    public static int[] copy(int[] inputArray, int newArrayLength) {
        int[] newArray = new int[newArrayLength];
        for(int i = 0; i < inputArray.length; i++) {
            newArray[i] = inputArray[i];
        }
        return newArray;
    }
}