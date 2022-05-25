import java.util.Scanner; 

class Main {
    public static void main(String[] args) {

        String[] keys = new String[6];
        int noMoves = 5;
        int goal = 15;
        
        int inputs = 0;
        int n = noMoves;
        int[] moves = new int[noMoves+1];

        int goalCal;
        int checker = 0;
        int possSol = 0;
        int combi = 0;

        Support sup = new Support();
        Functions fun = new Functions();
        Scanner inp = new Scanner(System.in);

        for(int i = 0; i <6; i++){
          keys[i] = inp.nextLine();
          if(keys[i] == "0"){
            break;
          }else{
            inputs++;
          }
        }
        
        for(int i = 0; i < n; i++){
            moves[i] = 0;
        }

        if (inputs == 1) {
          for(int i = n; i > 0; i--){
                System.out.print(keys[moves[i]] + " ");
                checker++;
            }
        }else{    
          
           while(moves[0] == 0){
             goalCal = 0;
             for(int i = n; i > 0; i--){
                  goalCal = fun.addition(goalCal, parseInt(keys[moves[i]]));
                  checker++;

              }
              combi++;
              if (goalCal == goal) {
                
                for(int i = n; i > 0; i--){
                    System.out.print(keys[moves[i]] + " ");
                 }
                System.out.println("");
                possSol++;
                //System.out.println(keys[moves[n]] + " " + keys[moves[n-1]] + " " + keys[moves[n-2]]);
                
              }
              moves = sup.incfun(moves, n, inputs);
          }
      }
        System.out.println("Total calculations done are " + checker);
        System.out.println("Total Combinations done are " + combi);
        System.out.println("Total Possible Solutions are " + possSol);
    }
    
}

class Support{
  int[] incfun(int[] moves, int n, int inputs){
        moves[n]++;
        
        if(moves[n] == inputs){
            moves[n] = 0;
            moves = incfun(moves, n-1, inputs);
            
        }
        return moves;
    }
}

class Functions{
  int addition(int goalCal, int x){
    goalCal +=x;
    return goalCal;
  }

  int multiplication(int goalCal, int x){
    goalCal *= x;
    return goalCal;
  }
}
