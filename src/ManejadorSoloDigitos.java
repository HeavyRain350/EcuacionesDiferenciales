
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class ManejadorSoloDigitos extends KeyAdapter{
        private int maxDigitos;
        private boolean consumelo;
        public ManejadorSoloDigitos(int maxDigitos) {
            this.maxDigitos = maxDigitos;
        }
        
         @Override
        public void keyPressed(KeyEvent e) {
            JTextField campo =(JTextField)e.getSource();
            int codigo = e.getKeyCode();
            consumelo = false;
            if(!((codigo>=KeyEvent.VK_0 && codigo <=KeyEvent.VK_9)
                    ||codigo == KeyEvent.VK_DELETE || codigo == KeyEvent.VK_BACK_SPACE || codigo==KeyEvent.VK_PERIOD)){
                e.consume();
                consumelo = true;
                return;
            }
            if(campo.getText().length()>= maxDigitos && (codigo>=KeyEvent.VK_0 && codigo <=KeyEvent.VK_9)){
                e.consume();
                consumelo=true;
            }
        }        
          @Override
        public void keyTyped(KeyEvent e) {
            if(consumelo){
                e.consume();
            }
        }
     }