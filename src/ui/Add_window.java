/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.UI;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author MarkLester
 */
public class Add_window extends javax.swing.JFrame implements UI {

    /**
     * Creates new form Add_window
     */
    public Add_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NI13 = new javax.swing.JLabel();
        NI11 = new javax.swing.JLabel();
        NI4 = new javax.swing.JLabel();
        NI3 = new javax.swing.JLabel();
        NI5 = new javax.swing.JLabel();
        NI9 = new javax.swing.JLabel();
        DescriptionBoxScroll = new javax.swing.JScrollPane();
        DescriptionBox = new javax.swing.JTextArea();
        TaskTitle = new javax.swing.JTextField();
        NI14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JPanel();
        NI12 = new javax.swing.JLabel();
        StartMonth = new javax.swing.JSpinner();
        StartDay = new javax.swing.JSpinner();
        StartYear = new javax.swing.JSpinner();
        StartHour = new javax.swing.JSpinner();
        StartMeridian = new javax.swing.JSpinner();
        NI2 = new javax.swing.JLabel();
        NI1 = new javax.swing.JLabel();
        NI16 = new javax.swing.JLabel();
        StartMinutes = new javax.swing.JSpinner();
        NI15 = new javax.swing.JLabel();
        NI8 = new javax.swing.JLabel();
        NI7 = new javax.swing.JLabel();
        NI6 = new javax.swing.JLabel();
        EndYear = new javax.swing.JSpinner();
        EndDay = new javax.swing.JSpinner();
        EndMonth = new javax.swing.JSpinner();
        EndHour = new javax.swing.JSpinner();
        NI17 = new javax.swing.JLabel();
        EndMinutes = new javax.swing.JSpinner();
        EndMeridian = new javax.swing.JSpinner();
        NI10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        NI13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI13.setText("Title:");
        NI13.setName("NI13"); // NOI18N

        NI11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI11.setText("Description:");
        NI11.setName("NI11"); // NOI18N

        NI4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI4.setText("DAY");
        NI4.setName("NI4"); // NOI18N

        NI3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI3.setText("MONTH");
        NI3.setName("NI3"); // NOI18N

        NI5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI5.setText("YEAR");
        NI5.setName("NI5"); // NOI18N

        NI9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI9.setText("TIME:");
        NI9.setName("NI9"); // NOI18N

        DescriptionBoxScroll.setName("DescriptionBoxScroll"); // NOI18N

        DescriptionBox.setColumns(20);
        DescriptionBox.setRows(5);
        DescriptionBox.setName("DescriptionBox"); // NOI18N
        DescriptionBoxScroll.setViewportView(DescriptionBox);

        TaskTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TaskTitle.setName("TaskTitle"); // NOI18N

        NI14.setBackground(new java.awt.Color(153, 0, 102));
        NI14.setName("NI14"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add new task");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout NI14Layout = new javax.swing.GroupLayout(NI14);
        NI14.setLayout(NI14Layout);
        NI14Layout.setHorizontalGroup(
            NI14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NI14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NI14Layout.setVerticalGroup(
            NI14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NI14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        SaveButton.setBackground(new java.awt.Color(204, 204, 204));
        SaveButton.setForeground(new java.awt.Color(204, 255, 204));
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.setName("SaveButton"); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
        });

        NI12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NI12.setText("Save");
        NI12.setName("NI12"); // NOI18N
        NI12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NI12FocusGained(evt);
            }
        });

        javax.swing.GroupLayout SaveButtonLayout = new javax.swing.GroupLayout(SaveButton);
        SaveButton.setLayout(SaveButtonLayout);
        SaveButtonLayout.setHorizontalGroup(
            SaveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveButtonLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(NI12)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        SaveButtonLayout.setVerticalGroup(
            SaveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NI12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        StartMonth.setName("StartMonth"); // NOI18N

        StartDay.setName("StartDay"); // NOI18N

        StartYear.setName("StartYear"); // NOI18N

        StartHour.setName("StartHour"); // NOI18N

        StartMeridian.setName("StartMeridian"); // NOI18N

        NI2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NI2.setText("END");
        NI2.setName("NI2"); // NOI18N

        NI1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NI1.setText("START");
        NI1.setName("NI1"); // NOI18N

        NI16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
        NI16.setName("NI16"); // NOI18N

        StartMinutes.setName("StartMinutes"); // NOI18N

        NI15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI15.setText(":");
        NI15.setName("NI15"); // NOI18N

        NI8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI8.setText("YEAR");
        NI8.setName("NI8"); // NOI18N

        NI7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI7.setText("DAY");
        NI7.setName("NI7"); // NOI18N

        NI6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI6.setText("MONTH");
        NI6.setName("NI6"); // NOI18N

        EndYear.setName("EndYear"); // NOI18N

        EndDay.setName("EndDay"); // NOI18N

        EndMonth.setName("EndMonth"); // NOI18N

        EndHour.setName("EndHour"); // NOI18N

        NI17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NI17.setText(":");
        NI17.setName("NI17"); // NOI18N

        EndMinutes.setName("EndMinutes"); // NOI18N

        EndMeridian.setName("EndMeridian"); // NOI18N

        NI10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NI10.setText("TIME:");
        NI10.setName("NI10"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NI14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NI13)
                        .addGap(70, 70, 70)
                        .addComponent(TaskTitle))
                    .addComponent(DescriptionBoxScroll)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(NI1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NI2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NI3)
                                .addGap(63, 63, 63)
                                .addComponent(NI4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NI9)
                                        .addGap(18, 18, 18)
                                        .addComponent(StartHour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(StartMonth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NI15, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StartMinutes)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NI5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NI6)
                                .addGap(57, 57, 57)
                                .addComponent(NI7)
                                .addGap(48, 48, 48)
                                .addComponent(NI8)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartMeridian, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NI16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(NI10)
                                        .addGap(18, 18, 18)
                                        .addComponent(EndHour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NI17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(EndMonth)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(EndMinutes))
                                    .addComponent(EndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EndYear, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(EndMeridian)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NI11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NI14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NI13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NI1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NI2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NI5)
                    .addComponent(NI4)
                    .addComponent(NI3)
                    .addComponent(NI8)
                    .addComponent(NI7)
                    .addComponent(NI6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NI17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NI9)
                                    .addComponent(StartHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartMeridian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NI15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NI10)
                                        .addComponent(EndHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EndMeridian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EndMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(NI16)
                            .addGap(33, 33, 33))))
                .addComponent(NI11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DescriptionBoxScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NI12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NI12FocusGained

    }//GEN-LAST:event_NI12FocusGained

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked

    }//GEN-LAST:event_SaveButtonMouseClicked

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered
        
    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        
    }//GEN-LAST:event_SaveButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionBox;
    private javax.swing.JScrollPane DescriptionBoxScroll;
    private javax.swing.JSpinner EndDay;
    private javax.swing.JSpinner EndHour;
    private javax.swing.JSpinner EndMeridian;
    private javax.swing.JSpinner EndMinutes;
    private javax.swing.JSpinner EndMonth;
    private javax.swing.JSpinner EndYear;
    private javax.swing.JLabel NI1;
    private javax.swing.JLabel NI10;
    private javax.swing.JLabel NI11;
    private javax.swing.JLabel NI12;
    private javax.swing.JLabel NI13;
    private javax.swing.JPanel NI14;
    private javax.swing.JLabel NI15;
    private javax.swing.JLabel NI16;
    private javax.swing.JLabel NI17;
    private javax.swing.JLabel NI2;
    private javax.swing.JLabel NI3;
    private javax.swing.JLabel NI4;
    private javax.swing.JLabel NI5;
    private javax.swing.JLabel NI6;
    private javax.swing.JLabel NI7;
    private javax.swing.JLabel NI8;
    private javax.swing.JLabel NI9;
    private javax.swing.JPanel SaveButton;
    private javax.swing.JSpinner StartDay;
    private javax.swing.JSpinner StartHour;
    private javax.swing.JSpinner StartMeridian;
    private javax.swing.JSpinner StartMinutes;
    private javax.swing.JSpinner StartMonth;
    private javax.swing.JSpinner StartYear;
    private javax.swing.JTextField TaskTitle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     * @see base.UI#getFields() 
     */
    @Override
    public Map getFields() {
        Map fields = new HashMap();
        
        fields.put(StartDay.getName(), StartDay);
        fields.put(StartHour.getName(), StartHour);
        fields.put(StartMeridian.getName(), StartMeridian);
        fields.put(StartMinutes.getName(), StartMinutes);
        fields.put(StartMonth.getName(), StartMonth);
        fields.put(StartYear.getName(), StartYear);
        fields.put(DescriptionBox.getName(), DescriptionBox);
        fields.put(DescriptionBoxScroll.getName(), DescriptionBoxScroll);
        fields.put(EndDay.getName(), EndDay);
        fields.put(EndHour.getName(), EndHour);
        fields.put(EndMeridian.getName(), EndMeridian);
        fields.put(EndMinutes.getName(), EndMinutes);
        fields.put(EndMonth.getName(), EndMonth);
        fields.put(EndYear.getName(), EndYear);
        fields.put(TaskTitle.getName(), TaskTitle);
        
        return fields;
    }
}
