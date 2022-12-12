package bridge.launcher;

import bridge.BridgeMaker;
import bridge.domain.bridge.Bridge;
import bridge.domain.bridge.BridgeSize;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final Bridge bridge;
    private final BridgeSize bridgeSize;

    public BridgeGame(BridgeMaker bridgeMaker, BridgeSize bridgeSize) {
        this.bridge = new Bridge(bridgeMaker.makeBridge(bridgeSize.number()));
        this.bridgeSize = bridgeSize;
    }

    public void move() {

    }

    public void retry() {
    }
}
