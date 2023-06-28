import javax.swing.JOptionPane;
public class mat_exemple{
    public static void main (String [] args){
        int g[][] = new int[6][2];
        double prod;
        String num;
        try{
            for(int i = 0; i<6; i++){
                for(int j=0; j<2;j++){
                    num = JOptionPane.showInputDialog(
                        "Informar valor g " + ", " + j + ":");
                    g[i][j]= Integer.parseInt(num);
                }
            }
            for (int i = 0; i<6; i++){
                prod = 1;
                for(int j = 0; j < 2 ; j++){
                    prod = prod * g[i][j];
                }
                JOptionPane.showMessageDialog(
                    null, "Linha " + i + ": " + Math.sqrt(prod));
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura!");
        }
    }
}