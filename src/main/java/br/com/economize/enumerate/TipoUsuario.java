package br.com.economize.enumerate;

public enum TipoUsuario {

	ADMINISTRADOR, GERENTE, USUARIO;

	@Override
	public String toString() {
		switch (this) {
		case ADMINISTRADOR:
			return "Administrador";
		case GERENTE:
			return "Gerente";
		case USUARIO:
			return "Usuário";
		default:
			return null;
		}
	}
}