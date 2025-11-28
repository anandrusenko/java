package dao;

import model.Student;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getStudentsByMonth(int month) {

        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students WHERE strftime('%m', birth_date) = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, String.format("%02d", month));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("last_name"),
                        rs.getString("first_name"),
                        rs.getString("middle_name"),
                        rs.getString("birth_date"),
                        rs.getString("gradebook_number")
                ));
            }

        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }

        return list;
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("last_name"),
                        rs.getString("first_name"),
                        rs.getString("middle_name"),
                        rs.getString("birth_date"),
                        rs.getString("gradebook_number")
                ));
            }

        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }

        return list;
    }
}
