package br.com.project.model.classes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;

/**
 * Representa a entidade do usuário do sistema.
 * 
 * Essa classe mapeia a tabela de usuários no banco de dados e é utilizada
 * tanto para autenticação quanto para auditoria (via Envers).
 * 
 * A anotação {@code @Audited} indica que qualquer alteração feita em registros
 * dessa tabela será auditada automaticamente pelo Hibernate Envers, gerando
 * entradas de histórico com quem alterou, quando e o que foi modificado.
 */



//----------------------------------------------------------------------------------------------------------------------------------------
@Audited
@Entity
@Table(name = "entidade", schema = "public")
public class Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	/**
	 * Identificador único da entidade (chave primária).
	 * Representa o código do usuário.
	 */
	@Id
	private Long ent_codigo;

	
	
	
	/**
	 * Login do usuário. Usado para autenticação.
	 */
	private String ent_login = null;

	
	
	
	/**
	 * Senha do usuário.
	 */
	private String ent_senha;
	
	
	private boolean ent_inativo = false;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ent_ultimoacesso;
	

//------------------------ Getters e Setters------------------------------------------------------------------------------------------------

	public void setEnt_ultimoacesso(Date ent_ultimoacesso) {
		this.ent_ultimoacesso = ent_ultimoacesso;
	}
	
	public Date getEnt_ultimoacesso() {
		return ent_ultimoacesso;
	}
	
	
	/**
	 * Recupera o login do usuário.
	 */
	public String getEnt_login() {
		return ent_login;
	}

	/**
	 * Define o login do usuário.
	 */
	public void setEnt_login(String ent_login) {
		this.ent_login = ent_login;
	}

	/**
	 * Recupera a senha do usuário.
	 */
	public String getEnt_senha() {
		return ent_senha;
	}

	/**
	 * Define a senha do usuário.
	 */
	public void setEnt_senha(String ent_senha) {
		this.ent_senha = ent_senha;
	}

	/**
	 * Define o código do usuário (ID).
	 */
	public void setEnt_codigo(Long ent_codigo) {
		this.ent_codigo = ent_codigo;
	}

	/**
	 * Recupera o código do usuário (ID).
	 */
	public Long getEnt_codigo() {
		return ent_codigo;
	}
	
	public void setEnt_inativo(boolean ent_inativo) {
		this.ent_inativo = ent_inativo;
	}
	
	public boolean getEnt_inativo() {
		return ent_inativo;
	}
	
}
