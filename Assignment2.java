public class App {
    public static void main(String[] args) throws Exception {
    
    int rideCount = 5;
    
    // FOR LOOP
    for (int i = 5; i != 0; i--) {
        if (i == 4) {
            break;
        }
        
        System.out.println("Journey");
    }
        
        
    // DO WHILE
    int surname = 5;
    
    do {
        System.out.println("Gamas");
        surname--;
        } while (surname != 0);
        
        
    // WHILE LOOP
    int nickname = 5;
    while (nickname != 0) {
        nickname--;
        
        if (nickname == 3) {
            System.out.println("Journ");
            continue;
        }
        
        System.out.println("J!");
    }
}
}



