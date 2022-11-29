package willow.train.kuayue.Util;

public interface IBogeyWheel {
        void setForcedSpeed(float speed);
        void unsetForcedSpeed();
        default void setAngle(float angle) {}
        default float getAngle() {return 0f;}
        float getWheelRadius();

}
