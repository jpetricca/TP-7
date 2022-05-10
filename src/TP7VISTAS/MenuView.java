
package TP7VISTAS;

import java.util.HashSet;
import tp7.Alumno;
import tp7.Materia;



public class MenuView extends javax.swing.JFrame {
    
    private HashSet <Materia> lMateria = new HashSet<>();
    private HashSet <Alumno> lAlumno = new HashSet<>();
    
    Materia materias = new Materia();
    Alumno alumnos = new Alumno();
    
    public MenuView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumnos = new javax.swing.JMenu();
        jmiFAlumnos = new javax.swing.JMenuItem();
        jmFMaterias = new javax.swing.JMenu();
        jmiFMaterias = new javax.swing.JMenuItem();
        jmInscripcion = new javax.swing.JMenu();
        jmiFInscripcion = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 316));

        escritorio.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jmAlumnos.setText("Alumnos");

        jmiFAlumnos.setText("Formulario Alumnos");
        jmiFAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFAlumnosActionPerformed(evt);
            }
        });
        jmAlumnos.add(jmiFAlumnos);

        jMenuBar1.add(jmAlumnos);

        jmFMaterias.setText("Materias");

        jmiFMaterias.setText("Formulario Materias");
        jmiFMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFMateriasActionPerformed(evt);
            }
        });
        jmFMaterias.add(jmiFMaterias);

        jMenuBar1.add(jmFMaterias);

        jmInscripcion.setText("Inscripcion");

        jmiFInscripcion.setText("Formulario Inscripcion");
        jmiFInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFInscripcionActionPerformed(evt);
            }
        });
        jmInscripcion.add(jmiFInscripcion);

        jMenuBar1.add(jmInscripcion);

        jmSalir.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFAlumnosActionPerformed
        escritorio.removeAll();
        FormAlumnosView falumnos = new FormAlumnosView(lAlumno);
        falumnos.setVisible(true);
        escritorio.add(falumnos);
        escritorio.repaint();
    }//GEN-LAST:event_jmiFAlumnosActionPerformed

    private void jmiFMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFMateriasActionPerformed
        escritorio.removeAll();
        FormMateriasView fmaterias = new FormMateriasView(lMateria);
        fmaterias.setVisible(true);
        escritorio.add(fmaterias);
        escritorio.repaint();
    }//GEN-LAST:event_jmiFMateriasActionPerformed

    private void jmiFInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFInscripcionActionPerformed
        escritorio.removeAll();
        FormInscripcionView finscripcion = new FormInscripcionView(lAlumno,lMateria);
        finscripcion.setVisible(true);
        escritorio.add(finscripcion);
        escritorio.repaint();
        
    }//GEN-LAST:event_jmiFInscripcionActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jmiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmFMaterias;
    private javax.swing.JMenu jmInscripcion;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiFAlumnos;
    private javax.swing.JMenuItem jmiFInscripcion;
    private javax.swing.JMenuItem jmiFMaterias;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
