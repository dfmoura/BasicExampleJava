import javax.swing.JOptionPane;

public class vet_dinamico {
    public static void main (String[] args){
        final String userInput = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:");
                int tamanho = Integer.parseInt(userInput);
        int[] a = new int[tamanho];
        int soma = 0;
        String num;
        try{
            for(int i = 0; i< tamanho; i++){
                num = JOptionPane.showInputDialog(
                "Digite o valor " + i + ":");
                a[i] = Integer.parseInt(num);
            }
        for(int i = 0; i < tamanho; i++){
            if(a[i]% 2 !=0)
                soma = soma + a[i];
            }
            JOptionPane.showMessageDialog(
                null, "Soma dos ímpares = " + soma);
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,"Ocorreu um erro durante a leitura!");
        }
    }
}
