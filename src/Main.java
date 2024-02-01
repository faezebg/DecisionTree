import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static final int rows = 8087;
    static final int cols = 17;

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
}
