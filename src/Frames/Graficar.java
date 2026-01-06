/*
 * Alan Yahir Japhet Gómez Mireles
 */
package Frames;

import Clases.Catalogo;
import Clases.Hospitales;
import Clases.Medico_Paciente;
import Clases.Medicos;
import Clases.Pacientes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author alany
 */
public class Graficar extends javax.swing.JFrame implements Printable {
//Llamado a las clases para usar sus métodos
    Catalogo ct = new Catalogo();
    Hospitales ht = new Hospitales();
    Medico_Paciente mp = new Medico_Paciente();
    Medicos md = new Medicos();
    Pacientes pc = new Pacientes();

    public Graficar() {
        initComponents();
        //Colocar color al frame
        this.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCatalogo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHospitales = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMed_Pac = new javax.swing.JTable();
        jButGraficar = new javax.swing.JButton();
        jButMostrar = new javax.swing.JButton();
        jButSalir = new javax.swing.JButton();
        jPanelGraficas = new javax.swing.JPanel();
        jButLimpiar = new javax.swing.JButton();
        jButBorrar = new javax.swing.JButton();
        jButImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jRad1 = new javax.swing.JRadioButton();
        jRad2 = new javax.swing.JRadioButton();
        jRad3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GraphingData By Alan Gómez  Mireles");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Graficación de datos");
        jLabel3.setOpaque(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));

        jTablePacientes.setBackground(new java.awt.Color(255, 255, 204));
        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_paciente", "Nombre", "ApPaterno", "ApMaterno", "Edad", "Sexo", "Telefono", "Id_cts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Tabla_Pacientes", jPanel1);

        jTableCatalogo.setBackground(new java.awt.Color(255, 255, 204));
        jTableCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_cts", "TipoSangre", "PorcentajeRareza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCatalogo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tabla_Catalogo", jPanel2);

        jTableHospitales.setBackground(new java.awt.Color(255, 255, 204));
        jTableHospitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_hospital", "NombreHospital", "Dirreción", "AñosOperando"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableHospitales);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tabla_Hospitales", jPanel3);

        jTableMedicos.setBackground(new java.awt.Color(255, 255, 204));
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_medico", "NombreM", "ApPaternoM", "ApMaternoM", "Edad", "AñosExperiencia", "FamiliasAtiende", "Id_hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableMedicos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tabla_Medicos", jPanel4);

        jTableMed_Pac.setBackground(new java.awt.Color(255, 255, 204));
        jTableMed_Pac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_medico", "Id_paciente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableMed_Pac);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tabla_Medico_Paciente", jPanel5);

        jButGraficar.setBackground(new java.awt.Color(255, 204, 204));
        jButGraficar.setText("Graficar");
        jButGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGraficarActionPerformed(evt);
            }
        });

        jButMostrar.setBackground(new java.awt.Color(255, 204, 204));
        jButMostrar.setText("Mostrar Datos");
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });

        jButSalir.setBackground(new java.awt.Color(255, 0, 0));
        jButSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButSalir.setText("Salir");
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });

        jPanelGraficas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGraficasLayout = new javax.swing.GroupLayout(jPanelGraficas);
        jPanelGraficas.setLayout(jPanelGraficasLayout);
        jPanelGraficasLayout.setHorizontalGroup(
            jPanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficasLayout.setVerticalGroup(
            jPanelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButLimpiar.setBackground(new java.awt.Color(255, 204, 204));
        jButLimpiar.setText("Limpiar Datos");
        jButLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLimpiarActionPerformed(evt);
            }
        });

        jButBorrar.setBackground(new java.awt.Color(255, 204, 204));
        jButBorrar.setText("Borrar Grafica");
        jButBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBorrarActionPerformed(evt);
            }
        });

        jButImprimir.setBackground(new java.awt.Color(255, 204, 204));
        jButImprimir.setText("Imprimir");
        jButImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButImprimirActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jRad1.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jRad1);
        jRad1.setText("Grafica de Linea");

        jRad2.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jRad2);
        jRad2.setText("Grafica Escalonada");
        jRad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRad2ActionPerformed(evt);
            }
        });

        jRad3.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(jRad3);
        jRad3.setText("Grafica de Área");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRad1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRad2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRad3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButSalir))
                    .addComponent(jButGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButBorrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButGraficar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButImprimir)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // Método mostrar de cada clase, ubicado para cada tabla
        ct.mostrarDatosCatalogo(jTableCatalogo);
        ht.mostrarDatosHospitales(jTableHospitales);
        mp.mostrarDatosMed_Pac(jTableMed_Pac);
        md.mostrarDatosMedicos(jTableMedicos);
        pc.mostrarDatosPacientes(jTablePacientes);
    }//GEN-LAST:event_jButMostrarActionPerformed

    private void jButGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGraficarActionPerformed
        //Si jRad1 esta seleccionado, generara la grafica de linea
        if (jRad1.isSelected()) {
            //Obtiene el valor de renglones de las tablas, 8 = general
            int z = jTablePacientes.getRowCount();
            //Creamos arreglos para tomar los valores de x y y
            int x[] = null;
            x = new int[z];
            int y[] = null;
            y = new int[z];
            
            //Obtenemos los valores de x, a partir de la tabla Pacientes y la columna 7
            for (int i = 0; i < z; i++) {

                x[i] = Integer.parseInt((String) jTablePacientes.getValueAt(i, 7));
            }
            //Los ordenamos
            Arrays.sort(x);
            //Obtenemos los valores de y, a partir de la tabla Catalogo y columna 2
            for (int i = 0; i < z; i++) {
                y[i] = Integer.parseInt((String) jTableCatalogo.getValueAt(i, 2));
            }
            //Generamos el objeto XYSeries para dar los valores de x y y
            XYSeries obj = new XYSeries("Relación TipoSangre/PorcentajeRareza");
            for (int i = 0; i < z; i++) {
                obj.add(x[i], y[i]);
            }
            //Guardamos los valores de x y y en el dataset
            XYSeriesCollection oDataset = new XYSeriesCollection();
            oDataset.addSeries(obj);
            //Generamos la grafica
            JFreeChart chart = ChartFactory.createXYLineChart("Relación", "TipoSangrePaciente", "PorcentajeRareza", oDataset, PlotOrientation.VERTICAL, true, false, false);
            //Colocamos el panel y mostramos la grafica en el panel
            ChartPanel panel = new ChartPanel(chart);
            jPanelGraficas.setLayout(new java.awt.BorderLayout());
            jPanelGraficas.add(panel);
            jPanelGraficas.validate();
            
        } else if (jRad2.isSelected()) {
            //si jRad2 esta seleccionado, se genera la grafica escalalonada
            //Obtenemos el tamaño de renglones de la tabla
            int z = jTablePacientes.getRowCount();
            //Creamos los arreglos para tomar los valores de x y y
            int x[] = null;
            x = new int[z];
            int y[] = null;
            y = new int[z];
            //Obtenemos los valores de x a partir de la tabla pacientes columna 4
            for (int i = 0; i < z; i++) {

                x[i] = Integer.parseInt((String) jTablePacientes.getValueAt(i, 4));
            }
            //Obtenemos los valores de y a partir de la tabla medicos columna 4
            for (int i = 0; i < z; i++) {
                y[i] = Integer.parseInt((String) jTableMedicos.getValueAt(i, 4));
            }
            //Generamos nuestro objeto XYSeries para guardar los valores de x y y
            XYSeries obj = new XYSeries("Comparativa EdadPacientes/EdadMedicos");
            for (int i = 0; i < z; i++) {
                obj.add(x[i], y[i]);
            }
            //Guardamos el objeto XYSeries para asignar valores al DataSet
            XYSeriesCollection oDataset = new XYSeriesCollection();
            oDataset.addSeries(obj);
            JFreeChart chart2 = ChartFactory.createXYStepChart("Comparativa", "EdadPacientes", "EdadMedicos", oDataset);
            //Mostramos el panel ylo validamos
            ChartPanel panel = new ChartPanel(chart2);
            jPanelGraficas.setLayout(new java.awt.BorderLayout());
            jPanelGraficas.add(panel);
            jPanelGraficas.validate();

        } else if (jRad3.isSelected()) {
            //Si jRad3 esta seleccionado mostraremos la grafica de Área
            //Obtenemos el tamaño de renglones de la tabla general=8
            int z = jTableHospitales.getRowCount();
            //Creamos los arreglos para tomar valores de x y y
            int x[] = null;
            x = new int[z];
            int y[] = null;
            y = new int[z];
            //Obtenemos los valores de x a partir de la tabla Hospitales columna 3
            for (int i = 0; i < z; i++) {

                x[i] = Integer.parseInt((String) jTableHospitales.getValueAt(i, 3));
            }
            //Obtenemos los valores de y a partir de la tabla Medicos columna 5
            for (int i = 0; i < z; i++) {
                y[i] = Integer.parseInt((String) jTableMedicos.getValueAt(i, 5));
            }
            //Creamos nuestro objeto XYSeries para asignar los valores de x y y
            XYSeries obj = new XYSeries("Comparativa AñosOperaciónHospital/AñosExperienciaMédico");
            for (int i = 0; i < z; i++) {
                obj.add(x[i], y[i]);
            }
            //Guardamos los valores de x y y en el dataset
            XYSeriesCollection oDataset = new XYSeriesCollection();
            oDataset.addSeries(obj);
            //Generamos la grafica
            JFreeChart chart3 = ChartFactory.createXYAreaChart("Comparativa Hospital-Médicos", "AñosOperaciónHospital", "AñosExperienciaMédicos", oDataset);
            //Mostramos la grafica en el panel
            ChartPanel panel = new ChartPanel(chart3);
            jPanelGraficas.setLayout(new java.awt.BorderLayout());
            jPanelGraficas.add(panel);
            jPanelGraficas.validate();
        }
    }//GEN-LAST:event_jButGraficarActionPerformed

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
        // Salir del frame
        dispose();
    }//GEN-LAST:event_jButSalirActionPerformed

    private void jButBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBorrarActionPerformed
        // Borrar los componentes y volver a darle base
        jPanelGraficas.removeAll();
        jPanelGraficas.repaint();
    }//GEN-LAST:event_jButBorrarActionPerformed

    private void jButImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButImprimirActionPerformed
        // Metodo Printer para imprimir
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean doPrint = job.printDialog(); // mostrar diálogo de impresión
        if (doPrint) {
            try {
                job.setJobName("");
                job.print();
            } catch (PrinterException e) {
                // aquí maneja los errores al imprimir
                
            }
        }
    }//GEN-LAST:event_jButImprimirActionPerformed

    private void jButLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLimpiarActionPerformed
        // Limpiar tablas con el método limpiar
        limpiar(jTablePacientes);
        limpiar(jTableHospitales);
        limpiar(jTableMedicos);
        limpiar(jTableCatalogo);
        limpiar(jTableMed_Pac);
    }//GEN-LAST:event_jButLimpiarActionPerformed

    private void jRad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRad2ActionPerformed

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
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButBorrar;
    private javax.swing.JButton jButGraficar;
    private javax.swing.JButton jButImprimir;
    private javax.swing.JButton jButLimpiar;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JButton jButSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelGraficas;
    private javax.swing.JRadioButton jRad1;
    private javax.swing.JRadioButton jRad2;
    private javax.swing.JRadioButton jRad3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCatalogo;
    private javax.swing.JTable jTableHospitales;
    private javax.swing.JTable jTableMed_Pac;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTable jTablePacientes;
    // End of variables declaration//GEN-END:variables

    @Override
    //Método para imprimir el frame
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {

            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        g2d.scale(pageFormat.getImageableWidth() / this.getWidth(), pageFormat.getImageableHeight() / this.getHeight());
        this.printAll(g2d);
        return PAGE_EXISTS;

    }
    //Método para limpiar la tabla, asignando a los renglones el valor de 0
    public void limpiar(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

}
