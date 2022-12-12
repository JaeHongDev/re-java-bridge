package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class PrintBridgeStatus extends BridgeGameStatus {
    public PrintBridgeStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return null;
    }
}
