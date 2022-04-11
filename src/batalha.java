
public class batalha {
    
    Resultado resultado = new Resultado();
    
    
    
    public void luta (Card_pokemon A, Card_pokemon B){
        
        if (A.poder > B.fraco){
            resultado.resultadoText.setText(A.nome + "Foi o vencedor!!");
            
            
           
        } else  {
             resultado.resultadoText.setText(B.nome + "Foi o vencedor!!");
        }
    }
    
   

}
