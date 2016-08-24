package com.company;

public class Main {

    public static void main(String[] args) {
	    MotionSensor motionSensor = new MotionSensor();
        Police police = new Police();
        motionSensor.setListener(police);
    }
}

class MotionSensor{

    private MotionSensorListener listener;

    public void setListener(MotionSensorListener listener){
        this.listener = listener;
    }

    public void detectMotion(){
        if(listener !=null)
            listener.motionDetected();
    }

   /* public static interface MotionSensorListener{ // static because its nested
        public void motionDetected();
    }*/
}

interface MotionSensorListener{
    public void motionDetected();

}

class Police implements MotionSensorListener{
    @Override
    public void motionDetected() {
        System.out.println("stop! you are under arrest");
    }
}
