// Java Bean: objeto com getters e setters
class PeriodoLetivo implements Comparable<PeriodoLetivo> { // implícito extends Object { // herança

  private final int ano;
  private final int metade;

  PeriodoLetivo(int ano, int metade) {
    this.ano = ano;
    this.metade = metade;
  }

  public int getAno() {
    return this.ano;
  }

  public int getMetade() {
    return this.metade;
  }

  // sobrescrevendo (anulando) o método toString
  @Override
  public String toString() {
    return this.ano + "-" + this.metade;
  }

  // sobrescrever equals e o hashCode
  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false; // sempre é diferente false
    if (this == obj) return true; // sempre true se mesma ref
    if (obj instanceof PeriodoLetivo) {
      PeriodoLetivo p = (PeriodoLetivo) obj;
      return (this.ano == p.ano && this.metade == p.metade);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    // multiplicar os atributos por um número primo
    // garantir que o hashCode seja sempre o mesmo
    // se os atributos forem os mesmos
    return this.ano * 31 + this.metade * 7;
  }

  @Override
  public int compareTo(PeriodoLetivo p) {
    // 2024 - 2029 + 2 - 1
    return this.ano - p.ano + this.metade - p.metade;
    // if (this.ano > p.ano) {
    //   return 1;
    // } else if (this.ano < p.ano) {
    //   return -1;
    // }
    // // mesmo ano
    // if (this.metade > p.metade) {
    //   return 1;
    // } else if (this.metade < p.metade) {
    //   return -1;
    // }
    // return 0;
  }

  // Java não suporta sobrecarga de operador
  // public boolean >()
}
