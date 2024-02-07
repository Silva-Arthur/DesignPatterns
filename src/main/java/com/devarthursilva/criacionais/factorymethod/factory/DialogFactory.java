package com.devarthursilva.criacionais.factorymethod.factory;

import com.devarthursilva.criacionais.factorymethod.buttons.Button;

/**
 * Essa classe abastrate é a classe que vai ser a Factory
 * 
 * */
public abstract class DialogFactory {

	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}
	
	/**
	 * Podemos implementar aqui um método default se for necessário
	 * 
	 * */
	public abstract Button createButton();
}
