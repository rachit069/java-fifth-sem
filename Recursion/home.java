public class home {
    public static void reachHome(int src,int dest){
        if(src == dest){
            System.out.println("Reached");
            return;
        }
        System.out.println(src);
        reachHome(src+1, dest);
        
    }
    public static void main(String args[]){
        int src = 1;
        int dest = 10;
        reachHome(src, dest);
    }    
}
