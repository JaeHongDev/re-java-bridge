package bridge.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView extends IoPrinter {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        Console.readLine();
        return 0;
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
}
