import java.util.Vector;

public class PokeBall {
    Vector<String> BallName = new Vector<>();
    Vector<Integer> BallCount = new Vector<>();
    Vector<String> BallRate = new Vector<>();

    public PokeBall(Vector<String> BallName, Vector<Integer> BallCount, Vector<String> BallRate){
        super();
        this.BallName = BallName;
        this.BallCount = BallCount;
        this.BallRate = BallRate;
    }

    public Vector<String> getBallName(){
        return BallName;
    }
    public void setBallName(Vector<String> BallName){
        this.BallName = BallName;
    }
    public Vector<Integer> getBallCount(){
        return BallCount;
    }
    public void setBallCount(Vector<Integer> BallCount){
        this.BallCount = BallCount;
    }
    public Vector<String> getBallRate(){
        return BallRate;
    }
    public void setBallRate(Vector<String> BallRate){
        this.BallRate = BallRate;
    }

    void printBall(){
        for(int i = 0; i < 5; i++){
            System.out.println(i+1 + "." + BallName.get(i) + " - " + BallCount.get(i) + " (Rate " + BallRate.get(i) + ")");
        }
        System.out.println("6.Back to Menu ...");
        System.out.print("=>> ");
    }

    void PokeBallinfo(){
        System.out.println("_______________________");
        System.out.println("========PokeBall=======");
        System.out.println("-----------------------");
        System.out.println("Description: ");
        System.out.println("A device for capturing wild Pokemon.");
        System.out.println("It's thrown like a ball at a Pokemon,");
        System.out.println("comfortably encapsulating its target.");
        System.out.println("_______________________");
        System.out.println("About : ");
        System.out.println("The regular red and white Poke Ball is the most basic in the game.");
        System.out.println("Initially, players are given 50 of these when they begin the game on a new account,");
        System.out.println("and, additionally, Poke Balls are rewarded by leveling up until the trainer reaches level 11.");
        System.out.println("_______________________");
    }

    void GreatBallinfo(){
        System.out.println("_______________________");
        System.out.println("=======GreatBall=======");
        System.out.println("-----------------------");
        System.out.println("Description: ");
        System.out.println("A good, high-performance Poke Ball");
        System.out.println("that provides a higher catch rate than a standard ");
        System.out.println("Poke Ball.");
        System.out.println("_______________________");
        System.out.println("About : ");
        System.out.println("Notable for its blue top-half with the red tabs, this is the next step-up from the regular Poke Balls.");
        System.out.println("Great Balls increase the player's potential to capture a wild Pokemon by 50%.");
        System.out.println("After a trainer reaches level 12, they will receive 20 Great Balls as a gift.");
        System.out.println("_______________________");
    }

    void UltraBallinfo(){
        System.out.println("_______________________");
        System.out.println("=======UltraBall=======");
        System.out.println("-----------------------");
        System.out.println("Description: ");
        System.out.println("An ultra-high performance Poke Ball");
        System.out.println("that provides a higher Pokemon catch rate than a ");
        System.out.println("Great Ball.");
        System.out.println("_______________________");
        System.out.println("About : ");
        System.out.println("The optimal device for catching Pokemon, ");
        System.out.println("the yellow and black Ultra Ball increases the trainer's chance of gaining a new Pokemon by 100%");
        System.out.println("--almost guaranteeing the capture.");
        System.out.println("_______________________");
    }

    void MasterBallinfo(){
        System.out.println("_______________________");
        System.out.println("=======MasterBall======");
        System.out.println("-----------------------");
        System.out.println("Description: ");
        System.out.println("The best Poke Ball with the ");
        System.out.println("ultimate level of performance.");
        System.out.println("With it, you will catch any wild Pokemon without fail.");
        System.out.println("_______________________");
        System.out.println("About : ");
        System.out.println("So far, it is not possible to acquire the Master Ball in Pokemon GO. ");
        System.out.println("So far, it is not possible to acquire the Master Ball in Pokemon GO.");
        System.out.println("However, known from its appearance in the main series of Pokemon games");
        System.out.println("_______________________");
    }

    void PremiereBallinfo(){
        System.out.println("_______________________");
        System.out.println("======PremierBall======");
        System.out.println("-----------------------");
        System.out.println("Description: ");
        System.out.println("The Premier Ball stands out as the only kind of poke ball");
        System.out.println("without an in-game description that gives the player some lore");
        System.out.println("beyond what is known about it in the main series games.");
        System.out.println("_______________________");
        System.out.println("About : ");
        System.out.println("Premier Balls have the same catch rate as regular Poke Balls");
        System.out.println("though, they cannot be stored in a trainers bag and disappear after a Raid Challenge.");
        System.out.println("Players will get Premier Balls in a Raid Challenge depending on their performance");
        System.out.println("_______________________");
    }
}
