package it.unikey.Utilities;
import java.text.DecimalFormat;

public abstract class ArraysUtilities {

    public static int returnOccourrence(int[] intArray, int nToCount) {
        int counter = 0;
        for(int i : intArray) {
            if(i == nToCount)
                counter++;
        }
        return counter;
    }

    public static int avg(int[] intArray)  {
        int counter = 0;
        int sum = 0;
        for(int i : intArray) {
            sum += i;
            counter++;
        }
        return sum/counter;
    }

    
    public static double[] copy(double[] doubleArray, int newLength) {
        double[] newArray = new double[newLength];
        for(int i = 0; i < doubleArray.length;i++) {
            newArray[i] = doubleArray[i];
        }
        return newArray;
    }

    public static int[] copy(int[] intArray, int newLength) {
        int[] newArray = new int[newLength];
        for(int i = 0; i < intArray.length;i++) {
            newArray[i] = intArray[i];
        }
        return newArray;
    }
    

    public static double[] toDoubleArray(String[] stringArray) {
        double[] doubleArray = new double[0];
        double newDouble;
        int length = 0;
        for(String s : stringArray) {
            try {
                newDouble = Double.parseDouble(s);
                length++;
                doubleArray = copy(doubleArray, length);
                doubleArray[length - 1] = newDouble;
            }
            catch(Exception e) {
                System.out.println(s + " non e' un numero valido");
            }
        }
        return doubleArray;
    }

    public static int[] toIntArray(String[] stringArray) {
        int[] intArray = new int[0];
        int newInt;
        int length = 0;
        for(String s : stringArray) {
            try {
                newInt = Integer.parseInt(s);
                length++;
                intArray = copy(intArray, length);
                intArray[length - 1] = newInt;
            }
            catch(Exception e) {
                System.out.println(s + " non e' un intero valido");
            }
        }
        return intArray;
    }

    public static void printMinMax(double[] doubleArray) {
        if (doubleArray.length == 0)
            System.out.println("Deh l'array l'e' vuoto bimbo!");
        else {
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            for(double f : doubleArray) {
                if(f < min)
                    min = f;
                if(f > max)
                    max = f;
            }
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(7);
            System.out.print("Min: " + df.format(min));
            System.out.print("\nMax: " + df.format(max));
        }
    }

    public static <T> T[] permuteForward1(T[] array) {
        int newIndex = 0;
        T[] newArray = array.clone();
        for(int i = 0; i < array.length; i++) {
            newIndex++;
            if(newIndex != array.length)
                newArray[newIndex] = array[i];
            else
                newArray[0] = array[i];
        }
        return newArray;
    }

    public static <T> T[] switchHalfs(T[] array) {
        T[] switchedArray = array.clone();
        if(array.length % 2 == 0) {
            for(int i = 0; i< array.length/2; i++) {
                switchedArray[i] = array[(array.length/2)+i];
                switchedArray[(array.length/2)+i] = array[i];
            }
        } else {
            switchedArray[(array.length/2)+1] = array[(array.length/2)+1];
            for(int i = 0; i< array.length/2; i++) {
                switchedArray[i] = array[(array.length/2)+i+1];
                switchedArray[(array.length/2)+i+1] = array[i];
            }
        }
        return switchedArray;
    }

    public static int minDispari(int[] intArray) {
        int min = 0;
        if (intArray.length == 0)
            System.out.println("Deh l'array l'e' vuoto bimbo!");
        else {
            min = Integer.MAX_VALUE;
            for(int i : intArray) {
                if(i == -1)
                    break;
                else if(i % 2 != 0 && i < min)
                    min = i;
            }
        }
        return min;
    }
}
