package bridge.launcher.status;

public interface BasicStatus {
    BridgeGameStatus next();

    default boolean runnable() {
        return true;
    }

}
