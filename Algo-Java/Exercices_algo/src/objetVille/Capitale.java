package objetVille;


	
	public class Capitale extends Ville {

		private String monument;

		public Capitale()
		{
			super();
			monument = "aucun";
		}

		public Capitale(String _nom, int _nbHabitant, String _Pays, String _Monument)
		{
			super(_nom,_nbHabitant,_Pays);
			this.monument = _Monument;
		}

		public String getMonument()
		{
			return this.monument;
		}

		public void setMonument(String _Monument)
		{
			this.monument = _Monument;
		}

		public String decrisToi()
		{
			return super.decrisToi() + " \n\t ===> "+ this.monument+ " en est un monument";
		}

	
}
