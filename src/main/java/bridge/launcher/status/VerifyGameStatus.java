package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class VerifyGameStatus extends BridgeGameStatus {
    public VerifyGameStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new AskRestartGameStatus(context);
    }
}
