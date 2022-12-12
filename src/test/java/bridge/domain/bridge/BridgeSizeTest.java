package bridge.domain.bridge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BridgeSizeTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 2, 22})
    void 다리길이는_3이상_21이하입니다(final int size) {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> new BridgeSize(size));

    }
}