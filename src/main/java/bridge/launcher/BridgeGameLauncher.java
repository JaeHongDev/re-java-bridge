package bridge.launcher;

import bridge.launcher.context.BridgeGameContext;
import bridge.launcher.status.BridgeGameStatus;
import bridge.launcher.status.InitStatus;

public class BridgeGameLauncher {

    private final BridgeGameContext bridgeGameContext = new BridgeGameContext();
    private BridgeGameStatus bridgeGameStatus = new InitStatus(bridgeGameContext);

    public void execute() {
        while (bridgeGameStatus.runnable()) {
            bridgeGameStatus = bridgeGameStatus.next();
        }
    }
}
