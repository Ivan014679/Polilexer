/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polilexer;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iván
 */
public class SymbolTableInterface extends javax.swing.JDialog {

    /**
     * Creates new form SymbolTable_Interface
     * @param parent
     * @param tokens
     */
    public SymbolTableInterface(javax.swing.JFrame parent, String[][] tokens) {
        super(parent, true);
        initComponents();
        otherInitComponents(tokens);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jSymbolTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla de símbolos");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tokens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10), new java.awt.Color(204, 204, 204))); // NOI18N
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        jSymbolTable.setBackground(new java.awt.Color(51, 51, 51));
        jSymbolTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSymbolTable.setForeground(new java.awt.Color(204, 204, 204));
        jSymbolTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Contenido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jSymbolTable);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otherInitComponents(String[][] tokens){
        try{
            DefaultTableModel table;
            table = (DefaultTableModel) jSymbolTable.getModel();
            for (String[] token : tokens) {
                table.addRow(token);
            }
            jSymbolTable.setModel(table);
        }catch(java.lang.NullPointerException ex){            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jSymbolTable;
    // End of variables declaration//GEN-END:variables
}