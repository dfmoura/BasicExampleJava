import javax.swing.JOptionPane;
public class histograma {
    public static void main (String[] args){
        final String userInput = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:");
                int tamanho = Integer.parseInt(userInput);
        int[] a = new int[tamanho];
        String num;
        char b = '■';
        try{
            for(int i = 0; i< tamanho; i++){
                num = JOptionPane.showInputDialog(
                "Digite o valor " + i + ":");
                a[i] = Integer.parseInt(num);
            }

            System.out.println(" ");
            System.out.println("..... H I S T O G R A M.....");
            System.out.println(" ");
        for(int i = 0; i < tamanho; i++){
            
            System.out.print(a[i]+"°: |");
            for(int j=0 ; j < a[i];j++){
                System.out.print(b);
            }
                System.out.println(" ");
            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,"Ocorreu um erro durante a leitura!");
        }
    }
}