//Program Kalkulator Dasar DDP
//{...........................}

/**
 *
 * @author Lenovo
 */
//Main Class
public class Kalkulato extends javax.swing.JFrame {
    
    //Deklarasi Variabel
    String angka;
    double total, angka1, angka2;
    int pilih;
    public Kalkulato() {
        initComponents();
        angka="";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        display = new javax.swing.JTextField();
        aotHapus = new javax.swing.JButton();
        aotAngka1 = new javax.swing.JButton();
        aotAngka4 = new javax.swing.JButton();
        aotAngka7 = new javax.swing.JButton();
        aotAngka0 = new javax.swing.JButton();
        aotPlusMin = new javax.swing.JButton();
        aotAngka2 = new javax.swing.JButton();
        aotAngka5 = new javax.swing.JButton();
        aotAngka8 = new javax.swing.JButton();
        aotAngka9 = new javax.swing.JButton();
        aotAngka6 = new javax.swing.JButton();
        aotAngka3 = new javax.swing.JButton();
        aotPersen = new javax.swing.JButton();
        aotBagi = new javax.swing.JButton();
        aotKali = new javax.swing.JButton();
        aotKurang = new javax.swing.JButton();
        aotPlus = new javax.swing.JButton();
        aotSamaDengan = new javax.swing.JButton();
        aotKoma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        aotHapus.setText("C");
        aotHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotHapusActionPerformed(evt);
            }
        });

        aotAngka1.setText("7");
        aotAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka1ActionPerformed(evt);
            }
        });

        aotAngka4.setText("4");
        aotAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka4ActionPerformed(evt);
            }
        });

        aotAngka7.setText("1");
        aotAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka7ActionPerformed(evt);
            }
        });

        aotAngka0.setText("0");
        aotAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka0ActionPerformed(evt);
            }
        });

        aotPlusMin.setText("+/-");
        aotPlusMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotPlusMinActionPerformed(evt);
            }
        });

        aotAngka2.setText("8");
        aotAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka2ActionPerformed(evt);
            }
        });

        aotAngka5.setText("5");
        aotAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka5ActionPerformed(evt);
            }
        });

        aotAngka8.setText("2");
        aotAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka8ActionPerformed(evt);
            }
        });

        aotAngka9.setText("3");
        aotAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka9ActionPerformed(evt);
            }
        });

        aotAngka6.setText("6");
        aotAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka6ActionPerformed(evt);
            }
        });

        aotAngka3.setText("9");
        aotAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotAngka3ActionPerformed(evt);
            }
        });

        aotPersen.setText("%");
        aotPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotPersenActionPerformed(evt);
            }
        });

        aotBagi.setText("/");
        aotBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotBagiActionPerformed(evt);
            }
        });

        aotKali.setText("*");
        aotKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotKaliActionPerformed(evt);
            }
        });

        aotKurang.setText("-");
        aotKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotKurangActionPerformed(evt);
            }
        });

        aotPlus.setText("+");
        aotPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotPlusActionPerformed(evt);
            }
        });

        aotSamaDengan.setText("=");
        aotSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotSamaDenganActionPerformed(evt);
            }
        });

        aotKoma.setText(",");
        aotKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aotKomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(aotHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotPlusMin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(aotAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotKali, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(aotAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aotKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aotAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aotAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aotAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aotAngka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aotKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aotSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(display)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aotHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotPlusMin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aotAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotKali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aotAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aotAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aotAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aotKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>                        

    private void aotAngka6ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        angka +="6";
        display.setText (angka);
    }                                         

    private void aotAngka9ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        angka +="3";
        display.setText (angka);
    }                                         

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void aotHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        display.setText("");
        angka1=0;
        angka2=0;
        total=0;
        angka="";
        
    }                                        

    private void aotKomaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        angka +=".";
        display.setText (angka);
    }                                       

    private void aotAngka0ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        angka +="0";
        display.setText (angka);
    }                                         

    private void aotAngka7ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        angka +="1";
        display.setText (angka);
    }                                         

    private void aotAngka8ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="2";
         display.setText (angka);
    }                                         

    private void aotAngka4ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="4";
         display.setText (angka);
    }                                         

    private void aotAngka5ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="5";
         display.setText (angka);
    }                                         

    private void aotAngka1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="7";
         display.setText (angka);
    }                                         

    private void aotAngka2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="8";
         display.setText (angka);
    }                                         

    private void aotAngka3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka +="9";
         display.setText (angka);
    }                                         

    private void aotPlusActionPerformed(java.awt.event.ActionEvent evt) {                                        
         angka1=Double.parseDouble(angka);
         display.setText("+");
         angka="";
         pilih=1;
    }                                       

    private void aotKurangActionPerformed(java.awt.event.ActionEvent evt) {                                          
         angka1=Double.parseDouble(angka);
         display.setText("-");
         angka="";
         pilih=2;
    }                                         

    private void aotKaliActionPerformed(java.awt.event.ActionEvent evt) {                                        
         angka1=Double.parseDouble(angka);
         display.setText("*");
         angka="";
         pilih=3;
    }                                       

    private void aotBagiActionPerformed(java.awt.event.ActionEvent evt) {                                        
         angka1=Double.parseDouble(angka);
         display.setText("+");
         angka="";
         pilih=4;
    }                                       

    private void aotPersenActionPerformed(java.awt.event.ActionEvent evt) {                                          
        angka2=Double.parseDouble(angka);
        total=angka2/100;
        angka=Double.toString(total);
        display.setText(angka);
    }                                         

    private void aotPlusMinActionPerformed(java.awt.event.ActionEvent evt) {                                           
        angka2=Double.parseDouble(angka);
        total=0-angka2;
        angka=Double.toString(total);
        display.setText(angka);
    }                                          

    private void aotSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {                                              
        switch(pilih){
            case 1:
                angka2=Double.parseDouble(angka);
                total=angka1+angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 2:
                angka2=Double.parseDouble(angka);
                total=angka1-angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 3:
                angka2=Double.parseDouble(angka);
                total=angka1*angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
            case 4:
                angka2=Double.parseDouble(angka);
                total=angka1/angka2;
                angka=Double.toString(total);
                display.setText(angka);
                break;
        }
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalkulato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulato().setVisible(true);
            }
        });
    }

    // Variabel Deklarasi                     
    private javax.swing.JButton aotAngka0;
    private javax.swing.JButton aotAngka1;
    private javax.swing.JButton aotAngka2;
    private javax.swing.JButton aotAngka3;
    private javax.swing.JButton aotAngka4;
    private javax.swing.JButton aotAngka5;
    private javax.swing.JButton aotAngka6;
    private javax.swing.JButton aotAngka7;
    private javax.swing.JButton aotAngka8;
    private javax.swing.JButton aotAngka9;
    private javax.swing.JButton aotBagi;
    private javax.swing.JButton aotHapus;
    private javax.swing.JButton aotKali;
    private javax.swing.JButton aotKoma;
    private javax.swing.JButton aotKurang;
    private javax.swing.JButton aotPersen;
    private javax.swing.JButton aotPlus;
    private javax.swing.JButton aotPlusMin;
    private javax.swing.JButton aotSamaDengan;
    private javax.swing.JTextField display;                  

}