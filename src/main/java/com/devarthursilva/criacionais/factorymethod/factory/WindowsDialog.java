package com.devarthursilva.criacionais.factorymethod.factory;

import com.devarthursilva.criacionais.factorymethod.buttons.Button;
import com.devarthursilva.criacionais.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends DialogFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
