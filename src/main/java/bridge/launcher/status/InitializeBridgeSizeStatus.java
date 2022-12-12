package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class InitializeBridgeSizeStatus extends BridgeGameStatus {
    public InitializeBridgeSizeStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new MovePlayerUnitStatus(context);
    }
}
