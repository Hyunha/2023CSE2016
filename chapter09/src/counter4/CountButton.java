package counter4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountButton extends JButton implements ActionListener {
    private CounterFrame view;
    private Counter model;

    /** CountButton 버튼 컨트롤러
     * @param label 버튼에 붙는 라벨
     * @param m 협조할 모델
     * @param v 갱신할 뷰 */
    public CountButton(String label, Counter m, CounterFrame v) {
        super(label);
        view = v;
        model = m;
        addActionListener(this);
    }

    /** actionPerformed '버튼 누르기' 액션 이벤트를 처리
     * @param e 이벤트 */
    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }
}
