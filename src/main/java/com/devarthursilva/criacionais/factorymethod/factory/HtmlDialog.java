package com.devarthursilva.criacionais.factorymethod.factory;

import com.devarthursilva.criacionais.factorymethod.buttons.Button;
import com.devarthursilva.criacionais.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends DialogFactory{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
