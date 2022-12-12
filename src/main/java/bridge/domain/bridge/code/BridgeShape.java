package bridge.domain.bridge.code;

import java.util.Arrays;

public enum BridgeShape {
    TOP("U", 1),
    BOTTOM("D", 0);

    private final String shape;
    private final int value;

    BridgeShape(final String shape, final int value) {
        this.shape = shape;
        this.value = value;
    }

    public static String convertBridgeValueToShape(final int value) {
        return Arrays.stream(values()).filter(bridgeShape -> bridgeShape.value == value)
                .findAny()
                .orElseThrow(() -> new IllegalStateException("다리를 생성할 수 없는 숫자입니다."))
                .shape;
    }

    public static BridgeShape from(String shape) {
        return Arrays.stream(values()).filter(bridgeShape -> bridgeShape.shape.equals(shape))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("존재 하지 않는 다리 값입니다."));
    }

    public String getShape() {
        return shape;
    }
}
