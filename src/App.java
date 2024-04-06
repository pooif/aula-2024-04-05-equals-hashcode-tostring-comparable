import java.util.HashMap;

class App {
  public static void main(String[] args) {
    // "programar por intenção"
    // período letivo, 2024-1
    //                                  ano    metade
    PeriodoLetivo p1 = new PeriodoLetivo(2024, 1);
    System.out.println(p1.getAno()); // 2024
    System.out.println(p1.getMetade()); // 1
    System.out.println(p1); // 2024-1
    System.out.println(p1.toString()); // 2024-1
    
    PeriodoLetivo p2 = new PeriodoLetivo(2024, 1);
    System.out.println(p2); // 2024-1

    System.out.println(p1 == p2); // false
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode()); // código hash (id)
    System.out.println(p2.hashCode()); // código hash (id)

    PeriodoLetivo p3 = new PeriodoLetivo(2025, 2);
    System.out.println(p1.equals(p3)); // false
    System.out.println(p3.equals(p3)); // true
    System.out.println(p3.equals(p1)); // false

    PeriodoLetivo p4 = new PeriodoLetivo(2024, 1);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p2.equals(p4)); // true
    System.out.println(p1.equals(p4)); // true

    // Comparável -> Comparable
    PeriodoLetivo p5 = new PeriodoLetivo(2025, 1);
    PeriodoLetivo p6 = new PeriodoLetivo(2025, 2);
    System.out.println(p5.compareTo(p6)); // -1
    System.out.println(p6.compareTo(p5)); // 1
    System.out.println(p1.compareTo(p4)); // 0
    if (p5.compareTo(p6) < 0) {
      System.out.println("p5 é menor que p6");
    }
    if (p5.compareTo(p6) > 0) {
      System.out.println("p5 é maior que p6");
    }
    if (p5.compareTo(p6) == 0) {
      System.out.println("p5 tem o mesmo valor de p6");
    }
    
    // Object o1 = null;
    // Object o2 = new Object();
    // System.out.println(o1);
    // System.out.println(o2);

  }
}