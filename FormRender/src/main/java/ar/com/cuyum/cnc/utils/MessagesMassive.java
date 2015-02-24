package ar.com.cuyum.cnc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.apache.log4j.Logger;


@SuppressWarnings("serial")
@ApplicationScoped
@Named("messageMassive")
public class MessagesMassive extends Properties {

	public static final String DEFAULT_FILE_NAME = "messages.properties";
		
	static Logger log = Logger.getLogger(MessagesMassive.class);

	@PostConstruct
	protected void init() {

		log.info("PROPIEDADES DEL SISTEMA CARGADAS");

		try {
			InputStream elInput=null;
			
			log.debug("******************cargando archivo "+ DEFAULT_FILE_NAME + " de mensajes de carga masiva");
			elInput  = this.getClass().getClassLoader().getResourceAsStream(DEFAULT_FILE_NAME);
			this.load(elInput);
		} catch (Exception e) {
			log.error("No puedo cargar el arhivo "+ DEFAULT_FILE_NAME);
		}
	}
	
	public String getSplitMsg(String msg){
		
		
		
		return msg;
	}
	
	public String getRemoteListHost(String msg){
		
		return msg;
	}
	
	private String get(String key){
		return this.getProperty(key);
	}
	
}