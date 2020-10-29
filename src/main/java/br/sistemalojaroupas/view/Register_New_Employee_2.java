/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Register_New_Employee_2 extends javax.swing.JDialog {

    /**
     * Creates new form Insert_Employee
     */
    public Register_New_Employee_2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }
    public void limpaCampos() {
    eName.setText("");
    eCPF.setText("");
    eBirthDate.setText("");
    eEmail.setText("");
    ePhone.setText("");
    eCell.setText("");
    eCEP.setText("");
    eNeighborhood.setText("");
    eAddress.setText("");
    eComplement.setText("");
    eState.setText("");
    eCity.setText("");
    eOccupation.setText("");
    eAdmissionDate.setText("");
    eSalary.setText("");
    eNumber.setText("");
    this.eAccessLevel.setSelectedIndex(0);
    eName.requestFocus();
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnt_save = new javax.swing.JLabel();
        btn_clear = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        eName = new javax.swing.JTextField();
        eEmail = new javax.swing.JTextField();
        eAddress = new javax.swing.JTextField();
        eNeighborhood = new javax.swing.JTextField();
        eCEP = new javax.swing.JTextField();
        eCity = new javax.swing.JTextField();
        eCPF = new javax.swing.JFormattedTextField();
        eBirthDate = new javax.swing.JFormattedTextField();
        ePhone = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        eCell = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        eState = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        eComplement = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        eNumber = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        eOccupation = new javax.swing.JTextField();
        eAccessLevel = new javax.swing.JComboBox<>();
        eAdmissionDate = new javax.swing.JFormattedTextField();
        eSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(573, 551));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png"))); // NOI18N
        bnt_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnt_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bnt_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bnt_saveMouseExited(evt);
            }
        });
        getContentPane().add(bnt_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, 30));

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limparClaro.png"))); // NOI18N
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clearMouseExited(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelarClaro.png"))); // NOI18N
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 610, 40));

        jPanel12.setBackground(new java.awt.Color(0, 0, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS PESSOAIS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(108, 81, 233))); // NOI18N
        jPanel12.setToolTipText("");
        jPanel12.setMaximumSize(new java.awt.Dimension(571, 300));
        jPanel12.setMinimumSize(new java.awt.Dimension(571, 300));
        jPanel12.setName("jdhdd"); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(59, 44, 150));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Nome:");
        jLabel22.setOpaque(true);
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jLabel23.setBackground(new java.awt.Color(59, 44, 150));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF:");
        jLabel23.setOpaque(true);
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 80, 30));

        jLabel24.setBackground(new java.awt.Color(59, 44, 150));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Data Nasc.:");
        jLabel24.setOpaque(true);
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 80, 30));

        jLabel25.setBackground(new java.awt.Color(59, 44, 150));
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tel.:");
        jLabel25.setOpaque(true);
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        jLabel26.setBackground(new java.awt.Color(59, 44, 150));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("E-mail:");
        jLabel26.setOpaque(true);
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel27.setBackground(new java.awt.Color(59, 44, 150));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Logradouro:");
        jLabel27.setOpaque(true);
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 30));

        jLabel28.setBackground(new java.awt.Color(59, 44, 150));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Bairro:");
        jLabel28.setOpaque(true);
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 80, 30));

        jLabel29.setBackground(new java.awt.Color(59, 44, 150));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CEP:");
        jLabel29.setOpaque(true);
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 30));

        jLabel30.setBackground(new java.awt.Color(59, 44, 150));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Cidade:");
        jLabel30.setOpaque(true);
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 70, 30));

        eName.setBackground(new java.awt.Color(204, 204, 204));
        eName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eName.setForeground(new java.awt.Color(255, 255, 255));
        eName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eName.setCaretColor(new java.awt.Color(255, 255, 255));
        eName.setOpaque(false);
        jPanel12.add(eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 270, 30));

        eEmail.setBackground(new java.awt.Color(204, 204, 204));
        eEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eEmail.setForeground(new java.awt.Color(255, 255, 255));
        eEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        eEmail.setOpaque(false);
        eEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eEmailActionPerformed(evt);
            }
        });
        jPanel12.add(eEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, 30));

        eAddress.setBackground(new java.awt.Color(204, 204, 204));
        eAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eAddress.setForeground(new java.awt.Color(255, 255, 255));
        eAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        eAddress.setOpaque(false);
        jPanel12.add(eAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, 30));

        eNeighborhood.setBackground(new java.awt.Color(204, 204, 204));
        eNeighborhood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNeighborhood.setForeground(new java.awt.Color(255, 255, 255));
        eNeighborhood.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eNeighborhood.setCaretColor(new java.awt.Color(255, 255, 255));
        eNeighborhood.setOpaque(false);
        jPanel12.add(eNeighborhood, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 30));

        eCEP.setBackground(new java.awt.Color(59, 44, 150));
        eCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCEP.setForeground(new java.awt.Color(255, 255, 255));
        eCEP.setText("29090100");
        eCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCEP.setCaretColor(new java.awt.Color(255, 255, 255));
        eCEP.setOpaque(false);
        jPanel12.add(eCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 100, 30));

        eCity.setBackground(new java.awt.Color(204, 204, 204));
        eCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCity.setForeground(new java.awt.Color(255, 255, 255));
        eCity.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCity.setCaretColor(new java.awt.Color(255, 255, 255));
        eCity.setOpaque(false);
        jPanel12.add(eCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, 30));

        eCPF.setBackground(new java.awt.Color(204, 204, 204));
        eCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            eCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eCPF.setCaretColor(new java.awt.Color(255, 255, 255));
        eCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCPF.setOpaque(false);
        jPanel12.add(eCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, 30));

        eBirthDate.setBackground(new java.awt.Color(204, 204, 204));
        eBirthDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        try {
            eBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eBirthDate.setCaretColor(new java.awt.Color(255, 255, 255));
        eBirthDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eBirthDate.setOpaque(false);
        eBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBirthDateActionPerformed(evt);
            }
        });
        jPanel12.add(eBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 100, 30));

        ePhone.setBackground(new java.awt.Color(204, 204, 204));
        ePhone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        ePhone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ePhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ePhone.setCaretColor(new java.awt.Color(255, 255, 255));
        ePhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ePhone.setOpaque(false);
        jPanel12.add(ePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 30));

        jLabel31.setBackground(new java.awt.Color(59, 44, 150));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Celular:");
        jLabel31.setOpaque(true);
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, 30));

        eCell.setBackground(new java.awt.Color(204, 204, 204));
        eCell.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eCell.setForeground(new java.awt.Color(255, 255, 255));
        try {
            eCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eCell.setCaretColor(new java.awt.Color(255, 255, 255));
        eCell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCell.setOpaque(false);
        jPanel12.add(eCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, 30));

        jLabel32.setBackground(new java.awt.Color(59, 44, 150));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("UF:");
        jLabel32.setOpaque(true);
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        eState.setBackground(new java.awt.Color(204, 204, 204));
        eState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eState.setForeground(new java.awt.Color(255, 255, 255));
        eState.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eState.setCaretColor(new java.awt.Color(255, 255, 255));
        eState.setOpaque(false);
        jPanel12.add(eState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 30));

        jLabel33.setBackground(new java.awt.Color(59, 44, 150));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Comp.:");
        jLabel33.setOpaque(true);
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 30));

        eComplement.setBackground(new java.awt.Color(204, 204, 204));
        eComplement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eComplement.setForeground(new java.awt.Color(255, 255, 255));
        eComplement.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eComplement.setCaretColor(new java.awt.Color(255, 255, 255));
        eComplement.setOpaque(false);
        jPanel12.add(eComplement, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 100, 30));

        jLabel34.setBackground(new java.awt.Color(59, 44, 150));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("N°:");
        jLabel34.setOpaque(true);
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 30, 30));

        eNumber.setBackground(new java.awt.Color(204, 204, 204));
        eNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNumber.setForeground(new java.awt.Color(255, 255, 255));
        eNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        eNumber.setOpaque(false);
        jPanel12.add(eNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 60, 30));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 580, 300));

        jPanel13.setBackground(new java.awt.Color(0, 0, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS FUNCIONAIS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(108, 81, 233))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(108, 81, 233));
        jPanel13.setMaximumSize(new java.awt.Dimension(571, 210));
        jPanel13.setMinimumSize(new java.awt.Dimension(571, 210));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(59, 44, 150));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Cargo:");
        jLabel35.setOpaque(true);
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        jLabel36.setBackground(new java.awt.Color(59, 44, 150));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Data de admissão:");
        jLabel36.setOpaque(true);
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

        jLabel37.setBackground(new java.awt.Color(59, 44, 150));
        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Salário:");
        jLabel37.setOpaque(true);
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 30));

        jLabel38.setBackground(new java.awt.Color(59, 44, 150));
        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Acesso:");
        jLabel38.setOpaque(true);
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 70, 30));

        eOccupation.setBackground(new java.awt.Color(204, 204, 204));
        eOccupation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eOccupation.setForeground(new java.awt.Color(255, 255, 255));
        eOccupation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eOccupation.setCaretColor(new java.awt.Color(255, 255, 255));
        eOccupation.setOpaque(false);
        jPanel13.add(eOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));

        eAccessLevel.setBackground(new java.awt.Color(108, 81, 233));
        eAccessLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eAccessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione nível", "Nível 1", "Nível 2", "Nível 3" }));
        eAccessLevel.setBorder(null);
        jPanel13.add(eAccessLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 160, 30));

        eAdmissionDate.setBackground(new java.awt.Color(204, 204, 204));
        eAdmissionDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eAdmissionDate.setForeground(new java.awt.Color(255, 255, 255));
        try {
            eAdmissionDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eAdmissionDate.setCaretColor(new java.awt.Color(255, 255, 255));
        eAdmissionDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eAdmissionDate.setOpaque(false);
        jPanel13.add(eAdmissionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));

        eSalary.setBackground(new java.awt.Color(204, 204, 204));
        eSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eSalary.setForeground(new java.awt.Color(255, 255, 255));
        eSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(108, 81, 233)));
        eSalary.setCaretColor(new java.awt.Color(255, 255, 255));
        eSalary.setOpaque(false);
        jPanel13.add(eSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 30));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 580, 138));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela_cadastro_funcionario_dark.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 632, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eBirthDateActionPerformed

    private void eEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eEmailActionPerformed

    private void bnt_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseClicked
       
    }//GEN-LAST:event_bnt_saveMouseClicked

    private void bnt_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseEntered
        // Trocar para ícone escuro
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar.png")));
    }//GEN-LAST:event_bnt_saveMouseEntered

    private void bnt_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_saveMouseExited
        // Voltar para ícone original
        bnt_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvarClaro.png")));
    }//GEN-LAST:event_bnt_saveMouseExited

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        // Limpar todos os campos (criar método depois)
       
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseEntered
        // Trocar para ícone escuro
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limpar.png")));
    }//GEN-LAST:event_btn_clearMouseEntered

    private void btn_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseExited
        // Voltar para ícone original
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limparClaro.png")));
    }//GEN-LAST:event_btn_clearMouseExited

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
        // Trocar para ícone escuro
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelar.png")));
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        // Voltar para ícone original
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelarClaro.png")));
    }//GEN-LAST:event_btn_cancelMouseExited
      
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register_New_Employee_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_New_Employee_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_New_Employee_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_New_Employee_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register_New_Employee_2 dialog = new Register_New_Employee_2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnt_save;
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_clear;
    private javax.swing.JComboBox<String> eAccessLevel;
    private javax.swing.JTextField eAddress;
    private javax.swing.JFormattedTextField eAdmissionDate;
    private javax.swing.JFormattedTextField eBirthDate;
    private javax.swing.JTextField eCEP;
    private javax.swing.JFormattedTextField eCPF;
    private javax.swing.JFormattedTextField eCell;
    private javax.swing.JTextField eCity;
    private javax.swing.JTextField eComplement;
    private javax.swing.JTextField eEmail;
    private javax.swing.JTextField eName;
    private javax.swing.JTextField eNeighborhood;
    private javax.swing.JTextField eNumber;
    private javax.swing.JTextField eOccupation;
    private javax.swing.JFormattedTextField ePhone;
    private javax.swing.JTextField eSalary;
    private javax.swing.JTextField eState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    // End of variables declaration//GEN-END:variables
}