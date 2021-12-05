import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];

        int tmpSeqCounter = 1;
        int longSeqCounter = 1;
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = scanner.nextInt();
            if (i != 0) {
                if (intArray[i] > intArray[i - 1]) {
                    tmpSeqCounter++;
                } else {
                    if (tmpSeqCounter > longSeqCounter) {
                        longSeqCounter = tmpSeqCounter;
                    }
                    tmpSeqCounter = 1;
                }
            }
        }
        if (tmpSeqCounter > longSeqCounter) {
            longSeqCounter = tmpSeqCounter;
        }
        System.out.println(longSeqCounter);
    }
}