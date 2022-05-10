/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.IWordle;
import Clases.motorTest;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author alumno
 */
public class WordleGUI extends javax.swing.JFrame {
    
        
    private IWordle motor;
    private int cont = 1;
    private String palabraA;
    
    private static final int MAX_INTENTOS = 5 ;
    private static final int TAMAÑO_PALABRA = 5;
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMAÑO_PALABRA];
    
    public WordleGUI() {
        initComponents();
        motor = new motorTest();
        palabraA = motor.palabraAleatoria();
        inicializarLabels();
        
        
    }
    
    public final void inicializarLabels(){
        for(int i  = 1;i<=MAX_INTENTOS; i++){
            for(int j = 1;j<=TAMAÑO_PALABRA;j++){
                try{
                    String nombreLabel = "label"+i+""+j;
                    
                    System.out.println(nombreLabel);
                    javax.swing.JLabel aux = (javax.swing.JLabel)this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i-1][j-1] = aux;                   
                } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException ex) {
                    Logger.getLogger(WordleGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonMotorGrupo = new javax.swing.ButtonGroup();
        Main = new javax.swing.JPanel();
        palabrasPanel = new javax.swing.JPanel();
        letrasPanel = new javax.swing.JPanel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        label22 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        label24 = new javax.swing.JLabel();
        label25 = new javax.swing.JLabel();
        label31 = new javax.swing.JLabel();
        label32 = new javax.swing.JLabel();
        label33 = new javax.swing.JLabel();
        label34 = new javax.swing.JLabel();
        label35 = new javax.swing.JLabel();
        label41 = new javax.swing.JLabel();
        label42 = new javax.swing.JLabel();
        label43 = new javax.swing.JLabel();
        label44 = new javax.swing.JLabel();
        label45 = new javax.swing.JLabel();
        label51 = new javax.swing.JLabel();
        label52 = new javax.swing.JLabel();
        label53 = new javax.swing.JLabel();
        label54 = new javax.swing.JLabel();
        label55 = new javax.swing.JLabel();
        botonesPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        enviarBoton = new javax.swing.JButton();
        palabraIntentar = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        ganarLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mensajeError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setLayout(new java.awt.BorderLayout());

        palabrasPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        letrasPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        letrasPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        letrasPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        letrasPanel.setLayout(new java.awt.GridLayout(5, 5, 4, 4));

        label11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("A");
        label11.setToolTipText("");
        label11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label11.setMaximumSize(new java.awt.Dimension(40, 40));
        label11.setMinimumSize(new java.awt.Dimension(40, 40));
        label11.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label11);

        label12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("A");
        label12.setToolTipText("");
        label12.setMaximumSize(new java.awt.Dimension(40, 40));
        label12.setMinimumSize(new java.awt.Dimension(40, 40));
        label12.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label12);

        label13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText("A");
        label13.setToolTipText("");
        label13.setMaximumSize(new java.awt.Dimension(40, 40));
        label13.setMinimumSize(new java.awt.Dimension(40, 40));
        label13.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label13);

        label14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("A");
        label14.setToolTipText("");
        label14.setMaximumSize(new java.awt.Dimension(40, 40));
        label14.setMinimumSize(new java.awt.Dimension(40, 40));
        label14.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label14);

        label15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText("A");
        label15.setToolTipText("");
        label15.setMaximumSize(new java.awt.Dimension(40, 40));
        label15.setMinimumSize(new java.awt.Dimension(40, 40));
        label15.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label15);

        label21.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setText("A");
        label21.setToolTipText("");
        label21.setMaximumSize(new java.awt.Dimension(40, 40));
        label21.setMinimumSize(new java.awt.Dimension(40, 40));
        label21.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label21);

        label22.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setText("A");
        label22.setToolTipText("");
        label22.setMaximumSize(new java.awt.Dimension(40, 40));
        label22.setMinimumSize(new java.awt.Dimension(40, 40));
        label22.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label22);

        label23.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setText("A");
        label23.setToolTipText("");
        label23.setMaximumSize(new java.awt.Dimension(40, 40));
        label23.setMinimumSize(new java.awt.Dimension(40, 40));
        label23.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label23);
        label23.getAccessibleContext().setAccessibleName("label23");

        label24.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setText("A");
        label24.setToolTipText("");
        label24.setMaximumSize(new java.awt.Dimension(40, 40));
        label24.setMinimumSize(new java.awt.Dimension(40, 40));
        label24.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label24);

        label25.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label25.setText("A");
        label25.setToolTipText("");
        label25.setMaximumSize(new java.awt.Dimension(40, 40));
        label25.setMinimumSize(new java.awt.Dimension(40, 40));
        label25.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label25);

        label31.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label31.setText("A");
        label31.setToolTipText("");
        label31.setMaximumSize(new java.awt.Dimension(40, 40));
        label31.setMinimumSize(new java.awt.Dimension(40, 40));
        label31.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label31);

        label32.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label32.setText("A");
        label32.setToolTipText("");
        label32.setMaximumSize(new java.awt.Dimension(40, 40));
        label32.setMinimumSize(new java.awt.Dimension(40, 40));
        label32.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label32);

        label33.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label33.setText("A");
        label33.setToolTipText("");
        label33.setMaximumSize(new java.awt.Dimension(40, 40));
        label33.setMinimumSize(new java.awt.Dimension(40, 40));
        label33.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label33);

        label34.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label34.setText("A");
        label34.setToolTipText("");
        label34.setMaximumSize(new java.awt.Dimension(40, 40));
        label34.setMinimumSize(new java.awt.Dimension(40, 40));
        label34.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label34);

        label35.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label35.setText("A");
        label35.setToolTipText("");
        label35.setMaximumSize(new java.awt.Dimension(40, 40));
        label35.setMinimumSize(new java.awt.Dimension(40, 40));
        label35.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label35);

        label41.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label41.setText("A");
        label41.setToolTipText("");
        label41.setMaximumSize(new java.awt.Dimension(40, 40));
        label41.setMinimumSize(new java.awt.Dimension(40, 40));
        label41.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label41);

        label42.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label42.setText("A");
        label42.setToolTipText("");
        label42.setMaximumSize(new java.awt.Dimension(40, 40));
        label42.setMinimumSize(new java.awt.Dimension(40, 40));
        label42.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label42);

        label43.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label43.setText("A");
        label43.setToolTipText("");
        label43.setMaximumSize(new java.awt.Dimension(40, 40));
        label43.setMinimumSize(new java.awt.Dimension(40, 40));
        label43.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label43);

        label44.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label44.setText("A");
        label44.setToolTipText("");
        label44.setMaximumSize(new java.awt.Dimension(40, 40));
        label44.setMinimumSize(new java.awt.Dimension(40, 40));
        label44.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label44);

        label45.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label45.setText("A");
        label45.setToolTipText("");
        label45.setMaximumSize(new java.awt.Dimension(40, 40));
        label45.setMinimumSize(new java.awt.Dimension(40, 40));
        label45.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label45);

        label51.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label51.setText("A");
        letrasPanel.add(label51);

        label52.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label52.setText("A");
        letrasPanel.add(label52);

        label53.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label53.setText("A");
        letrasPanel.add(label53);

        label54.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label54.setText("A");
        letrasPanel.add(label54);

        label55.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label55.setText("A");
        letrasPanel.add(label55);

        palabrasPanel.add(letrasPanel);

        Main.add(palabrasPanel, java.awt.BorderLayout.PAGE_START);

        botonesPanel.setPreferredSize(new java.awt.Dimension(500, 230));
        botonesPanel.setLayout(new java.awt.GridLayout(2, 2));

        jPanel5.setLayout(new java.awt.GridLayout(2, 0));

        jLabel6.setText("jLabel6");
        jPanel5.add(jLabel6);

        jLabel12.setText("jLabel12");
        jPanel5.add(jLabel12);

        botonesPanel.add(jPanel5);

        enviarBoton.setText("Enviar");
        enviarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotonActionPerformed(evt);
            }
        });

        palabraIntentar.setColumns(1);
        palabraIntentar.setRows(1);
        palabraIntentar.setTabSize(5);
        palabraIntentar.setMaximumSize(new java.awt.Dimension(10, 10));
        palabraIntentar.setMinimumSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(palabraIntentar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabraIntentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarBoton))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        botonesPanel.add(jPanel4);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        ganarLabel.setText("has ganado a la 2");
        jPanel3.add(ganarLabel, new java.awt.GridBagConstraints());

        botonesPanel.add(jPanel3);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        mensajeError.setText("jLabel25");
        jPanel6.add(mensajeError);

        botonesPanel.add(jPanel6);

        Main.add(botonesPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Reiniciar");

        jMenuItem1.setText("Reiniciar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Motor");

        BotonMotorGrupo.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Test");
        jMenu2.add(jRadioButtonMenuItem1);

        BotonMotorGrupo.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("File");
        jMenu2.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBotonActionPerformed
            String palabra = palabraIntentar.getText().toUpperCase();
            if(comprobarPalabra(palabra)){
                if(palabra.equalsIgnoreCase(palabraA)){
                    completarLabels(palabra);
                    this.enviarBoton.setEnabled(false);
                    this.palabraIntentar.setEditable(false);
                    this.ganarLabel.setText("Has ganado en "+cont+" intentos");
                }else{
                    completarLabels(palabra);
                    if(cont==5){
                        this.ganarLabel.setText("Has perdido");
                        this.enviarBoton.setEnabled(false);
                        this.palabraIntentar.setEditable(false);
                    }
                }
                
            }else{
                
            }
            cont++;
    }//GEN-LAST:event_enviarBotonActionPerformed
    
    private void completarLabels(String palabra){
        StringBuilder sb = new StringBuilder(palabra);
        
        JLabel[] label = labels[cont-1];
        for(int j  = 0; j < label.length; j++){
            JLabel jLabel = label[j];
            jLabel.setText(sb.substring(j, j+1));
        }
    }
    
    private boolean comprobarPalabra(String p){
        if(p.matches("[a-zA-Z]{5}")){
            mensajeError.setForeground(Color.black);
            mensajeError.setText("Palabra Introducida correctamente");
            return true;
        }
        else{
            mensajeError.setForeground(Color.red);
            mensajeError.setText("Formato de palabra no valido");
            return false;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(WordleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonMotorGrupo;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton enviarBoton;
    private javax.swing.JLabel ganarLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label24;
    private javax.swing.JLabel label25;
    private javax.swing.JLabel label31;
    private javax.swing.JLabel label32;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label34;
    private javax.swing.JLabel label35;
    private javax.swing.JLabel label41;
    private javax.swing.JLabel label42;
    private javax.swing.JLabel label43;
    private javax.swing.JLabel label44;
    private javax.swing.JLabel label45;
    private javax.swing.JLabel label51;
    private javax.swing.JLabel label52;
    private javax.swing.JLabel label53;
    private javax.swing.JLabel label54;
    private javax.swing.JLabel label55;
    private javax.swing.JPanel letrasPanel;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JTextArea palabraIntentar;
    private javax.swing.JPanel palabrasPanel;
    // End of variables declaration//GEN-END:variables
}
