package com.nelioalves.cursomc.domain;

import java.io.Serializable;

// a implementação serializable permite que os atributs da classe posam ser gravados em arquivos, trafegar em rede. obrigatorio
public class Categoria  implements Serializable{
	
	
	// sempre que utiliza serializable é preciso incluir esta informação
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	
	// sempre criar um construtor
	public Categoria() {
	}

	// construtor com parametros
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	// implementar hashcode equals para comparação da string e não por pnteiro de memoria
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
