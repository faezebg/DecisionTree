import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    static final int rows = 8087;
    static final int cols = 17;
    static float[][] data;
    static float[] label;
    private int meghdar;
    static float count0, count1, count2, count3, count4, count5, count6, count7, count8;
    public static void main(String[] args) throws FileNotFoundException {
        float[][] data = readData();
        float[] label = readLabel();
    }

    private static float[][] readData() throws FileNotFoundException {
        float[][] data = new float[rows][cols];
        File file = new File("C:\\Users\\AVA\\OneDrive\\Desktop\\DecisionTree\\src\\feature_train.csv");

        try (Scanner sc = new Scanner(file)) {
            sc.nextLine();
            for (int i = 0; i < data.length && sc.hasNextLine(); i++) {
                String[] line = sc.nextLine().trim().split(",");
                for (int j = 0; j < Math.min(line.length, data[i].length); j++) {
                    data[i][j] = Float.parseFloat(line[j]);
                }
            }
        }
        return data;
    }

    private static float[] readLabel() throws FileNotFoundException {
        float[] label = new float[rows];
        File file = new File("C:\\Users\\AVA\\OneDrive\\Desktop\\DecisionTree\\src\\label_train.csv");

        try (Scanner sc = new Scanner(file)) {
            sc.nextLine();
            for (int i = 0; i < label.length && sc.hasNextLine(); i++) {
                String line = sc.nextLine();
                label[i] = Float.parseFloat(line);
            }
        }
        return label;
    }

    public int difrentData(int index) {
        float[] khCount = new float[9];
        for (int i = 0; i < cols; i++) {
            float count = data[i][index];
            switch ((int) count) {
                case 0:
                    count0++;
                    khCount[0] = count0;
                    break;
                case 1:
                    count1++;
                    khCount[1] = count1;
                    break;
                case 2:
                    count2++;
                    khCount[2] = count2;
                    break;
                case 3:
                    count3++;
                    khCount[3] = count3;
                    break;
                case 4:
                    count4++;
                    khCount[4] = count4;
                    break;
                case 5:
                    count5++;
                    khCount[5] = count5;
                    break;
                case 6:
                    count6++;
                    khCount[6] = count6;
                    break;
                case 7:
                    count7++;
                    khCount[7] = count7;
                    break;
                case 8:
                    count8++;
                    khCount[8] = count8;
                    break;
            }

        }
        for (int j = 0; j < 9; j++){
            if (khCount[j] != 0) {
                meghdar++;
            }
        }
        return meghdar;
    }
}
