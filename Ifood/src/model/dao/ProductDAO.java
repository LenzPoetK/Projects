/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.Product;

/**
 *
 * @author leona
 */
public class ProductDAO {
    
    public void create(Product p) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO products(name, price, description, role, prep_time) VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setString(3, p.getDescription());
            stmt.setString(4, p.getRole());
            stmt.setString(5, p.getPrepTime());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Saved successfully");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Save error: " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Product> findAll() throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Product> products = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM products");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Product product = new Product();
                
                product.setId(rs.getInt("id"));
                product.setDescription(rs.getString("description"));
                product.setName(rs.getString("name"));
                product.setPrepTime(rs.getString("prep_time"));
                product.setRole(rs.getString("role"));
                product.setPrice(rs.getDouble("price"));
                
                products.add(product);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unsuccessful connection", "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return products;
    }
    
    public void update(Product p) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE products SET name=?, price=?, description=?, role=?, prep_time=? WHERE id = ?");
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setString(3, p.getDescription());
            stmt.setString(4, p.getRole());
            stmt.setString(5, p.getPrepTime());
            stmt.setInt(6, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updated successfully");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Update error: " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Product p) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM products WHERE id = ?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deleted successfully");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Delete error: " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
