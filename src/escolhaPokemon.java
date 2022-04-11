
public class escolhaPokemon extends javax.swing.JFrame {
     public void botaoFim () {
       Resultado resultado = new Resultado();
       resultado.setVisible(true);
       this.dispose();
   }

   public void luta (Card_pokemon A, Card_pokemon B){
        Resultado resultado = new Resultado();
        if (A.poder > B.fraco){
            resultado.resultadoText.setText(A.nome + "Foi o vencedor!!");
            
            
           
        } else  {
             resultado.resultadoText.setText(B.nome + "Foi o vencedor!!");
        }
   }
    public void Resultado() {
       Resultado resultado = new Resultado();
       resultado.setVisible(true);
       this.dispose();
   }
    public escolhaPokemon() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        escolhaUm = new javax.swing.JComboBox<>();
        escolhaDois = new javax.swing.JComboBox<>();
        botBatalha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        jTextField1.setText("Escolha os pokemons que vão batalhar nessa rodada!!");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 350, 50));

        escolhaUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Charmander", "Blastoise", " ", " " }));
        escolhaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaUmActionPerformed(evt);
            }
        });
        getContentPane().add(escolhaUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        escolhaDois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blastoise", "Charmander", " " }));
        escolhaDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaDoisActionPerformed(evt);
            }
        });
        getContentPane().add(escolhaDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        botBatalha.setText("Batalha!");
        botBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBatalhaActionPerformed(evt);
            }
        });
        getContentPane().add(botBatalha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\CLIP\\Downloads\\maxresdefault.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 580, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escolhaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaUmActionPerformed
      if(escolhaUm.getSelectedItem().equals("Blastoise")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Blastoise", "Agua", 100, 200, 40, 1000 );  
      }
        if(escolhaUm.getSelectedItem().equals("Charizard")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Charizard", "Fogo", 120, 220, 42, 1100 );  
      }
          if(escolhaUm.getSelectedItem().equals("Venusaur")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Venusaur", "Grama", 80, 150, 32, 800 );  
      }
    }//GEN-LAST:event_escolhaUmActionPerformed

    private void escolhaDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaDoisActionPerformed
        if(escolhaDois.getSelectedItem().equals("Blastoise")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Blastoise", "Agua", 100, 200, 40, 1000 );  
      }
        if(escolhaDois.getSelectedItem().equals("Charizard")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Charizard", "Fogo", 120, 220, 42, 1100 );  
      }
          if(escolhaDois.getSelectedItem().equals("Venusaur")){
         
         Card_pokemon cardpokemon = new Card_pokemon("Venusaur", "Grama", 80, 150, 32, 800 );  
      }
    }//GEN-LAST:event_escolhaDoisActionPerformed

    private void botBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBatalhaActionPerformed
   
        
 botaoFim();
        System.out.println("Charmander foi o vecendor");
        
         
    }//GEN-LAST:event_botBatalhaActionPerformed
    public String escolhaUm(){
        return escolhaUm.getSelectedItem().toString();
    }
    public String escolhaDois(){
        return escolhaDois.getSelectedItem().toString();
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(escolhaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escolhaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escolhaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escolhaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new escolhaPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBatalha;
    private javax.swing.JComboBox<String> escolhaDois;
    private javax.swing.JComboBox<String> escolhaUm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
