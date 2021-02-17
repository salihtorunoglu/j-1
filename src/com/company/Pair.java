package com.company;
// First question
public class Pair<F, S>{
    private F first;
    private S sec;

    public Pair(F first, S sec) {
        this.first = first;
        this.sec= sec;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSec() {
        return sec;
    }

    public void setSec(S sec) {
        this.sec= sec;
    }
}


// Second question
class InvalidSubscriptException extends Exception {
    InvalidSubscriptException() {
        System.out.print("Error");
        System.out.println();
    }
}
class GenericMethodTest {
    // generic method printArray
    public static <E> void printArray(E[] inputArray) {
        // display array elements
        for (E element : inputArray)
            System.out.print(element + " ");
        System.out.println();
    } // end method printArray
    public static <E> void printArray(E[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException {
        if (highSubscript <= lowSubscript || lowSubscript < 0 || highSubscript >= inputArray.length){
            throw new InvalidSubscriptException();
        }
        else
        {
            for (int j=lowSubscript; j<=highSubscript; j++)
                System.out.print(inputArray[j]+ " ");
            System.out.println();
        }
    }
    // Third  question
    public static void printArray(String[] stringArray){
        int count=0;
        for(int i=0; i<stringArray.length; i++){
            count++;
            System.out.print(stringArray[i]+ " ");
            if(count== 4){
                System.out.println();
            }
        }
    }


    public static void main(String args[]) throws InvalidSubscriptException{
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray= {"one", "two", "three", "four", "five", "six", "seven", "eight"};


        System.out.println("Array integerArray contains:");
        printArray(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        printArray(charArray); // pass a Character array
        System.out.println("\nArray stringArray contains:");
        printArray(stringArray);

    }
}