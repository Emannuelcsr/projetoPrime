package br.com.project.bean.view;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.framwork.interfac.crud.InterfaceCrud;
import br.com.project.been.geral.BeanManagedViewAbstract;

@Controller
@Scope(value = "session")
@ManagedBean(name = "mensagemBeanView")
public class MensagemBeanView extends BeanManagedViewAbstract {

	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String novo() throws Exception {
		
		return "";
	}




	@Override
	protected InterfaceCrud<?> getController() {
		return null;
	}




	@Override
	protected Class<?> getClassImplement() {
		return null;
	}




	@Override
	public String condicaoAndParaPesquisa() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
