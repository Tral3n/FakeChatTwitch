/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;


import java.awt.Color;
import java.awt.event.ItemEvent;

import java.awt.event.KeyEvent;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
/**
 *
 * @author Tralen
 */
public class Chat extends javax.swing.JFrame implements NativeKeyListener{

    /**
     * Creates new form Chat
     */
    
    
    public Chat(){
        initComponents();
  

         
  
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventana = new javax.swing.JTextPane();
        MonkaW = new javax.swing.JToggleButton();
        Sadge = new javax.swing.JToggleButton();
        OMEGALUL = new javax.swing.JToggleButton();
        GachiHyper = new javax.swing.JToggleButton();
        TRUELULW = new javax.swing.JToggleButton();
        PepeLaugh = new javax.swing.JToggleButton();
        ForsenCD = new javax.swing.JToggleButton();
        Pogu = new javax.swing.JToggleButton();
        Pog = new javax.swing.JToggleButton();
        ayaya = new javax.swing.JToggleButton();
        PepeJam = new javax.swing.JToggleButton();
        PauseChamp = new javax.swing.JToggleButton();
        HeadBang = new javax.swing.JToggleButton();
        pepega = new javax.swing.JToggleButton();
        EZ = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FChat");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        ventana.setEditable(false);
        ventana.setBorder(null);
        ventana.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ventana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ventanaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ventana);

        MonkaW.setText("MonkaW");
        MonkaW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonkaWActionPerformed(evt);
            }
        });

        Sadge.setText("Sadge");
        Sadge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SadgeActionPerformed(evt);
            }
        });

        OMEGALUL.setText("OMEGALUL");
        OMEGALUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OMEGALULActionPerformed(evt);
            }
        });

        GachiHyper.setText("GachIHyper");
        GachiHyper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GachiHyperActionPerformed(evt);
            }
        });

        TRUELULW.setText("TRUELULW");
        TRUELULW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRUELULWActionPerformed(evt);
            }
        });

        PepeLaugh.setText("oh no oh no");
        PepeLaugh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepeLaughActionPerformed(evt);
            }
        });

        ForsenCD.setText("ForsenCD");
        ForsenCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForsenCDActionPerformed(evt);
            }
        });

        Pogu.setText("PogU");
        Pogu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoguActionPerformed(evt);
            }
        });

        Pog.setText("Pog");
        Pog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PogActionPerformed(evt);
            }
        });

        ayaya.setText("AYAYA");
        ayaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayayaActionPerformed(evt);
            }
        });

        PepeJam.setText("PepeJam");
        PepeJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepeJamActionPerformed(evt);
            }
        });

        PauseChamp.setText("PauseChamp");
        PauseChamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseChampActionPerformed(evt);
            }
        });

        HeadBang.setText("HeadBang");
        HeadBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeadBangActionPerformed(evt);
            }
        });

        pepega.setText("Pepega");
        pepega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepegaActionPerformed(evt);
            }
        });

        EZ.setText("EZ");
        EZ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EZItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HeadBang, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(ayaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pogu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sadge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MonkaW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OMEGALUL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GachiHyper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PepeJam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pepega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TRUELULW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ForsenCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PauseChamp, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(PepeLaugh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 123, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MonkaW)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GachiHyper)
                        .addComponent(TRUELULW)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OMEGALUL)
                    .addComponent(Sadge)
                    .addComponent(ForsenCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pogu)
                    .addComponent(Pog)
                    .addComponent(PauseChamp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ayaya)
                    .addComponent(PepeJam)
                    .addComponent(PepeLaugh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeadBang)
                    .addComponent(pepega)
                    .addComponent(EZ))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GachiHyperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GachiHyperActionPerformed
        if (GachiHyper.isSelected()) {

            GachiHyper.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 4;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);

                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\GachiHyper.gif"));
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(2) + 1) {
                                    case 1:
                                        appendString(" YES");
                                        break;
                                    case 2:
                                        appendString(" OMG");
                                        break;
                            } 
                               
                            
                        }else if(numberimg == 2){
                            appendString(" ");
                                       
                        }
                    }
                    }
                
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            GachiHyper.setBackground(Color.white);
        }
    }//GEN-LAST:event_GachiHyperActionPerformed

    private void OMEGALULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OMEGALULActionPerformed
        if (OMEGALUL.isSelected()) {

            OMEGALUL.setBackground(Color.red);
            Chat chat = new Chat();

            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 10;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);

                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\OMEGALUL.png"));
                    appendString("  ");
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                appendString("SO BAD ");
                            } else {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            OMEGALUL.setBackground(Color.white);
        }
    }//GEN-LAST:event_OMEGALULActionPerformed

    private void SadgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SadgeActionPerformed
        if (Sadge.isSelected()) {

            Sadge.setBackground(Color.red);
            Chat chat = new Chat();

            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 4;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);

                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\sadge.png"));
                    appendString("  ");
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                appendString("true ");
                            } else {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            Sadge.setBackground(Color.white);
        }
    }//GEN-LAST:event_SadgeActionPerformed
;


    private void MonkaWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonkaWActionPerformed
   

      
         MonkaW.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('1'), "pressed");
       
        if (MonkaW.isSelected()) {

            MonkaW.setBackground(Color.red);
            Chat chat = new Chat();

            RandomNames generar = new RandomNames();
            String text = generar.Generar();
            System.out.println("test");

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 4;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);

                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\MonkaW.jpg"));
                    appendString("  ");
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                appendString("? ");
                            } else {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } 
        
        MonkaW.setBackground(Color.white);
    }//GEN-LAST:event_MonkaWActionPerformed

    private void TRUELULWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRUELULWActionPerformed
        if (TRUELULW.isSelected()) {

            TRUELULW.setBackground(Color.red);
            Chat chat = new Chat();

            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": TRUE  ");
                int minnumberimg = 1;
                int maxnumberimg = 1;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);

                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\LULW.jpg"));
                    /*if(numberimg==1){
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j <numberqmark ; j++) {
                            if(j==1){
                                appendString(  "NOT FALSE ");
                            }else{
                                appendString("");
                            }
                        }
                    }*/
 /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("   \n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            TRUELULW.setBackground(Color.white);
        }
    }//GEN-LAST:event_TRUELULWActionPerformed

    private void PepeLaughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepeLaughActionPerformed
        if (PepeLaugh.isSelected()) {

            PepeLaugh.setBackground(Color.red);
            Chat chat = new Chat();

            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 4;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\PepeLaughN.png"));
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                appendString(" oh no oh no");
                            } else if (j == 2) {
                                appendString("here it comes");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            PepeLaugh.setBackground(Color.white);
        }
    }//GEN-LAST:event_PepeLaughActionPerformed

    private void ForsenCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForsenCDActionPerformed
        if (ForsenCD.isSelected()) {

            ForsenCD.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 3;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                                ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\Forsencd.jpg   "));
                                                  appendString("  ");
                                if (numberimg == 1) {
                        
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(2) + 1) {
                                    case 1:
                                        appendString(" MY MAN");
                                        break;
                                    case 2:
                                        appendString(" SO?");
                                        break;

                                }

                            } else if (j == 2) {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            ForsenCD.setBackground(Color.white);
        }
    }//GEN-LAST:event_ForsenCDActionPerformed

    private void PoguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoguActionPerformed
        if (Pogu.isSelected()) {

            Pogu.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 8;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\PogU.png"));
                                       
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(3) + 1) {
                                    case 1:
                                        appendString("  WTF");
                                        break;
                                    case 2:
                                        appendString(" HUGE");
                                        break;

                                    case 3:
                                        appendString(" BIG");
                                        break;

                                }

                            } else if (j == 2) {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            Pogu.setBackground(Color.white);
        }
    }//GEN-LAST:event_PoguActionPerformed

    private void PogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PogActionPerformed
        if (Pog.isSelected()) {

            Pog.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 2;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\Pog.jpg"));
appendString("  ");
                }
                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            Pog.setBackground(Color.white);
        }
    }//GEN-LAST:event_PogActionPerformed

    private void ayayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayayaActionPerformed
               if (ayaya.isSelected()) {

            ayaya.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 8;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\AYAYA.png"));
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 5;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(2) + 1) {
                                    case 1:
                                        appendString("  CUTE");
                                        break;
                                    case 2:
                                        appendString(" ?");
                                        break;

                                  

                                }

                            } else if (j == 2) {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            ayaya.setBackground(Color.white);
        }
    }//GEN-LAST:event_ayayaActionPerformed

    private void PepeJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepeJamActionPerformed
      if (PepeJam.isSelected()) {

            PepeJam.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 4;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\pepejam.gif"));
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(3) + 1) {
                                    case 1:
                                        appendString("  BEST PART");
                                        break;
                                    case 2:
                                        appendString(" JAMMER");
                                        break;

                                    case 3:
                                        appendString(" OH SHIT");
                                        break;

                                }

                            } else if (j == 2) {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            PepeJam.setBackground(Color.white);
        }
    }//GEN-LAST:event_PepeJamActionPerformed

    private void PauseChampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseChampActionPerformed
     if (PauseChamp.isSelected()) {

            PauseChamp.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 2;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\PauseChamp.png"));
                    if (numberimg == 1) {
                        int minqmark = 1;
                        int maxqmark = 2;
                        int numberqmark = (int) (Math.random() * (maxqmark - minqmark + 1) + minqmark);
                        for (int j = 0; j < numberqmark; j++) {
                            if (j == 1) {
                                switch (rand.nextInt(6) + 1) {
                                    case 1:
                                        appendString("  HOLD IT");
                                        break;
                                    case 2:
                                        appendString(" .....");
                                        break;

                                    case 3:
                                        appendString(" ...........");
                                        break;
                                        case 4:
                                        appendString(" ........");
                                        break;
                                         case 5:
                                        appendString(" ...............");
                                        break;
                                         case 6:
                                        appendString(" ....");
                                        break;

                                }

                            } else if (j == 2) {
                                appendString("");
                            }
                        }
                    }
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            PauseChamp.setBackground(Color.white);
        }
    }//GEN-LAST:event_PauseChampActionPerformed

    private void HeadBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeadBangActionPerformed
   if (HeadBang.isSelected()) {

            HeadBang.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 5;
                int maxnumberimg = 10;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\Headbang.gif"));
                   
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            HeadBang.setBackground(Color.white);
        }
    }//GEN-LAST:event_HeadBangActionPerformed

    private void pepegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepegaActionPerformed
        if (pepega.isSelected()) {

            pepega.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();

            try {
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 8;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\pepega.png"));
                   
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            pepega.setBackground(Color.white);
        }
    }//GEN-LAST:event_pepegaActionPerformed

    
    class ValidateThread implements Runnable {
    public void run() {
        validate();
    }
}
     
    private void ventanaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventanaKeyPressed
           if(evt.getKeyCode() == KeyEvent.VK_M){
        EZ.setSelected(rootPaneCheckingEnabled);
          System.out.println("m key pressed");
        
    }else if (evt.getKeyCode() == KeyEvent.VK_N){
        EZ.setSelected(rootPaneCheckingEnabled);
          System.out.println("m key pressed");
    }
    }//GEN-LAST:event_ventanaKeyPressed

    private void EZItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EZItemStateChanged
     

        
         while (EZ.isSelected()) {

             EZ.isSelected();
            EZ.setBackground(Color.red);
            Chat chat = new Chat();
            Random rand = new Random();
            RandomNames generar = new RandomNames();
            String text = generar.Generar();
             try {
                 Thread.sleep(2000);
                 

             } catch (InterruptedException ex) {
                 Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
             }
            try {
                  ventana.update(ventana.getGraphics());
                
                appendString(text + ": ");
                int minnumberimg = 1;
                int maxnumberimg = 8;
                int numberimg = (int) (Math.random() * (maxnumberimg - minnumberimg + 1) + minnumberimg);
                Random random = new Random();
                for (int i = 0; i < numberimg; i++) {
                    ventana.insertIcon(new ImageIcon("C:\\Users\\Tralen\\Documents\\NetBeansProjects\\FakeChat\\src\\LectorDeImagenes\\EZ.jpg"));
                 
                 
                
                    /*if(numberimg==1){
                        appendString( "wtf");
                    }*/

                }

                appendString("\n");

            } catch (BadLocationException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);

            }

        } {
       
            EZ.setBackground(Color.white);
        }
    
              
           
    }//GEN-LAST:event_EZItemStateChanged

 

    
    public void appendString(String str) throws BadLocationException {

        StyledDocument document = (StyledDocument) ventana.getDocument();
        document.insertString(document.getLength(), str, null);
        
      
    }

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton EZ;
    private javax.swing.JToggleButton ForsenCD;
    private javax.swing.JToggleButton GachiHyper;
    private javax.swing.JToggleButton HeadBang;
    private javax.swing.JToggleButton MonkaW;
    private javax.swing.JToggleButton OMEGALUL;
    private javax.swing.JToggleButton PauseChamp;
    private javax.swing.JToggleButton PepeJam;
    private javax.swing.JToggleButton PepeLaugh;
    private javax.swing.JToggleButton Pog;
    private javax.swing.JToggleButton Pogu;
    private javax.swing.JToggleButton Sadge;
    private javax.swing.JToggleButton TRUELULW;
    private javax.swing.JToggleButton ayaya;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton pepega;
    public javax.swing.JTextPane ventana;
    // End of variables declaration//GEN-END:variables

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
