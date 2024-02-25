package util;

import java.io.File;

public class Checker {

	static boolean fileExists(String path) {
		File arquivo = new File(path);

		if (arquivo.exists()) {
			return true;
		} else {
			return false;
		}
	}
}