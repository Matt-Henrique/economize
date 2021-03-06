package br.com.economize.domain;

/**
* @author Mateus Henrique Tofanello
* 
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
public class Produto extends GenericDomain {

	@ManyToOne
	@JoinColumn(nullable = false)
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;

	@Column(length = 20, nullable = false)
	private String subCategoria;

	@Column(length = 150, nullable = false)
	private String descricao;

	@Column(length = 30, nullable = false)
	private String descricaoReduzida;

	@Column(length = 15, nullable = false)
	private String unidadeMedida;

	@Column(length = 15, nullable = false)
	private String embalagem;

	@Column(length = 15, nullable = false)
	private String ean;

	@Transient
	private String caminho;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoReduzida() {
		return descricaoReduzida;
	}

	public void setDescricaoReduzida(String descricaoReduzida) {
		this.descricaoReduzida = descricaoReduzida;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public Produto() {
		empresa = new Empresa();
	}
}