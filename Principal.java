public class Principal {
    public static void main(String [] args) {

         Empregado empregado = new Empregado();
         empregado.setNome("Amabile");
         empregado.setEndereco("Pompeia");
         empregado.setTelefone("ZZZ");
         empregado.setSalario(1800);

         Empregado empregado2= new Empregado();
         //settar com os seu dados 
         empregado2.setNome("Jhonynhas");
         empregado2.setEndereco("Pompeia");
         empregado2.setTelefone("00028922");
         empregado2.setSalario(10000);
         
         System.out.println("---------------------------");
         System.out.println("Empregado numero 1 ");
         System.out.println(empregado.getNome());
         System.out.println(empregado.getEndereco());
         System.out.println(empregado.getTelefone());
         System.out.println(empregado.getSalario());
         System.out.println("---------------------------");
         System.out.println("Empregado numero 2 ");
         System.out.println(empregado2.getNome());
         System.out.println(empregado2.getEndereco());
         System.out.println(empregado2.getTelefone());
         System.out.println(empregado2.getSalario());
         System.out.println("---------------------------");
    }
}
