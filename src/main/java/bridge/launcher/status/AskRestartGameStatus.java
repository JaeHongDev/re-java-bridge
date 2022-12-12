package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class AskRestartGameStatus extends BridgeGameStatus {
    public AskRestartGameStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new GameFinalResultStatus(context);
    }
}
