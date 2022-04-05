import com.example.biografbackendspring.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StaffDAO {

    @Autowired

    private JdbcTemplate jdbcTemplate;

    public void insertMovies(int id, String name, String phone, String userName, String passWord) {

        String query = "INSERT INTO Staff (Staff_id, Staff_name, Staff_phone, Staff_userName, Staff_passWord) VALUES(?,?,?,?,?)";

        int result = jdbcTemplate.update(query, id, name, phone, userName, passWord);

        if (result > 0) {
            System.out.println(result + " Salon added to database, good job dumbass");

        }

    }

    public Staff getStaffById(int id){

        String query = "SELECT * FROM Staff WHERE Staff_id =?";

        Staff staff = jdbcTemplate.queryForObject(query, new RowMapper<Staff>() {
            @Override
            public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
                Staff staff1 = new Staff(rs.getInt("Staff_id"),
                        rs.getString("Staff_name"),
                        rs.getString("Staff_phone"),
                        rs.getString("Staff_userName"),
                        rs.getString("Staff_passWord"));

                return staff1;

            }
        }, id);

        return staff;



    }





}
