package org.mmatas1300;
public class App extends javax.swing.JFrame {
    int xMouse, yMouse;
    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArtikelbuttonGroup = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        FemNomenRB = new javax.swing.JRadioButton();
        MaskNomenRB = new javax.swing.JRadioButton();
        NeuNomenRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        wortTF = new javax.swing.JTextField();
        plTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        verwandteTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        beispielTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bildTF = new javax.swing.JTextField();
        schickenBtn = new javax.swing.JButton();
        PlNomenRB = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        wortMFTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mannerTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        frauTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        frauenTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        verwandteMFTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        beispielMFTF = new javax.swing.JTextField();
        bildMFTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        schickenMFBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        wortVTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        zeitformenTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ppronomen1TF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ppronomen2TF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ppronomen3TF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ppronomen4TF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ppronomen5TF = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ppronomen6TF = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        beispielVTF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        bildVTF = new javax.swing.JTextField();
        schickenVBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bildAWTF = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        beispielAWTF = new javax.swing.JTextField();
        verwandteAWTF = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        typAWTF = new javax.swing.JTextField();
        schickenAWBtn = new javax.swing.JButton();
        wortAWTF = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(33, 33, 33));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 174, 0));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(33, 33, 33));
        jLabel1.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("die Wortschatzkartei");
        jLabel1.setToolTipText("");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        jTabbedPane5.setBackground(new java.awt.Color(33, 33, 33));
        jTabbedPane5.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setToolTipText("");
        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane5.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jTabbedPane5.setName(""); // NOI18N

        jPanel4.setBackground(new java.awt.Color(33, 33, 33));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        FemNomenRB.setBackground(new java.awt.Color(33, 33, 33));
        ArtikelbuttonGroup.add(FemNomenRB);
        FemNomenRB.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        FemNomenRB.setForeground(new java.awt.Color(184, 44, 80));
        FemNomenRB.setText("Feminin Nomen");
        FemNomenRB.setBorder(null);
        FemNomenRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FemNomenRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemNomenRBActionPerformed(evt);
            }
        });

        MaskNomenRB.setBackground(new java.awt.Color(33, 33, 33));
        ArtikelbuttonGroup.add(MaskNomenRB);
        MaskNomenRB.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        MaskNomenRB.setForeground(new java.awt.Color(0, 120, 163));
        MaskNomenRB.setText("Maskulim Nomen");
        MaskNomenRB.setBorder(null);
        MaskNomenRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaskNomenRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaskNomenRBActionPerformed(evt);
            }
        });

        NeuNomenRB.setBackground(new java.awt.Color(33, 33, 33));
        ArtikelbuttonGroup.add(NeuNomenRB);
        NeuNomenRB.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        NeuNomenRB.setForeground(new java.awt.Color(77, 172, 43));
        NeuNomenRB.setText("Neutrum Nomen");
        NeuNomenRB.setBorder(null);
        NeuNomenRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setBackground(new java.awt.Color(33, 33, 33));
        jLabel2.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Plural:");

        wortTF.setBackground(new java.awt.Color(44, 44, 44));
        wortTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        wortTF.setForeground(new java.awt.Color(255, 255, 255));
        wortTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wortTF.setBorder(null);
        wortTF.setCaretColor(new java.awt.Color(255, 255, 255));
        wortTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        plTF.setBackground(new java.awt.Color(44, 44, 44));
        plTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        plTF.setForeground(new java.awt.Color(255, 255, 255));
        plTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plTF.setBorder(null);
        plTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel3.setBackground(new java.awt.Color(33, 33, 33));
        jLabel3.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Wort:");

        jLabel4.setBackground(new java.awt.Color(33, 33, 33));
        jLabel4.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Verwandte:");

        verwandteTF.setBackground(new java.awt.Color(44, 44, 44));
        verwandteTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        verwandteTF.setForeground(new java.awt.Color(255, 255, 255));
        verwandteTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        verwandteTF.setBorder(null);
        verwandteTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel5.setBackground(new java.awt.Color(33, 33, 33));
        jLabel5.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Beispiel:");

        beispielTF.setBackground(new java.awt.Color(44, 44, 44));
        beispielTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        beispielTF.setForeground(new java.awt.Color(255, 255, 255));
        beispielTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beispielTF.setBorder(null);
        beispielTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel6.setBackground(new java.awt.Color(33, 33, 33));
        jLabel6.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bild:");

        bildTF.setBackground(new java.awt.Color(44, 44, 44));
        bildTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        bildTF.setForeground(new java.awt.Color(255, 255, 255));
        bildTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bildTF.setBorder(null);
        bildTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        schickenBtn.setBackground(new java.awt.Color(55, 55, 55));
        schickenBtn.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        schickenBtn.setForeground(new java.awt.Color(255, 255, 255));
        schickenBtn.setText("Schicken");
        schickenBtn.setBorder(null);
        schickenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schickenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schickenBtnMouseClicked(evt);
            }
        });

        PlNomenRB.setBackground(new java.awt.Color(33, 33, 33));
        ArtikelbuttonGroup.add(PlNomenRB);
        PlNomenRB.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        PlNomenRB.setForeground(new java.awt.Color(227, 200, 23));
        PlNomenRB.setText("Plural Nomen");
        PlNomenRB.setBorder(null);
        PlNomenRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(MaskNomenRB)
                .addGap(34, 34, 34)
                .addComponent(FemNomenRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(NeuNomenRB)
                .addGap(34, 34, 34)
                .addComponent(PlNomenRB)
                .addGap(70, 70, 70))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(schickenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plTF)
                            .addComponent(wortTF)
                            .addComponent(verwandteTF)
                            .addComponent(beispielTF)
                            .addComponent(bildTF, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaskNomenRB)
                    .addComponent(FemNomenRB)
                    .addComponent(NeuNomenRB)
                    .addComponent(PlNomenRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verwandteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beispielTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bildTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(schickenBtn)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Nomen", jPanel4);

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));

        wortMFTF.setBackground(new java.awt.Color(44, 44, 44));
        wortMFTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        wortMFTF.setForeground(new java.awt.Color(255, 255, 255));
        wortMFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wortMFTF.setBorder(null);
        wortMFTF.setCaretColor(new java.awt.Color(255, 255, 255));
        wortMFTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel8.setBackground(new java.awt.Color(33, 33, 33));
        jLabel8.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Wort:");

        jLabel9.setBackground(new java.awt.Color(33, 33, 33));
        jLabel9.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manner:");

        mannerTF.setBackground(new java.awt.Color(44, 44, 44));
        mannerTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        mannerTF.setForeground(new java.awt.Color(255, 255, 255));
        mannerTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mannerTF.setBorder(null);
        mannerTF.setCaretColor(new java.awt.Color(255, 255, 255));
        mannerTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel10.setBackground(new java.awt.Color(33, 33, 33));
        jLabel10.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Frau:");

        frauTF.setBackground(new java.awt.Color(44, 44, 44));
        frauTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        frauTF.setForeground(new java.awt.Color(255, 255, 255));
        frauTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frauTF.setBorder(null);
        frauTF.setCaretColor(new java.awt.Color(255, 255, 255));
        frauTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel11.setBackground(new java.awt.Color(33, 33, 33));
        jLabel11.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Frauen:");

        frauenTF.setBackground(new java.awt.Color(44, 44, 44));
        frauenTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        frauenTF.setForeground(new java.awt.Color(255, 255, 255));
        frauenTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frauenTF.setBorder(null);
        frauenTF.setCaretColor(new java.awt.Color(255, 255, 255));
        frauenTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel12.setBackground(new java.awt.Color(33, 33, 33));
        jLabel12.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Verwandte:");

        verwandteMFTF.setBackground(new java.awt.Color(44, 44, 44));
        verwandteMFTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        verwandteMFTF.setForeground(new java.awt.Color(255, 255, 255));
        verwandteMFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        verwandteMFTF.setBorder(null);
        verwandteMFTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel13.setBackground(new java.awt.Color(33, 33, 33));
        jLabel13.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Beispiel:");

        beispielMFTF.setBackground(new java.awt.Color(44, 44, 44));
        beispielMFTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        beispielMFTF.setForeground(new java.awt.Color(255, 255, 255));
        beispielMFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beispielMFTF.setBorder(null);
        beispielMFTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        bildMFTF.setBackground(new java.awt.Color(44, 44, 44));
        bildMFTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        bildMFTF.setForeground(new java.awt.Color(255, 255, 255));
        bildMFTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bildMFTF.setBorder(null);
        bildMFTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel14.setBackground(new java.awt.Color(33, 33, 33));
        jLabel14.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bild:");

        schickenMFBtn.setBackground(new java.awt.Color(55, 55, 55));
        schickenMFBtn.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        schickenMFBtn.setForeground(new java.awt.Color(255, 255, 255));
        schickenMFBtn.setText("Schicken");
        schickenMFBtn.setBorder(null);
        schickenMFBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schickenMFBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schickenMFBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(schickenMFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(beispielMFTF)
                                    .addComponent(bildMFTF, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wortMFTF, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(mannerTF)
                            .addComponent(frauTF)
                            .addComponent(frauenTF)
                            .addComponent(verwandteMFTF))))
                .addGap(195, 195, 195))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wortMFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mannerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(frauTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(frauenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(verwandteMFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beispielMFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bildMFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(schickenMFBtn)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Mann/Frau Nomen", jPanel3);

        jPanel2.setBackground(new java.awt.Color(33, 33, 33));

        wortVTF.setBackground(new java.awt.Color(44, 44, 44));
        wortVTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        wortVTF.setForeground(new java.awt.Color(255, 255, 255));
        wortVTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wortVTF.setBorder(null);
        wortVTF.setCaretColor(new java.awt.Color(255, 255, 255));
        wortVTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel15.setBackground(new java.awt.Color(33, 33, 33));
        jLabel15.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Verbe:");

        jLabel16.setBackground(new java.awt.Color(33, 33, 33));
        jLabel16.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Zeitformen:");

        zeitformenTF.setBackground(new java.awt.Color(44, 44, 44));
        zeitformenTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        zeitformenTF.setForeground(new java.awt.Color(255, 255, 255));
        zeitformenTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zeitformenTF.setBorder(null);
        zeitformenTF.setCaretColor(new java.awt.Color(255, 255, 255));
        zeitformenTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel17.setBackground(new java.awt.Color(33, 33, 33));
        jLabel17.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ich:");

        ppronomen1TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen1TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen1TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen1TF.setBorder(null);
        ppronomen1TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen1TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel18.setBackground(new java.awt.Color(33, 33, 33));
        jLabel18.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Du:");

        ppronomen2TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen2TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen2TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen2TF.setBorder(null);
        ppronomen2TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen2TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel19.setBackground(new java.awt.Color(33, 33, 33));
        jLabel19.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Er/Sie/Es:");

        ppronomen3TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen3TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen3TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen3TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen3TF.setBorder(null);
        ppronomen3TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen3TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel20.setBackground(new java.awt.Color(33, 33, 33));
        jLabel20.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Wir:");

        ppronomen4TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen4TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen4TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen4TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen4TF.setBorder(null);
        ppronomen4TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen4TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel21.setBackground(new java.awt.Color(33, 33, 33));
        jLabel21.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Ihr:");

        ppronomen5TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen5TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen5TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen5TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen5TF.setBorder(null);
        ppronomen5TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen5TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel22.setBackground(new java.awt.Color(33, 33, 33));
        jLabel22.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sie:");

        ppronomen6TF.setBackground(new java.awt.Color(44, 44, 44));
        ppronomen6TF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        ppronomen6TF.setForeground(new java.awt.Color(255, 255, 255));
        ppronomen6TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppronomen6TF.setBorder(null);
        ppronomen6TF.setCaretColor(new java.awt.Color(255, 255, 255));
        ppronomen6TF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel23.setBackground(new java.awt.Color(33, 33, 33));
        jLabel23.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Beispiel:");

        beispielVTF.setBackground(new java.awt.Color(44, 44, 44));
        beispielVTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        beispielVTF.setForeground(new java.awt.Color(255, 255, 255));
        beispielVTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beispielVTF.setBorder(null);
        beispielVTF.setCaretColor(new java.awt.Color(255, 255, 255));
        beispielVTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel24.setBackground(new java.awt.Color(33, 33, 33));
        jLabel24.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Bild:");

        bildVTF.setBackground(new java.awt.Color(44, 44, 44));
        bildVTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        bildVTF.setForeground(new java.awt.Color(255, 255, 255));
        bildVTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bildVTF.setBorder(null);
        bildVTF.setCaretColor(new java.awt.Color(255, 255, 255));
        bildVTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        schickenVBtn.setBackground(new java.awt.Color(55, 55, 55));
        schickenVBtn.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        schickenVBtn.setForeground(new java.awt.Color(255, 255, 255));
        schickenVBtn.setText("Schicken");
        schickenVBtn.setBorder(null);
        schickenVBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schickenVBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schickenVBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(schickenVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ppronomen6TF, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ppronomen5TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                                .addComponent(ppronomen4TF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ppronomen3TF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zeitformenTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ppronomen1TF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ppronomen2TF, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(wortVTF)
                            .addComponent(beispielVTF, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(bildVTF, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))))
                .addGap(195, 195, 195))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wortVTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zeitformenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppronomen6TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beispielVTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(bildVTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schickenVBtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Verbe", jPanel2);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        bildAWTF.setBackground(new java.awt.Color(44, 44, 44));
        bildAWTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        bildAWTF.setForeground(new java.awt.Color(255, 255, 255));
        bildAWTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bildAWTF.setBorder(null);
        bildAWTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel25.setBackground(new java.awt.Color(33, 33, 33));
        jLabel25.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Bild:");

        jLabel26.setBackground(new java.awt.Color(33, 33, 33));
        jLabel26.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Beispiel:");

        beispielAWTF.setBackground(new java.awt.Color(44, 44, 44));
        beispielAWTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        beispielAWTF.setForeground(new java.awt.Color(255, 255, 255));
        beispielAWTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        beispielAWTF.setBorder(null);
        beispielAWTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        verwandteAWTF.setBackground(new java.awt.Color(44, 44, 44));
        verwandteAWTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        verwandteAWTF.setForeground(new java.awt.Color(255, 255, 255));
        verwandteAWTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        verwandteAWTF.setBorder(null);
        verwandteAWTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel27.setBackground(new java.awt.Color(33, 33, 33));
        jLabel27.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Verwandte:");

        jLabel28.setBackground(new java.awt.Color(33, 33, 33));
        jLabel28.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Typ:");

        typAWTF.setBackground(new java.awt.Color(44, 44, 44));
        typAWTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        typAWTF.setForeground(new java.awt.Color(255, 255, 255));
        typAWTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        typAWTF.setBorder(null);
        typAWTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        schickenAWBtn.setBackground(new java.awt.Color(55, 55, 55));
        schickenAWBtn.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        schickenAWBtn.setForeground(new java.awt.Color(255, 255, 255));
        schickenAWBtn.setText("Schicken");
        schickenAWBtn.setBorder(null);
        schickenAWBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schickenAWBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schickenAWBtnMouseClicked(evt);
            }
        });

        wortAWTF.setBackground(new java.awt.Color(44, 44, 44));
        wortAWTF.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        wortAWTF.setForeground(new java.awt.Color(255, 255, 255));
        wortAWTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wortAWTF.setBorder(null);
        wortAWTF.setSelectionColor(new java.awt.Color(255, 174, 0));

        jLabel29.setBackground(new java.awt.Color(33, 33, 33));
        jLabel29.setFont(new java.awt.Font("Baloo Bhaijaan 2 SemiBold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Wort:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bildAWTF, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(beispielAWTF, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(verwandteAWTF, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(wortAWTF, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(typAWTF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(schickenAWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wortAWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typAWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verwandteAWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beispielAWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bildAWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addComponent(schickenAWBtn)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Andere Wort", jPanel1);

        bg.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 840, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FemNomenRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemNomenRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemNomenRBActionPerformed

    private void MaskNomenRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaskNomenRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaskNomenRBActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void schickenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schickenBtnMouseClicked
        RWCard myFile = new RWCard();
        String type = "";
        if(FemNomenRB.isSelected()){
            type = "Nomen-die";
        } else if(MaskNomenRB.isSelected()){
            type = "Nomen-der";   
        } else if(NeuNomenRB.isSelected()){
            type = "Nomen-das";   
        } else if(PlNomenRB.isSelected()){
            type = "Nomen-pl";   
        }
        Nomen1Card myCard = new Nomen1Card(type,wortTF.getText(),plTF.getText(),verwandteTF.getText(),beispielTF.getText(),bildTF.getText());
        myFile.setCard(myCard);
        System.out.println(myCard.toString());
        javax.swing.JOptionPane.showMessageDialog(this,"Datei abgeschickt!");
    }//GEN-LAST:event_schickenBtnMouseClicked

    private void schickenMFBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schickenMFBtnMouseClicked
        RWCard myFile = new RWCard();
        Nomen2Card myCard = new Nomen2Card(wortMFTF.getText(),mannerTF.getText(),frauTF.getText(),frauenTF.getText(),verwandteMFTF.getText(),beispielMFTF.getText(),bildMFTF.getText());
        myFile.setCard(myCard);
        System.out.println(myCard.toString());
        javax.swing.JOptionPane.showMessageDialog(this,"Datei abgeschickt!");
    }//GEN-LAST:event_schickenMFBtnMouseClicked

    private void schickenVBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schickenVBtnMouseClicked
        RWCard myFile = new RWCard();
        VerbeCard myCard = new VerbeCard(wortVTF.getText(),zeitformenTF.getText(),ppronomen1TF.getText(),ppronomen2TF.getText(),ppronomen3TF.getText(),ppronomen4TF.getText(),ppronomen5TF.getText(),ppronomen6TF.getText(),beispielVTF.getText(),bildVTF.getText());
        myFile.setCard(myCard);
        System.out.println(myCard.toString());
        javax.swing.JOptionPane.showMessageDialog(this,"Datei abgeschickt!");
    }//GEN-LAST:event_schickenVBtnMouseClicked

    private void schickenAWBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schickenAWBtnMouseClicked
        RWCard myFile = new RWCard();
        AndereWortCard myCard = new AndereWortCard(wortAWTF.getText(),typAWTF.getText(),verwandteAWTF.getText(),beispielAWTF.getText(),bildAWTF.getText());
        myFile.setCard(myCard);
        System.out.println(myCard.toString());
        javax.swing.JOptionPane.showMessageDialog(this,"Datei abgeschickt!");
    }//GEN-LAST:event_schickenAWBtnMouseClicked

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
        
        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ArtikelbuttonGroup;
    private javax.swing.JRadioButton FemNomenRB;
    private javax.swing.JRadioButton MaskNomenRB;
    private javax.swing.JRadioButton NeuNomenRB;
    private javax.swing.JRadioButton PlNomenRB;
    private javax.swing.JTextField beispielAWTF;
    private javax.swing.JTextField beispielMFTF;
    private javax.swing.JTextField beispielTF;
    private javax.swing.JTextField beispielVTF;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField bildAWTF;
    private javax.swing.JTextField bildMFTF;
    private javax.swing.JTextField bildTF;
    private javax.swing.JTextField bildVTF;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JTextField frauTF;
    private javax.swing.JTextField frauenTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField mannerTF;
    private javax.swing.JTextField plTF;
    private javax.swing.JTextField ppronomen1TF;
    private javax.swing.JTextField ppronomen2TF;
    private javax.swing.JTextField ppronomen3TF;
    private javax.swing.JTextField ppronomen4TF;
    private javax.swing.JTextField ppronomen5TF;
    private javax.swing.JTextField ppronomen6TF;
    private javax.swing.JButton schickenAWBtn;
    private javax.swing.JButton schickenBtn;
    private javax.swing.JButton schickenMFBtn;
    private javax.swing.JButton schickenVBtn;
    private javax.swing.JTextField typAWTF;
    private javax.swing.JTextField verwandteAWTF;
    private javax.swing.JTextField verwandteMFTF;
    private javax.swing.JTextField verwandteTF;
    private javax.swing.JTextField wortAWTF;
    private javax.swing.JTextField wortMFTF;
    private javax.swing.JTextField wortTF;
    private javax.swing.JTextField wortVTF;
    private javax.swing.JTextField zeitformenTF;
    // End of variables declaration//GEN-END:variables
}