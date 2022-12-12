package bridge.launcher.status;

import bridge.launcher.context.BridgeGameContext;
import bridge.view.InputView;
import bridge.view.OutputView;

public abstract class BridgeGameStatus implements BasicStatus {
    protected final InputView inputView;
    protected final OutputView outputView;
    protected final BridgeGameContext context;

    public BridgeGameStatus(final BridgeGameContext context) {
        this.context = context;
        this.inputView = context.getInputView();
        this.outputView = context.getOutputView();
    }

}
