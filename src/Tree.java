import java.io.BufferedReader;
import java.io.FileReader;

public class Tree {
    private int depth;
    private String[] feature_train_headers;
    private int[][] feature_train;
    private int[] labels;
    private Node[] tree;

    Tree() {
        feature_train_headers = new String[17];
        feature_train = new int[8878][17];
        labels = new int[8878];
        tree = new Node[17];
    }

    public int getDepth() {
        return depth;
    }

    void createTree() {
        for (int i = 0; i < feature_train_headers.length; i++) {
            tree[i] = new Node();
            tree[i].setHeader(feature_train_headers[i]);
            tree[i].setData(feature_train);
            tree[i].setLabel(labels);
        }
        for (int i = 0; i < feature_train_headers.length; i++) {
            if (feature_train_headers[i].equals("HighBP")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][0] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][0] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HighChol")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][1] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][1] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("CholCheck")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][2] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][2] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Smoker")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][3] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][3] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Stroke")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][4] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][4] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HeartDiseaseorAttack")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][5] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][5] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("PhysActivity")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][6] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][6] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Fruits")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][7] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][7] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Veggies")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][8] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][8] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HvyAlcoholConsump")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][9] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][9] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("AnyHealthcare")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][10] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][10] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("NoDocbcCost")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][11] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][11] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("GenHlth")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][12] == 1) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][12] == 2) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    } else if (feature_train[j][12] == 3) {
                        tree[i].getChildernNodes()[2].addData(feature_train[j]);
                    } else if (feature_train[j][12] == 4) {
                        tree[i].getChildernNodes()[3].addData(feature_train[j]);
                    } else if (feature_train[j][12] == 5) {
                        tree[i].getChildernNodes()[4].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("DiffWalk")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][13] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][13] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Sex")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][14] == 0) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][14] == 1) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Education")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][15] == 1) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][15] == 2) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    } else if (feature_train[j][15] == 3) {
                        tree[i].getChildernNodes()[2].addData(feature_train[j]);
                    } else if (feature_train[j][15] == 4) {
                        tree[i].getChildernNodes()[3].addData(feature_train[j]);
                    } else if (feature_train[j][15] == 5) {
                        tree[i].getChildernNodes()[4].addData(feature_train[j]);
                    } else if (feature_train[j][15] == 6) {
                        tree[i].getChildernNodes()[5].addData(feature_train[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Income")) {
                for (int j = 0; j < feature_train.length; j++) {
                    if (feature_train[j][16] == 1) {
                        tree[i].getChildernNodes()[0].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 2) {
                        tree[i].getChildernNodes()[1].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 3) {
                        tree[i].getChildernNodes()[2].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 4) {
                        tree[i].getChildernNodes()[3].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 5) {
                        tree[i].getChildernNodes()[4].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 6) {
                        tree[i].getChildernNodes()[5].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 7) {
                        tree[i].getChildernNodes()[6].addData(feature_train[j]);
                    } else if (feature_train[j][16] == 8) {
                        tree[i].getChildernNodes()[7].addData(feature_train[j]);
                    }
                }
            }
        }
    }

    void readFile() {
        String feature_train_path = "./files/feature_train.csv";
        String label_train_path = "./files/label_train.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(feature_train_path))) {
            String line;

            line = br.readLine();

            for (int i = 0; i < line.split(",").length; i++) {
                feature_train_headers[i] = line.split(",")[i];
            }

            for (int i = 0; (line = br.readLine()) != null; i++) {
                for (int j = 0; j < line.split(",").length; j++) {
                    feature_train[i][j] = Integer.parseInt(line.split(",")[j]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(label_train_path))) {
            String line;

            line = br.readLine();

            for (int i = 0; (line = br.readLine()) != null; i++) {
                labels[i] = Integer.parseInt(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        createTree();
    }

    // void selectRoot() {

    // }

    // float entropy(Node root) {

    //   for (int i = 0; i < root.getChildernCount(); i++) {

    //   }
    // }

    // float iGain(int pEntropy, float[] weight, float[] entropies) {

    // }
}