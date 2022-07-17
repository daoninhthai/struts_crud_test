package com.stackjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import com.stackjava.models.User;
import com.stackjava.utils.JDBCConnection;

public class UserDAO {
	public User getUserById(int id) {
		String sql = "select * from user where id = ?";
		Connection connection = JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));

				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<User> getAllUser() {
		List<User> usersList = new ArrayList<User>();

		
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "select * from user";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				usersList.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usersList;
	}
	
	public void addUser(User user) {


		
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "insert into user(name,age) value(?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setInt(2, user.getAge());
			
			int  rs = preparedStatement.executeUpdate();
			
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
public void updateUser(User user) {


		
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "update user set name=? ,age=? where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setInt(2, user.getAge());
			preparedStatement.setInt(3, user.getId());
			int  rs = preparedStatement.executeUpdate();
			
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

public void deleteUser(int id) {


	
	Connection connection = JDBCConnection.getJDBCConnection();
	String sql = "delete from user where id = ?";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int  rs = preparedStatement.executeUpdate();
		
		

		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
	
	
	
	
	
}
