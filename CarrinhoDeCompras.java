package exemplo;
  @Stateful
  public class CarrinhoDeCompras {
   
            List<String> itens;
   
            public CarrinhoDeCompras () {
                     itens = new ArrayList<>();
            }
   
            public void adicionarItem(String item) {
                     itens.add(item);
            }
   
            public void removerItem(String item) {
                     itens.remove(item);
            }
   
            @Remove
            public void remover() {
                     itens = null;
            }
  }