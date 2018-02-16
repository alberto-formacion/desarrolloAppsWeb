package ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.Usuario;

public class UsuarioService {
	private static Connection conexion = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	private static void crearConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void cerrarConexion() {
		try {
			if(rs!=null) {
				rs.close();
			}
			
			if(ps!=null) {
				ps.close();
			}
			
			if(conexion!=null) {
				conexion.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Usuario[] getUsuarios(){
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("select nombre, apellidos, email from Alumnos");
			
			rs = ps.executeQuery();
			
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString("nombre"));
				u.setApellidos(rs.getString("apellidos"));
				u.setEmail(rs.getString("email"));
				
				usuarios.add(u);
			}
			
			return usuarios.toArray(new Usuario[usuarios.size()]);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		
		return null;
	}
}
