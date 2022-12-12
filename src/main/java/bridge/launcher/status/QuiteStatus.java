package bridge.launcher.status;

import bridge.launcher.context.SystemContext;

public class QuiteStatus extends BridgeGameStatus {

    public QuiteStatus(SystemContext context) {
        super(context);
    }

    @Override
    public BridgeGameStatus next() {
        return new VerifyGameStatus(context);
    }
}
