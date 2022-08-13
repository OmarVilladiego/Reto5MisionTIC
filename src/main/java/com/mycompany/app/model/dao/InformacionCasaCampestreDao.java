package com.mycompany.app.model.dao;
import java.sql.Connection;
import java.sql.Statement;



import com.mycompany.app.util.JDBCUtilities;


import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import com.mycompany.app.model.vo.InformacionCasaCampestreVo;

public class InformacionCasaCampestreDao {
    public List<InformacionCasaCampestreVo> Listar() throws Exception{


        ArrayList<InformacionCasaCampestreVo> result = new ArrayList<>();

        ResultSet rs = null;
        Connection  connection = JDBCUtilities.getConnection();
        Statement statement = null;
        String Consulta =
        "SELECT p.ID_Proyecto AS ID, constructora,Numero_Habitaciones, ciudad"
                +" FROM Proyecto p"
                +" WHERE Ciudad IN('Santa Marta','Cartagena','Barranquilla')"
                +" AND Clasificacion = 'Casa Campestre';";
        
        


                try {
                    statement = connection.createStatement();
                    
                    rs = statement.executeQuery(Consulta);
                    while (rs.next()) {
                        InformacionCasaCampestreVo objeto = new InformacionCasaCampestreVo();
                        objeto.setIdproyecto(rs.getInt("id"));
                        objeto.setConstructora(rs.getString("constructora"));
                        objeto.setNumerohabitaciones(rs.getInt("Numero_Habitaciones"));
                        objeto.setCiudad(rs.getString("ciudad"));
                        
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
