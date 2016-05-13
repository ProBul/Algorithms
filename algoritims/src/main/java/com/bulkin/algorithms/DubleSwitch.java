package com.bulkin.algorithms;

public class DubleSwitch {
    private int canBeArranged = 1;

    private int[] problematicNum = new int[2];

    private int index = 0;// index to deal with the problematic numbers array

    private int tempInt;

    public int solution(int A[]) {
       /*if the array is sorted, the method will return "1". if not the it will count how many
         times we have not sorted numbers in the array and store the index of this number. this index
         will be used later to switch between those numbers */
        for (int i = 0; i < A.length - 2; i++) {

            if (A[i] <= A[i + 1]) {
                
            } else {
                problematicNum[index] = i;
                if (index == 2) {
                    return canBeArranged = 0;
                }
                index++;
            }
        }
        //in case we have only one number that is located not in his place, we will compare it with the first
        // number bigger than him and then try to shift between them. then run the loop again
        if (index == 1) {
            for (int i = 0; i < A.length; i++) {
                if (A[problematicNum[index = 0]] < A[i]) {
                    tempInt = A[problematicNum[index = 0]];
                    A[problematicNum[index = 0]] = A[i - 1];
                    A[i - 1] = tempInt;
                    break;
                }
            }

            for (int x = 0; x <= A.length - 2; x++) {
                if (A[x] <= A[x + 1]) {
                    x++;
                } else {
                    return canBeArranged = 0;
                }
            }
        }

        // if we have 2 numbers that are not located in their spot the we switch between them
        // and run the loop again
        if (index == 2) {
            tempInt = A[problematicNum[index = 0]];
            A[problematicNum[index = 0]] = A[problematicNum[index = 1]];
            A[problematicNum[index = 1]] = tempInt;

            for (int i = 0; i <= A.length - 2; i++) {
                if (A[i] <= A[i + 1]) {
                    i++;
                } else {
                    return canBeArranged = 0;
                }
            }
        }
        return canBeArranged;
    }

}
