package pooaula13polimorfismosobrecargacachorro;
//author Mari 
 
public class PooAula13PolimorfismoSobrecargaCachorro {
    public static void main(String[] args) {
        // Programa principal
        Mamifero m = new Mamifero();
        m.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        c.reagir("Oi");
        c.reagir("Ola");
        c.reagir(true);
        c.reagir(false);
        c.reagir(9, 45);
        c.reagir(19, 00);
        c.reagir(17, 2.5f);
        c.reagir(1, 2.5f);
    }
}
