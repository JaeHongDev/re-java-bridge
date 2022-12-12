package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class InitStatus extends BridgeGameStatus {
    public InitStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        this.inputView.readGameCommand();
        return new InitializeBridgeSizeStatus(context);
    }
}
