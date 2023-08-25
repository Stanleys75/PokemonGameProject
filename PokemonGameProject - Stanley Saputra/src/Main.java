import java.util.Scanner;
import java.util.Vector;

public class Main {

    Scanner sc = new Scanner(System.in);
    Vector<String> PokemonName = new Vector<>();
    Vector<Integer> PokemonList = new Vector<>();

    Vector<String> tempName = new Vector<>();
    Vector<Integer> tempList = new Vector<>();

    Vector<String> BallName = new Vector<>();
    Vector<Integer> BallCount = new Vector<>();
    Vector<String> BallRate = new Vector<>();

    Pokemon pm = new Pokemon(PokemonName,PokemonList);
    PokeBall pb = new PokeBall(BallName,BallCount,BallRate);

    void menu(){
        System.out.println("");
        System.out.println("______________");
        System.out.println("|Pokemon Go !|");
        System.out.println("--------------");
        System.out.println("1. Pokedex List");
        System.out.println("2. PokeBall List");
        System.out.println("3. Add Pokemon");
        System.out.println("4. Remove Pokemon");
        System.out.println("5. Exit Game");
        System.out.print("=> ");
    }

    void cls(){
        for(int i = 0; i<100;i++){
            System.out.println();
        }
    }

    public void Enter(){
        System.out.println();
        System.out.print("Press Enter To Continue ......");
        sc.nextLine();
        sc.nextLine();
    }

    int choose;
    public Main(){
        pm.PokemonName.add("Mewtwo");
        pm.PokemonName.add("Articuno");
        pm.PokemonName.add("Zapdos");

        pm.PokemonPower.add(100);
        pm.PokemonPower.add(203);
        pm.PokemonPower.add(400);

        pb.BallName.add("Poke Ball");
        pb.BallName.add("Great Ball");
        pb.BallName.add("Ultra Ball");
        pb.BallName.add("Master Ball");
        pb.BallName.add("Premiere Ball");

        pb.BallCount.add(198);
        pb.BallCount.add(423);
        pb.BallCount.add(32);
        pb.BallCount.add(133);
        pb.BallCount.add(233);

        pb.BallRate.add("20%");
        pb.BallRate.add("50%");
        pb.BallRate.add("100%");
        pb.BallRate.add("1000%");
        pb.BallRate.add("20%");

        do {
            menu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    cls();
                    pm.printPokemon();
                    Enter();
                    break;

                case 2:
                    int option;
                    do{
                        cls();
                        System.out.println("PokeBall List: ");
                        pb.printBall();
                        option = sc.nextInt();
                        cls();

                        if(option == 1){
                            pb.PokeBallinfo();
                            Enter();
                            pb.printBall();
                        }
                        else if(option == 2){
                            pb.GreatBallinfo();
                            Enter();
                            pb.printBall();
                        }
                        else if(option == 3){
                            pb.UltraBallinfo();
                            Enter();
                            pb.printBall();
                        }
                        else if(option == 4){
                            pb.MasterBallinfo();
                            Enter();
                            pb.printBall();

                        } else if (option == 5) {
                            pb.PremiereBallinfo();
                            Enter();
                            pb.printBall();
                        }

                    }while(option != 6);
                    break;

                case 3:
                    String AddPokemon;
                    int NumPokemon;

                    tempName = pm.getPokemonName();
                    tempList = pm.getPokemonPower();

                    System.out.println("Add New Pokemon : ");
                    AddPokemon = sc.next();
                    System.out.print("Power of Pokemon : ");
                    NumPokemon = sc.nextInt();

                    tempName.add(AddPokemon);
                    tempList.add(NumPokemon);

                    pm.setPokemonName(tempName);
                    pm.setPokemonPower(tempList);

                    break;
                case 4:
                    pm.printPokemon();
                    System.out.println("Delete Pokemon Number : ");
                    int delete;
                    delete = sc.nextInt();
                    for(int i=1; i<=pm.PokemonName.size();i++){
                        if(i == delete){
                            pm.PokemonName.remove(i-1);
                            pm.PokemonPower.remove(i-1);
                        }
                    }
                    System.out.println("Delete Complete !");
                    break;

                case 5:

                    break;
            }

        } while(choose!=5);
    }

    public static void main(String[] args) {
        System.out.println("Stanley Saputra - 2501961754");
        new Main();
    }
}