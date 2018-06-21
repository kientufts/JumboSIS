package Student;

import Connector.myConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kienle
 */
public class StudentQuery {

    public boolean insertStudent(Student std) {
        boolean isInserted = true;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO `student`(`fname`, `lname`, `class`, `phone`, `email`, `address`, `pic`, `userId`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, std.getFname());
            ps.setString(2, std.getLname());
            ps.setString(3, std.getClassS());
            ps.setString(4, std.getPhone());
            ps.setString(5, std.getEmail());
            ps.setString(6, std.getAddress());
            ps.setBytes(7, std.getPic());
            ps.setInt(8, std.getUid());

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "New Student Added");
                isInserted = true;
            } else {
                JOptionPane.showMessageDialog(null, "Something Wrong");
                isInserted = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isInserted;
    }

    // create a list of students
    public ArrayList<Student> studentList(int userId) {
        ArrayList<Student> sList = new ArrayList<>();

        Connection con = myConnection.getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `fname`, `lname`, `class`, `phone`, `email`, `address`, `pic` FROM `student` WHERE userid = " + userId);

            Student std;

            while (rs.next()) {
                std = new Student(rs.getInt("id"),
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getString("class"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getBytes("pic"),
                        0);
                
                sList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sList;
    }
}
