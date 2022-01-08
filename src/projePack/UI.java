package projePack;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener {
    JFrame frame;
    JPanel firstPanel;
    JPanel secondPanel;
    JPanel thirdPanel;
    JPanel labelsPanel;
    JPanel textfieldsPanel;
    JPanel firstControlPanel;
    JPanel secondControlPanel;
    Border border = BorderFactory.createLineBorder(Color.black);
    Border margin = new EmptyBorder(10,10,10,10);
    JButton buttonEkle;
    JButton buttonTemizle;
    JButton buttonOlustur;
    JLabel labelAd;
    JLabel labelSoyAd;
    JLabel labelDogumTarihi;
    JLabel labelCinsiyet;
    JLabel labelAkraba;
    JTextField textFieldAd;
    JTextField textFieldSoyad;
    JTextField textFieldDogumTarihi;
    JComboBox comboBoxCinsiyet;
    String[] cinsiyet = {"Kadın","Erkek"};
    JComboBox comboBoxAkraba;
    String[] akraba = {"Anne","Baba","Kardeş","Eş"};


    UI() {
        firstPanel = new JPanel();
        firstPanel.setBorder(border);
        firstPanel.setBounds(0, 0, 1100, 800);
        firstPanel.setLayout(null);


        secondPanel = new JPanel();
        secondPanel.setBorder(border);
        secondPanel.setBounds(1100, 0, 430, 400);
        secondPanel.setLayout(new BoxLayout(secondPanel,BoxLayout.LINE_AXIS));
        //secondPanel.setLayout(new GridLayout());

        secondControlPanel = new JPanel();
        secondControlPanel.setLayout(new GridLayout());

        thirdPanel = new JPanel();
        thirdPanel.setBorder(border);
        thirdPanel.setBounds(1100, 400, 430, 400);
        thirdPanel.setLayout(new BoxLayout(thirdPanel,BoxLayout.PAGE_AXIS));

        firstControlPanel = new JPanel();
        firstControlPanel.setBounds(20,20,1100,800);
        firstControlPanel.setLayout(new BoxLayout(firstControlPanel,BoxLayout.PAGE_AXIS));

        labelsPanel = new JPanel();
        //labelsPanel.setBounds(0,50,30,200);
        labelsPanel.setLayout(new BoxLayout(labelsPanel,BoxLayout.PAGE_AXIS));

        textfieldsPanel = new JPanel();
        textfieldsPanel.setLayout(new BoxLayout(textfieldsPanel,BoxLayout.PAGE_AXIS));

        labelAd = new JLabel();
        labelAd.setText("Ad: ");
        // labelAd.setBounds(secondPanel.getX() + 50,secondPanel.getY() + 50,30,10);

        labelSoyAd = new JLabel();
        labelSoyAd.setText("Soyad: ");

        labelDogumTarihi = new JLabel();
        labelDogumTarihi.setText("Doğum Tarihi: ");

        labelCinsiyet = new JLabel();
        labelCinsiyet.setText("Cinsiyet: ");

        textFieldAd = new JTextField();
        textFieldAd.setMaximumSize(new Dimension(Integer.MAX_VALUE, textFieldAd.getMinimumSize().height));

        textFieldSoyad = new JTextField();
        textFieldSoyad.setMaximumSize(new Dimension(Integer.MAX_VALUE, textFieldSoyad.getMinimumSize().height));

        textFieldDogumTarihi = new JTextField();
        textFieldDogumTarihi.setMaximumSize(new Dimension(Integer.MAX_VALUE, textFieldDogumTarihi.getMinimumSize().height));

        comboBoxCinsiyet = new JComboBox(cinsiyet);
        comboBoxCinsiyet.setMaximumSize(new Dimension(Integer.MAX_VALUE, textFieldDogumTarihi.getMinimumSize().height));
        comboBoxCinsiyet.addActionListener(this);

        comboBoxAkraba = new JComboBox(akraba);
        comboBoxAkraba.setMaximumSize(new Dimension(Integer.MAX_VALUE, textFieldDogumTarihi.getMinimumSize().height));
        comboBoxAkraba.addActionListener(this);

        labelAkraba = new JLabel("Akraba Ekle");


        buttonEkle = new JButton("Ekle");
        buttonEkle.setBounds(secondPanel.getX() + 50,secondPanel.getY() + 50,30,10);
        buttonEkle.addActionListener(this);

        buttonTemizle = new JButton("Temizle");
        buttonTemizle.setBounds(930,690,80,30);
        buttonTemizle.addActionListener(this);

        buttonOlustur = new JButton("Soy Ağacını Oluştur");
        buttonOlustur.setBounds(770,690,150,30);
        buttonOlustur.addActionListener(this);


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //frame.setSize(1650,1080);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setVisible(true);

        textfieldsPanel.add(Box.createRigidArea(new Dimension(0,15))); //margin
        textfieldsPanel.add(textFieldAd);
        textfieldsPanel.add(Box.createRigidArea(new Dimension(0,15)));
        textfieldsPanel.add(textFieldSoyad);
        textfieldsPanel.add(Box.createRigidArea(new Dimension(0,15)));
        textfieldsPanel.add(textFieldDogumTarihi);
        textfieldsPanel.add(Box.createRigidArea(new Dimension(0,15)));
        textfieldsPanel.add(comboBoxCinsiyet);
        textfieldsPanel.add(Box.createRigidArea(new Dimension(0,15)));

        labelsPanel.add(Box.createRigidArea(new Dimension(0,15))); //margin
        labelsPanel.add(labelAd);
        labelsPanel.add(Box.createRigidArea(new Dimension(0,18)));
        labelsPanel.add(labelSoyAd);
        labelsPanel.add(Box.createRigidArea(new Dimension(0,18)));
        labelsPanel.add(labelDogumTarihi);
        labelsPanel.add(Box.createRigidArea(new Dimension(0,18)));
        labelsPanel.add(labelCinsiyet);
        labelsPanel.add(Box.createRigidArea(new Dimension(0,18)));

//        secondPanel.add(labelAd);
//        secondPanel.add(Box.createRigidArea(new Dimension(0,15))); //margin
//        secondPanel.add(labelSoyAd);
//        secondPanel.add(Box.createRigidArea(new Dimension(0,15)));
//        secondPanel.add(labelDogumTarihi);
//        secondPanel.add(Box.createRigidArea(new Dimension(0,15)));
//        secondPanel.add(labelCinsiyet);
//        secondPanel.add(Box.createRigidArea(new Dimension(0,15)));
//        secondPanel.add(textFieldAd);

        firstPanel.add(buttonTemizle);
        firstPanel.add(buttonOlustur);

        secondControlPanel.add(labelsPanel);
        secondControlPanel.add(textfieldsPanel);
        secondPanel.add(secondControlPanel);
        secondPanel.add(buttonEkle);

        thirdPanel.add(labelAkraba);
        thirdPanel.add(comboBoxAkraba);


        frame.add(firstPanel);
        frame.add(secondPanel);
        frame.add(thirdPanel);

    }

    public static void main(String[] args) {
        UI ui = new UI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonEkle){
            JLabel tempLabel = new JLabel(textFieldAd.getText() + " " + textFieldSoyad.getText());
            tempLabel.setBorder(new CompoundBorder(border, margin));
            tempLabel.setBounds(0,0,80,30);

            firstControlPanel.add(tempLabel);
            firstControlPanel.add(Box.createRigidArea(new Dimension(0,15)));
            firstPanel.add(firstControlPanel);
            SwingUtilities.updateComponentTreeUI(firstPanel); //reload the firstPanel after every person add

            System.out.println(textFieldAd.getText());
            System.out.println(textFieldSoyad.getText());
            System.out.println(textFieldDogumTarihi.getText());
        }

        if(e.getSource() == comboBoxCinsiyet){
            System.out.println(comboBoxCinsiyet.getSelectedIndex());
        }

        if (e.getSource() == comboBoxAkraba){
            System.out.println(comboBoxAkraba.getSelectedIndex());
        }

        if(e.getSource() == buttonTemizle){
            firstControlPanel.removeAll();
            SwingUtilities.updateComponentTreeUI(firstControlPanel);
        }

        if(e.getSource() == buttonOlustur){

        }
    }
}
