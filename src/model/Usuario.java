package model;

public class Usuario {
	private String nome;
	private int rg;
	private String tipoUsuario;
	
	public Usuario(String nome, int rg, String tipoUsuario) {
		this.nome = nome;
		this.rg = rg;
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
