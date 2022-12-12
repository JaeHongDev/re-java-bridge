package bridge.launcher;

import bridge.launcher.context.SystemContext;
import bridge.launcher.status.BridgeGameStatus;
import bridge.launcher.status.InitStatus;

public class BridgeGameLauncher {

    private final SystemContext systemContext = new SystemContext();
    private BridgeGameStatus bridgeGameStatus = new InitStatus(systemContext);

    public void execute() {
        while (bridgeGameStatus.runnable()) {
            bridgeGameStatus = bridgeGameStatus.next();
        }
    }
}
