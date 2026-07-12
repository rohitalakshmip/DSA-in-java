package Array;

public class Merge2SortedArray_important {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9,13,14,15,16,17};
        int[] b = {1, 3, 4, 5, 7, 8, 12};

        int[] c = new int[a.length + b.length];
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
        average(c, a, b);
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }

    private static void average(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
          /* tertiary operator can be used instead of if-else loop
           c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];*/

            if (a[i] < b[j]) {
                c[k] = a[i]; //  c[k++] = a[i++] post increment
                i++; //k++
            } else {
                c[k] = b[j];  //  c[k++] = b[j++] post increment
                j++; //k++
            }
            k++;
        }
        if (i == a.length) {     // array over take b element
            while (j < b.length) {
                c[k++] = b[j++];
            }
        } else {
                while (i < a.length) {
                    c[k++] = a[i++];
                }

            }
        }
    }