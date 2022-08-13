package com.mycompany.app.controller;

import java.util.List;

import com.mycompany.app.model.dao.InformacionComprasProveedorDao;
import com.mycompany.app.model.dao.InformacionCasaCampestreDao;
import com.mycompany.app.model.dao.InformacionLiderDao;
import com.mycompany.app.model.vo.InformacionComprasProveedorVo;
import com.mycompany.app.model.vo.InformacionCasaCampestreVo;
import com.mycompany.app.model.vo.InformacionLiderVo;


public class ReportesController {
  private InformacionLiderDao InformacionLiderDao;
  private InformacionComprasProveedorDao InformacionComprasProveedorDao;
  private InformacionCasaCampestreDao InformacionCasaCampestreDao;


public ReportesController() {
    InformacionLiderDao = new InformacionLiderDao();
    InformacionComprasProveedorDao = new InformacionComprasProveedorDao();
    InformacionCasaCampestreDao = new InformacionCasaCampestreDao();
    
   
}

public List<InformacionLiderVo> ListarInformacionLider() throws Exception {
    return InformacionLiderDao.Listar();

}

public List<InformacionCasaCampestreVo> ListarInformacionCasaCampestre() throws Exception {
    return InformacionCasaCampestreDao.Listar();
}

public List<InformacionComprasProveedorVo> ListarInformacionComprasProveedor() throws Exception {
return InformacionComprasProveedorDao.Listar();
}







  

} 