package com.adactin.helper;

import java.io.IOException;

public class FileReader {
	
	private FileReader() {

	}

	public static FileReader getInstance() {
		FileReader frm = new FileReader();
		return frm;
	}

	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
