package HeritageAnimal;

public class Labrador extends Animal {

	@Override
	public String getEspece() {
		return " DE l'éspèce des canidés,";
	}

	@Override
	public String getNom() {
		return " le labrador";
	}

	@Override
	public String getMange() {
		return " mange du patté,";
	}

	@Override
	public String getCommunication() {
		return " comunique en aboyant et par des gestes de sa queu,";
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
		return null;
	}

}
