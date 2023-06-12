package tambone.danilo;


public class RubricaContatti 
{
	String nome, cognome, numero;
	
	static RubricaContatti[] contacts;
	
	static 
	{
		contacts = new RubricaContatti[3];
	}

	public RubricaContatti(String nome, String cognome, String numero)
	{
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}
	
	
	public static RubricaContatti[] getContacts()
	{
		return contacts;
	}
	
	public static void setContacts(int index, RubricaContatti rubricaContatti )
	{
		contacts[index] = rubricaContatti;
	}
	
	@Override
	public String toString()
	{
		return  "\nContatto: " + " " +
				"\nNome: " + nome +
				"\nCognome: " + cognome +
				"\nNumero di Telefono: " + numero + "\n" + "--------------------------------" ;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public static void setContacts(RubricaContatti[] contacts) {
		RubricaContatti.contacts = contacts;
	}
	
	
}

	

