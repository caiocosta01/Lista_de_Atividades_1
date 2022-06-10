
public class questao12 {
    public static void main(String[] args){
        int metrosPorSegundos = 15;
        int tempoMinutos = 50;
        int TempoSegundos = tempoMinutos * 60;
        float distancia = TempoSegundos*metrosPorSegundos;
        System.out.println("A distância percorrida pelo carro foi de "+(distancia/1000)+" KM");
            
        
    }
}
