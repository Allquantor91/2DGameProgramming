package ignite;

import java.io.IOException;

import logger.Logger;

import config.ConfigParser;

public class Igniter {
	/**
	 * STAAART
	 * @param args
	 */
	public static void main(String [] args){
		new Igniter().init();
	}
	
	private void init(){
		parseFiles();
	}
	
	/**
	 * Parse the needed files
	 * configfile
	 * all game entitys
	 */
	private void parseFiles(){
		try {
			ConfigParser.parseGameConfig();
			ConfigParser.parseEntityConfig();
		} catch (IOException e) {
			Logger.error(e.getMessage());
		}
	}
}
