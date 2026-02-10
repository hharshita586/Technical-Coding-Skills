// YOUR ARE GIVEN AN INTEGER ARRAY A. YOU HAVE TO FIND THE SECOND LARGEST ELEMENT / VALUE IN THE ARRAY OR REPORT THAT NO SUCH ELEMENT EXISTS.

// OBSERVATION:
// THE SECOND LARGEST ELEMENT IN THE ARRAY CAN BE FOUND BY FIRST FINDING THE LARGEST ELEMENT AND THEN FINDING THE LARGEST ELEMENT THAT IS LESS THAN THE FIRST LARGEST ELEMENT.

// CODE:

public class Second_largest {
    public static void main(String[] args) {

        int arr[] = {10, 20, 40, 30, 60};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second largest element: " + second_largest);
        }
    }
}
