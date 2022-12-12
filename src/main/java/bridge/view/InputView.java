package bridge.view;

import bridge.domain.bridge.BridgeSize;
import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView extends IoPrinter {

    /**
     * 다리의 길이를 입력받는다.
     */
    public BridgeSize readBridgeSize() {
        this.println("다리의 길이를 입력해주세요.");
        return new BridgeSize(this.readIntegerAndAfterNewLine());
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String readLine() {
        try {
            return Console.readLine();
        } catch (NoSuchElementException exception) {
            throw new IllegalStateException("더이상 입력할 수 없습니다.");
        }
    }

    private String readLineAndAfterNewLine() {
        var input = readLine();
        this.println();
        return input;
    }

    private int readInteger() {
        try {
            return Integer.parseInt(readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    private int readIntegerAndAfterNewLine() {
        var input = readInteger();
        this.println();
        return input;
    }
}
