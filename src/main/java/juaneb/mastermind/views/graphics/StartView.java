package main.java.juaneb.mastermind.views.graphics;

class StartView  {

	/*JEB aquí metería todos los atributos propios de la interfaz gráfica. No heredo de WithConsoleView porque no voy a usar una interfaz de consola*/

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

	/*JEB aquí metería todos los métodos propios de la interfaz gráfica*/

}
