//Jeferson Alexis Suchite Chavez 0909/22/12681
package tareaprograiipoo;

public class CalculadoraInterfazGrafica extends javax.swing.JFrame {
   CalculadoraEspecial ce =new CalculadoraEspecial("Especial", "Negro", 25, "abc123", "Jack");
   
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      bg = new javax.swing.JPanel();
      bgreslt = new javax.swing.JPanel();
      resultadotxt = new javax.swing.JTextField();
      bgfunc = new javax.swing.JPanel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(255, 255, 255));
      setPreferredSize(new java.awt.Dimension(600, 400));
      setResizable(false);

      bg.setBackground(new java.awt.Color(255, 255, 255));
      bg.setBorder(new javax.swing.border.MatteBorder(null));
      bg.setPreferredSize(new java.awt.Dimension(600, 400));
      bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      bgreslt.setBackground(new java.awt.Color(153, 153, 153));
      bgreslt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      bgreslt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      resultadotxt.setEditable(false);
      resultadotxt.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
      resultadotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      bgreslt.add(resultadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 70));

      bg.add(bgreslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 130));

      bgfunc.setBackground(new java.awt.Color(8, 131, 149));
      bgfunc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      bgfunc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
      bg.add(bgfunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 270));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel bg;
   private javax.swing.JPanel bgfunc;
   private javax.swing.JPanel bgreslt;
   private javax.swing.JTextField resultadotxt;
   // End of variables declaration//GEN-END:variables
}
