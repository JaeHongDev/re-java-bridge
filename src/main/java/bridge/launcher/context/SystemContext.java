package bridge.launcher.context;

import bridge.view.InputView;
import bridge.view.OutputView;

public class SystemContext {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final BridgeGameContext bridgeGameContext = new BridgeGameContext();

    public InputView getInputView() {
        return inputView;
    }

    public OutputView getOutputView() {
        return outputView;
    }

    public BridgeGameContext getBridgeGameContext() {
        return bridgeGameContext;
    }
}
