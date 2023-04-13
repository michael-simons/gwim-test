package gwim;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {

	static {
		configureLogging();
	}

	@SuppressWarnings("squid:S4792")
	private static void configureLogging() {
		try {
			LogManager.getLogManager()
				.readConfiguration(App.class.getResourceAsStream("/logging.properties"));
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	public static void main(String...a) {
		System.out.println("Hello Sysout");
		Logger.getLogger("app").log(Level.INFO, "Hello Info");
	}
}
