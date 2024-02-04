import java.io.BufferedReader;
import java.io.FileReader;

public class Tree {
    private int depth = 1;
    private String[] feature_train_headers;
    private int[][] feature_train;
    private int[] labels;
    private Node mainTree;
    private float[] iGains;
    private int iGainsCounter = 0;
    private int createTreeCounter = 0;

    Tree() {
        feature_train_headers = new String[17];
        feature_train = new int[8878][17];
        labels = new int[8878];
        iGains = new float[17];
        mainTree = new Node();
    }

    public int getDepth() {
        return depth;
    }

    void createTree(int[][] data, int[] label, Node rootNode) {
        Node[] tree = new Node[17];
        for (int i = 0; i < feature_train_headers.length; i++) {
            tree[i] = new Node();
            tree[i].setHeader(feature_train_headers[i]);
            tree[i].setData(data);
            tree[i].setLabel(label);
        }
        for (int i = 0; i < feature_train_headers.length; i++) {
            if (feature_train_headers[i].equals("HighBP")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][0] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][0] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HighChol")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][1] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][1] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("CholCheck")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][2] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][2] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Smoker")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][3] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][3] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Stroke")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][4] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][4] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HeartDiseaseorAttack")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][5] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][5] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("PhysActivity")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][6] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][6] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Fruits")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][7] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][7] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Veggies")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][8] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][8] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("HvyAlcoholConsump")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][9] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][9] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("AnyHealthcare")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][10] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][10] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("NoDocbcCost")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][11] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][11] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("GenHlth")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][12] == 1) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][12] == 2) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    } else if (data[j][12] == 3) {
                        tree[i].getChildernNodes()[2].addData(data[j]);
                        tree[i].getChildernNodes()[2].addLabel(label[j]);
                    } else if (data[j][12] == 4) {
                        tree[i].getChildernNodes()[3].addData(data[j]);
                        tree[i].getChildernNodes()[3].addLabel(label[j]);
                    } else if (data[j][12] == 5) {
                        tree[i].getChildernNodes()[4].addData(data[j]);
                        tree[i].getChildernNodes()[4].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("DiffWalk")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][13] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][13] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Sex")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][14] == 0) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][14] == 1) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Education")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][15] == 1) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][15] == 2) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    } else if (data[j][15] == 3) {
                        tree[i].getChildernNodes()[2].addData(data[j]);
                        tree[i].getChildernNodes()[2].addLabel(label[j]);
                    } else if (data[j][15] == 4) {
                        tree[i].getChildernNodes()[3].addData(data[j]);
                        tree[i].getChildernNodes()[3].addLabel(label[j]);
                    } else if (data[j][15] == 5) {
                        tree[i].getChildernNodes()[4].addData(data[j]);
                        tree[i].getChildernNodes()[4].addLabel(label[j]);
                    } else if (data[j][15] == 6) {
                        tree[i].getChildernNodes()[5].addData(data[j]);
                        tree[i].getChildernNodes()[5].addLabel(label[j]);
                    }
                }
            } else if (feature_train_headers[i].equals("Income")) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][16] == 1) {
                        tree[i].getChildernNodes()[0].addData(data[j]);
                        tree[i].getChildernNodes()[0].addLabel(label[j]);
                    } else if (data[j][16] == 2) {
                        tree[i].getChildernNodes()[1].addData(data[j]);
                        tree[i].getChildernNodes()[1].addLabel(label[j]);
                    } else if (data[j][16] == 3) {
                        tree[i].getChildernNodes()[2].addData(data[j]);
                        tree[i].getChildernNodes()[2].addLabel(label[j]);
                    } else if (data[j][16] == 4) {
                        tree[i].getChildernNodes()[3].addData(data[j]);
                        tree[i].getChildernNodes()[3].addLabel(label[j]);
                    } else if (data[j][16] == 5) {
                        tree[i].getChildernNodes()[4].addData(data[j]);
                        tree[i].getChildernNodes()[4].addLabel(label[j]);
                    } else if (data[j][16] == 6) {
                        tree[i].getChildernNodes()[5].addData(data[j]);
                        tree[i].getChildernNodes()[5].addLabel(label[j]);
                    } else if (data[j][16] == 7) {
                        tree[i].getChildernNodes()[6].addData(data[j]);
                        tree[i].getChildernNodes()[6].addLabel(label[j]);
                    } else if (data[j][16] == 8) {
                        tree[i].getChildernNodes()[7].addData(data[j]);
                        tree[i].getChildernNodes()[7].addLabel(label[j]);
                    }
                }
            }
        }
        for (int i = 0; i < feature_train_headers.length; i++) {
            entropy(tree[i]);
        }
        if (iGainsCounter == 17) {
            iGainsCounter = 0;
            float max = -1;
            int maxIndex = -1;
            int i = 0;
            for (; i < 16; i++) {
                if (iGains[i] > max) {
                    max = iGains[i];
                    maxIndex = i;
                }
            }
            if (createTreeCounter == 0) {
                createTreeCounter++;
                mainTree = tree[maxIndex];
                for (int j = 0; j < mainTree.getChildernCount(); j++) {
                    if (!mainTree.getChildernNodes()[j].isCompelete() && iGains[maxIndex] > 0.1) {
                        createTree(mainTree.getChildernNodes()[j].getData(), mainTree.getChildernNodes()[j].getLabel(),
                                mainTree.getChildernNodes()[j]);
                    }
                }
            } else {
                rootNode = tree[i];
                for (int j = 0; j < rootNode.getChildernCount(); j++) {
                    if (!rootNode.getChildernNodes()[j].isCompelete() && iGains[maxIndex] > 0.1) {
                        createTree(rootNode.getChildernNodes()[j].getData(), rootNode.getChildernNodes()[j].getLabel(),
                                rootNode.getChildernNodes()[j]);
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

        createTree(feature_train, labels, mainTree);
    }

    void entropy(Node root) {
        float enRoot = 0;
        float enChildTemp = 0;
        float enChild = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 0 && root.getLabel0() != 0) {
                enRoot += ((float) root.getLabel0() / root.getLabelCount())
                        * (Math.log10((float) root.getLabel0() / root.getLabelCount()) / Math.log10(2));
            } else if (i == 1 && root.getLabel1() != 0) {
                enRoot += ((float) root.getLabel1() / root.getLabelCount())
                        * (Math.log10((float) root.getLabel1() / root.getLabelCount()) / Math.log10(2));
            } else if (i == 2 && root.getLabel2() != 0) {
                enRoot += ((float) root.getLabel2() / root.getLabelCount())
                        * (Math.log10((float) root.getLabel2() / root.getLabelCount()) / Math.log10(2));
            }
        }
        enRoot = -enRoot;
        for (int i = 0; i < root.getChildernCount(); i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 && root.getChildernNodes()[i].getLabel0() != 0) {
                    enChildTemp += ((float) root.getChildernNodes()[i].getLabel0() / root.getChildernNodes()[i].getLabelCount())
                            * (Math.log10((float) root.getChildernNodes()[i].getLabel0() / root.getChildernNodes()[i].getLabelCount())
                            / Math.log10(2));
                } else if (j == 1 && root.getChildernNodes()[i].getLabel1() != 0) {
                    enChildTemp += ((float) root.getChildernNodes()[i].getLabel1() / root.getChildernNodes()[i].getLabelCount())
                            * (Math.log10((float) root.getChildernNodes()[i].getLabel1() / root.getChildernNodes()[i].getLabelCount())
                            / Math.log10(2));
                } else if (j == 2 && root.getChildernNodes()[i].getLabel2() != 0) {
                    enChildTemp += ((float) root.getChildernNodes()[i].getLabel2() / root.getChildernNodes()[i].getLabelCount())
                            * (Math.log10((float) root.getChildernNodes()[i].getLabel2() / root.getChildernNodes()[i].getLabelCount())
                            / Math.log10(2));
                }
            }
            enChildTemp = enChildTemp * ((float) root.getChildernNodes()[i].getLabelCount() / root.getLabelCount());
            enChild += enChildTemp;
            enChildTemp = 0;
        }
        iGains[iGainsCounter] = enRoot - enChild;
        iGainsCounter++;
    }
}