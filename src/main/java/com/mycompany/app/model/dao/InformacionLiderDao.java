package com.mycompany.app.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;






import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.mycompany.app.util.JDBCUtilities;

import com.mycompany.app.model.vo.InformacionLiderVo;


public class InformacionLiderDao {
       
    public List<InformacionLiderVo> Listar(String banco) throws Exception{


        ArrayList<InformacionLiderVo> result = new ArrayList<InformacionLiderVo>();

        ResultSet rs = null;
        Connection  connection = JDBCUtilities.getConnection();
        PreparedStatement statement = null;
        String Consulta = "SELECT P.ID_PROYECTO AS ID, P.CONSTRUCTORA, P.CIUDAD, P.CLASIFICACION, T.ESTRATO,"
                           +" L.NOMBRE||' '||L.PRIMER_APELLIDO||''||L.SEGUNDO_APELLIDO AS LIDER FROM PROYECTO P"
                           +" JOIN TIPO T ON (P.ID_TIPO = T.ID_TIPO) JOIN LIDER L ON (P.ID_LIDER = L.ID_LIDER)"
                           +" WHERE P.BANCO_VINCULADO = ?"
                           +" ORDER BY FECHA_INICIO DESC, CIUDAD, CONSTRUCTORA;";


                try {
                    statement = connection.prepareStatement(Consulta);
                    statement.setString(1, banco);
                    rs = statement.executeQuery();
                    while (rs.next()) {
                        InformacionLiderVo objeto = new InformacionLiderVo();
                        objeto.setId(rs.getInt("id"));
                        
                        objeto.setCiudad(rs.getString("ciudad"));

                        objeto.setConstructora(rs.getString("constructora"));
                        
                        objeto.setClasificacion(rs.getString("clasificacion"));

                        objeto.setEstrato(rs.getInt("estrato"));
                 
                        objeto.setLider(rs.getString("lider"));
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
