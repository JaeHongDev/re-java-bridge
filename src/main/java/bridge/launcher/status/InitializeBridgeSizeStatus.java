package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class InitializeBridgeSizeStatus extends BridgeGameStatus {
    public InitializeBridgeSizeStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        var bridgeSize = this.inputView.readBridgeSize();

        this.bridgeGameContext.generateBridgeGame(bridgeSize);

        return new MovePlayerUnitStatus(context);
    }
}
