package fr.uvsq.ex3_8;

import java.util.ArrayList;
import java.time.LocalDate;

public class Personnel {

	private String nom;
	private String prenom;
	private LocalDate date_naissance;
	
	private ArrayList<Telephone> num_tel;
	private ArrayList<String>fonction;
	
	Personnel(Builder builder)
	{
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.date_naissance=builder.date_naissance;
		this.num_tel=builder.num_tel;
		this.fonction=builder.fonction;
	}
	public static class Builder
	{
		private String nom;
		private String prenom;
		private LocalDate date_naissance;
		
		private ArrayList<String> fonction;
		private ArrayList<Telephone>num_tel;
		
		private Builder(String nom, String prenom, LocalDate date_naissance)
		{
			this.nom=nom;
			this.prenom=prenom;
			this.date_naissance= date_naissance;
			
		}
		public Builder fonction (ArrayList<String> fonction)
		{
			this.fonction=fonction;
			return this;
		}
		public Builder num_tel (ArrayList<Telephone> num_tel)
		{
			this.num_tel=num_tel;
			return this;
		}
		
	}
}
