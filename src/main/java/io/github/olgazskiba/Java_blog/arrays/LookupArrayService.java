package io.github.olgazskiba.Java_blog.arrays;

public class LookupArrayService {

        public int indexOfMax(int[] array){
                if (array.length == 0) {
                    return -1;
                }
                int idx = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[idx] < array[i]) {
                        idx = i;
                    }
                }
                return idx;
            }

            public int indexOfMin(int[] array2){
                if (array2.length == 0) {
                    return -1;
                }
                int idx = 0;
                for (int i = 0; i < array2.length; i++) {
                    if (array2[idx] > array2[i]) {
                        idx = i;
                    }
                }
                return idx;

            }
            public int indexOf(int[] array3, int value){
                if (array3.length == 0) {
                    return -1;
                }
                for (int i = 0; i < array3.length; i++) {
                    if (array3[i] == value) {
                        return i;
                    }
                }
                return value;
            }
    public int findMax(int[] array4) {
        if (array4.length == 0) {
            return 0;
        }

        int max = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > max) {
                max = array4[i];
            }
        }
        return max;
    }

    public int findMin(int[] array5){
            if(array5.length == 0) {
                return 0;
            }
            int min = array5[0];
            for (int i = 0; i < array5.length; i++) {
                if (array5[i] < min){
                    min = array5[i];
                }
        }
          return min;
    }


}



