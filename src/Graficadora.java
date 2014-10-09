
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
 * @author Santiago García Cabral 33140664 <stylder@gmail.com>
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
            jLBRespuestaDecremento.setText(null);
        }        
      // graficadora.Graficadora.plano.paintSQRFunc(graficadora.Graficadora.plano.getGraphics(),-0.2,2,-15,-200,200);
    }   

     private void funcionCrecimiento(double tiemInicial, double tiemIntermedio, double tiemDuda, double valInicial, double valIntermedio){
         System.out.println(Math.E+"");
         double k=(Math.log(tiemIntermedio))/(valIntermedio);
         double t=(Math.log(tiemDuda))/(k);                                   
         jLBRespuestaCrec.setText(t+" unidades");
     }
     
     private void funcionDecremento(double tiemInicial, double tiemIntermedio, double tiemDuda, double valInicial, double valIntermedio){
         
         //jLBRespuestaDecremento.setText(t+"");
     }
    
}
     
     
     
    /**
     * Creates new form Graficadora
     */
    public Graficadora() {
        initComponents();
        ManejadorBotones manejador = new ManejadorBotones();
        jBtnCleanCrecimiento.addActionListener(manejador);
        jBtnCrecimiento.addActionListener(manejador);
        jBtnDecremento.addActionListener(manejador);
        jBtnCleanDecremento.addActionListener(manejador);
        
        
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
         
         
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel3 = new javax.swing.JPanel();
        jBtnCleanCrecimiento = new javax.swing.JButton();
        jBtnCleanDecremento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLBRespuestaCrec = new javax.swing.JLabel();
        jLBRespuestaDecremento = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFTIntermedioCrecimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(jTFTDudaCrecimiento, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTFTInicialCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jTFVInicialCrecimiento)
                            .addComponent(jTFVIntermedioCrecimiento)
                            .addComponent(jTFVDudaCrecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jBtnCrecimiento)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)))
                .addGap(24, 24, 24)
                .addComponent(jBtnCrecimiento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
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
                        .addGap(86, 86, 86)
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
                .addGap(24, 24, 24)
                .addComponent(jBtnDecremento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Limpiar Campos"));

        jBtnCleanCrecimiento.setText("Limpiar Campos");
        jBtnCleanCrecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCleanCrecimientoActionPerformed(evt);
            }
        });

        jBtnCleanDecremento.setText("Limpiar Campos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jBtnCleanCrecimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCleanDecremento)
                .addGap(107, 107, 107))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCleanCrecimiento)
                    .addComponent(jBtnCleanDecremento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBRespuestaCrec.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        jLBRespuestaDecremento.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLBRespuestaCrec, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLBRespuestaDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBRespuestaDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBRespuestaCrec, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
    private javax.swing.JButton jBtnCleanCrecimiento;
    private javax.swing.JButton jBtnCleanDecremento;
    private javax.swing.JButton jBtnCrecimiento;
    private javax.swing.JButton jBtnDecremento;
    private javax.swing.JLabel jLBRespuestaCrec;
    private javax.swing.JLabel jLBRespuestaDecremento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    // End of variables declaration//GEN-END:variables
}
