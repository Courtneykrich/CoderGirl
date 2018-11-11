public class GremlinLab {
    public static void  main(String[]args){
        int numGremlins = Integer.parseInt(args[0]);
        if (numGremlins > 0) {

            Gremlins[]gremlins;
            gremlins = new Gremlins[numGremlins];
            for (int i = 0; i < numGremlins; i++){
                gremlins[i]=new Gremlins();
            }
            System.out.println("There are "+Gremlins.getGremlinCount()+" gremlins.");
        }
    }
}
