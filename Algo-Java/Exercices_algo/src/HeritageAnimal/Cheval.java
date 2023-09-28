package HeritageAnimal;

public class Cheval extends Animal {

	@Override
	public String getEspece() {
		return " De l espece des équidés,";
	}

	@Override
	public String getNom() {
		return " le cheval";
	}

	@Override
	public String getMange() {
		return " mange du foin,";
	}

	@Override
	public String getCommunication() {
		return " comunique par hennissement,";
	}

	@Override
	public String getDeplacement() {
		return " se déplace en marchant et en courant,";
	}

	@Override
	public String getAnimal() {
		return " c'est un mamifere.";
	}

	@Override
	public String getAffichage() {
		// TODO Auto-generated method stub
		return null;
	}

}
