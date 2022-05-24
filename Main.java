class Main {
    public static void main(String[] args) {

        int[] keys = new int[]{10,-2,-3,0};
        int noMoves = 5;
        int goal = 15;
        
        int inputs = keys.length;
        int n = noMoves;
        int[] moves = new int[noMoves+1];

        int goalCal;
        int checker = 0;
        int possSol = 0;
        int combi = 0;

        
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
                  goalCal += keys[moves[i]];
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
              moves = incfun(moves, n, inputs);
          }
      }
        System.out.println("Total calculations done are " + checker);
        System.out.println("Total Combinations done are " + combi);
        System.out.println("Total Possible Solutions are " + possSol);
    }
    
    static int[] incfun(int[] moves, int n, int inputs){
        moves[n]++;
        
        if(moves[n] == inputs){
            moves[n] = 0;
            moves = incfun(moves, n-1, inputs);
            
        }
        return moves;
    }
}
