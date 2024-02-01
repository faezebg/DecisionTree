public class Tree {
    Main main ;
    int depth;
    //int getDepth();
    public Tree(float[][] data , float[] labels){

    }
    float Entropy(float[] labels){
        int count0 , count1 , count2 ;
        float entropy = 0.0F;
        for (int i = 1; i <= labels.length; i++) {
            float p = 1.0F * labels[i] / labels.length;
            if (labels[i] > 0)
                entropy -= p * Math.log(p) / Math.log(2);
        }
        return entropy;
    }
    float iGain(int pEntropy , float[] weight , float[] entropies){
        //implement
        return 1;
    }

    public static void main(String[] args) {

        System.out.println();
    }



}
