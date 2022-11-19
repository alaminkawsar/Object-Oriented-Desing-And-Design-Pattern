public class Robot {
    private String robotName = "Robot";
    private int posX = 0;
    private int posY = 0;

    public void walk_forward() {
        posY++;
        showPose();
    }
    public void turnLeft() {
        posX--;
        showPose();
    }
    public void turnRight() {
        posX++;
        showPose();
    }
    public void go_backward() {
        posY--;
        showPose();
    }
    public void stop(){
        System.out.println("Stop Robot");
    }
    public void showPose(){
        System.out.println("Robot position is: " + posX + " " + posY);
    }
    
}