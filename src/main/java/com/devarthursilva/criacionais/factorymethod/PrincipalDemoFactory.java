package com.devarthursilva.criacionais.factorymethod;

import com.devarthursilva.criacionais.factorymethod.factory.DialogFactory;
import com.devarthursilva.criacionais.factorymethod.factory.HtmlDialog;
import com.devarthursilva.criacionais.factorymethod.factory.WindowsDialog;

public class PrincipalDemoFactory {

	private static DialogFactory dialog;
	
	public static void main(String[] args) {
		configureFactory();
		renderWindow();
	}
	
	static void configureFactory() {
		if (System.getProperty("os.name").equals("Windows 10" )) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	static void renderWindow() {
		dialog.renderWindow();
	}
}
