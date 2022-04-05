import com.example.biografbackendspring.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository

public class SalonDAO {

    @Autowired

    private JdbcTemplate jdbcTemplate;

    public void insertSalon(int id, int theaterId, String location, String theaterSeats) {

        String query = "INSERT INTO Salons (Salon_id, Salon_theaterId, Salon_location, Salon_theaterSeats,) VALUES(?,?,?,?)";

        int result = jdbcTemplate.update(query, id, theaterId, location, theaterSeats);

        if (result > 0) {
            System.out.println(result + " Salon added to database, good job dumbass");

        }
    }

    public Salon getSalonById(int id){

        String query = "SELECT * FROM Salons WHERE salon_id =?";

        Salon salon = jdbcTemplate.queryForObject(query, new RowMapper<Salon>() {
            @Override
            public Salon mapRow(ResultSet rs, int rowNum) throws SQLException {
                Salon sal = new Salon(rs.getInt("salon_id"),
                        rs.getInt("salon_theatreId"),
                        rs.getString("salon_location"),
                        rs.getString("salon_theaterSeats"));

                return sal;

            }
        }, id);

        return salon;



    }








}
