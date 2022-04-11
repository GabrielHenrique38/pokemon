
import javax.swing.JOptionPane;


public class Pokemon_go {

   
    public static void main(String[] args) {
        Loading_Pokemon loading_pokemon = new Loading_Pokemon();
        loading_pokemon.setVisible(true);
        try {
            for (int i = 0; i < 100; i += 3) {
                Thread.sleep(70);
                loading_pokemon.progresso.setValue(i);
                loading_pokemon.porcentagem.setText(Integer.toString(i) + "%");
            }
            loading_pokemon.dispose();
            
            telaInicio telainicio = new telaInicio();
            telainicio.setVisible(true);
           
            
             
            
            }
        catch (InterruptedException e){
            JOptionPane.showConfirmDialog(null, "Erro!");
    }
    
    }
    
}
