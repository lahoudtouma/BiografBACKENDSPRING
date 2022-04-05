package com.example.biografbackendspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository

    public class MoviesDAO{

        @Autowired

        private JdbcTemplate jdbcTemplate;

        public void insertMovies(int id, int theaterId, String name, String dateTime, String seatsAvailable) {

            String query = "INSERT INTO movies (Movies_id, Movies_theaterId, Movies_name, Movies_dateTime, Movies_seatsAvailable) VALUES(?,?,?,?,?)";

            int result = jdbcTemplate.update(query, id, theaterId, name, dateTime, seatsAvailable);

            if (result > 0) {
                System.out.println(result + " Movie added to database, good job dumbass");

            }
        }

            public Movies getMoviesById(int id){

                String query = "SELECT * FROM Movies WHERE movie_id =?";

                Movies movies = jdbcTemplate.queryForObject(query, new RowMapper<Movies>() {
                    @Override
                    public Movies mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Movies mov = new Movies(rs.getInt("movie_id"),
                                rs.getInt("movie_theatreId"),
                                rs.getString("movie_name"),
                                rs.getString("movie_dateTime"),
                                rs.getString("movie_seatsAvailable"));

                        return mov;

                    }
                }, id);

                return movies;



            }








    }


