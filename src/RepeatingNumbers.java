public class RepeatingNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 15, 7, 4, 7, 5, 6, 15, 12, 4, 2, 6, 6, 12, 2};
        int[] repeatNumbers = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(repeatNumbers, list[i])) {
                        repeatNumbers[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : repeatNumbers) {
            if(value !=0){
                if (value % 2 == 0) {
                    System.out.println(value);
                }

            }

        }
    }
}
