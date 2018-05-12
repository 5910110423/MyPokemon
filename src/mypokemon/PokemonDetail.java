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
       pokemons.add(new Lapras());
       pokemons.add(new Lucario());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyPokemon 1.0");
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pikachu", "Lapras", "Lucario" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Berry", "GoldBerry", "MySteryBerry" }));

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("Run");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypokemon/pic/PokemonIcon.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 111, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, 111, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, 0, 106, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String type = jComboBox1.getSelectedItem().toString();
        switch(type){
            case "Pikachu" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/Pikachu1.png")));
                        jTextArea1.setText(printPokemons(pokemons,0));
                        //jTextArea1.setText("pika pikaa");
                        break;
            case "Lapras" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/Lapras1.png")));
                        jTextArea1.setText(printPokemons(pokemons,1));
                        //jTextArea1.setText("pika pikaa");
                        break;
            case "Lucario" : 
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("pic/Lucario1.png")));
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
            case "Lapras" : 
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
            case "Lucario" : 
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
