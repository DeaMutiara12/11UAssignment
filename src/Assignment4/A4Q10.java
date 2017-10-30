/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * @author Donald
 */
public class A4Q10 extends javax.swing.JFrame {

    /**
     * Creates new form A4Q100
     */
    public A4Q10() {
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

        fahrenheitB = new javax.swing.JButton();
        celsiusB = new javax.swing.JButton();
        fahrenheitInput = new javax.swing.JTextField();
        celsiusInput = new javax.swing.JTextField();
        fahrenheit = new javax.swing.JLabel();
        celsius = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fahrenheitB.setText("F -> C");
        fahrenheitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitBActionPerformed(evt);
            }
        });

        celsiusB.setText("C -> F");
        celsiusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusBActionPerformed(evt);
            }
        });

        fahrenheit.setText("Degrees Fahrenheit");

        celsius.setText("Degrees Celsius");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celsius)
                    .addComponent(fahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fahrenheitInput, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(celsiusInput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fahrenheitB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(celsiusB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheitB)
                    .addComponent(fahrenheitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fahrenheit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(celsiusB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(celsiusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(celsius)))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fahrenheitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitBActionPerformed
        // input degrees in fahrenheit
        String fahrenheit = fahrenheitInput.getText();
        
        //inputy degrees in celsius
        String celsius = celsiusInput.getText();
        
        //converting strings into integers
        double fahrenheitInput = Integer.parseInt (fahrenheit);
        
        //Convert strings to integers
        double celsiusOutput = (fahrenheitInput-32)/1.8;
        
        //outputting the degrees in celsius
        celsiusInput.setText("" + celsiusOutput);
    }//GEN-LAST:event_fahrenheitBActionPerformed

    private void celsiusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusBActionPerformed
        // input degrees in fahrenheit
        String fahrenheit = fahrenheitInput.getText();
        
        //input degrees in celsius
        String celsius= celsiusInput.getText();
        
        //converting strings to doubles
        double celsiusInput= Integer.parseInt (celsius);
        
        //converting celsius  to fahrenheit
        double fahrenheitOutput = celsiusInput*1.8+32;
        
        //outputting the degrees in celsius
        fahrenheitInput.setText("" + fahrenheitOutput);
        
    }//GEN-LAST:event_celsiusBActionPerformed

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
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A4Q10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsius;
    private javax.swing.JButton celsiusB;
    private javax.swing.JTextField celsiusInput;
    private javax.swing.JLabel fahrenheit;
    private javax.swing.JButton fahrenheitB;
    private javax.swing.JTextField fahrenheitInput;
    // End of variables declaration//GEN-END:variables
}
