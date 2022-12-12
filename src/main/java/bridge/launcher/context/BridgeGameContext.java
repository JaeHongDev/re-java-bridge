package bridge.launcher.context;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.domain.bridge.BridgeSize;
import bridge.launcher.BridgeGame;

public class BridgeGameContext {
    private final BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    private BridgeGame bridgeGame;

    public void generateBridgeGame(BridgeSize bridgeSize) {
        this.bridgeGame = new BridgeGame(bridgeMaker, bridgeSize);
    }
}
