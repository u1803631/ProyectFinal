


import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Window extends javax.swing.JFrame {

    File currentDirFile = new File(".");
    String path = System.getProperty("user.dir");
    ExtraccionArchivo archivo = new ExtraccionArchivo(path + "\\Casos_positivos_de_COVID-19_en_Colombia (2).csv");

    String DepartamentoF;
   String SexoF;
   int EdadF;
   String StatusF;
   String Tipo;

    public Window() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JboxEdad = new javax.swing.JComboBox<>();
        JboxSexo = new javax.swing.JComboBox<>();
        JboxStatus = new javax.swing.JComboBox<>();
        JboxDepartamento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        GenerarGraficas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TipoGrafica = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Edad");

        jLabel2.setText("Departamento");

        jLabel3.setText("Sexo");

        jLabel4.setText("Status");

        JboxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre -", "Entre 0-18", "Entre19-30", "Entre 31-45", "Entre 45-60", "Entre 61-80", "Entre81-103" }));

        JboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));

        JboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Casa", "Recuperado", "Hospital", "Hospital UCI", "Fallecido" }));

        JboxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Amazonas", "Antioquia", "Arauca", "Atlántico", "Archipiélago de San Andrés Providencia y Santa Catalina", "Bogotá D.C.", "Barranquilla D.E.", "Boyacá", "Bolívar", "Buenaventura D.E.", "Cundinamarca", "Cauca", "Caldas", "Cartagena D.T.y C.", "Casanare", "Caquetá", "Cesar", "Chocó", "Córdoba", "Huila", "Magdalena", "Meta", "La Guajira", "Nariño", "Norte de Santander", "Putumayo", "Quindio", "Risaralda", "Santander", "Santa Marta D.T. y C.", "Sucre", "Tolima", "Valle del Cauca", "Vaupes" }));
        JboxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JboxDepartamentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Positivos COVID 19 - Colombia 2020");

        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GenerarGraficas.setText("Generar Graficas ");
        GenerarGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarGraficasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Grafica ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Grafica Top 3");

        TipoGrafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barras", "Torta" }));

        jLabel8.setText("Tipo Grafica");

        panel.setBackground(new java.awt.Color(153, 153, 153));
        panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        panel2.setBackground(new java.awt.Color(153, 153, 153));
        panel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(412, 412, 412)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JboxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(26, 26, 26)
                        .addComponent(GenerarGraficas)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JboxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerarGraficas))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)
                        .addContainerGap(219, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenerarGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarGraficasActionPerformed
      
        
        if(  archivo.Bandera == false)
            
        {
            
          try {

            archivo.crearListado();

        } catch (FileNotFoundException ex) {
         Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
          archivo.Bandera=true;
       
       
        }
       
        DepartamentoF=(String) JboxDepartamento.getSelectedItem();
        SexoF =(String) JboxSexo.getSelectedItem();
        StatusF=(String) JboxStatus.getSelectedItem();
        EdadF=JboxEdad.getSelectedIndex() ;

         
          
       ProcessData send = new ProcessData();
       send.ProcessData(DepartamentoF, StatusF, SexoF, EdadF,archivo.ListadoFinals);
       send.Filro1();
       
       int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,d1=0,d2=0,d3=0,d4=0,d5=0,d6=0;
       for (int i = 0; i < send.ListaFinalE.size(); i++) {
             if (send.ListaFinalE.get(i).Edad >= 0 && send.ListaFinalE.get(i).Edad <= 18) {
                       c1++;

                    }else{
                         if (send.ListaFinalE.get(i).Edad >=19 && send.ListaFinalE.get(i).Edad <= 30) {
                        c2++;

                    }else{
                       if (send.ListaFinalE.get(i).Edad>= 31 && send.ListaFinalE.get(i).Edad <= 45) {
                        c3++;

                    }else{
                     if (send.ListaFinalE.get(i).Edad >=46 && send.ListaFinalE.get(i).Edad <= 60) {
                        c4++;
                    }
                     else{
                         if (send.ListaFinalE.get(i).Edad >=61 && send.ListaFinalE.get(i).Edad <= 80) {
                        c5++;

                    }
                         else{
                           if (send.ListaFinalE.get(i).Edad >= 81 && send.ListaFinalE.get(i).Edad <= 103) {
                        c6 ++;

                    }  
                         }
                     }
                    }
                    }
                    }
            
        }
       send.NoFilro();
       for (int i = 0; i < send.ListaFinalN.size(); i++) {
             if (send.ListaFinalN.get(i).Edad >= 0 && send.ListaFinalN.get(i).Edad <= 18) {
                       d1++;

                    }else{
                         if (send.ListaFinalN.get(i).Edad >=19 && send.ListaFinalN.get(i).Edad <= 30) {
                        d2++;

                    }else{
                       if (send.ListaFinalN.get(i).Edad>= 31 && send.ListaFinalN.get(i).Edad <= 45) {
                        d3++;

                    }else{
                     if (send.ListaFinalN.get(i).Edad >=46 && send.ListaFinalN.get(i).Edad <= 60) {
                        d4++;
                    }
                     else{
                         if (send.ListaFinalN.get(i).Edad >=61 && send.ListaFinalN.get(i).Edad <= 80) {
                        d5++;

                    }
                         else{
                           if (send.ListaFinalN.get(i).Edad >= 81 && send.ListaFinalN.get(i).Edad <= 103) {
                        d6 ++;

                    }  
                         }
                     }
                    }
                    }
                    }
            
        }
       
      
      Tipo=(String) TipoGrafica.getSelectedItem();
      if(Tipo=="Barras"){
       DefaultCategoryDataset dataset= new DefaultCategoryDataset();
       
        dataset.addValue(c1,"","0-18");
        dataset.addValue(c2,"","19-30");
        dataset.addValue(c3,"","31-45");
        dataset.addValue(c4,"","46-60");
        dataset.addValue(c5,"","61-80");
        dataset.addValue(c6,"","81-103");
       
//       
       JFreeChart chart= ChartFactory.createBarChart("","Edad ", "Cantidad de personas", dataset,PlotOrientation.HORIZONTAL, false, false, false);
       ChartPanel chartPanel=new ChartPanel(chart);
        panel.removeAll();
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.validate();
        DefaultCategoryDataset dataset2= new DefaultCategoryDataset();
       
        dataset2.addValue(d1,"","0-18");
        dataset2.addValue(d2,"","19-30");
        dataset2.addValue(d3,"","31-45");
        dataset2.addValue(d4,"","46-60");
        dataset2.addValue(d5,"","61-80");
        dataset2.addValue(d6,"","81-103");
//       
//       
       JFreeChart chart2= ChartFactory.createBarChart("","Edad ", "Cantidad de personas", dataset2,PlotOrientation.HORIZONTAL, false, false, false);
       ChartPanel chartPanel2=new ChartPanel(chart2);
        panel2.removeAll();
        panel2.add(chartPanel2, BorderLayout.CENTER);
        panel2.validate();
      }
       
    }//GEN-LAST:event_GenerarGraficasActionPerformed

    private void JboxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JboxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JboxDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarGraficas;
    private javax.swing.JComboBox<String> JboxDepartamento;
    private javax.swing.JComboBox<String> JboxEdad;
    private javax.swing.JComboBox<String> JboxSexo;
    private javax.swing.JComboBox<String> JboxStatus;
    private javax.swing.JComboBox<String> TipoGrafica;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
