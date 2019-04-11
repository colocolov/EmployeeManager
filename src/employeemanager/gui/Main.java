package employeemanager.gui;

import employeemanager.models.MyEmployee;
import employeemanager.models.Employee;
import employeemanager.service.EmployeeService;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Стас
 */
public class Main extends javax.swing.JFrame {

    private final int ID = 0;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        printBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addEmplBtn = new javax.swing.JButton();
        editEmplBtn = new javax.swing.JButton();
        deleteEmpBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        employeesListTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main window");

        jLabel2.setText("Employees");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        importBtn.setText("Import");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        exportBtn.setText("Export");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addEmplBtn.setText("Add Employee");
        addEmplBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmplBtnActionPerformed(evt);
            }
        });

        editEmplBtn.setText("Edit Employee");
        editEmplBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmplBtnActionPerformed(evt);
            }
        });

        deleteEmpBtn.setText("Delete Employee");
        deleteEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteEmpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editEmplBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEmplBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmplBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editEmplBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Advanced");

        jLabel4.setText("Action");

        employeesListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Birthday", "Adress", "Position"
            }
        ));
        jScrollPane4.setViewportView(employeesListTable);
        if (employeesListTable.getColumnModel().getColumnCount() > 0) {
            employeesListTable.getColumnModel().getColumn(0).setMinWidth(25);
            employeesListTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            employeesListTable.getColumnModel().getColumn(0).setMaxWidth(25);
            employeesListTable.getColumnModel().getColumn(1).setMinWidth(110);
            employeesListTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            employeesListTable.getColumnModel().getColumn(1).setMaxWidth(110);
            employeesListTable.getColumnModel().getColumn(2).setMinWidth(110);
            employeesListTable.getColumnModel().getColumn(2).setPreferredWidth(110);
            employeesListTable.getColumnModel().getColumn(2).setMaxWidth(110);
            employeesListTable.getColumnModel().getColumn(3).setMinWidth(100);
            employeesListTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            employeesListTable.getColumnModel().getColumn(3).setMaxWidth(100);
            employeesListTable.getColumnModel().getColumn(4).setPreferredWidth(110);
            employeesListTable.getColumnModel().getColumn(5).setMinWidth(100);
            employeesListTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            employeesListTable.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton10.setText("Search");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Add");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void addEmployee(Employee emp) {
        if (emp.isValid()) {
            addEmployeeToList(emp);
        } else {
            //display error
        }
    }
    
    public static void editEmployee(int idEmployee, String newName, String newSurname, String newBirthday, String newCountry, String newCity, String newStreet, Integer newZip, String newPosition){
        DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeesListTable.getModel(); // так мы будем ссылаться на наши данные в таблице
        employeeListModel.setValueAt(newName, idEmployee - 1, 1);
        employeeListModel.setValueAt(newSurname, idEmployee - 1, 2);
        employeeListModel.setValueAt(newBirthday, idEmployee - 1, 3);
        employeeListModel.setValueAt(newCountry  + " / " +  newCity  + " / " +  newStreet + " / " +  newZip, idEmployee - 1, 4);
        employeeListModel.setValueAt(newPosition, idEmployee - 1, 5);
        EmployeeService.edit(idEmployee, newName, newSurname, newBirthday, newCountry, newCity, newStreet, newZip, newPosition);
    }

    private static void addEmployeeToList(Employee emp) {
        DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeesListTable.getModel(); // так мы будем ссылаться на наши данные в таблице
        int employeeId = employeeListModel.getRowCount() + 1;
        employeeListModel.addRow(new Object[]{employeeId, emp.getName(), emp.getSurname(), emp.getBirthday().toString(), 
            emp.getCountry().toString() + " / " +  emp.getCity().toString() + " / " + emp.getStreet() + " / " + emp.getZip(), 
            emp.getPosition().toString()});
        emp.setId(employeeId);
        EmployeeService.getEmployeesList().add(emp);
        
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addEmplBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmplBtnActionPerformed
        // кнопка AddEmployee
        Add addWindow = new Add();
        addWindow.setVisible(true);     // открывает окно Add
        //addWindow.setLocation(int 200, int 300);
        //setVisible(true); // закрывает текущее окно
    }//GEN-LAST:event_addEmplBtnActionPerformed

    private void editEmplBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmplBtnActionPerformed
        // кнопка EditEmployee
        int selectRow = Main.employeesListTable.getSelectedRow();
        if (selectRow != -1) { // если выбрана строка то мы делаем код
            DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeesListTable.getModel(); // так мы будем ссылаться на наши данные в таблице
            Object value = employeeListModel.getValueAt(selectRow, ID); // определяем какая была выбрана строка и колонка 
            Integer employeeId = Integer.parseInt(value.toString());
            Employee foundEmployee = EmployeeService.getById(employeeId);
            
            Edit editWindow = new Edit(foundEmployee);
            editWindow.setVisible(true); // открывает окно Edit
            //setVisible(true); // закрывает текущее окно
        }
    }//GEN-LAST:event_editEmplBtnActionPerformed

    private void deleteEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpBtnActionPerformed
        // кнопка DeleteEmployee
        
        int selectedRow = Main.employeesListTable.getSelectedRow();
        if (selectedRow != -1) { // если выбрана строка то мы делаем код
            DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeesListTable.getModel(); // так мы будем ссылаться на наши данные в таблице
            // employeeService
            // read id
            // EmployeeService.delete(id)
            Object value = employeeListModel.getValueAt(selectedRow, ID); // определяем какая была выбрана строка и колонка 
            Integer employeeId = Integer.parseInt(value.toString());
            employeeListModel.removeRow(selectedRow);
            EmployeeService.delete(employeeId);
            
        }
    }//GEN-LAST:event_deleteEmpBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        EmployeeService.getEmployeesListToPrint();
    }//GEN-LAST:event_printBtnActionPerformed

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        // TODO add your handling code here:
        Import importWindow = new Import();
        importWindow.setVisible(true);
    }//GEN-LAST:event_importBtnActionPerformed

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        // TODO add your handling code here:
        Export exportWindow = new Export();
        exportWindow.setVisible(true);
    }//GEN-LAST:event_exportBtnActionPerformed

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
    private javax.swing.JButton addEmplBtn;
    private javax.swing.JButton deleteEmpBtn;
    private javax.swing.JButton editEmplBtn;
    public static javax.swing.JTable employeesListTable;
    private javax.swing.JButton exportBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
