package org.techhub.PRACTICE_MVC_APPLICATION.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.PRACTICE_MVC_APPLICATION.Model.Employee;

@Repository("empRepo")
public class EmployeeRepository {

	@Autowired
	JdbcTemplate template;
	List<Employee> list;

	public boolean isAdd(final Employee e) {
		int val = template.update("insert into employeee values('0',?,?,?)", new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, e.getName());
				ps.setString(2, e.getEmail());
				ps.setInt(3, e.getSal());
			}
		});
		if (val > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<Employee> ViewEmployee() {
		list = template.query("select * from employeee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setSal(rs.getInt(4));
				return e;
			}
		});
		return list;
	}

	public boolean isDelete(final int id) {
		try {
			int v = template.update("delete from employeee where id=?", new PreparedStatementSetter() {
				public void setValues(PreparedStatement ps) throws SQLException {
				     ps.setInt(1,id);
				}
			});
			if(v>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (Exception ex) {
			System.out.println("exception is " + ex);
			return false;
		}
		
	}
	public boolean isUpdate(final Employee e) {
		int v=template.update("update employeee set name=?,email=?,sal=? where id=?",new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
			     ps.setString(1,e.getName());
			     ps.setString(2,e.getEmail());
			     ps.setInt(3,e.getSal());
			     ps.setInt(4,e.getId());
			}
		});
		if(v>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public List<Employee> SearchByName(String name)
	{
		list=template.query("select * from where name=?",new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setSal(rs.getInt(4));
				return e;
			}	
		});
		return list;
	}

}
