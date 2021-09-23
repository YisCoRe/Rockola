package DAO;

import java.util.ArrayList;
import TO.TOusuario;
import db.ConexionDB;

public class DAOUsuarios {
	
    private ConexionDB con = new ConexionDB();

    public DAOUsuarios() {
    }
        
     public ArrayList<TOusuario> consultarUsuarios(){
         ArrayList<TOusuario> usuario = new ArrayList<>();
         con.consultar("Usuarios");
         return null;
     }   
        
	
}
