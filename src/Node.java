public class Node {
    private int data[][] = new int[8878][17];
    private int label[] = new int[8878];
    private String header;
    private Node[] childernNodes;
    private int count = 0;
    private int count2 = 0;

    Node() {

    }

    Node(String header, int data[][]) {
        this.header = header;
        this.data = data;
        if (header.equals("HighBP")) {
            childernNodes = new Node[2];
        } else if (header.equals("HighChol")) {
            childernNodes = new Node[2];
        } else if (header.equals("CholCheck")) {
            childernNodes = new Node[2];
        } else if (header.equals("Smoker")) {
            childernNodes = new Node[2];
        } else if (header.equals("Stroke")) {
            childernNodes = new Node[2];
        } else if (header.equals("HeartDiseaseorAttack")) {
            childernNodes = new Node[2];
        } else if (header.equals("PhysActivity")) {
            childernNodes = new Node[2];
        } else if (header.equals("Fruits")) {
            childernNodes = new Node[2];
        } else if (header.equals("Veggies")) {
            childernNodes = new Node[2];
        } else if (header.equals("HvyAlcoholConsump")) {
            childernNodes = new Node[2];
        } else if (header.equals("AnyHealthcare")) {
            childernNodes = new Node[2];
        } else if (header.equals("NoDocbcCost")) {
            childernNodes = new Node[2];
        } else if (header.equals("GenHlth")) {
            childernNodes = new Node[5];
        } else if (header.equals("DiffWalk")) {
            childernNodes = new Node[6];
        } else if (header.equals("Sex")) {
            childernNodes = new Node[2];
        } else if (header.equals("Education")) {
            childernNodes = new Node[2];
        } else if (header.equals("Income")) {
            childernNodes = new Node[8];
        }
        for (int i = 0; i < childernNodes.length; i++) {
            childernNodes[i] = new Node();
        }
    }

    public Node[] getChildernNodes() {
        return childernNodes;
    }

    public int[][] getData() {
        return data;
    }

    public String getHeader() {
        return header;
    }

    public int getChildernCount() {
        return childernNodes.length;
    }

    public int[] getLabel() {
        return label;
    }

    public int getLabelCount() {
        return count2;
    }

    public void setChildernNodes(Node[] childernNodes) {
        this.childernNodes = childernNodes;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void setHeader(String header) {
        this.header = header;
        if (header.equals("HighBP")) {
            childernNodes = new Node[2];
        } else if (header.equals("HighChol")) {
            childernNodes = new Node[2];
        } else if (header.equals("CholCheck")) {
            childernNodes = new Node[2];
        } else if (header.equals("Smoker")) {
            childernNodes = new Node[2];
        } else if (header.equals("Stroke")) {
            childernNodes = new Node[2];
        } else if (header.equals("HeartDiseaseorAttack")) {
            childernNodes = new Node[2];
        } else if (header.equals("PhysActivity")) {
            childernNodes = new Node[2];
        } else if (header.equals("Fruits")) {
            childernNodes = new Node[2];
        } else if (header.equals("Veggies")) {
            childernNodes = new Node[2];
        } else if (header.equals("HvyAlcoholConsump")) {
            childernNodes = new Node[2];
        } else if (header.equals("AnyHealthcare")) {
            childernNodes = new Node[2];
        } else if (header.equals("NoDocbcCost")) {
            childernNodes = new Node[2];
        } else if (header.equals("GenHlth")) {
            childernNodes = new Node[5];
        } else if (header.equals("DiffWalk")) {
            childernNodes = new Node[2];
        } else if (header.equals("Sex")) {
            childernNodes = new Node[2];
        } else if (header.equals("Education")) {
            childernNodes = new Node[6];
        } else if (header.equals("Income")) {
            childernNodes = new Node[8];
        }
        for (int i = 0; i < childernNodes.length; i++) {
            childernNodes[i] = new Node();
        }
    }

    public void setLabel(int[] label) {
        this.label = label;
        count2 = 8878;
    }

    void addData(int[] newData) {
        for (int i = 0; i < newData.length; i++) {
            data[count][i] = newData[i];
        }
        count++;
    }

    void addLabel(int newLabel) {
        label[count2] = newLabel;
        count2++;
    }

    int getLabel0() {
        int counter = 0;
        for (int i = 0; i < count2; i++) {
            if (label[i] == 0) {
                counter++;
            }
        }
        return counter;
    }

    int getLabel1() {
        int counter = 0;
        for (int i = 0; i < count2; i++) {
            if (label[i] == 1) {
                counter++;
            }
        }
        return counter;
    }

    int getLabel2() {
        int counter = 0;
        for (int i = 0; i < count2; i++) {
            if (label[i] == 2) {
                counter++;
            }
        }
        return counter;
    }

    boolean isCompelete() {
        if ((getLabel0() != 0 && getLabel1() == 0 && getLabel2() == 0)
                || (getLabel0() == 0 && getLabel1() != 0 && getLabel2() == 0)
                || (getLabel0() == 0 && getLabel1() == 0 && getLabel2() != 0)) {
            return true;
        }
        return false;
    }
}