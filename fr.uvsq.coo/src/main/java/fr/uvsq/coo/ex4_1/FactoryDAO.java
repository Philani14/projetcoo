package fr.uvsq.coo.ex4_1;



public abstract class FactoryDAO {
	
		public enum DaoType { JDBC, Serialisation; }
		
		public abstract DAO getPersonneDAO( ) ;
		
		public static  FactoryDAO getFactory ( DaoType type ) {
		if ( type == DaoType .JDBC) return new FactoryJDBC( ) ;
		
		if ( type== DaoType.Serialisation)  return new FactorySerialisation( ) ;
		return null ;
		}
}
