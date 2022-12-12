package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class GameFinalResultStatus extends BridgeGameStatus {
    public GameFinalResultStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new QuiteStatus(context);
    }
}
