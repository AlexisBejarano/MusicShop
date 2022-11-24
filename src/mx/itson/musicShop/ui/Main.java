/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.musicShop.ui;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

import mx.itson.musicShop.entidades.Estado;
import mx.itson.musicShop.entidades.Movimiento;
import mx.itson.musicShop.enumerador.Tipo;
/**
 *
 * @author Alexis Bejarano
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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
        lblNombreTienda = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        lblCp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        seleccionMeses = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Detalles de Tienda");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        lblNombreTienda.setText("Dato_Nombre de tienda");

        lblCuenta.setText("Dato_Cuenta");

        lblMoneda.setText("Dato_Moneda");

        lblClabe.setText("Dato_Clabe");

        lblDescripcion.setText("Dato_Descripcion");

        lblCodigo.setText("Dato_Codigo");

        lblNombre.setText("Dato_Nombre");

        lblDomicilio.setText("Dato_Domicilio");

        lblCiudad.setText("Dato_Ciudad");

        lblRfc.setText("Dato_RFC");

        lblCp.setText("Dato_CP");

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FECHA", "HORA", "DESCRIPCIÓN", "DEPÓSITO", "DEVOLUCIÓN", "SUBTOTAL"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        seleccionMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        seleccionMeses.setDoubleBuffered(true);

        jLabel3.setText("Seleccione mes antes de Buscar JSON");

        jLabel4.setText("Seleccione JSON");

        jLabel5.setText("Se requiere ver el historial de compras y el monto de cada compra del año 2022 de un clinete");

        jLabel6.setText("Nombre Tienda:");

        jLabel7.setText("Cuenta:");

        jLabel8.setText("Clabe:");

        jLabel9.setText("Moneda:");

        jLabel10.setText("Descripción:");

        jLabel11.setText("Codigo de referencia:");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Domicilio:");

        jLabel14.setText("Ciudad:");

        jLabel15.setText("RFC:");

        jLabel16.setText("Codigo Postal:");

        jLabel17.setText("Saldo Final:");

        lblSubTotal.setText("Dato_SubTotal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCuenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClabe))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMoneda))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDomicilio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCiudad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRfc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(seleccionMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSubTotal)))
                .addGap(75, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(seleccionMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreTienda)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuenta)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClabe)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoneda)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblRfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblCp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblSubTotal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       try {
           //Utilizaremos JFileChooser para poder llamar al archivo.
           JFileChooser jfileChooser = new JFileChooser();
           jfileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
           
           //Si se selecciona la carpeta correcta mostrara el contenido en el SWIM.
           if(jfileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION);
           File archivo = jfileChooser.getSelectedFile();
           
           //Capturamos los datos del arhcivo.
           byte archivoBytes[] = Files.readAllBytes(archivo.toPath());
           
           //Guardamos el contenido del JSON en una variable para poder proceder a deserializarlo.
           String contenido = new String(archivoBytes, StandardCharsets.UTF_8);
           
           //Importamos el documento desearelizado.
           Estado estado = new Estado().deserializar(contenido);
           
           //Imprimimos el contenido en el SWIM.
           lblNombreTienda.setText(estado.getNombreTienda());
           lblNombre.setText(estado.getCliente().getNombre());
           lblRfc.setText(estado.getCliente().getRfc());
           lblDomicilio.setText(estado.getCliente().getDomicilio());
           lblCiudad.setText(estado.getCliente().getCiudad());
           lblCp.setText(estado.getCliente().getCp());
           lblCuenta.setText(estado.getCuenta());
           lblMoneda.setText(estado.getMoneda());
           lblDescripcion.setText(estado.getDescripcion());
           lblClabe.setText(estado.getClabe());
           lblCodigo.setText(estado.getCliente().getCodigo());
                   
           //Declaramos que el contenido de la tabla "Movimientos" sera manejado por modelo.
           DefaultTableModel modelo = (DefaultTableModel) tblMovimientos.getModel();
           modelo.setRowCount(0);
           
           //Damos el foramto en el que se presentara la fecha de la tabla a imprimir
           DateFormat formatFecha = new SimpleDateFormat("dd/MM/YYYY");
           
           //Organizamos las fechas de menor(Acendenete) a mayor(desendente).
           estado.getMovimientos().sort((mov1, mov2) -> mov1.getFecha().compareTo(mov2.getFecha()));
           
           Locale local = new Locale("es", "MX");
           NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);
           
           //Se crean las variables para conseguir los datos del resumen.
           double saldoInicial=0;
           double devolucion=0;
           double depositos=0;
           double meses= seleccionMeses.getSelectedIndex()-1;
        
           // Se crea una lista para almacenar los dias del mes 
           List<Movimiento>movimientos = new ArrayList();
           for(Movimiento d : estado.getMovimientos()){
           
               
            //se valida si el mes seleccionado es igual al mes de la fecha
            if(meses==d.getFecha().getMonth()){
            movimientos.add(d);
            //Si no es igual y es menor se sumaran las cantidades para el saldo inicial anterior
            }else if(meses>d.getFecha().getMonth()){
             if(d.getTipo()==Tipo.Desposito){
                 saldoInicial+=d.getCantidad();
            }else{
                saldoInicial+=d.getCantidad();
            }   
            }
            
            
            }
            //Se ordenan las fechas
            movimientos.sort((mov1,mov2)->mov1.getFecha().compareTo(mov2.getFecha()));
            
            
            //Se valida si el mes es mayor a 0 y si no lo es se imprimira toda la lista de datos
            if(meses>-1){ 
            for(Movimiento b : movimientos){
            //Validamos si la cantidad ingresada es deposito o retiro
            if(b.getTipo()==Tipo.Desposito){
                b.setDeposito(b.getCantidad());
                depositos+=b.getDeposito();
                
            }else{
                b.setDevolucion(b.getCantidad());
                devolucion+=b.getDevolucion();
                
            }
            //Imprimimos la lista
                modelo.addRow(new Object []{formatFecha.format(b.getFecha()),b.getHora(),b.getDescripcion(),formatoMoneda.format(b.getDeposito()),formatoMoneda.format(b.getDevolucion()),formatoMoneda.format(saldoInicial+(depositos))});
               
            }
            }else{
               for(Movimiento b : estado.getMovimientos()){
            //Validamos si la cantidad ingresada es deposito o retiro
            if(b.getTipo()==Tipo.Desposito){
                b.setDeposito(b.getCantidad());
                depositos+=b.getDeposito();
                
            }else{
                b.setDevolucion(b.getCantidad());
                devolucion+=b.getDevolucion();
                
            }
            //Imprimimos la tabla
                modelo.addRow(new Object []{formatFecha.format(b.getFecha()),b.getHora(),b.getDescripcion(),formatoMoneda.format(b.getDeposito()),formatoMoneda.format(b.getDevolucion()),formatoMoneda.format(depositos)});
                
                //Convertimos a String y lo mostramos en la interfaz.
                String depositosString = Integer.toString((int) depositos);
                lblSubTotal.setText(depositosString);
           }
           }
           
           
       }catch(Exception e){
           //Si ocurre algo mal en el momento de realizar la ccion de llamado se mostrara un mensaje de error.
           System.err.print("Ops, ocurrio un error" + e.getMessage());
       }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCp;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreTienda;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JComboBox<String> seleccionMeses;
    private javax.swing.JTable tblMovimientos;
    // End of variables declaration//GEN-END:variables
}
