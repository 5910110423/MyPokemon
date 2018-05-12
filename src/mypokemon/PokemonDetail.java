/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypokemon;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author NICK
 */
public class PokemonDetail extends javax.swing.JFrame {

    /**
     * Creates new form PokemonDetail
     * 
     */
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    
    public PokemonDetail() {
       pokemons.add(new Pikachu());
       pokemons.add(new Lugia());
       pokemons.add(new Venusaur());
       
    }
    public void start(){
         initComponents();
         this.setVisible(true);
         Pikachu pikachu = new Pikachu();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "Pokemon: "+
                pokemons.get(member).getName()+"\nHealth: "+String.format("%.0f", pokemons.get(member).getHealth())
                +"/"+String.format("%.0f",pokemons.get(member).maxHealth);
        String weight = "\nWeight: "+
                String.format("%.02f",pokemons.get(member).getWeight());
        return hp+weight;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyPokemon 1.0");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pikachu", "Lugia", "Venusaur" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 505, 111, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Berry", "GoldBerry", "MySteryBerry" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 505, 111, -1));

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 545, 111, -1));

        jButton2.setText("Eat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 545, 111, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 505, 106, -1));

        jButton3.setText("Run");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 545, 106, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypokemon/pic/PokemonIcon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 260, 202));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 286, 570, 206));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypokemon/pic/BG11.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String type = jComboBox1.getSelectedItem().toString();
        switch(type){
            case "Pikachu" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/pk.gif")));
                        jTextArea1.setText(printPokemons(pokemons,0));
                        //jTextArea1.setText("pika pikaa");
                        break;
            case "Lugia" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/t3.gif")));
                        jTextArea1.setText(printPokemons(pokemons,1));
                        //jTextArea1.setText("pika pikaa");
                        break;
            case "Venusaur" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/45.gif")));
                        jTextArea1.setText(printPokemons(pokemons,2));
                        //jTextArea1.setText("pika pikaa");
                        break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String type = jComboBox1.getSelectedItem().toString();
        String typeBerry = jComboBox2.getSelectedItem().toString();
        
       switch(type){
            case "Pikachu" : 
                        switch(typeBerry){
                            case "Berry" :  pokemons.get(0).eat(new Berry(0));
                                            jTextArea1.setText(printPokemons(pokemons,0));
                                            break;
                            case "GoldBerry" : pokemons.get(0).eat(new Berry(1));
                                                jTextArea1.setText(printPokemons(pokemons,0));
                                                break;
                            case "MySteryBerry" : pokemons.get(0).eat(new Berry(2));
                                                jTextArea1.setText(printPokemons(pokemons,0));
                                                break;
                        }
                        break;
            case "Lugia" : 
                        switch(typeBerry){
                            case "Berry" :  pokemons.get(1).eat(new Berry(0));
                                            jTextArea1.setText(printPokemons(pokemons,1));
                                            break;
                            case "GoldBerry" : pokemons.get(1).eat(new Berry(1));
                                                jTextArea1.setText(printPokemons(pokemons,1));
                                                break;
                            case "MySteryBerry" : pokemons.get(1).eat(new Berry(2));
                                                jTextArea1.setText(printPokemons(pokemons,1));
                                                break;
                        }
                        break;
            case "Venusaur" : 
                        switch(typeBerry){
                            case "Berry" :  pokemons.get(2).eat(new Berry(0));
                                            jTextArea1.setText(printPokemons(pokemons,2));
                                            break;
                            case "GoldBerry" : pokemons.get(2).eat(new Berry(1));
                                                jTextArea1.setText(printPokemons(pokemons,2));
                                                break;
                            case "MySteryBerry" : pokemons.get(2).eat(new Berry(2));
                                                jTextArea1.setText(printPokemons(pokemons,2));
                                                break;
                        }
                        break;
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
