public class JackOLantern {
    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }
    public void fill(String str){
        for(int i= 0; i < faceFeatures.length; i++){
            for(int k = 0; k < faceFeatures[i].length; k++){
                faceFeatures[i][k] = str;
            }
        }
    }
    public String toString(){
        String bricks = "";
        for(int i= 0; i < faceFeatures.length; i++)
        {
            for(int k = 0; k < faceFeatures[i].length; k++)
            {
                bricks = bricks + faceFeatures[i][k];
            }
            bricks = bricks + "\n";
        }
        return bricks;
    }
}
