/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_podzial;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Patryk
 */
public class Podzial extends javax.swing.JFrame {

    DefaultListModel<String> listas1 = new DefaultListModel<>();
    ArrayList<Integer> listastart = new ArrayList();
    DefaultListModel<String> listak1 = new DefaultListModel<>();
    ArrayList<Integer> listaz1 = new ArrayList();
    DefaultListModel<String> listak2 = new DefaultListModel<>();
    ArrayList<Integer> listaz2 = new ArrayList();
    boolean kontrola;
    /**
     * Creates new form Podział
     */
    public Podzial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dodaj = new javax.swing.JButton();
        usun = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        solve_problem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dodaj.setText("dodaj liczbe");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });

        usun.setText("usuń liczbe");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.setVisibleRowCount(5);
        jScrollPane1.setViewportView(lista);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Rozwiązanie problemu");

        jScrollPane2.setViewportView(jList1);

        jScrollPane3.setViewportView(jList2);

        solve_problem.setText("Rozwiąż problem");
        solve_problem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solve_problemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(solve_problem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solve_problem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dodaj)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usun))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed
        try{
        int liczba = Integer.parseInt(JOptionPane.showInputDialog("Nowa Liczba! \n Podaj Liczbę"));
        listastart.add(liczba);
            listas1.addElement(listastart.get(listastart.size()-1).toString());
           lista.setModel(listas1);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(rootPane, "nie dodano liczby z powodu złego formatu wprowadzanej danej");
        }
    }//GEN-LAST:event_dodajActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
       try{
        listastart.remove(lista.getSelectedIndex());
        listas1.remove(lista.getSelectedIndex());
        lista.setModel(listas1);
    }catch(Exception e){
        
    }
    }//GEN-LAST:event_usunActionPerformed

    private void solve_problemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solve_problemActionPerformed
       int[] kombinacje = new int[listastart.size()];
       listak1.removeAllElements();
       listak2.removeAllElements();
       for(int i = listaz1.size()-1;i>-1;i--){
          listaz1.remove(i);
       }
       for(int i = listaz2.size()-1;i>-1;i--){
          listaz2.remove(i);
       }
       kontrola=false;
       for(int i = 0;i<listastart.size();i++){
           kombinacje[i]=listastart.get(i);
       }
       znajdz_kombinacje(listastart.size(),kombinacje);
       for(int i = 0;i<listaz1.size();i++){
          listak1.addElement(listaz1.get(i).toString());
       }
       for(int i = 0;i<listaz2.size();i++){
           listak2.addElement(listaz2.get(i).toString());
       }
       jList1.setModel(listak1);
       jList2.setModel(listak2);
       if(listaz1.isEmpty()&&listaz2.isEmpty()){
         jLabel1.setText("Brak rozwiązania");  
       }else{
         jLabel1.setText("Rozwiązanie problemu");
       }
    }//GEN-LAST:event_solve_problemActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Podzial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Podzial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton solve_problem;
    private javax.swing.JButton usun;
    // End of variables declaration//GEN-END:variables

    private void znajdz_kombinacje(int n,int[] baza) {
         int zmiana;
     
        if (n == 1) {
          kontrola = zatwierdz(baza);
          if(kontrola==true){
            
          } 
        } else {
            if(kontrola == false){
            for (int i = 0; i < n; i++) {
                zmiana = baza[i];
                baza[i] = baza[n - 1];
                baza[n - 1] = zmiana;
                znajdz_kombinacje(n - 1, baza);
                zmiana = baza[i];
                baza[i] = baza[n - 1];
                baza[n - 1] = zmiana;
            }
        }else{
                
            }
        }
    }

    private boolean zatwierdz(int[] baza) {
        if(listaz1.isEmpty()&&listaz2.isEmpty()){
        boolean wynik = false;
        int suma1 = 0,suma2 = 0;
         ArrayList<Integer> lista1 = new ArrayList();
      ArrayList<Integer> lista2 = new ArrayList();
        for(int i = 0;i<baza.length;i++){
        if(suma1<=suma2){
          suma1=suma1+baza[i];  
          lista1.add(baza[i]);
        }else{
          suma2=suma2+baza[i]; 
          lista2.add(baza[i]);
        }    
        }
        wynik = suma1==suma2;
        if(wynik == true){
           for(int i = 0;i<lista1.size();i++){
               listaz1.add(lista1.get(i));
               System.out.println("1:"+lista1.get(i));
           }
           for(int i = 0;i<lista2.size();i++){
               System.out.println("2:"+lista2.get(i));
               listaz2.add(lista2.get(i));
           }
        }return wynik;
        }else{
           return false; 
        }
        
    }
}
