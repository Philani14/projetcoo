package fr.uvsq.coo.ex4_1;

public class FactorySerialisation extends FactoryDAO{
	
	
	public static DAO<Personnel> getPersonneDAO() {
		return new PersonneDAO()  ;
		}

}
