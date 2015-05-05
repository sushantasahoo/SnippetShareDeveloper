/**
 * 
 */
package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.AddressVO;
import edu.sjsu.cmpe275.group12.model.UserVO;

/**
 * @author Vaibhav
 *
 */
public class UserMapper implements RowMapper<UserVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserVO user = new UserVO();
		AddressVO address = new AddressVO();
		user.setUserId(rs.getInt("user_id"));
	    user.setFirstname(rs.getString("first_name"));
	    user.setLastname(rs.getString("last_name"));
	    user.setEmail(rs.getString("email"));
	    user.setPassword(rs.getString("password"));
	    user.setMobileNumber(rs.getLong("mobile_number"));
	    address.setStreet(rs.getString("street"));
	    address.setCity(rs.getString("city"));
	    address.setState(rs.getString("state"));
	    address.setZip(rs.getInt("zip"));
	    user.setAddress(address);
	    return user;
	}

}
