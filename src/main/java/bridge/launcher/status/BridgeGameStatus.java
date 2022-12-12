package bridge.launcher.status;

import bridge.launcher.context.BridgeGameContext;
import bridge.launcher.context.SystemContext;
import bridge.view.InputView;
import bridge.view.OutputView;

public abstract class BridgeGameStatus implements BasicStatus {
    protected final SystemContext context;
    protected final InputView inputView;
    protected final OutputView outputView;
    protected final BridgeGameContext bridgeGameContext;

    public BridgeGameStatus(final SystemContext systemContext) {
        this.context = systemContext;
        this.bridgeGameContext = systemContext.getBridgeGameContext();
        this.inputView = systemContext.getInputView();
        this.outputView = systemContext.getOutputView();
    }

}
