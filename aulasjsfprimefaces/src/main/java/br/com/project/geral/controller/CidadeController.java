package br.com.project.geral.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import br.com.framwork.implementacao.crud.ImplementacaoCrud;
import br.com.framwork.interfac.crud.InterfaceCrud;
import br.com.project.model.classes.Cidade;
import br.com.repository.interfaces.RepositoryCidade;
import br.com.srv.interfaces.SrvCidade;


@Controller
public class CidadeController extends ImplementacaoCrud<Cidade> implements InterfaceCrud<Cidade>  {

	private static final long serialVersionUID = 1L;

	@Resource
	private SrvCidade srvCidade;
	
	@Resource
	private RepositoryCidade repositoryCidade;
	
}
