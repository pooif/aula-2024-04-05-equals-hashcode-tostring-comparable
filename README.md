# Métodos "comuns" aos objetos

* método `toString`: representa um objeto como um texto.
* métodos `equals` e `hashCode`: são métodos para comparação e para compartimentar o mapa (Map)
* interface `Comparable` e o método `compareTo`: para definir "grandeza" de um dado objeto, quer dizer, saber se um objeto é menor ou maior que outro.

PT-BR: 5/4/2024 (d/m/yyyy)
EN-US: 4/5/2024
ISO: 2024-04-05 (yyyy-mm-dd)

```java
class Data {
  int dia, mes, ano;
  public String toString() {
    return dia + "/" + mes + "/" + ano;
  }
}

class Main {
  public static void main(String... args) {
    Data d1 = new Data(3, 5, 2024);
    Data d2 = new Data(13, 2, 2022);
    Data d3 = new Data(3, 5, 2024);
    // comparável, valor escalar discreto
    // d1 == d3
    // d2 < d3
    // d3 > d2
    // d2 != d1
    // d1 >= d3
  }
}
```