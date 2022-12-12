package bridge.domain.bridge;

import bridge.domain.bridge.number.PositiveNumber;

public class BridgeSize implements PositiveNumber {
    private static final int MIN_NUMBER = 3;
    private static final int MAX_NUMBER = 21;
    private final int size;

    public BridgeSize(final int size) {
        validateSizeIsGreaterThanMinNumber(size);
        validateSizeIsLessThanMaxNumber(size);
        this.size = size;
    }

    private void validateSizeIsLessThanMaxNumber(int size) {
        if (size > MAX_NUMBER) {
            throw new IllegalArgumentException("21보다 클 수 없습니다");
        }
    }

    private void validateSizeIsGreaterThanMinNumber(int size) {
        if (size < MIN_NUMBER) {
            throw new IllegalArgumentException("3보다 작을 수 없습니다.");
        }
    }

    @Override
    public int number() {
        return size;
    }
}
