package de.hsbochum.fbg.kswe.testing;

public class BubbleSort {

    /**
     * Bubble Sort Algorithm
     *
     * @param <T> the comparable type
     * @param array the be sorted array
     * @return the sorted array
     *
     */
    public <T extends Comparable<T>> T[] sort(T array[]) {
        int last = array.length;
        
        // sort as long as we swapped
        boolean swap;
        do {
            swap = false;
            for (int count = 0; count < last - 1; count++) {
                if (isLess(array[count], array[count + 1])) {
                    swap = swap(array, count, count + 1);
                }
            }
            last--;
        } while (swap);
        
        return array;
    }

    private <T extends Comparable<T>> boolean isLess(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private <T extends Comparable<T>> boolean swap(T array[], int i1, int i2) {
        T tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
        return true;
    }

}
