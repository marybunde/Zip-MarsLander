public class OnBoardComputer implements BurnStream {
private boolean freeFall = true;
    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if(status.getVelocity()<=0)

            burn = 199 - status.getVelocity();


        System.out.println(burn); /*hack!*/
        return burn;
    }

}
