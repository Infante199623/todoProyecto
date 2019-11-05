
package vista;

import controlador.ControladorPlato;
import controlador.ControladorRestaurante;
import controlador.ControladorUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Plato;
import modelo.Restaurante;
import modelo.Usuario;

/**
 *
 * @author Paco
 */

public class vista extends javax.swing.JFrame {
  ArrayList <Restaurante> listaRestaurantes;
  ArrayList <Plato> listaPlatos;

    public vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        conectar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextLogin = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conectar.setText("Iniciar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("CRIST EAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1iniciarSesionBotonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Login");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("CRIST EAT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel7)))
                .addGap(0, 210, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel3);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "tipoComida", "Direccion", "Valoracion"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Restaurantes");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Platos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(157, 157, 157))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tablas", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
       
        String login="jose";
        String password="";
          
         ControladorRestaurante controlador = new ControladorRestaurante(); 
         ControladorPlato controladorP =  new ControladorPlato();
         
         txt.append("RESTAURANTES"+"\n");
        try {
            ArrayList<Restaurante> listaRestaurantes = controlador.getRestaurantes();
            for (int i = 0; i < listaRestaurantes.size(); i++) {
                System.out.println(listaRestaurantes.get(i).getId()+"#"+listaRestaurantes.get(i).getNombre()+"#"+listaRestaurantes.get(i).getTipoComida()+"#"+listaRestaurantes.get(i).getDireccion()+"#"+listaRestaurantes.get(i).getValoracion()+"#"+listaRestaurantes.get(i).getPedidoMinimo()+"#"+listaRestaurantes.get(i).getHoraApertura()+"#"+listaRestaurantes.get(i).getHoraCierre()+"#"+listaRestaurantes.get(i).isAbierto());
                txt.append(listaRestaurantes.get(i).getId()+"#"+listaRestaurantes.get(i).getNombre()+"#"+listaRestaurantes.get(i).getTipoComida()+"#"+listaRestaurantes.get(i).getDireccion()+"#"+listaRestaurantes.get(i).getValoracion()+"#"+listaRestaurantes.get(i).getPedidoMinimo()+"#"+listaRestaurantes.get(i).getHoraApertura()+"#"+listaRestaurantes.get(i).getHoraCierre()+"#"+listaRestaurantes.get(i).isAbierto()+"\n");

            }
            
            txt.append("PLATOS"+"\n");
            
             ArrayList<Plato> listaplatos = controladorP.getPlatos();
            for (int i = 0; i < listaplatos.size(); i++) {
                System.out.println(listaplatos.get(i).getId()+"#"+listaplatos.get(i).getNombre()+"#"+listaplatos.get(i).getDescripcion()+"#"+listaplatos.get(i).getPrecio()+"#"+listaplatos.get(i).getIdRestaurante());
                txt.append(listaplatos.get(i).getId()+"#"+listaplatos.get(i).getNombre()+"#"+listaplatos.get(i).getDescripcion()+"#"+listaplatos.get(i).getPrecio()+"#"+listaplatos.get(i).getIdRestaurante()+"\n");

            }
        } catch (SQLException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_conectarActionPerformed

    private void jButton1iniciarSesionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1iniciarSesionBotonActionPerformed
        // TODO add your handling code here:
       boolean encontrado = false;
       String IP = jTextLogin.getText();
       String Puerto = jTextPassword.getText();
       ControladorUsuario controladorU =  new ControladorUsuario();
       ControladorRestaurante controladorR =  new ControladorRestaurante();
       ControladorPlato controladorP =  new ControladorPlato();
       
       
        try {
            ArrayList<Usuario> listausuarios = controladorU.getUsuarios();
             for (int i = 0; i < listausuarios.size(); i++) {
                 System.out.println(listausuarios.get(i).getId()+"#"+listausuarios.get(i).getLogin()+"#"+listausuarios.get(i).getPassword());
                 if(listausuarios.get(i).getLogin().equals(IP) && listausuarios.get(i).getPassword().equals(Puerto)){
                     encontrado = true;
                 }
            }
        } catch (SQLException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
           if(encontrado==true){
            jTabbedPane1.setSelectedComponent(jPanel5);
           }
           
      try {
          listaRestaurantes = controladorR.getRestaurantes();
          listaPlatos = controladorP.getPlatos();
          
            DefaultTableModel modeloTabla = new DefaultTableModel();

            modeloTabla.setColumnIdentifiers(new Object[]{"NOMBRE","TIPOCOMIDA",
                                                "DIRECCION","VALORACION"});
            
            for(Restaurante R : listaRestaurantes){
            modeloTabla.addRow(new String[]{R.getNombre(),R.getTipoComida(),R.getDireccion(),R.getValoracion()});             
            }   
             
             for (int i = 0; i < listaPlatos.size(); i++) {
                    System.out.println(listaPlatos.get(i).getId()+"#"+listaPlatos.get(i).getIdRestaurante()+"#"+listaPlatos.get(i).getNombre()+"#"+listaPlatos.get(i).getDescripcion()+"#"+listaPlatos.get(i).getPrecio());
                }
             
        jTable5.setModel(modeloTabla);      
        jScrollPane5.revalidate();
        jScrollPane5.repaint();
        jTable5.revalidate();
        jTable5.repaint(); 
        
      } catch (SQLException ex) {
          Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
      }        
    }//GEN-LAST:event_jButton1iniciarSesionBotonActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int fila = jTable5.rowAtPoint(evt.getPoint());
        if(fila > -1){
            System.out.println("Restaurante " + listaRestaurantes.get(fila).getNombre());
             mostrarTablaPlatos(listaRestaurantes.get(fila).getId());
        }
    }//GEN-LAST:event_jTable5MouseClicked

    
//    public void mostrarTablaRestaurantes() {
//        DefaultTableModel modeloTabla = new DefaultTableModel();
//
//        modeloTabla.setColumnIdentifiers(new Object[]{"NOMBRE","TIPOCOMIDA",
//                                                "DIRECCION","VALORACION"});
//       
//        for(Restaurante R : restaurantes){
//            modeloTabla.addRow(new String[]{R.getNombre(),
//                                R.getTipoComida(),
//                                R.getDireccion(),
//                                R.getValoracion()+""});  
//           
//            }
//        jTable5.setModel(modeloTabla);      
//        jScrollPane5.revalidate();
//        jScrollPane5.repaint();
//        jTable5.revalidate();
//        jTable5.repaint();               
//    }

public void mostrarTablaPlatos(int idR) {
        DefaultTableModel modeloTabla = new DefaultTableModel();        
        modeloTabla.setColumnIdentifiers(new Object[]{"NOMBRE","PRECIO","DESCRIPCION"});
        
        for(Plato P : listaPlatos){
            if(P.getIdRestaurante()==idR)
                modeloTabla.addRow(new Object[]{P.getNombre(),P.getPrecio(),P.getDescripcion()});                                                    
                           
            }
        
        jTable6.setModel(modeloTabla);
        jScrollPane6.revalidate();
        jScrollPane6.repaint();
        jTable6.revalidate();
        jTable6.repaint();
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton conectar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
