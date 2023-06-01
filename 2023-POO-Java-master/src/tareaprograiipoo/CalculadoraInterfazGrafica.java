//Jefeson Alexis Suchite Chavez 0909/22/12681
package tareaprograiipoo;

public class CalculadoraInterfazGrafica extends javax.swing.JFrame {
    CalculadoraEspecial ce;

   public CalculadoraInterfazGrafica() {
      this.ce = new CalculadoraEspecial("Cientifica", "Negro", 15, "123fx4mg", "Jackson");
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

      bg = new javax.swing.JPanel();
      bgreslt = new javax.swing.JPanel();
      igutxt = new javax.swing.JTextField();
      bgfun = new javax.swing.JPanel();
      num1txt = new javax.swing.JTextField();
      num2txt = new javax.swing.JTextField();
      cleanbtm = new javax.swing.JButton();
      sumbtn = new javax.swing.JButton();
      restbtn = new javax.swing.JButton();
      mulbtn = new javax.swing.JButton();
      divbtn = new javax.swing.JButton();
      rzcbtn = new javax.swing.JButton();
      npbtn = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setPreferredSize(new java.awt.Dimension(500, 300));

      bg.setBackground(new java.awt.Color(255, 255, 255));
      bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      bgreslt.setBackground(new java.awt.Color(204, 204, 204));
      bgreslt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      bgreslt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      igutxt.setEditable(false);
      igutxt.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
      igutxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
      bgreslt.add(igutxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 70));

      bg.add(bgreslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 120));

      bgfun.setBackground(new java.awt.Color(8, 131, 149));
      bgfun.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      bgfun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      num1txt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      num1txt.setForeground(new java.awt.Color(204, 204, 204));
      num1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      num1txt.setText("Primer Numero");
      bgfun.add(num1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 40));

      num2txt.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
      num2txt.setForeground(new java.awt.Color(204, 204, 204));
      num2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      num2txt.setText("Segundo Numero");
      bgfun.add(num2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, 40));

      cleanbtm.setBackground(new java.awt.Color(255, 51, 51));
      cleanbtm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      cleanbtm.setText("CE");
      cleanbtm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      cleanbtm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      cleanbtm.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cleanbtmActionPerformed(evt);
         }
      });
      bgfun.add(cleanbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

      sumbtn.setBackground(new java.awt.Color(102, 255, 255));
      sumbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      sumbtn.setText("Sumar");
      sumbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      sumbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      sumbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sumbtnActionPerformed(evt);
         }
      });
      bgfun.add(sumbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 30));

      restbtn.setBackground(new java.awt.Color(102, 255, 255));
      restbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      restbtn.setText("Resta");
      restbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      restbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      restbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            restbtnActionPerformed(evt);
         }
      });
      bgfun.add(restbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

      mulbtn.setBackground(new java.awt.Color(102, 255, 255));
      mulbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      mulbtn.setText("Multiplicar");
      mulbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      mulbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      mulbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mulbtnActionPerformed(evt);
         }
      });
      bgfun.add(mulbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 30));

      divbtn.setBackground(new java.awt.Color(102, 255, 255));
      divbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      divbtn.setText("Dividir");
      divbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      divbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      divbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            divbtnActionPerformed(evt);
         }
      });
      bgfun.add(divbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 30));

      rzcbtn.setBackground(new java.awt.Color(102, 255, 255));
      rzcbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      rzcbtn.setText("Raiz Cuadrada");
      rzcbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rzcbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      rzcbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rzcbtnActionPerformed(evt);
         }
      });
      bgfun.add(rzcbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 30));

      npbtn.setBackground(new java.awt.Color(102, 255, 255));
      npbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
      npbtn.setText("Numero Primo");
      npbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      npbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      npbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            npbtnActionPerformed(evt);
         }
      });
      bgfun.add(npbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

      bg.add(bgfun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 280));

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

   private void cleanbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbtmActionPerformed
      igutxt.setText("");
      num1txt.setText("");
      num2txt.setText("");
   }//GEN-LAST:event_cleanbtmActionPerformed

   private void sumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      double num2 = Double.parseDouble(num2txt.getText());
      double resultado = ce.sumar(num1,num2);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_sumbtnActionPerformed

   private void npbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      boolean resultado = ce.esPrimo((int) num1);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_npbtnActionPerformed

   private void mulbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      double num2 = Double.parseDouble(num2txt.getText());
      double resultado = ce.multiplicar(num1,num2);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_mulbtnActionPerformed

   private void divbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      double num2 = Double.parseDouble(num2txt.getText());
      double resultado = ce.dividir(num1,num2);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_divbtnActionPerformed

   private void rzcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rzcbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      double resultado = ce.raizCuadrada(num1);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_rzcbtnActionPerformed

   private void restbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restbtnActionPerformed
      double num1 = Double.parseDouble(num1txt.getText());
      double num2 = Double.parseDouble(num2txt.getText());
      double resultado = ce.restar(num1,num2);
      igutxt.setText(String.valueOf(resultado));
   }//GEN-LAST:event_restbtnActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel bg;
   private javax.swing.JPanel bgfun;
   private javax.swing.JPanel bgreslt;
   private javax.swing.JButton cleanbtm;
   private javax.swing.JButton divbtn;
   private javax.swing.JTextField igutxt;
   private javax.swing.JButton mulbtn;
   private javax.swing.JButton npbtn;
   private javax.swing.JTextField num1txt;
   private javax.swing.JTextField num2txt;
   private javax.swing.JButton restbtn;
   private javax.swing.JButton rzcbtn;
   private javax.swing.JButton sumbtn;
   // End of variables declaration//GEN-END:variables
}
