/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1lenguajes.frames;

import com.mycompany.proyecto1lenguajes.AlmacenadorReportes.*;
import com.mycompany.proyecto1lenguajes.Automatas.Identificador;
import static com.mycompany.proyecto1lenguajes.RegistroTablas.MovilizadorDatos.movilizar;
import com.mycompany.proyecto1lenguajes.Archivos.CargaArchivo;
import com.mycompany.proyecto1lenguajes.Archivos.ExportarArchivo;
import com.mycompany.proyecto1lenguajes.CargadorObjetos.*;
import com.mycompany.proyecto1lenguajes.RegistroTablas.*;
import com.mycompany.proyecto1lenguajes.RegistroTablas.ReporteErrores;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author Mariano
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public static CargarError cargarError;
    public static CargarLexema cargarLexema;
    public static CargarToken cargarToken;
    public static ArrayList<ReporteErrorObjeto> errorEstablecido;//indicamos un array list de error para leer los archivos
    public static ArrayList<RecuentoLexemaObjeto> lexemaEstablecido;//indicamos un array list de lexema para leer los archivos
    public static ArrayList<ReporteTokensObjeto> tokenEstablecido;//indicamos un array list de token para leer los archivos
    public Inicio() {
        initComponents();
        crearReportes();
        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }
    public void crearReportes(){
        this.cargarError = new CargarError();  
        this.cargarLexema = new CargarLexema();
        this.cargarToken = new CargarToken();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CargaArchivo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        buscarText = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MovimientoEstado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ReportToken = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        RecuentoLexema = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        ReporteError = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Reportes de tokens");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        CargaArchivo.setColumns(20);
        CargaArchivo.setRows(5);
        jScrollPane1.setViewportView(CargaArchivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 650, 270));

        jButton1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("ANALIZAR TEXTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Buscar cadena");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));
        jPanel1.add(buscarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 180, 20));

        jButton4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Guardar Archivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        MovimientoEstado.setColumns(20);
        MovimientoEstado.setRows(5);
        jScrollPane2.setViewportView(MovimientoEstado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 450, 270));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mariano");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 630, -1, -1));

        ReportToken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Token", "Lexema", "Fila", "Columna"
            }
        ));
        jScrollPane3.setViewportView(ReportToken);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 410, 210));

        RecuentoLexema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lexema", "Token", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(RecuentoLexema);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 350, 210));

        ReporteError.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cadena error", "Fila", "Columna"
            }
        ));
        jScrollPane6.setViewportView(ReporteError);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 350, 210));

        jLabel5.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Texto Cargado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Movimiento de estado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Reporte de errores");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Recuento de lexemas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                CargaArchivo carga = new CargaArchivo();
                carga.leer(archivo, CargaArchivo);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer carga de archivo");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        errorEstablecido = new ArrayList<>();  
        lexemaEstablecido = new ArrayList<>();   
        tokenEstablecido = new ArrayList<>(); 
        ReporteErrores.completarTabla(errorEstablecido, ReporteError);
        RecuentoLexemas.completarTabla(lexemaEstablecido, RecuentoLexema);
        movilizar.setCondiconalError(0);
        MovimientoEstado.setText("");
        movilizar.setCaracteresUsados(0);
        movilizar.setCadenaUsada("");
        movilizar.setFila(0);
        movilizar.setColumna(0);
        String linea,reduccionLinea,lector;
        String texto=CargaArchivo.getText();
        Reader leer = new StringReader(texto);
        int contador=0;
        char verificadorLinea;
        BufferedReader leerTA = new BufferedReader(leer);
        try {
            while ((linea = leerTA.readLine()) != null) {
                contador++;
                movilizar.setFila(contador);
                movilizar.setColumna(0);
                movilizar.setCaracteresUsados(0);
                movilizar.setCadenaUsada("");
                verificadorLinea=linea.charAt(0);
                if(Character.isLetter(verificadorLinea)){
                    Identificador.identificadorInicio(linea,MovimientoEstado);
                    reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
                    JOptionPane.showMessageDialog(null, reduccionLinea);
                    while(movilizar.getCaracteresUsados()<linea.length()){
                        verificadorLinea=reduccionLinea.charAt(0);
                        JOptionPane.showMessageDialog(null, movilizar.getCaracteresUsados());
                        if(Character.isLetter(verificadorLinea)){
                            Identificador.identificadorInicio(reduccionLinea,MovimientoEstado);
                            reduccionLinea=linea.substring(movilizar.getCaracteresUsados(), linea.length());
                        }else{
                            movilizar.setCaracteresUsados(linea.length());
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Tarado xd");
                }
            }
            if(movilizar.getCondiconalError()==1){
                ReporteErrores.completarTabla(errorEstablecido, ReporteError);
            }else if(movilizar.getCondiconalError()==0){
                RecuentoLexemas.completarTabla(lexemaEstablecido, RecuentoLexema);
                ReporteTokens.completarTabla(tokenEstablecido, ReportToken);
            }
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String valorBusqueda,textoArea;
        valorBusqueda= buscarText.getText();
        if (valorBusqueda.length() >= 1) {    
        DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
        Highlighter h = CargaArchivo.getHighlighter();
        h.removeAllHighlights();
        textoArea=CargaArchivo.getText();
        Pattern p = Pattern.compile("(?i)" + valorBusqueda);
        Matcher m = p.matcher(textoArea);
        while (m.find()) {
                try {
                    h.addHighlight(m.start(), m.end(), highlightPainter);
                } catch (BadLocationException ex) {
                    JOptionPane.showMessageDialog(null, "Error a resaltar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero ingresa una cadena para ser leída");
        }
        //CargaArchivo.setText(CargaArchivo.getText().replaceAll(valorBusqueda, espacio));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ExportarArchivo.exportarParaExel(CargaArchivo);//enviamos parametro para guardar archivo texto
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea CargaArchivo;
    private javax.swing.JTextArea MovimientoEstado;
    public static javax.swing.JTable RecuentoLexema;
    public static javax.swing.JTable ReportToken;
    public static javax.swing.JTable ReporteError;
    private javax.swing.JTextField buscarText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
