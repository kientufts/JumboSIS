package form;

import Student.Student;
import Student.StudentModel;
import Student.StudentQuery;
import Utils.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.JTableHeader;

/**
 *
 * @author kienle
 */
public class studentForm extends javax.swing.JFrame {

    /**
     * Creates new form studentForm
     */
    String imagePth = null;
    public static int currentUserId;

    public studentForm() {
        initComponents();

        populateJTable();
        jTable1.setShowGrid(true);
        jTable1.setSelectionBackground(Color.lightGray);
        JTableHeader th = jTable1.getTableHeader();
        th.setForeground(Color.BLUE);
        th.setFont(new Font("Tahoma", Font.BOLD, 12));

        System.out.println(currentUserId + "From Student");
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
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelUserPic = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxClass = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabelStudentPic = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jButtonBrowse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAddStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEditStudent = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonDeleteStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(910, 376));
        setMinimumSize(new java.awt.Dimension(910, 376));
        setUndecorated(true);
        setSize(new java.awt.Dimension(910, 376));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(416, 49));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Info");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 10, 170, 30);

        jLabelClose.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(880, 10, 20, 30);

        jLabelMin.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin);
        jLabelMin.setBounds(860, 10, 20, 30);

        jLabelUserPic.setBackground(new java.awt.Color(255, 255, 0));
        jLabelUserPic.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabelUserPic.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabelUserPic.setOpaque(true);
        jLabelUserPic.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabelUserPic.setSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabelUserPic);
        jLabelUserPic.setBounds(0, 0, 50, 50);

        jLabelUsername.setBackground(new java.awt.Color(255, 204, 102));
        jLabelUsername.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 204));
        jLabelUsername.setText("Username");
        jPanel1.add(jLabelUsername);
        jLabelUsername.setBounds(60, 10, 110, 20);

        jLabel4.setText("First Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("Phone:");

        jLabel7.setText("Email:");

        jLabel8.setText("Class:");

        jComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science", "Eletrical Engineering", "Computer Engineering", "Maths" }));

        jLabel9.setText("Profile Picture:");

        jLabelStudentPic.setBackground(new java.awt.Color(102, 255, 255));
        jLabelStudentPic.setOpaque(true);

        jLabel11.setText("Address:");

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jButtonBrowse.setBackground(new java.awt.Color(51, 153, 255));
        jButtonBrowse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBrowse.setText("Browse");
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonAddStudent.setBackground(new java.awt.Color(51, 153, 255));
        jButtonAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddStudent.setText("Add");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonEditStudent.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEditStudent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jLabel10.setText("ID:");

        jButtonDeleteStudent.setBackground(new java.awt.Color(51, 153, 255));
        jButtonDeleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteStudent.setText("Delete");
        jButtonDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStudentPic, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBrowse)
                                    .addComponent(jLabelStudentPic, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateJTable() {
        StudentQuery stdQ = new StudentQuery();
        ArrayList<Student> stdList = stdQ.studentList(currentUserId);
        String[] colNames = {"Id", "First Name", "Last Name", "Class", "Phone", "Email", "Address", "Image"};
        Object[][] rows = new Object[stdList.size()][8];

        for (int i = 0; i < stdList.size(); i++) {
            rows[i][0] = stdList.get(i).getSid();
            rows[i][1] = stdList.get(i).getFname();
            rows[i][2] = stdList.get(i).getLname();
            rows[i][3] = stdList.get(i).getClassS();
            rows[i][4] = stdList.get(i).getPhone();
            rows[i][5] = stdList.get(i).getEmail();
            rows[i][6] = stdList.get(i).getAddress();

            ImageIcon pic = new ImageIcon(new ImageIcon(stdList.get(i).getPic()).getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH));

            rows[i][7] = pic;
            StudentModel stdModel = new StudentModel(rows, colNames);
            jTable1.setModel(stdModel);
            jTable1.setRowHeight(40);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(70);
        }
    }

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        ImageUtil imgUtil = new ImageUtil();
        imagePth = imgUtil.browseImage(jLabelStudentPic);
        System.out.println(imagePth);
    }//GEN-LAST:event_jButtonBrowseActionPerformed

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        String fname = jTextFieldFname.getText();
        String lname = jTextFieldLname.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        String address = jTextAreaAddress.getText();
        String classS = jComboBoxClass.getSelectedItem().toString();
        byte[] img = null;
        try {

            Path pth = Paths.get(imagePth);
            img = Files.readAllBytes(pth);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        Student std = new Student(null, fname, lname, classS, phone, email, address, img, currentUserId);

        StudentQuery stdQ = new StudentQuery();
        stdQ.insertStudent(std);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // display selected Jtable row data

        // get selected row index
        int rowIndex = jTable1.getSelectedRow();
        jTextFieldId.setText(jTable1.getValueAt(rowIndex, 0).toString());
        jTextFieldFname.setText(jTable1.getValueAt(rowIndex, 1).toString());
        jTextFieldLname.setText(jTable1.getValueAt(rowIndex, 2).toString());
        jComboBoxClass.setSelectedItem(jTable1.getValueAt(rowIndex, 3).toString());
        jTextFieldPhone.setText(jTable1.getValueAt(rowIndex, 4).toString());
        jTextFieldEmail.setText(jTable1.getValueAt(rowIndex, 5).toString());
        jTextAreaAddress.setText(jTable1.getValueAt(rowIndex, 6).toString());
        Image pic = ((ImageIcon) jTable1.getValueAt(rowIndex, 7)).getImage().getScaledInstance(jLabelStudentPic.getWidth(), jLabelStudentPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(pic);
        jLabelStudentPic.setIcon(img);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        int id = Integer.valueOf(jTextFieldId.getText());
        String fname = jTextFieldFname.getText();
        String lname = jTextFieldLname.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        String address = jTextAreaAddress.getText();
        String classS = jComboBoxClass.getSelectedItem().toString();
        // if the user want to update data and the profile pic
        if (imagePth != null) {
            byte[] img = null;
            try {

                Path pth = Paths.get(imagePth);
                img = Files.readAllBytes(pth);

                Student std = new Student(id, fname, lname, classS, phone, email, address, img, currentUserId);

                StudentQuery stdQ = new StudentQuery();
                stdQ.updateStudent(std, true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Student std = new Student(id, fname, lname, classS, phone, email, address, null, currentUserId);

            StudentQuery stdQ = new StudentQuery();
            stdQ.updateStudent(std, false);
        }


    }//GEN-LAST:event_jButtonEditStudentActionPerformed

    private void jButtonDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteStudentActionPerformed
        int id = Integer.valueOf(jTextFieldId.getText());
        StudentQuery stdQ = new StudentQuery();
        stdQ.deleteStudent(id);
    }//GEN-LAST:event_jButtonDeleteStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonDeleteStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JComboBox<String> jComboBoxClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelStudentPic;
    public javax.swing.JLabel jLabelUserPic;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
