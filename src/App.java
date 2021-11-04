public class App {
    public static void main(String[] args) {
        
        Calculos calculos = new Calculos();

        System.out.println(calculos.calcularForcaPeso(90f, 9.81f));
        System.out.println(calculos.calcularForcaCentripeta(35f, 20f, 10f));
        System.out.println(calculos.calcularImpulso(35f, 10f, 0f));
        System.out.println(calculos.calcularForcaElastica(35f, 5f));
        System.out.println(calculos.calcularVelocidadeMedia(10f, 0f, 5f, 0f));
        System.out.println(calculos.calcularMRU(4f, 10f, 2f));
        System.out.println(calculos.calcularMRUV(5f, 15f, 5f));      
    }
}
