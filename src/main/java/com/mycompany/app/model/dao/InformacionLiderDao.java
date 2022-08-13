package com.mycompany.app.model.dao;

import java.sql.Connection;
import java.sql.Statement;






import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.mycompany.app.util.JDBCUtilities;

import com.mycompany.app.model.vo.InformacionLiderVo;


public class InformacionLiderDao {
       
    public List<InformacionLiderVo> Listar() throws Exception{


        ArrayList<InformacionLiderVo> result = new ArrayList<InformacionLiderVo>();

        ResultSet rs = null;
        Connection  connection = JDBCUtilities.getConnection();
        Statement statement = null;
        String Consulta = "SELECT ID_Lider,Nombre ,Primer_Apellido, Ciudad_Residencia"
                           +" FROM Lider l"
                           +" ORDER BY Ciudad_Residencia ASC;";


                try {
                    statement = connection.createStatement();
                    rs = statement.executeQuery(Consulta);
                    while (rs.next()) {
                        InformacionLiderVo objeto = new InformacionLiderVo();
                       objeto.setId(rs.getInt("ID_Lider"));
                       objeto.setNombre(rs.getString("Nombre"));
                       objeto.setPrimerApellido(rs.getString("Primer_Apellido"));
                       objeto.setCiudadRecidencia(rs.getString("Ciudad_Residencia"));
                       
                       result.add(objeto);



                    }




                } finally {
                  
                    if (rs != null){
                    rs.close();
                    }
                    if (statement != null) {
                    statement.close();
                    }
                    if (connection != null){
                    connection.close();
                    }
                    
    }


    


   
    
    
    return result;

}

}
