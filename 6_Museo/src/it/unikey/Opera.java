package it.unikey;

public abstract class Opera {

  private static int counter = 0;

  private int codice;
  private String titolo;
  private String autore;
  private boolean isEsposta;

  public Opera() {
    codice = counter++;
  }

  public Opera(String titolo, String autore, boolean isEsposta) {
    this.codice = counter++;
    this.titolo = titolo;
    this.autore = autore;
    this.isEsposta = isEsposta;
  }

  public int getCodice() {
    return codice;
  }

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  public String getAutore() {
    return autore;
  }

  public void setAutore(String autore) {
    this.autore = autore;
  }

  public boolean isEsposta() {
    return isEsposta;
  }

  public void setEsposta(boolean isEsposta) {
    this.isEsposta = isEsposta;
  }

  public void carica() {
    if (Museo.getListaOpereNelMuseo().size() < Museo.getSpazioOpereMuseo()) {
      this.setEsposta(true);
      Museo.getListaOpereNelMuseo().add(this);
    } else {
      this.setEsposta(false);
      Deposito.getListaOpereNelDeposito().add(this);
    }
  }

  @Override
  public String toString() {
    return "Opera [autore = " + autore +
        ", titolo = " + titolo +
        ", isEsposta = " + isEsposta + "]";
  }

  public static Opera cerca(int codice) {
    try {
      return Museo.getListaOpereNelMuseo().get(codice);
    } catch (Exception ex1) {
      try {
        return Deposito.getListaOpereNelDeposito().get(codice);
      } catch (Exception ex2) {
        System.out.println("Opera non trovata nel Museo ne' nel Deposito :(");
        return null;
      }
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Opera other = (Opera) obj;
    if (autore == null) {
      if (other.autore != null)
        return false;
    } else if (!autore.equals(other.autore))
      return false;
    if (codice != other.codice)
      return false;
    if (isEsposta != other.isEsposta)
      return false;
    if (titolo == null) {
      if (other.titolo != null)
        return false;
    } else if (!titolo.equals(other.titolo))
      return false;
    return true;
  }

}
