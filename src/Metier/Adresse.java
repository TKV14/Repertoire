package Metier;

public class Adresse {

	private String type;
	private String num;
	private String rue;
	private String codePostal;
	private String ville;

	public Adresse(String type, String num, String rue, String codePostal, String ville) {
		super();
		
		this.setType(type);
		this.setNum(num);
		this.setRue(rue);
		this.setCodePostal(codePostal);
		this.setVille(ville);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getKey() {
		return this.num + this.rue + this.ville + this.codePostal;
	}
}