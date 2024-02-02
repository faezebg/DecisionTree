public class Tree {
    Main main ;
    int depth;
    int count0 = 0,count1 = 0,count2 = 0;
    //int getDepth();
    public Tree(float[][] data , float[] labels){

    }
    float Entropy(float[] labels){
        float entropy = 0.0F;
        for (int i = 0; i < labels.length; i++) {
            switch ((int) labels[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        int total = count0 + count1 + count2;
        float p0, p1, p2;
        p0 = (float) count0 / total;
        p1 = (float) count1 / total;
        p2 = (float) count2 / total;
        float Entropy = (float) -((p0 * Math.log(p0)) + (p1 * Math.log(p1)) + (p2 * Math.log(p2)));
        return Entropy;
    }
    float iGain(int pEntropy , float[] weight , float[] entropies){
        //implement
        return 1;
    }

    public static void main(String[] args) {

        System.out.println();
    }



}
