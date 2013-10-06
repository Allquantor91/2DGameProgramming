package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import logger.Logger;

/**
 * Gives functionality to parse the config file in a specific path
 * 
 * @author Nils
 * @version 05.10.2013
 */
public class ConfigParser {

	private final static String mainPath = "src\\config\\";
	private final static String gameConfigPath = mainPath + "gameConfig.cfg";
	private final static String entityConfigPath = mainPath
			+ "entityConfig.cfg";

	/**
	 * parse all entitys in the entityConfigPath file
	 * 
	 * @author Nils
	 * @throws IOException
	 */
	public static void parseEntityConfig() throws IOException {
		String entityFile = readFileByTotal(entityConfigPath,
				StandardCharsets.UTF_8);
		initEntityConfig(entityFile);
	}

	/**
	 * parse all configs in the gameConfigPath file
	 * 
	 * @author Nils
	 * @throws IOException
	 */
	public static void parseGameConfig() throws IOException {
		List<String> configFile = readFileByLine(gameConfigPath);
		initGameConfig(configFile);
		Logger.logConfiguration();
	}

	/**
	 * inits the values specified in entityFile for the game
	 * 
	 * @author Nils
	 * @param entityFile
	 */
	private static void initEntityConfig(String entityFile) {
		// TODO implement
		String reg = "\\beginEntity";
	}

	/**
	 * inits the values specified in Configuration.java with values in
	 * gameConfigPath
	 * 
	 * @author Nils
	 * @param entityFile
	 */
	private static void initGameConfig(List<String> configFile) {
		for (String config : configFile) {
			setConfigByEntity(config);
		}
	}

	/**
	 * called by initGameConfig, sets the value in Configuration by key
	 * will log error if it was not found
	 * 
	 * @author Nils
	 * @param entity
	 */
	private static void setConfigByEntity(String config) {
		String keyValueDelimiter = "=";
		String[] keyValue = config.split(keyValueDelimiter);
		String key = keyValue[0];
		String value = keyValue[1];
		/*switch (key) {
		case "width":
			Configuration.width = Integer.parseInt(value);
			break;
		case "height":
			Configuration.height = Integer.parseInt(value);
			break;
		case "fullscreen":
			Configuration.fullScreen = Boolean.parseBoolean(value);
			break;
		default:
			Logger.error(key + " was not found in my config");
		}*/
	}

	/**
	 * reads a path and returns a list with every line of the file
	 * 
	 * @author Nils
	 * @param path
	 * @return
	 * @throws IOException
	 */
	private static List<String> readFileByLine(String path) throws IOException {
		List<String> ret = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		while ((line = br.readLine()) != null) {
			ret.add(line);
		}
		br.close();
		return ret;
	}

	/**
	 * reads a path and returns the whole file as a string
	 * 
	 * @author Nils
	 * @param path
	 * @param encoding
	 * @return
	 * @throws IOException
	 * @link Source http://stackoverflow.com/questions/326390/how-to-create-a-
	 *       java-string-from-the-contents-of-a-file
	 */
	private static String readFileByTotal(String path, Charset encoding)
			throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
}
