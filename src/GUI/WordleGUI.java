/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.IWordle;
import Clases.motorTest;
import Clases.motorDeporte;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author alumno
 */
public class WordleGUI extends javax.swing.JFrame {
    
    private final Color VERDE = new Color(51,102,0);
    private final Color NARANJA = new Color(204,153,0);
    private final Color ROJO = new Color(204,0,0);
   
    
    private IWordle motor;
    private int cont = 1;
    private String palabraA;
    
    
    private static final int MAX_INTENTOS = 5 ;
    private static final int TAMAÑO_PALABRA = 5;
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMAÑO_PALABRA];
    
    public WordleGUI() {
        initComponents();
        
        motor = new motorTest();
        palabraA = motor.palabraAleatoria().toUpperCase();
        inicializarLabels();
         this.getContentPane().setBackground(Color.orange);
        this.palabraIntentar.setBorder(BorderFactory.createLineBorder(Color.white));
        System.out.println(palabraA);
        
        
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
        nombreMotor = new javax.swing.JPanel();
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
        letrasAcertadas = new javax.swing.JLabel();
        letrasFalladas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        enviarBoton = new javax.swing.JButton();
        palabraIntentar = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        ganarLabel1 = new javax.swing.JLabel();
        ganarLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mensajeError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        botonReinicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        motorTestBoton = new javax.swing.JRadioButtonMenuItem();
        motorFileBoton = new javax.swing.JRadioButtonMenuItem();
        motorDeporte = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout nombreMotorLayout = new javax.swing.GroupLayout(nombreMotor);
        nombreMotor.setLayout(nombreMotorLayout);
        nombreMotorLayout.setHorizontalGroup(
            nombreMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        nombreMotorLayout.setVerticalGroup(
            nombreMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        Main.add(nombreMotor, java.awt.BorderLayout.PAGE_END);

        palabrasPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        letrasPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        letrasPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        letrasPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        letrasPanel.setLayout(new java.awt.GridLayout(5, 5, 4, 4));

        label11.setBackground(new java.awt.Color(255, 255, 247));
        label11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setToolTipText("");
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label11.setMaximumSize(new java.awt.Dimension(40, 40));
        label11.setMinimumSize(new java.awt.Dimension(40, 40));
        label11.setOpaque(true);
        label11.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label11);

        label12.setBackground(new java.awt.Color(255, 255, 247));
        label12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setToolTipText("");
        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label12.setMaximumSize(new java.awt.Dimension(40, 40));
        label12.setMinimumSize(new java.awt.Dimension(40, 40));
        label12.setOpaque(true);
        label12.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label12);

        label13.setBackground(new java.awt.Color(255, 255, 247));
        label13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setToolTipText("");
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label13.setMaximumSize(new java.awt.Dimension(40, 40));
        label13.setMinimumSize(new java.awt.Dimension(40, 40));
        label13.setOpaque(true);
        label13.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label13);

        label14.setBackground(new java.awt.Color(255, 255, 247));
        label14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setToolTipText("");
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label14.setMaximumSize(new java.awt.Dimension(40, 40));
        label14.setMinimumSize(new java.awt.Dimension(40, 40));
        label14.setOpaque(true);
        label14.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label14);

        label15.setBackground(new java.awt.Color(255, 255, 247));
        label15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setToolTipText("");
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label15.setMaximumSize(new java.awt.Dimension(40, 40));
        label15.setMinimumSize(new java.awt.Dimension(40, 40));
        label15.setOpaque(true);
        label15.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label15);

        label21.setBackground(new java.awt.Color(255, 255, 247));
        label21.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label21.setForeground(new java.awt.Color(255, 255, 255));
        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setToolTipText("");
        label21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label21.setMaximumSize(new java.awt.Dimension(40, 40));
        label21.setMinimumSize(new java.awt.Dimension(40, 40));
        label21.setOpaque(true);
        label21.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label21);

        label22.setBackground(new java.awt.Color(255, 255, 247));
        label22.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label22.setForeground(new java.awt.Color(255, 255, 255));
        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setToolTipText("");
        label22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label22.setMaximumSize(new java.awt.Dimension(40, 40));
        label22.setMinimumSize(new java.awt.Dimension(40, 40));
        label22.setOpaque(true);
        label22.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label22);

        label23.setBackground(new java.awt.Color(255, 255, 247));
        label23.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label23.setForeground(new java.awt.Color(255, 255, 255));
        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setToolTipText("");
        label23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label23.setMaximumSize(new java.awt.Dimension(40, 40));
        label23.setMinimumSize(new java.awt.Dimension(40, 40));
        label23.setOpaque(true);
        label23.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label23);
        label23.getAccessibleContext().setAccessibleName("label23");

        label24.setBackground(new java.awt.Color(255, 255, 247));
        label24.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label24.setForeground(new java.awt.Color(255, 255, 255));
        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setToolTipText("");
        label24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label24.setMaximumSize(new java.awt.Dimension(40, 40));
        label24.setMinimumSize(new java.awt.Dimension(40, 40));
        label24.setOpaque(true);
        label24.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label24);

        label25.setBackground(new java.awt.Color(255, 255, 247));
        label25.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label25.setForeground(new java.awt.Color(255, 255, 255));
        label25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label25.setToolTipText("");
        label25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label25.setMaximumSize(new java.awt.Dimension(40, 40));
        label25.setMinimumSize(new java.awt.Dimension(40, 40));
        label25.setOpaque(true);
        label25.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label25);

        label31.setBackground(new java.awt.Color(255, 255, 247));
        label31.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label31.setForeground(new java.awt.Color(255, 255, 255));
        label31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label31.setToolTipText("");
        label31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label31.setMaximumSize(new java.awt.Dimension(40, 40));
        label31.setMinimumSize(new java.awt.Dimension(40, 40));
        label31.setOpaque(true);
        label31.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label31);

        label32.setBackground(new java.awt.Color(255, 255, 247));
        label32.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label32.setForeground(new java.awt.Color(255, 255, 255));
        label32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label32.setToolTipText("");
        label32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label32.setMaximumSize(new java.awt.Dimension(40, 40));
        label32.setMinimumSize(new java.awt.Dimension(40, 40));
        label32.setOpaque(true);
        label32.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label32);

        label33.setBackground(new java.awt.Color(255, 255, 247));
        label33.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label33.setForeground(new java.awt.Color(255, 255, 255));
        label33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label33.setToolTipText("");
        label33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label33.setMaximumSize(new java.awt.Dimension(40, 40));
        label33.setMinimumSize(new java.awt.Dimension(40, 40));
        label33.setOpaque(true);
        label33.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label33);

        label34.setBackground(new java.awt.Color(255, 255, 247));
        label34.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label34.setForeground(new java.awt.Color(255, 255, 255));
        label34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label34.setToolTipText("");
        label34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label34.setMaximumSize(new java.awt.Dimension(40, 40));
        label34.setMinimumSize(new java.awt.Dimension(40, 40));
        label34.setOpaque(true);
        label34.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label34);

        label35.setBackground(new java.awt.Color(255, 255, 247));
        label35.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label35.setForeground(new java.awt.Color(255, 255, 255));
        label35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label35.setToolTipText("");
        label35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label35.setMaximumSize(new java.awt.Dimension(40, 40));
        label35.setMinimumSize(new java.awt.Dimension(40, 40));
        label35.setOpaque(true);
        label35.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label35);

        label41.setBackground(new java.awt.Color(255, 255, 247));
        label41.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label41.setForeground(new java.awt.Color(255, 255, 255));
        label41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label41.setToolTipText("");
        label41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label41.setMaximumSize(new java.awt.Dimension(40, 40));
        label41.setMinimumSize(new java.awt.Dimension(40, 40));
        label41.setOpaque(true);
        label41.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label41);

        label42.setBackground(new java.awt.Color(255, 255, 247));
        label42.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label42.setForeground(new java.awt.Color(255, 255, 255));
        label42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label42.setToolTipText("");
        label42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label42.setMaximumSize(new java.awt.Dimension(40, 40));
        label42.setMinimumSize(new java.awt.Dimension(40, 40));
        label42.setOpaque(true);
        label42.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label42);

        label43.setBackground(new java.awt.Color(255, 255, 247));
        label43.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label43.setForeground(new java.awt.Color(255, 255, 255));
        label43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label43.setToolTipText("");
        label43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label43.setMaximumSize(new java.awt.Dimension(40, 40));
        label43.setMinimumSize(new java.awt.Dimension(40, 40));
        label43.setOpaque(true);
        label43.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label43);

        label44.setBackground(new java.awt.Color(255, 255, 247));
        label44.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label44.setForeground(new java.awt.Color(255, 255, 255));
        label44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label44.setToolTipText("");
        label44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label44.setMaximumSize(new java.awt.Dimension(40, 40));
        label44.setMinimumSize(new java.awt.Dimension(40, 40));
        label44.setOpaque(true);
        label44.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label44);

        label45.setBackground(new java.awt.Color(255, 255, 247));
        label45.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label45.setForeground(new java.awt.Color(255, 255, 255));
        label45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label45.setToolTipText("");
        label45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label45.setMaximumSize(new java.awt.Dimension(40, 40));
        label45.setMinimumSize(new java.awt.Dimension(40, 40));
        label45.setOpaque(true);
        label45.setPreferredSize(new java.awt.Dimension(40, 40));
        letrasPanel.add(label45);

        label51.setBackground(new java.awt.Color(255, 255, 247));
        label51.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label51.setForeground(new java.awt.Color(255, 255, 255));
        label51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label51.setOpaque(true);
        letrasPanel.add(label51);

        label52.setBackground(new java.awt.Color(255, 255, 247));
        label52.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label52.setForeground(new java.awt.Color(255, 255, 255));
        label52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label52.setOpaque(true);
        letrasPanel.add(label52);

        label53.setBackground(new java.awt.Color(255, 255, 247));
        label53.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label53.setForeground(new java.awt.Color(255, 255, 255));
        label53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label53.setOpaque(true);
        letrasPanel.add(label53);

        label54.setBackground(new java.awt.Color(255, 255, 247));
        label54.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label54.setForeground(new java.awt.Color(255, 255, 255));
        label54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label54.setOpaque(true);
        letrasPanel.add(label54);

        label55.setBackground(new java.awt.Color(255, 255, 247));
        label55.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label55.setForeground(new java.awt.Color(255, 255, 255));
        label55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label55.setOpaque(true);
        letrasPanel.add(label55);

        palabrasPanel.add(letrasPanel);

        Main.add(palabrasPanel, java.awt.BorderLayout.PAGE_START);

        botonesPanel.setPreferredSize(new java.awt.Dimension(500, 230));
        botonesPanel.setLayout(new java.awt.GridLayout(2, 2));

        jPanel5.setLayout(new java.awt.GridLayout(2, 0));
        jPanel5.add(letrasAcertadas);
        jPanel5.add(letrasFalladas);

        botonesPanel.add(jPanel5);

        enviarBoton.setBackground(new java.awt.Color(200, 200, 200));
        enviarBoton.setText("Enviar");
        enviarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBotonActionPerformed(evt);
            }
        });

        palabraIntentar.setColumns(1);
        palabraIntentar.setRows(1);
        palabraIntentar.setTabSize(1);
        palabraIntentar.setMaximumSize(new java.awt.Dimension(10, 10));
        palabraIntentar.setMinimumSize(new java.awt.Dimension(10, 10));
        palabraIntentar.setName(""); // NOI18N
        palabraIntentar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                palabraIntentarKeyTyped(evt);
            }
        });

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
                .addContainerGap(45, Short.MAX_VALUE))
        );

        botonesPanel.add(jPanel4);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 10, 0));

        ganarLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jPanel3.add(ganarLabel1);

        ganarLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jPanel3.add(ganarLabel2);

        botonesPanel.add(jPanel3);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        mensajeError.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jPanel6.add(mensajeError, new java.awt.GridBagConstraints());

        botonesPanel.add(jPanel6);

        Main.add(botonesPanel, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        jMenu1.setText("Reiniciar");

        botonReinicio.setText("Reiniciar");
        botonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReinicioActionPerformed(evt);
            }
        });
        jMenu1.add(botonReinicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Motor");

        BotonMotorGrupo.add(motorTestBoton);
        motorTestBoton.setSelected(true);
        motorTestBoton.setText("Test");
        motorTestBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorTestBotonActionPerformed(evt);
            }
        });
        jMenu2.add(motorTestBoton);

        BotonMotorGrupo.add(motorFileBoton);
        motorFileBoton.setText("File");
        motorFileBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorFileBotonActionPerformed(evt);
            }
        });
        jMenu2.add(motorFileBoton);

        BotonMotorGrupo.add(motorDeporte);
        motorDeporte.setText("Deportle");
        motorDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorDeporteActionPerformed(evt);
            }
        });
        jMenu2.add(motorDeporte);

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
            
        boolean ganar;
        String palabra = palabraIntentar.getText().toUpperCase();
            
            
            if(comprobarPalabra(palabra)){
                if(palabra.equalsIgnoreCase(palabraA)){
                    ganar = true;
                    completarLabels(palabra,ganar);
                    finalizarJuego();
                    ganar(); 
                }else{
                    ganar = false;
                    completarLabels(palabra,ganar);
                    if(cont==5){
                        finalizarJuego();
                        perder();
                    }
                }
            cont++;  
            }
            this.palabraIntentar.setText("");
            
    }//GEN-LAST:event_enviarBotonActionPerformed
    private void ganar(){
        this.ganarLabel1.setForeground(VERDE);
        this.ganarLabel1.setText("  Enhorabuena!!!!!");
        this.ganarLabel2.setForeground(VERDE);
        this.ganarLabel2.setText("  Has ganado en "+cont+" intentos");
        this.palabraIntentar.setBorder(BorderFactory.createLineBorder(VERDE));
        
        
        
    }
    
    private void perder(){
        this.ganarLabel1.setForeground(ROJO);
        this.ganarLabel1.setText("  !!UPS!!");
        this.ganarLabel2.setForeground(ROJO);
        this.ganarLabel2.setText("  La palabra correcta: "+palabraA);
        this.palabraIntentar.setBorder(BorderFactory.createLineBorder(ROJO));
        
    }
    private void finalizarJuego(){
        this.enviarBoton.setEnabled(false);
        this.palabraIntentar.setEditable(false);
    }
    private void botonReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReinicioActionPerformed
        reiniciar();
        
    }//GEN-LAST:event_botonReinicioActionPerformed
    
    private void reiniciar(){
        palabraA = motor.palabraAleatoria().toUpperCase();
        System.out.println(palabraA);
        
        for(JLabel[] label : labels){
            for(JLabel jLabel : label){
                jLabel.setText("");
                jLabel.setBackground(Color.WHITE);
            }
        }
        
        this.ganarLabel1.setText("");
        this.ganarLabel2.setText("");
        this.palabraIntentar.setText("");
        this.mensajeError.setText("");
        this.letrasAcertadas.setText("");
        this.letrasFalladas.setText("");
        
        this.enviarBoton.setEnabled(true);
        this.palabraIntentar.setEditable(true);
        this.palabraIntentar.setBorder(BorderFactory.createLineBorder(Color.white));
        
        cont = 1;
    }
    
    private void palabraIntentarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabraIntentarKeyTyped
        
        if(this.palabraIntentar.getText().length()>4){
            evt.consume();
        }
        
    }//GEN-LAST:event_palabraIntentarKeyTyped

    private void motorTestBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorTestBotonActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motorTestBotonActionPerformed

    private void motorFileBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorFileBotonActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motorFileBotonActionPerformed

    private void motorDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorDeporteActionPerformed
        seleccionarMotor();
    }//GEN-LAST:event_motorDeporteActionPerformed
    
    private void seleccionarMotor(){
        if(this.motorDeporte.isSelected()){
            motor = new motorDeporte();
        }else if(this.motorTestBoton.isSelected()){
            motor = new motorTest();
        }else if(this.motorFileBoton.isSelected()){
            motor = new motorDeporte();
        }
        reiniciar();
    }
    
    private void completarLabels(String palabra, boolean ganar){
        
        StringBuilder sb = new StringBuilder(palabra);
        StringBuilder sbA = new StringBuilder(palabraA);
        
        if(ganar){
            JLabel[] label = labels[cont-1];
            for(int j  = 0; j < label.length; j++){
                JLabel jLabel = label[j];
                String letra = palabra.charAt(j) + "";
                jLabel.setText(letra);
                jLabel.setBackground(VERDE);
            } 
        }else{
            //comprobar color verde
            JLabel[] label = labels[cont-1];
            for(int j  = 0; j < label.length; j++){
                JLabel jLabel = label[j];
                String letra = palabra.charAt(j) + "";
                jLabel.setText(letra);
                if(esVerde(sb,sbA,j)){
                    jLabel.setBackground(VERDE);
                }
            }
            //comprobar color naranja
            for(int j  = 0; j < label.length; j++){
                JLabel jLabel = label[j];
                
                jLabel.setBackground(esNaranja(sb,sbA,j,jLabel));    
            } 
        }
        
        
    }
    private boolean esVerde(StringBuilder sb,StringBuilder sbA,int j){
        String letra = sb.substring(j,j+1);
        if(sb.substring(j,j+1).equals(sbA.substring(j,j+1))){
            sb.replace(j, j+1,"!");
            sbA.replace(j, j+1,"!");
            //almacenarLetras(letra,"verde");
            return true;
        }else{
            return false;
        }
    }
    
    private Color esNaranja(StringBuilder sb,StringBuilder sbA,int j,JLabel jLabel){
        if(!sb.substring(j,j+1).equals("!")){
            String letra = sb.substring(j,j+1);
            if(sbA.indexOf(sb.substring(j,j+1))!=-1){
                sbA.replace(sbA.indexOf(sb.substring(j,j+1)), sbA.indexOf(sb.substring(j,j+1))+1," ");
                sb.replace(j,j+1," ");
                
                
                return NARANJA;
            }else{
                //almacenarLetras(letra,"rojo");
                return ROJO;

            }
        }
        return jLabel.getBackground(); 
        
    }
    
    /*
    private void almacenarLetras(String letra, String color){
        if(color.equals("rojo")){
            this.
        }
    }
     */   
    
    
    private boolean comprobarPalabra(String p){
        if(p.matches("[a-zA-Z]{5}")){
            this.mensajeError.setText("");
            return true;
        }
        else{
            mensajeError.setForeground(ROJO);
            mensajeError.setText("Formato de palabra no válido");
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
    private javax.swing.JMenuItem botonReinicio;
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton enviarBoton;
    private javax.swing.JLabel ganarLabel1;
    private javax.swing.JLabel ganarLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JLabel letrasAcertadas;
    private javax.swing.JLabel letrasFalladas;
    private javax.swing.JPanel letrasPanel;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JRadioButtonMenuItem motorDeporte;
    private javax.swing.JRadioButtonMenuItem motorFileBoton;
    private javax.swing.JRadioButtonMenuItem motorTestBoton;
    private javax.swing.JPanel nombreMotor;
    private javax.swing.JTextArea palabraIntentar;
    private javax.swing.JPanel palabrasPanel;
    // End of variables declaration//GEN-END:variables
}
