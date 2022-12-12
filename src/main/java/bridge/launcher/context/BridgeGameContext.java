package bridge.launcher.context;

import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeGameContext {

    public InputView getInputView() {
        return new InputView();
    }

    public OutputView getOutputView() {
        return new OutputView();
    }
}
