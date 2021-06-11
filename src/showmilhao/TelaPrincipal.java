/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmilhao;
import Classes.AlternativaPergunta;
import Classes.Jogador;
import Classes.Perguntas;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel_PC
 */
public class TelaPrincipal extends JFrame {
    Perguntas atual;
    Perguntas possiveis[];
    int posicao;
    int cartasQuantidade = 0;
    int premio[] = new int[10];
    private Jogador jogando;
    telaInicial pai;
        
    int jaSorteado[] = new int[8];
    int nivelPergunta = 0;
    /**
     * Creates new form TelaPrincipal
     */
    
  
    
    public TelaPrincipal(Perguntas possiveis[], Jogador jogando, telaInicial pai) {
        initComponents();
        JOptionPane.showMessageDialog(null, jogando.getNome()+ ", Bem vindo ao show do milh�o");
        this.possiveis = possiveis;
        this.jogando = jogando;
        this.pai = pai;
        inicializaPremio();
        proximaPergunta(posicao);
        
    }

    public void setJogando(Jogador jogando)
    {
        this.jogando = jogando;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        letraA = new javax.swing.JButton();
        letraB = new javax.swing.JButton();
        letraC = new javax.swing.JButton();
        letraD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciadoPergunta = new javax.swing.JTextArea();
        pular2 = new javax.swing.JButton();
        cartas = new javax.swing.JButton();
        pular3 = new javax.swing.JButton();
        txtPular1 = new javax.swing.JLabel();
        txtPular2 = new javax.swing.JLabel();
        txtCartas = new javax.swing.JLabel();
        placas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        convidados = new javax.swing.JButton();
        fundoAjudas = new javax.swing.JLabel();
        acertar = new javax.swing.JLabel();
        errar = new javax.swing.JLabel();
        parar = new javax.swing.JButton();
        fundoAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(530, 10, 231, 130);

        letraA.setBackground(new java.awt.Color(255, 0, 51));
        letraA.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        letraA.setForeground(new java.awt.Color(255, 255, 255));
        letraA.setText("   A) ");
        letraA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        letraA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        letraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraAActionPerformed(evt);
            }
        });
        getContentPane().add(letraA);
        letraA.setBounds(30, 240, 230, 60);

        letraB.setBackground(new java.awt.Color(255, 0, 51));
        letraB.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        letraB.setForeground(new java.awt.Color(255, 255, 255));
        letraB.setText("   B) ");
        letraB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        letraB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        letraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraBActionPerformed(evt);
            }
        });
        getContentPane().add(letraB);
        letraB.setBounds(280, 240, 230, 60);

        letraC.setBackground(new java.awt.Color(255, 0, 51));
        letraC.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        letraC.setForeground(new java.awt.Color(255, 255, 255));
        letraC.setText("   C)");
        letraC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        letraC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        letraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraCActionPerformed(evt);
            }
        });
        getContentPane().add(letraC);
        letraC.setBounds(30, 330, 230, 60);

        letraD.setBackground(new java.awt.Color(255, 0, 51));
        letraD.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        letraD.setForeground(new java.awt.Color(255, 255, 255));
        letraD.setText("   D) ");
        letraD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        letraD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        letraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraDActionPerformed(evt);
            }
        });
        getContentPane().add(letraD);
        letraD.setBounds(280, 330, 230, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        enunciadoPergunta.setEditable(false);
        enunciadoPergunta.setBackground(new java.awt.Color(255, 0, 51));
        enunciadoPergunta.setColumns(20);
        enunciadoPergunta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        enunciadoPergunta.setForeground(new java.awt.Color(255, 255, 255));
        enunciadoPergunta.setLineWrap(true);
        enunciadoPergunta.setRows(5);
        enunciadoPergunta.setText("Aqui vai uma pergunta");
        enunciadoPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        jScrollPane1.setViewportView(enunciadoPergunta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 126, 480, 80);

        pular2.setBackground(new java.awt.Color(255, 255, 255));
        pular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/pular.png"))); // NOI18N
        pular2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        pular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pular2ActionPerformed(evt);
            }
        });
        getContentPane().add(pular2);
        pular2.setBounds(660, 270, 50, 50);

        cartas.setBackground(new java.awt.Color(255, 255, 255));
        cartas.setForeground(new java.awt.Color(255, 0, 51));
        cartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/cartas.jpg"))); // NOI18N
        cartas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        cartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartasActionPerformed(evt);
            }
        });
        getContentPane().add(cartas);
        cartas.setBounds(550, 170, 50, 50);

        pular3.setBackground(new java.awt.Color(255, 255, 255));
        pular3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/pular.png"))); // NOI18N
        pular3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        pular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pular3ActionPerformed(evt);
            }
        });
        getContentPane().add(pular3);
        pular3.setBounds(590, 270, 50, 50);

        txtPular1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtPular1.setForeground(new java.awt.Color(255, 255, 255));
        txtPular1.setText("Pular");
        txtPular1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPular1);
        txtPular1.setBounds(670, 320, 40, 20);

        txtPular2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtPular2.setForeground(new java.awt.Color(255, 255, 255));
        txtPular2.setText("Pular");
        txtPular2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPular2);
        txtPular2.setBounds(600, 320, 40, 20);

        txtCartas.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtCartas.setForeground(new java.awt.Color(255, 255, 255));
        txtCartas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCartas.setText("Cartas");
        txtCartas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtCartas);
        txtCartas.setBounds(550, 220, 50, 20);

        placas.setBackground(new java.awt.Color(255, 255, 255));
        placas.setForeground(new java.awt.Color(255, 0, 51));
        placas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/placas.jpg"))); // NOI18N
        placas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        placas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placasActionPerformed(evt);
            }
        });
        getContentPane().add(placas);
        placas.setBounds(620, 170, 50, 50);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Placas");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 220, 50, 30);

        convidados.setBackground(new java.awt.Color(255, 255, 255));
        convidados.setForeground(new java.awt.Color(255, 0, 51));
        convidados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/placas.jpg"))); // NOI18N
        convidados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        convidados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convidadosActionPerformed(evt);
            }
        });
        getContentPane().add(convidados);
        convidados.setBounds(690, 170, 50, 50);

        fundoAjudas.setBackground(new java.awt.Color(0, 204, 204));
        fundoAjudas.setOpaque(true);
        getContentPane().add(fundoAjudas);
        fundoAjudas.setBounds(540, 150, 210, 210);

        acertar.setBackground(new java.awt.Color(255, 255, 51));
        acertar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        acertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acertar.setText("Acertar");
        acertar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        acertar.setOpaque(true);
        getContentPane().add(acertar);
        acertar.setBounds(390, 30, 120, 50);

        errar.setBackground(new java.awt.Color(255, 255, 51));
        errar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        errar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errar.setText("errar");
        errar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        errar.setOpaque(true);
        getContentPane().add(errar);
        errar.setBounds(30, 30, 120, 50);

        parar.setBackground(new java.awt.Color(255, 255, 51));
        parar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        parar.setText("Parar");
        parar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
            }
        });
        getContentPane().add(parar);
        parar.setBounds(210, 30, 120, 50);

        fundoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/13115545492078.jpg"))); // NOI18N
        getContentPane().add(fundoAzul);
        fundoAzul.setBounds(0, 0, 800, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraAActionPerformed
        verificaCorreto(0);
    }//GEN-LAST:event_letraAActionPerformed

    private void letraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraBActionPerformed
        verificaCorreto(1);
    }//GEN-LAST:event_letraBActionPerformed

    private void letraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraCActionPerformed
       verificaCorreto(2);
    }//GEN-LAST:event_letraCActionPerformed

    private void letraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraDActionPerformed
        verificaCorreto(3);
    }//GEN-LAST:event_letraDActionPerformed

    private void pular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pular2ActionPerformed
        pular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/pularusado.png"))); 
        pular2.setEnabled(false);
        posicao+=1;
        proximaPergunta(posicao);
    }//GEN-LAST:event_pular2ActionPerformed

    private void cartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartasActionPerformed
        cartas.setEnabled(false);
        cartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/cartasusadas.jpg")));
        Random r = new Random();
        int x = r.nextInt(2) + 1;
        cartasQuantidade = x;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Cartas c = new Cartas(cartasQuantidade);
                c.setVisible(true);
           }
        });
        
        
        
        retirarAlternativas();
        
        
        
    }//GEN-LAST:event_cartasActionPerformed

    private void pular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pular3ActionPerformed
        pular3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/pularusado.png")));
        pular3.setEnabled(false);
        posicao+=1;
        proximaPergunta(posicao);
    }//GEN-LAST:event_pular3ActionPerformed

    private void placasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placasActionPerformed
        placas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/placasusada.jpg")));
        placas.setEnabled(false);
        char placas[] = new char[8];
        gerarPlacas(placas);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placas(placas).setVisible(true);
            }
        });
    }//GEN-LAST:event_placasActionPerformed

    private void convidadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convidadosActionPerformed
        char convidados[] = new char[4];
        gerarConvidados(convidados);
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new Convidados(convidados).setVisible(true);
            }
        });
    }//GEN-LAST:event_convidadosActionPerformed

    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja parar?");
        
        if(x ==0)
        {
            JOptionPane.showMessageDialog(null, "Escrever codigo aqui");
        }
    }//GEN-LAST:event_pararActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertar;
    private javax.swing.JButton cartas;
    private javax.swing.JButton convidados;
    private javax.swing.JTextArea enunciadoPergunta;
    private javax.swing.JLabel errar;
    private javax.swing.JLabel fundoAjudas;
    private javax.swing.JLabel fundoAzul;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton letraA;
    private javax.swing.JButton letraB;
    private javax.swing.JButton letraC;
    private javax.swing.JButton letraD;
    private javax.swing.JLabel logo;
    private javax.swing.JButton parar;
    private javax.swing.JButton placas;
    private javax.swing.JButton pular2;
    private javax.swing.JButton pular3;
    private javax.swing.JLabel txtCartas;
    private javax.swing.JLabel txtPular1;
    private javax.swing.JLabel txtPular2;
    // End of variables declaration//GEN-END:variables
   
        
    public int verificaCorreto(int i){
        
        if(atual.getAlternativaPosicao(i).isResposta())
        {
            JOptionPane.showMessageDialog(null, "Parab�ns");
            jogando.setPremio(String.valueOf(premio[nivelPergunta]));
            posicao += 1;
            proximaPergunta(posicao);
            return 1;
        }else{ 
            jogando.setPremio(errar.getText());
            JOptionPane.showMessageDialog(null, "N�o foi dessa vez!!");
            dispose();
            pai.setVisible(true);
             return 0;
        }
    }
    
    public void proximaPergunta(int posicao)
    {
        if(nivelPergunta != 9){
            errar.setText("R$ " + String.valueOf(premio[nivelPergunta]/2));
            parar.setText("R$ " + String.valueOf(premio[nivelPergunta]));
            acertar.setText("R$ " + String.valueOf(premio[nivelPergunta+1]));
            nivelPergunta+=1;
            atual = possiveis[posicao];
            enunciadoPergunta.setText("   "+ possiveis[posicao].getEnunciado());
            letraA.setText("   A) " + possiveis[posicao].getAlternativaPosicao(0).getAlternativa());
            letraB.setText("   B) " + possiveis[posicao].getAlternativaPosicao(1).getAlternativa());
            letraC.setText("   C) " + possiveis[posicao].getAlternativaPosicao(2).getAlternativa());
            letraD.setText("   D) " + possiveis[posicao].getAlternativaPosicao(3).getAlternativa());
            letraA.setEnabled(true);
            letraB.setEnabled(true);
            letraC.setEnabled(true);
            letraD.setEnabled(true);
        }else{
            errar.setText("----");
            parar.setText("----");
            parar.setEnabled(false);
            acertar.setText("1 showmilhao");
            AlternativaPergunta a[] = new AlternativaPergunta[4];
        
            a[0] = new AlternativaPergunta("Cydiclesson ", false);
            a[1] = new AlternativaPergunta("Robson", true);
            a[2] = new AlternativaPergunta("Suzicleyde", false);
            a[3] = new AlternativaPergunta("Robervalsson", false);
        
            Perguntas p1 = new Perguntas("   Qual professor dar� um ponto extra para um trabalho bem feito?", a);
            p1.adicionarOpcoes(a);
        
            atual = p1;
            
            enunciadoPergunta.setText("  Qual professor dar� 1 ponto extra para um trabalho bem feito");
            letraA.setText("   A) " + atual.getAlternativaPosicao(0).getAlternativa());
            letraB.setText("   B) " + atual.getAlternativaPosicao(1).getAlternativa());
            letraC.setText("   C) " + atual.getAlternativaPosicao(2).getAlternativa());
            letraD.setText("   D) " + atual.getAlternativaPosicao(3).getAlternativa());
            letraA.setEnabled(true);
            letraB.setEnabled(true);
            letraC.setEnabled(true);
            letraD.setEnabled(true);
            
        }
        
        
    }
    
    public void inicializaPremio()
    {
        premio[0] = 0;
        premio[1] = 1000;
        premio[2] = 2500;
        premio[3] = 5000;
        premio[4] = 10000;
        premio[5] = 25000;
        premio[6] = 50000;
        premio[7] = 100000;
        premio[8] = 250000;
        premio[9] = 5000000;
    }
    
    
    public void retirarAlternativas()
    {
        Random r = new Random();
        
        for(int i = 0; i < cartasQuantidade; i++)
        {
            int x = r.nextInt(4);
            
            while(jaSorteado[x] == 1 || possiveis[posicao].getAlternativaPosicao(x).isResposta() == true)
            {
                x = r.nextInt();
            }
            
            jaSorteado[x] = 1;
            
            if(x == 0)
            {
                letraA.setEnabled(false);
            }else{
                if(x == 1)
                {
                    letraB.setEnabled(false);
                }else{
                    if(x == 2)
                    {
                        letraC.setEnabled(false);
                    }else{
                        if(x == 3)
                        {
                            letraD.setEnabled(false);
                        }
                    }
                }
            }
            
            
        }
    }
    
    
    public void gerarPlacas(char placas[]){
        int total=0;
        int erradas;
        int x;
        int posicaoCerta = -1;
        Random r = new Random();
        
        for(int i = 0;i<8;i++)
        {
            placas[i] = 'e';
        }
        
        for(int i = 0;i<4;i++)
        {
            if(atual.getAlternativaPosicao(i).isResposta())
            {
                posicaoCerta = i;
            }else{
               erradas = r.nextInt(2)+1;
               if((total + erradas) < 5){
                
                    total += erradas;
                    for(int j=0;j<erradas;j++)
                    {
                        x = r.nextInt(8);
                        while(placas[x] != 'e')
                        {
                         x = r.nextInt(8);
                        }
                
                        switch(i)
                        {
                            case 0:
                                placas[x] = 'A';
                            break;
                            case 1:
                                placas[x] = 'B';
                            break;
                            case 2:
                                placas[x] = 'C';
                            break;
                            case 3:
                                placas[x] = 'D';
                            break;
                        }
                    }
               }
            }
        }
        
        
        for(int i = 0;i<8-total;i++)
        {
                x = r.nextInt(8);
                while(placas[x] != 'e')
                {
                    x = r.nextInt(8);
                }
                
                switch(posicaoCerta)
                {
                    case 0:
                        placas[x] = 'A';
                    break;
                    case 1:
                        placas[x] = 'B';
                    break;
                    case 2:
                        placas[x] = 'C';
                    break;
                    case 3:
                        placas[x] = 'D';
                    break;
                }
        }
        
    }
    
    public void gerarConvidados(char convidados[]){
        int total=0;
        int posicaoErrada;
        int posicaoCerta = -1;
        int vetor;
        Random r = new Random();
        
        for(int i = 0;i<4;i++)
        {
            convidados[i] = 'e';
        }
        
        for(int i = 0;i<4;i++)
        {
            if(atual.getAlternativaPosicao(i).isResposta())
            {
                posicaoCerta = i;
            }
        }
        posicaoErrada = r.nextInt(4);
        
        vetor = r.nextInt(4);
        
                switch(posicaoErrada)
                {
                    case 0:
                        convidados[vetor] = 'A';
                    break;
                    case 1:
                        convidados[vetor] = 'B';
                    break;
                    case 2:
                        convidados[vetor] = 'C';
                    break;
                    case 3:
                        convidados[vetor] = 'D';
                    break;
                }
        
        for(int i = 0;i<3;i++)
        {
                vetor = r.nextInt(4);
                while(convidados[vetor] != 'e')
                {
                    vetor = r.nextInt(4);
                }
                
                switch(posicaoCerta)
                {
                    case 0:
                        convidados[vetor] = 'A';
                    break;
                    case 1:
                        convidados[vetor] = 'B';
                    break;
                    case 2:
                        convidados[vetor] = 'C';
                    break;
                    case 3:
                        convidados[vetor] = 'D';
                    break;
                }
        }
        
    }
   
}