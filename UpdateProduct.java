package com.inventorymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class UpdateProduct {

	public void addProduct(Product product)throws Exception {
		String sql="Insert into product values(?,?,?,?)";
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement pst=conn.prepareStatement(sql)){
				pst.setString(1,product.getName());
				pst.setString(2, product.getCategory());
				pst.setDouble(3, product.getPrice());
				pst.setInt(4, product.getQuantity());
				pst.executeUpdate();
			}
		}
	public List<Product> getAllProducts() throws Exception{
		String sql="Select * from product";
		List<Product> products=new ArrayList<>();
		try(Connection conn=DBConnection.getConnection();
				Statement st=conn.createStatement()){
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
					Product p=new Product();
					p.setName(rs.getString("name"));
					p.setCategory(rs.getString("category"));
					p.setQuantity(rs.getInt("Quantity"));
					p.setPrice(rs.getInt("price"));
					products.add(p);
				}
			}
		return products;
		}
	
	public boolean updateProduct(String name,double price,int quantity) throws Exception {
		String sql="update product set price= ?,quantity=? where name=?";
		try(Connection conn=DBConnection.getConnection();
				PreparedStatement pst=conn.prepareStatement(sql)){
			pst.setDouble(1,price);
			pst.setInt(2,quantity);
			pst.setString(3, name);
			return pst.executeUpdate() >0;
		}
		}
	public boolean deleteProduct(String name)throws Exception {
		String sql="delete from products where name=?";
		try(Connection conn=DBConnection.getConnection();
				PreparedStatement pst=conn.prepareStatement(sql)){
			pst.setString(1, name);
			return pst.executeUpdate()>0;
		}
	}
	
	}
	

