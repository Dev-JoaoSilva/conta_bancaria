public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular="Isaque Katahira";
        minhaConta.saldo=7632;

        Conta minhaConta2;
        minhaConta.saldo=673;
        minhaConta2 = new Conta();
        minhaConta.numero=2;
        minhaConta.titular="João Gabriel";
        minhaConta.saldo=10000;

        System.out.println(minhaConta.numero);
        System.out.println(minhaConta.titular);
        System.out.println(minhaConta.saldo);
        
        System.out.println(minhaConta2.numero);
        System.out.println(minhaConta2.titular);
        System.out.println(minhaConta2.saldo);
    }

}
