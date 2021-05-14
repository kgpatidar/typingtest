/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtest;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author kgpat
 */
public class TypingFrame extends javax.swing.JFrame {

    /**
     * Creates new form TypingFrame
     */
    public TypingFrame() {
        initComponents();
        type = null;
        userType = "";
        i = 0;
        startTime = 0;
        dataStore.add("Computer programming is the process of designing and building an executable computer program for accomplishing a specific computing task. Programming involves tasks such as: analysis, generating algorithms, profiling algorithms' accuracy and resource consumption, and the implementation of algorithms in a chosen programming language. The source code of a program is written in one or more languages that are intelligible to programmers, rather than machine code, which is directly executed by the central processing unit. The purpose of programming is to find a sequence of instructions that will automate the performance of a task  on a computer, often for solving a given problem. The process of programming thus often requires expertise in several different subjects, including knowledge of the application domain, specialized algorithms, and formal logic. Tasks accompanying and related to programming include: testing, debugging, source code maintenance, implementation of build systems, and management of derived artifacts, such as the machine code of computer programs. These might be considered part of the programming process, but often the term software development is used for this larger process with the term programming, implementation, or coding reserved for the actual writing of code. Software engineering combines engineering techniques with software development practices. Reverse engineering is the opposite process. A hacker is any skilled computer expert that uses their technical knowledge to overcome a problem, but it can also mean a security hacker in common language. ");
        dataStore.add("A zoo, or zoological garden or park, is a property where a large number of wildlife species are housed. The animals are not in the wild, but are instead kept in captivity in areas that replicate their natural habitats. There are mammals, birds, reptiles, fishes and amphibians that are kept in zoos. The animals are looked after by trained caretakers, and feed and provided water to drink. The animals and their surroundings are maintained clean and hygienic. The animals are given medical attention when required. People, especially children, like to visit zoos to take a look at the wild animals. You will find here below a number of short paragraphs on the topic Zoo of varying word lengths. We hope these paragraphs on Zoo will help students in completing their school assignments. These will also help children write and read out paragraphs in simple words and with small sentences. Students can select any paragraph on Zoo according to their particular requirement. There are zoos in many cities around the world. People can go and visit zoos as they are open for public viewing. Many different wildlife species are kept in a zoo. A wide variety of mammals, reptiles, amphibians, fishes and birds are kept and cared for in a zoo. A zoo is a property that houses wildlife species from around the world. The mammals, birds, amphibians, fishes and reptiles that are kept in a zoo are found naturally in the wild in different kind of habitats. The habitats include forests of varied flora and vegetation, mountainous areas of varying altitudes, deserts of different kinds, and many varied water bodies. In order to keep a great variety of wildlife in a zoo, the different habitats where the animals are naturally found are re-created in a zoo. There are many different wild animals that can be seen in a zoo. There are mammals, amphibians, birds, fishes as also reptiles that are housed in a zoo. There are large and small carnivorous and herbivorous mammals. It includes tigers, lions, elephants, deer, monkeys, rhinoceroses, pandas and leopards. There are also a great variety of birds that may be resident, endemic, exotic and migratory ones that can be seen in a zoo. Snakes such as the cobra and the python are also kept in a zoo. Aquatic species of wildlife can be seen in the water bodies created in a zoo.");
        dataStore.add("Science deals with the study of the processes and occurrences that we see in the natural world around us. Scientific study is undertaken through observation and experiment. It deals with the study of facts that are verifiable. When observed facts are studied systematically it becomes a science. A scientific study is made possible through experiments. Experiments may be conducted in the real world or in laboratories under controlled conditions. A science allows for experiments to be conducted and results to be verified repeatedly. There are many different streams of sciences such as physics, chemistry, zoology, botany, geology, meteorology and astronomy. You will find here below a number of long and short paragraphs on Science of varying word lengths. We hope these Science paragraphs will help students in completing their school assignments. These will also help children write and read out Science paragraph in simple words and with small sentences. Students can select any paragraph on Science according to their particular requirement. Science education is important. Developing a scientific temper among children, the youth and people in general is essential. The various sciences are introduced to children as part of formal school education. Physics, chemistry, and biology are the streams of sciences introduced to children at school. Scientific experiments make the study of the different sciences interesting and easy to understand. They also help to make children more aware of and inquisitive to learn more of the world around them. Science is integral to education and the advancement of knowledge of the world around us. Scientific studies are based on observations and facts that are then analyzed and understood through experiments. The natural occurrences in the world that we see around us have scientific explanations. For example, the natural phenomenon of rainfall can be explained through principles of heat, evaporation and condensation. Likewise, the formation of the rainbow after a rain is a phenomenon based on principles of light.");
        dataStore.add("Addiction to anything happens when it starts being used excessively and when without it something seems incomplete in life. Like the additions of tea and coffee, now people are also getting additions of video games. From morning till night, they have started living in captivity of android phones or laptops. While doing some work, many people are seen playing games on their phones even during a slightest break. Such people are so lost in their world of games that they do not remember their stop in the bus and train or other important works. This situation can be very stressful if not controlled in time. Although gaming addiction is a new word, there is no difference between it and other addictions. Just like a drug addict needs drug all the time. In the same way in video gaming addiction, one needs to play a video game all the time. If he does not get to play the game, he starts getting restless. People with gaming addiction spend most of their day playing video games. It is not just the youngsters playing big games on the computer but adults are also involved. Younger children and older people may get addicted to it. Excess of anything is harmful. Likewise, if a child plays excessive games on a portable device, such as on a TV, or on a computer, it can affect his/her life. Playing games is a great source of entertainment for children, but its addiction can become very harmful to children’s health. Children who are addicted to video games are affected both emotionally and physically. Gaming addiction not only affects their health but also their studies. In addition, children who are addicted to video games do not participate in any social things. Children who are addicted to playing games are unable to concentrate and to take interest either in their work or studies. If children play games for a long time, this affects their education very badly. Due to the addiction of playing games, children also face problems in getting good sleep. Apart from this, due to the addiction of the game, children remain deprive of sleep late nights and can’t sleep for the recommended hours of sleep. Inadequate sleep is harmful to their overall health.Children who are addicted to playing games are always seen playing games all the time. They are socially separated from people and at the same time.");
        dataStore.add("Diwali is a Hindu festival celebrated every year as a festival of lights. It is very significant festival for the people of Hindu religion. Everyone becomes very happy on the occurrence of this festival and celebrates with lots of preparations. Diwali is a five days long festival begins from Dhanteras and ends at Bhai dooj. It falls every year on fifteenth day of the Kartik month. People start cleaning their houses few days before the main date of Diwali such as white washing, dusting, painting, etc. Houses get decorated using real or artificial flowers and other decorative materials. Everywhere looks very dazzling because of the lighting small earthen lamps and electric bulbs. It is considered that Goddess Lakshmi makes a visit to each houses in the night of Diwali that’s why everyone lights their houses to welcome the Goddess. In return, Goddess gives her blessings to her devotees for healthy and prosperous life. At this day, everyone performs puja of Goddess Lakshmi and God Ganesha and then distributes gifts and sweets to their friends, neighbors and relatives. Diwali is one of the most favorite festival of everyone. It is a most enjoyable, sacred and loveliest festival in the Hindu religion. It is celebrated every year all through the country as well as abroad (by the Indian people) with great joy and enthusiasm. Everyone (especially kids) waits for this festival with much keen. This festival is celebrated from the ancient time to mark the happy return of lord Rama with his wife and brother to his Kingdom (Ayodhya) after long fourteen years of exile. It is a five days long festival of lights and festivities, falls every year twenty days after Dussehra. It make us feel the advent of winter season. It brings lots of charms and delight in our life. Diwali is also known as Deepawali because we make a row or collection of many lamps out the home. People start festival preparations few days before the main date such as cleaning of houses, white washing of buildings, decorations, buy toys, gifts, flowers and other necessary things for festival");
        Random rand = new Random();
        int r = rand.nextInt(5);
        type = dataStore.get(r);
        jTextArea1.append(type);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        field = new javax.swing.JTextField();
        wrongChar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);
        field.setSize(400, 400);

        jScrollPane1.getViewport().setViewPosition(new Point(0,0));

        field.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActionPerformed(evt);
            }
        });

        wrongChar.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        wrongChar.setForeground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Last Wrong Character :");

        tfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tfield.setForeground(new java.awt.Color(0, 153, 102));
        tfield.setText("5:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(tfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wrongChar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wrongChar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addComponent(tfield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        setSize(new java.awt.Dimension(1650, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int totWord = 0;
    class ThreadDemo extends Thread {
        int min = 2, sec = 00;
        public void run() {
            while(true) {
                try{
                    if(min>-1) {
                        sec--;
                        if(sec<1) {
                            min--;
                            sec = 59;
                        }
                        if(sec<10) {
                            tfield.setText(min+":0"+sec);
                        } else {
                            tfield.setText(min+":"+sec);
                        }
                        sleep(1000);
                    } else {
                        for(int z=0;z<userType.length();z++) {
                            if(userType.charAt(z)==' ') {
                                totWord++;
                            }
                        }
                        totWord++;
                        
                        tfield.setText("0:00");
                        jTextArea1.setText("typing speed WPM : " + totWord/2);
                        jTextArea1.append("\n" + "Next Goal is " + (int)(totWord/2 + 2));
                        jTextArea1.append("\n\n\nThankyou for Using @TypeWithKG");
                        JOptionPane.showMessageDialog(field, "WPM : " + totWord/2 +"\n\n" + "Press Ok to Type Again " );
                        jTextArea1.setText("");
                        field.setText("");
                        restartType();
                        
                        stop();
                    }
                } catch(Exception e) {
                    
                }
            }
        }
    }
    
    
    public void restartType() {
        type = null;
        userType = "";
        i = 0;
        startTime = 0;
        dataStore.add("Computer programming is the process of designing and building an executable computer program for accomplishing a specific computing task. Programming involves tasks such as: analysis, generating algorithms, profiling algorithms' accuracy and resource consumption, and the implementation of algorithms in a chosen programming language. The source code of a program is written in one or more languages that are intelligible to programmers, rather than machine code, which is directly executed by the central processing unit. The purpose of programming is to find a sequence of instructions that will automate the performance of a task  on a computer, often for solving a given problem. The process of programming thus often requires expertise in several different subjects, including knowledge of the application domain, specialized algorithms, and formal logic. Tasks accompanying and related to programming include: testing, debugging, source code maintenance, implementation of build systems, and management of derived artifacts, such as the machine code of computer programs. These might be considered part of the programming process, but often the term software development is used for this larger process with the term programming, implementation, or coding reserved for the actual writing of code. Software engineering combines engineering techniques with software development practices. Reverse engineering is the opposite process. A hacker is any skilled computer expert that uses their technical knowledge to overcome a problem, but it can also mean a security hacker in common language. ");
        dataStore.add("A zoo, or zoological garden or park, is a property where a large number of wildlife species are housed. The animals are not in the wild, but are instead kept in captivity in areas that replicate their natural habitats. There are mammals, birds, reptiles, fishes and amphibians that are kept in zoos. The animals are looked after by trained caretakers, and feed and provided water to drink. The animals and their surroundings are maintained clean and hygienic. The animals are given medical attention when required. People, especially children, like to visit zoos to take a look at the wild animals. You will find here below a number of short paragraphs on the topic Zoo of varying word lengths. We hope these paragraphs on Zoo will help students in completing their school assignments. These will also help children write and read out paragraphs in simple words and with small sentences. Students can select any paragraph on Zoo according to their particular requirement. There are zoos in many cities around the world. People can go and visit zoos as they are open for public viewing. Many different wildlife species are kept in a zoo. A wide variety of mammals, reptiles, amphibians, fishes and birds are kept and cared for in a zoo. A zoo is a property that houses wildlife species from around the world. The mammals, birds, amphibians, fishes and reptiles that are kept in a zoo are found naturally in the wild in different kind of habitats. The habitats include forests of varied flora and vegetation, mountainous areas of varying altitudes, deserts of different kinds, and many varied water bodies. In order to keep a great variety of wildlife in a zoo, the different habitats where the animals are naturally found are re-created in a zoo. There are many different wild animals that can be seen in a zoo. There are mammals, amphibians, birds, fishes as also reptiles that are housed in a zoo. There are large and small carnivorous and herbivorous mammals. It includes tigers, lions, elephants, deer, monkeys, rhinoceroses, pandas and leopards. There are also a great variety of birds that may be resident, endemic, exotic and migratory ones that can be seen in a zoo. Snakes such as the cobra and the python are also kept in a zoo. Aquatic species of wildlife can be seen in the water bodies created in a zoo.");
        dataStore.add("Science deals with the study of the processes and occurrences that we see in the natural world around us. Scientific study is undertaken through observation and experiment. It deals with the study of facts that are verifiable. When observed facts are studied systematically it becomes a science. A scientific study is made possible through experiments. Experiments may be conducted in the real world or in laboratories under controlled conditions. A science allows for experiments to be conducted and results to be verified repeatedly. There are many different streams of sciences such as physics, chemistry, zoology, botany, geology, meteorology and astronomy. You will find here below a number of long and short paragraphs on Science of varying word lengths. We hope these Science paragraphs will help students in completing their school assignments. These will also help children write and read out Science paragraph in simple words and with small sentences. Students can select any paragraph on Science according to their particular requirement. Science education is important. Developing a scientific temper among children, the youth and people in general is essential. The various sciences are introduced to children as part of formal school education. Physics, chemistry, and biology are the streams of sciences introduced to children at school. Scientific experiments make the study of the different sciences interesting and easy to understand. They also help to make children more aware of and inquisitive to learn more of the world around them. Science is integral to education and the advancement of knowledge of the world around us. Scientific studies are based on observations and facts that are then analyzed and understood through experiments. The natural occurrences in the world that we see around us have scientific explanations. For example, the natural phenomenon of rainfall can be explained through principles of heat, evaporation and condensation. Likewise, the formation of the rainbow after a rain is a phenomenon based on principles of light.");
        dataStore.add("Addiction to anything happens when it starts being used excessively and when without it something seems incomplete in life. Like the additions of tea and coffee, now people are also getting additions of video games. From morning till night, they have started living in captivity of android phones or laptops. While doing some work, many people are seen playing games on their phones even during a slightest break. Such people are so lost in their world of games that they do not remember their stop in the bus and train or other important works. This situation can be very stressful if not controlled in time. Although gaming addiction is a new word, there is no difference between it and other addictions. Just like a drug addict needs drug all the time. In the same way in video gaming addiction, one needs to play a video game all the time. If he does not get to play the game, he starts getting restless. People with gaming addiction spend most of their day playing video games. It is not just the youngsters playing big games on the computer but adults are also involved. Younger children and older people may get addicted to it. Excess of anything is harmful. Likewise, if a child plays excessive games on a portable device, such as on a TV, or on a computer, it can affect his/her life. Playing games is a great source of entertainment for children, but its addiction can become very harmful to children’s health. Children who are addicted to video games are affected both emotionally and physically. Gaming addiction not only affects their health but also their studies. In addition, children who are addicted to video games do not participate in any social things. Children who are addicted to playing games are unable to concentrate and to take interest either in their work or studies. If children play games for a long time, this affects their education very badly. Due to the addiction of playing games, children also face problems in getting good sleep. Apart from this, due to the addiction of the game, children remain deprive of sleep late nights and can’t sleep for the recommended hours of sleep. Inadequate sleep is harmful to their overall health.Children who are addicted to playing games are always seen playing games all the time. They are socially separated from people and at the same time.");
        dataStore.add("Diwali is a Hindu festival celebrated every year as a festival of lights. It is very significant festival for the people of Hindu religion. Everyone becomes very happy on the occurrence of this festival and celebrates with lots of preparations. Diwali is a five days long festival begins from Dhanteras and ends at Bhai dooj. It falls every year on fifteenth day of the Kartik month. People start cleaning their houses few days before the main date of Diwali such as white washing, dusting, painting, etc. Houses get decorated using real or artificial flowers and other decorative materials. Everywhere looks very dazzling because of the lighting small earthen lamps and electric bulbs. It is considered that Goddess Lakshmi makes a visit to each houses in the night of Diwali that’s why everyone lights their houses to welcome the Goddess. In return, Goddess gives her blessings to her devotees for healthy and prosperous life. At this day, everyone performs puja of Goddess Lakshmi and God Ganesha and then distributes gifts and sweets to their friends, neighbors and relatives. Diwali is one of the most favorite festival of everyone. It is a most enjoyable, sacred and loveliest festival in the Hindu religion. It is celebrated every year all through the country as well as abroad (by the Indian people) with great joy and enthusiasm. Everyone (especially kids) waits for this festival with much keen. This festival is celebrated from the ancient time to mark the happy return of lord Rama with his wife and brother to his Kingdom (Ayodhya) after long fourteen years of exile. It is a five days long festival of lights and festivities, falls every year twenty days after Dussehra. It make us feel the advent of winter season. It brings lots of charms and delight in our life. Diwali is also known as Deepawali because we make a row or collection of many lamps out the home. People start festival preparations few days before the main date such as cleaning of houses, white washing of buildings, decorations, buy toys, gifts, flowers and other necessary things for festival");
        Random rand = new Random();
        int r = rand.nextInt(5);
        type = dataStore.get(r);
        for(int i=0;i<type.length();i++) {
            if(i%71==0 && i!=0) {
                jTextArea1.append("\n");
            }
            jTextArea1.append(String.valueOf(type.charAt(i)));
        }
    }
    
    ArrayList<String> dataStore = new ArrayList<String>();
//    dataStore.add("");
    
    String type = null;
    String userType = "";
    int i = 0;
    int startTime = 0;
    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        if(startTime==0) {
            startTime = 1;
            ThreadDemo obj = new ThreadDemo();
            obj.start();
        }
        System.out.print(type.length());
        if(evt.getKeyCode()==8) {
            i--;
            field.setText(userType.substring(0,i));
            userType = userType.substring(0,i);
        } else {
            if(16!=evt.getKeyCode()) {
                char key = evt.getKeyChar();
                if(type.charAt(i)==key) {
                    field.setText(field.getText() + String.valueOf(key));
                    userType += key;
                    System.out.println("Yes" + "------>" + type.charAt(i+1));
                    i++;
                } else {
                    field.setText(field.getText() + String.valueOf(key));
                    userType += key;
                    i++;
                    System.out.println("No");
                }
            }
        }
        
        int is = 0;
        int lastChar = -1;
        for(int j=0;j<i;j++) {
            if(userType.charAt(j)!=type.charAt(j)) {
                is = 1;
                lastChar = j;
            }
        }
        if(lastChar>-1) {
            wrongChar.setText(String.valueOf(userType.charAt(lastChar)));
        } else {
            wrongChar.setText("N/A");
        }
        if(is==1) {
            field.setForeground(Color.RED);
        } else {
            field.setForeground(Color.BLUE);
        }
//        System.out.println("user" + userType);
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(TypingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tfield;
    private javax.swing.JLabel wrongChar;
    // End of variables declaration//GEN-END:variables
}
