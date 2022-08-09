package com.mycompany.app.controller;

import java.util.List;

import com.mycompany.app.model.dao.ComprasDeLiderDao;
import com.mycompany.app.model.dao.DeudasPorProyectoDao;
import com.mycompany.app.model.dao.InformacionLiderDao;
import com.mycompany.app.model.vo.ComprasDeLiderVo;
import com.mycompany.app.model.vo.DeudasPorProyectoVo;
import com.mycompany.app.model.vo.InformacionLiderVo;
import com.mycompany.app.view.ReportesView;

public class ReportesController {
  private InformacionLiderDao proyectoBancoDao;
  private ComprasDeLiderDao comprasDeLiderDao;
  private DeudasPorProyectoDao deudasPorProyectoDao;


public ReportesController() {
    proyectoBancoDao = new InformacionLiderDao();
    comprasDeLiderDao = new ComprasDeLiderDao();
    deudasPorProyectoDao = new DeudasPorProyectoDao();
    
   
}

public List<InformacionLiderVo> ListarProyectoBanco(String Banco) throws Exception {
    return proyectoBancoDao.Listar(Banco);

}

public List<DeudasPorProyectoVo> ListarDeudarPor(Double limite) throws Exception {
    return deudasPorProyectoDao.Listar(limite);
}

public List<ComprasDeLiderVo> ListarComprasDeLider() throws Exception {
return comprasDeLiderDao.Listar();
}







  

} 