package model.korisnici;

import model.enumeracije.Pol;

public class Admin extends Korisnik {
	
	private double plata;
	
	public Admin() {
		super();
		plata = 0;
	}

	public Admin(String ime, String prezime, String jmbg, Pol pol, String brojTelefona, String adresa, String username,
			String lozinka, double plata) {
		super(ime, prezime, jmbg, pol, brojTelefona, adresa, username, lozinka);
		this.plata = plata;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	@Override
	public String toString() {
		return ime + "|" + prezime
				+ "|" + jmbg + "|" + pol + "|" + brojTelefona + "|" + adresa
				+ "|" + username + "|" + lozinka + "|" + plata;
	}
	
	


	
	

	

}
