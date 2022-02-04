package it.unikey.primecalculator.utilities;

public abstract class LongArrayUtil {

    public static long[] copy(long[] inputArray, int newArrayLength) {
        long[] newArray = new long[newArrayLength];
        for(int i = 0; i < inputArray.length; i++) {
            newArray[i] = inputArray[i];
        }
        return newArray;
    }

    public static long[] sort(long[] inputArray) {
        long temp = 0;
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = i; j < inputArray.length; j++) {
                if(inputArray[i] >= inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }
}
