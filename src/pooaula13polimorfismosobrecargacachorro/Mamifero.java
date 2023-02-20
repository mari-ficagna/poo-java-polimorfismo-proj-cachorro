package pooaula13polimorfismosobrecargacachorro;
//@author Mari 
 
public class Mamifero extends Animal {
    //Atributos
    protected String corPele;
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero...");
    }
    //Metodos especiais
    public String getCorPele() {
        return corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
