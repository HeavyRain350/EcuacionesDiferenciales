
import graficadora.Plano;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ecuaciones Diferenciales 3°B
 */
public class Graficadora extends javax.swing.JFrame {
     public static Plano plano;
     
     
     
private class ManejadorBotones extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();
        
        if (origen== jBtnCrecimiento) {            
            if (!(  jTFTInicialCrecimiento.getText().isEmpty() || 
                    jTFTIntermedioCrecimiento.getText().isEmpty() || 
                    jTFTDudaCrecimiento.getText().isEmpty() ||
                    jTFVInicialCrecimiento.getText().isEmpty() || 
                    jTFVIntermedioCrecimiento.getText().isEmpty()                  
                )) {
                
                double tiempoInical = Double.parseDouble(jTFTInicialCrecimiento.getText());
                double tiempoIntermedio = Double.parseDouble(jTFTIntermedioCrecimiento.getText());
                double tiempoDuda = Double.parseDouble(jTFTDudaCrecimiento.getText());
                double valorInicial = Double.parseDouble(jTFVInicialCrecimiento.getText());
                double valorIntermedio = Double.parseDouble(jTFVIntermedioCrecimiento.getText());
                //int valorDuda = Integer.parseInt(jTFVDudaCrecimiento.getText());
                funcionCrecimiento(tiempoInical, tiempoIntermedio, tiempoDuda,valorInicial,valorIntermedio);
            }else{
                JOptionPane.showMessageDialog(Graficadora.this,
                       "Todos los campos son obligatorios",
                               "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
               return;
            }            
        }
        
        if (origen==jBtnDecremento) {
            
            if (!(  jTFTInicialDecremento.getText().isEmpty() || 
                    jTFTIntermedioDecremento.getText().isEmpty() || 
                    jTFTDudaDecremento.getText().isEmpty() ||
                    jTFVInicialDecremento.getText().isEmpty() || 
                    jTFVIntermedioDecremento.getText().isEmpty() 
                )) {
                
                double tiempoInicial = Double.parseDouble(jTFTInicialDecremento.getText());
                double tiempoIntermedio = Double.parseDouble(jTFTIntermedioDecremento.getText());
                double tiempoDuda = Double.parseDouble(jTFTDudaDecremento.getText());                
                double valorInicial = Double.parseDouble(jTFVInicialDecremento.getText());
                double valorIntermedio = Double.parseDouble(jTFVIntermedioDecremento.getText());
                //int valorDuda = Integer.parseInt(jTFVDudaDecremento.getText());
                funcionDecremento(tiempoInicial,tiempoIntermedio,tiempoDuda,valorInicial,valorIntermedio);                
            }else{
                JOptionPane.showMessageDialog(Graficadora.this,
                       "Todos los campos son obligatorios",
                               "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
               return;
            }
            
        }
        
        if (origen==jBtnCalcularRC) {
            
            if (!(  jTFVoltajeInicialRC.getText().isEmpty() || 
                    jTFResistenciaRC.getText().isEmpty() || 
                    jTFCapacitanciaRC.getText().isEmpty() ||
                    jTFCargaInicialRC.getText().isEmpty() || 
                    jTFCargaIncognitaRC.getText().isEmpty() 
                )) {
                
                double voltajeInicialRC = Double.parseDouble(jTFVoltajeInicialRC.getText());
                double recistenciaRC = Double.parseDouble(jTFResistenciaRC.getText());
                double capacitanciaRC = Double.parseDouble(jTFCapacitanciaRC.getText());                
                double cargaInicialRC = Double.parseDouble(jTFCargaInicialRC.getText());
                double cargaIncognitaRC = Double.parseDouble(jTFCargaIncognitaRC.getText());                
              funcionRC(voltajeInicialRC,recistenciaRC,capacitanciaRC,cargaInicialRC,cargaIncognitaRC);                
            }else{
                JOptionPane.showMessageDialog(Graficadora.this,
                       "Todos los campos son obligatorios",
                               "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
               return;
            }
            
        }
        
        
        if (origen==jBtnCalcularRL) {
            
            if (!(  jTFVoltajeInicialRL.getText().isEmpty() || 
                    jTFResistenciaRL.getText().isEmpty() || 
                    jTFInductancia.getText().isEmpty() ||
                    jTFIntensidadInicial.getText().isEmpty()                     
                )) {
                
                double voltajeRL = Double.parseDouble(jTFVoltajeInicialRL.getText());
                double resistenciaRL = Double.parseDouble(jTFResistenciaRL.getText());
                double inductanciaRL = Double.parseDouble(jTFInductancia.getText());                
                double intencidadInicialRL = Double.parseDouble(jTFIntensidadInicial.getText());
                
                //int valorDuda = Integer.parseInt(jTFVDudaDecremento.getText());
                funcionRL(voltajeRL,resistenciaRL,inductanciaRL,intencidadInicialRL);                
            }else{
                JOptionPane.showMessageDialog(Graficadora.this,
                       "Todos los campos son obligatorios",
                               "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
               return;
            }            
        }
        
        
               
        
        
        if (origen==jBtnCleanCrecimiento) {
            jTFTInicialCrecimiento.setText(null);            
            jTFTIntermedioCrecimiento.setText(null);            
            jTFTDudaCrecimiento.setText(null);
            jTFVInicialCrecimiento.setText(null);            
            jTFVIntermedioCrecimiento.setText(null);            
            jTFVDudaCrecimiento.setText(null);
            jLBRespuestaCrec.setText(null);                                
        }
        if (origen==jBtnCleanDecremento) {
            jTFTInicialDecremento.setText(null);
            jTFTIntermedioDecremento.setText(null);
            jTFTDudaDecremento.setText(null);
            jTFVInicialDecremento.setText(null);
            jTFVIntermedioDecremento.setText(null);
            jTFVDudaDecremento.setText(null);
            //jLBRespuestaDecremento.setText(null);
        }
        
        if(origen== jBtnCleanRC){
            jTFVoltajeInicialRC.setText(null);
            jTFResistenciaRC.setText(null);
            jTFCapacitanciaRC.setText(null);
            jTFCargaInicialRC.setText(null);
            jTFCargaIncognitaRC.setText(null);
        }
        
        if(origen== jBtnCleanRL){
            jTFVoltajeInicialRL.setText(null);
            jTFResistenciaRL.setText(null);
            jTFInductancia.setText(null);
            jTFIntensidadInicial.setText(null);
            jTFRespuesta.setText(null);
        }
      // graficadora.Graficadora.plano.paintSQRFunc(graficadora.Graficadora.plano.getGraphics(),-0.2,2,-15,-200,200);
    }   

     private void funcionCrecimiento(double tiemInicial, double tiemIntermedio, double tiemDuda, double valInicial, double valIntermedio){
         System.out.println(Math.E+"");
         double k=(Math.log(tiemIntermedio))/(valIntermedio);
         double t=(Math.log(tiemDuda))/(k);                                   
         jLBRespuestaCrec.setText(t+" unidades");
     }
     
     private void funcionDecremento(double tiemInicial, double tiemIntermedio, 
             double tiemDuda, double valInicial, double valIntermedio){
         
         System.out.println("Tiempo Inicial: "+tiemInicial);
         System.out.println("Tiempo Intermedio: "+tiemIntermedio);
         System.out.println("Tiempo Duda: "+tiemDuda);
         System.out.println("Valor Inicial: "+valInicial);
         System.out.println("Valor Intermedio: "+valIntermedio);
     }
    
     private void funcionRC(double voltajeInicial, double recistencia, double capacitancia, 
             double cargaInicial, double cargaIncognita){
         
         System.out.println("Voltaje Inicial: "+voltajeInicial);
         System.out.println("Recistencia: "+recistencia);
         System.out.println("Capacitancia: "+capacitancia);
         System.out.println("Carga Inicial: "+cargaInicial);
         System.out.println("Carga Incognita: "+cargaIncognita);
         
                
     }
     
     private void funcionRL(double voltaje, double resistencia, 
             double inductancia, double intencidadInicial){
         System.out.println("Voltaje: "+voltaje);
         System.out.println("Recistencia: "+resistencia);
         System.out.println("Inductancia: "+inductancia);
         System.out.println("Intencidad Inicial: "+intencidadInicial);
     }
}
     
     
     
    /**
     * Creates new form Graficadora
     */
    public Graficadora() {
        initComponents();
        ManejadorBotones manejador = new ManejadorBotones();
        
        jBtnCrecimiento.addActionListener(manejador);
        jBtnDecremento.addActionListener(manejador);
        jBtnCalcularRC.addActionListener(manejador);
        jBtnCalcularRL.addActionListener(manejador);
        jBtnCleanCrecimiento.addActionListener(manejador);
        jBtnCleanDecremento.addActionListener(manejador);
        jBtnCleanRC.addActionListener(manejador);
        jBtnCleanRL.addActionListener(manejador);
        
         ManejadorSoloDigitos manejadorDigitos = new ManejadorSoloDigitos(5);
         jTFTInicialCrecimiento.addKeyListener(manejadorDigitos);
         jTFTIntermedioCrecimiento.addKeyListener(manejadorDigitos);
         jTFTDudaCrecimiento.addKeyListener(manejadorDigitos);
         jTFVInicialCrecimiento.addKeyListener(manejadorDigitos);
         jTFVIntermedioCrecimiento.addKeyListener(manejadorDigitos);
         jTFVDudaCrecimiento.addKeyListener(manejadorDigitos);

         jTFTInicialDecremento.addKeyListener(manejadorDigitos);
         jTFTIntermedioDecremento.addKeyListener(manejadorDigitos);
         jTFTDudaDecremento.addKeyListener(manejadorDigitos);
         jTFVInicialDecremento.addKeyListener(manejadorDigitos);
         jTFVIntermedioDecremento.addKeyListener(manejadorDigitos);
         jTFVDudaDecremento.addKeyListener(manejadorDigitos);
         
        jTFVoltajeInicialRC.addKeyListener(manejadorDigitos);
        jTFResistenciaRC.addKeyListener(manejadorDigitos);
        jTFCapacitanciaRC.addKeyListener(manejadorDigitos);
        jTFCargaInicialRC.addKeyListener(manejadorDigitos);
        jTFCargaIncognitaRC.addKeyListener(manejadorDigitos);

        jTFVoltajeInicialRL.addKeyListener(manejadorDigitos);
        jTFResistenciaRL.addKeyListener(manejadorDigitos);
        jTFInductancia.addKeyListener(manejadorDigitos);
        jTFIntensidadInicial.addKeyListener(manejadorDigitos);
        jTFRespuesta.addKeyListener(manejadorDigitos);
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        RL = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTFTInicialCrecimiento = new javax.swing.JTextField();
        jTFTIntermedioCrecimiento = new javax.swing.JTextField();
        jTFTDudaCrecimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnCrecimiento = new javax.swing.JButton();
        jTFVDudaCrecimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFVIntermedioCrecimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFVInicialCrecimiento = new javax.swing.JTextField();
        jBtnCleanCrecimiento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLBRespuestaCrec = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTFTInicialDecremento = new javax.swing.JTextField();
        jTFTIntermedioDecremento = new javax.swing.JTextField();
        jTFTDudaDecremento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnDecremento = new javax.swing.JButton();
        jTFVDudaDecremento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFVIntermedioDecremento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFVInicialDecremento = new javax.swing.JTextField();
        jBtnCleanDecremento = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLBRespuestaDecremento1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTFVoltajeInicialRC = new javax.swing.JTextField();
        jTFCapacitanciaRC = new javax.swing.JTextField();
        jTFCargaIncognitaRC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBtnCalcularRC = new javax.swing.JButton();
        jTFIntensidadRC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTFCargaInicialRC = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTFResistenciaRC = new javax.swing.JTextField();
        jBtnCleanRC = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLBRC = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTFVoltajeInicialRL = new javax.swing.JTextField();
        jTFInductancia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jBtnCalcularRL = new javax.swing.JButton();
        jTFRespuesta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTFIntensidadInicial = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTFResistenciaRL = new javax.swing.JTextField();
        jBtnCleanRL = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLBRL = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Limpiar Campos"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores de Crecimiento"));

        jTFTInicialCrecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTIntermedioCrecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTDudaCrecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Tiempo Inicial");

        jLabel2.setText("Tiempo Intermedio");

        jLabel3.setText("Tiempo incognito");

        jBtnCrecimiento.setText("Calcular");

        jTFVDudaCrecimiento.setEnabled(false);

        jLabel7.setText("Valor incognito");

        jTFVIntermedioCrecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Valor Intermedio");

        jLabel9.setText("Valor Inicial");

        jTFVInicialCrecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnCleanCrecimiento.setText("Limpiar Campos");
        jBtnCleanCrecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCleanCrecimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCleanCrecimiento)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFTIntermedioCrecimiento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTDudaCrecimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTFTInicialCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTFVInicialCrecimiento)
                    .addComponent(jTFVIntermedioCrecimiento)
                    .addComponent(jTFVDudaCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnCrecimiento)
                        .addGap(13, 13, 13)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTInicialCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVInicialCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTIntermedioCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVIntermedioCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTDudaCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVDudaCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCrecimiento)
                    .addComponent(jBtnCleanCrecimiento))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBRespuestaCrec.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLBRespuestaCrec, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLBRespuestaCrec, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        RL.addTab("E.D de crecimiento", jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores de Decremento"));

        jTFTInicialDecremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTIntermedioDecremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFTDudaDecremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Tiempo Inicial");

        jLabel5.setText("Tiempo Intermedio");

        jLabel6.setText("Tiempo incognito");

        jBtnDecremento.setText("Calcular");

        jTFVDudaDecremento.setEnabled(false);

        jLabel10.setText("Valor incognito");

        jTFVIntermedioDecremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Valor Intermedio");

        jLabel12.setText("Valor Inicial");

        jTFVInicialDecremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnCleanDecremento.setText("Limpiar Campos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFTIntermedioDecremento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(jTFTDudaDecremento, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTFTInicialDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jTFVInicialDecremento)
                            .addComponent(jTFVIntermedioDecremento)
                            .addComponent(jTFVDudaDecremento, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnCleanDecremento)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnDecremento)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTInicialDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVInicialDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTIntermedioDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVIntermedioDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTDudaDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVDudaDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCleanDecremento)
                    .addComponent(jBtnDecremento))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBRespuestaDecremento1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLBRespuestaDecremento1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLBRespuestaDecremento1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        RL.addTab("E.D en decremento", jPanel6);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores de RC"));

        jTFVoltajeInicialRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCapacitanciaRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFCargaIncognitaRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Voltaje");

        jLabel14.setText("Capacitancia");

        jLabel15.setText("Carga Incognita");

        jBtnCalcularRC.setText("Calcular");

        jTFIntensidadRC.setEnabled(false);

        jLabel16.setText("Intensidad de Corriente");

        jTFCargaInicialRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("Carga Inicial");

        jLabel18.setText("Resistencia(Ohms)");

        jTFResistenciaRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnCleanRC.setText("Limpiar Campos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTFCapacitanciaRC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jTFCargaIncognitaRC, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jTFVoltajeInicialRC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCleanRC))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCalcularRC)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18)
                        .addComponent(jTFResistenciaRC)
                        .addComponent(jTFCargaInicialRC)
                        .addComponent(jTFIntensidadRC, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFVoltajeInicialRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFResistenciaRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapacitanciaRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCargaInicialRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCargaIncognitaRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIntensidadRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcularRC)
                    .addComponent(jBtnCleanRC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBRC.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLBRC, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLBRC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        RL.addTab("RC", jPanel7);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores de RL"));

        jTFVoltajeInicialRL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFInductancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setText("Voltaje");

        jLabel20.setText("Inductancia(H)");

        jBtnCalcularRL.setText("Calcular");

        jTFRespuesta.setEnabled(false);

        jLabel22.setText("Respuesta del Sistema");

        jTFIntensidadInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setText("Intensidad Inicial");

        jLabel24.setText("Resistencia(Ohms)");

        jTFResistenciaRL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnCleanRL.setText("Limpiar Campos");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFInductancia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVoltajeInicialRL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jBtnCleanRL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBtnCalcularRL)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel24)
                                    .addComponent(jTFResistenciaRL, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTFIntensidadInicial)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFRespuesta))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFVoltajeInicialRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFResistenciaRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFInductancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIntensidadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcularRL)
                    .addComponent(jBtnCleanRL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBRL.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLBRL, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLBRL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        RL.addTab("RL", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RL)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RL)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCleanCrecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCleanCrecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCleanCrecimientoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane RL;
    private javax.swing.JButton jBtnCalcularRC;
    private javax.swing.JButton jBtnCalcularRL;
    private javax.swing.JButton jBtnCleanCrecimiento;
    private javax.swing.JButton jBtnCleanDecremento;
    private javax.swing.JButton jBtnCleanRC;
    private javax.swing.JButton jBtnCleanRL;
    private javax.swing.JButton jBtnCrecimiento;
    private javax.swing.JButton jBtnDecremento;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLBRC;
    private javax.swing.JLabel jLBRL;
    private javax.swing.JLabel jLBRespuestaCrec;
    private javax.swing.JLabel jLBRespuestaDecremento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTFCapacitanciaRC;
    private javax.swing.JTextField jTFCargaIncognitaRC;
    private javax.swing.JTextField jTFCargaInicialRC;
    private javax.swing.JTextField jTFInductancia;
    private javax.swing.JTextField jTFIntensidadInicial;
    private javax.swing.JTextField jTFIntensidadRC;
    private javax.swing.JTextField jTFResistenciaRC;
    private javax.swing.JTextField jTFResistenciaRL;
    private javax.swing.JTextField jTFRespuesta;
    private javax.swing.JTextField jTFTDudaCrecimiento;
    private javax.swing.JTextField jTFTDudaDecremento;
    private javax.swing.JTextField jTFTInicialCrecimiento;
    private javax.swing.JTextField jTFTInicialDecremento;
    private javax.swing.JTextField jTFTIntermedioCrecimiento;
    private javax.swing.JTextField jTFTIntermedioDecremento;
    private javax.swing.JTextField jTFVDudaCrecimiento;
    private javax.swing.JTextField jTFVDudaDecremento;
    private javax.swing.JTextField jTFVInicialCrecimiento;
    private javax.swing.JTextField jTFVInicialDecremento;
    private javax.swing.JTextField jTFVIntermedioCrecimiento;
    private javax.swing.JTextField jTFVIntermedioDecremento;
    private javax.swing.JTextField jTFVoltajeInicialRC;
    private javax.swing.JTextField jTFVoltajeInicialRL;
    // End of variables declaration//GEN-END:variables
}
