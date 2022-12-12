package bridge.domain.bridge;

import bridge.domain.bridge.code.BridgeShape;
import java.util.List;
import java.util.stream.Collectors;

public class Bridge {
    private final List<BridgeShape> bridge;

    public Bridge(List<String> makeBridge) {
        this.bridge = makeBridge.stream()
                .map(BridgeShape::from)
                .collect(Collectors.toList());
    }
}
