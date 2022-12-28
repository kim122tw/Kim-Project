package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Order;

public class orderDaoimpl implements orderDao {
	
	public static void main(String[] args) {
		//new orderDaoimpl().add(new Order("C桌", 1, 1, 6));
		//System.out.print(new orderDaoimpl().queryId(4)); 
		List<Object> l = new orderDaoimpl().queryId(4);
		Order[] o = l.toArray(new Order[l.size()]);
		
		o[0].setDesk("A桌");
		
		new orderDaoimpl().update(o[0]);
		
	}

	@Override
	public void add(Object o) {
		Connection conn = ConDB.getDb();
		String sql = "insert into menu(desk, A, B, C, sum) values(?, ?, ?, ?, ?)";
		Order or = (Order) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql); 
			ps.setString(1, or.getDesk());
			ps.setInt(2, or.getA());
			ps.setInt(3, or.getB());
			ps.setInt(4, or.getC());
			ps.setInt(5, or.getSum());
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Object> queryall() {
		Connection conn = ConDB.getDb();
		String sql = "select * from menu";
		List l = new ArrayList<>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Order or = new Order();
				or.setDesk(rs.getString("desk"));
				or.setA(rs.getInt("A"));
				or.setB(rs.getInt("B"));
				or.setC(rs.getInt("C"));
				or.setSum(rs.getInt("sum"));
				or.setId(rs.getInt("id"));
				l.add(or);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Object> querysum(int start, int end) {
		Connection conn = ConDB.getDb();
		String sql = "select * from menu where sum >= ? and sum <= ?";
		List l = new ArrayList<>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order or = new Order();
				or.setId(rs.getInt("id"));
				or.setDesk(rs.getString("desk"));
				or.setA(rs.getInt("A"));
				or.setB(rs.getInt("B"));
				or.setC(rs.getInt("C"));
				or.setSum(rs.getInt("sum"));
				
				l.add(or);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Object> queryId(int id) {
		Connection conn = ConDB.getDb();
		String sql = "select * from menu where id = ?";
		List l = new ArrayList<>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Order or = new Order();
				or.setId(rs.getInt("id"));
				or.setDesk(rs.getString("desk"));
				or.setA(rs.getInt("A"));
				or.setB(rs.getInt("B"));
				or.setC(rs.getInt("C"));
				or.setSum(rs.getInt("sum"));
				
				l.add(or);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public void update(Object o) {
		Connection conn = ConDB.getDb();
		String sql = "update menu set desk = ?, A = ?, B = ?, C = ?, sum = ? where id = ?";
		Order or = (Order) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql); 
			ps.setString(1, or.getDesk());
			ps.setInt(2, or.getA());
			ps.setInt(3, or.getB());
			ps.setInt(4, or.getC());
			ps.setInt(5, or.getSum());
			ps.setInt(6, or.getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		Connection conn = ConDB.getDb();
		String sql = "delete from menu where id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
