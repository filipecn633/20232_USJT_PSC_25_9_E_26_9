public class JogoV1 {
    public static void main(String[] args) {
        //1. construir um onjeto personagem
        var p = new Personagem ();
        //2. dar um nome para ele 
        p.nome = "John" ;
        //3. fazer ele caçar
        p.cacar();
        //4. fazer ele comer 
        p.comer();
        //5. fazer ele dormir
        p.dormir();
    }
}
