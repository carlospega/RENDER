package ar.com.cuyum.cnc.localizacion.vo;

public class ListObject {

	private String id;
	
	private String text;
	
	private String idPadre;

	
	public ListObject(String id, String text){
		this.id = id;
		this.text = text;
		this.idPadre = "";
		
	}
	
	public ListObject(String id, String text, String idPadre){
		this.id = id;
		this.text = text;
		this.idPadre = idPadre;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}
	
}