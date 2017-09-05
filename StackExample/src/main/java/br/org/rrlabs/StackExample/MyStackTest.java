package br.org.rrlabs.StackExample;

public class MyStackTest {
	 public static void main(String[] args)
	 {
	     MyStack s = new MyStack();
	     s.push(10);
	 	 System.out.println("Inserido: 10");
	     s.push(9);
	 	 System.out.println("Inserido: 9");
	 	 System.out.println("Minimo: "+ s.getMin());
	     s.push(8);
	 	 System.out.println("Inserido: 8");
	     s.push(7);
	 	 System.out.println("Inserido: 7");
	     System.out.println("Minimo: "+ s.getMin());
	     System.out.println("Retirado: "+ s.pop());
	     System.out.println("Minimo: "+ s.getMin());
	     System.out.println("Retirado: "+ s.pop());
	     System.out.println("Minimo: "+ s.getMin());
	 }
}
