public class Tree {
    int depth;
    //int getDepth();
    public Tree(float[][] data , float[] labels){

    }
    float Entropy(float[] labels){
        float entropy = 0.0F;
        for (int i = 1; i <= labels.length; i++) {
            double p = 1.0 * labels[i] / labels.length;
            if (labels[i] > 0)
                entropy -= p * Math.log(p) / Math.log(2);
        }
        return entropy;
    }
    float iGain(int pEntropy , float[] weight , float[] entropies){
        //implement
        return 1;
    }



}
