import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Pessoa> agenda = new ArrayList<Pessoa>();
        agenda.add(new Pessoa("Nome A", 15, 1000));
        agenda.add(new Pessoa("Nome B", 35, 4500));
        agenda.add(new Pessoa("Nome C", 28, 15000));
        agenda.add(new Pessoa("Nome F", 77, 100));

        list<Pessoa> agendaComAumento = agenda.stream()
                .map(p-> new Pessoa(p.getNome(), p.getIdade(), p.getSalario() * 1.1))


        System.out.println("Fera !!");



        for (Pessoa aux :agenda){
            double aumento = aux.getSalario()*0.10;
            aux.setSalario(aux.getSalario()+aumento);
        }
        agenda.forEach(System.out::println);



        Stream<Pessoa> stream = agenda.stream().filter(p -> p.getIdade() > 30);

        List<Pessoa> idosos_v0 = stream.collect(Collectors.toList());

        List<Pessoa> idosos = agenda.stream()
                .filter(p -> p.getIdade() > 30 ).collect(Collectors.toList());

        idosos.forEach(System.out::println);



        //processo normal
        /*for (Pessoa aux : agenda) {
            if(aux.getIdade()>30) {
                System.out.println(aux);
            }
        }*/


    }

}