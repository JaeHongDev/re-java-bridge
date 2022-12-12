package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class MovePlayerUnitStatus extends BridgeGameStatus {
    public MovePlayerUnitStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new PrintBridgeStatus(context);
    }
}
