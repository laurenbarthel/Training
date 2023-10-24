public class Herbert {

    public static enum LEVEL {
        HIGH,
        MED,
        LOW
    }

    int number = 0;
    
    public Herbert(){
    }


    public static void setHeight(LEVEL height){
        switch(height){
            case HIGH:
                System.out.println("HIGH");
                break;
            default:
                break;
        }
    }


}
