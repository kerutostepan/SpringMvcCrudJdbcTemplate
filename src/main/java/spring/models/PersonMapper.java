package spring.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt(1));
        person.setName(rs.getString(2));
        person.setAge(rs.getInt(3));
        person.setEmail(rs.getString(4));
        return person;
    }
}
