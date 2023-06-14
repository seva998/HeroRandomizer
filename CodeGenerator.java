import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class CodeGenerator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField displayField;
    private JPanel buttonPanel;
    private double result = 0;
    private String operator = "";

    public CodeGenerator() {
        setTitle("Рандомайзер героев");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(240, 180);
        setLocationRelativeTo(null);

        ButtonListener buttonListener = new ButtonListener();


        displayField = new JTextField(30);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 1, 1, 1));

        String[] buttonText = {
                "Выбрать наугад"
        };

        for (String text : buttonText) {
            JButton button = new JButton(text);
            button.addActionListener(buttonListener);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            buttonPanel.add(button);
        }

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(displayField, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        calculate(buttonText);
    }

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonText = e.getActionCommand();
            calculate(buttonText);
        }
    }

    private void calculate(String buttonText) {
        if (buttonText.matches("Выбрать наугад")) {
                displayField.setText(generate());
        }
    }

    public String generate() {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Alchemist");
        wordList.add("Axe");
        wordList.add("Bristleback");
        wordList.add("Centaur Warruner");
        wordList.add("Chaos Knight");
        wordList.add("Dawnbreaker");
        wordList.add("Doom");
        wordList.add("Dragon Knight");
        wordList.add("Earth Spirit");
        wordList.add("Earthshaker");
        wordList.add("Elder Titan");
        wordList.add("Huskar");
        wordList.add("Kunka");
        wordList.add("Legion Commander");
        wordList.add("Lifestealer");
        wordList.add("Mars");
        wordList.add("Night Stalker");
        wordList.add("Ogre Magi");
        wordList.add("Omniknight");
        wordList.add("Primal Beast");
        wordList.add("Pudge");
        wordList.add("Slardar");
        wordList.add("Spirit Breaker");
        wordList.add("Sven");
        wordList.add("Tidehunter");
        wordList.add("Tiny");
        wordList.add("Treant Protector");
        wordList.add("Tusk");
        wordList.add("Underlord");
        wordList.add("Undying");
        wordList.add("Wraith King");
        wordList.add("Antimage");
        wordList.add("Arc Warden");
        wordList.add("Bloodseaker");
        wordList.add("Bounty Hunter");
        wordList.add("Clinkz");
        wordList.add("Draw Ranger");
        wordList.add("Ember Spirit");
        wordList.add("Void");
        wordList.add("Gyrocopter");
        wordList.add("Hoodwink");
        wordList.add("Juggernaut");
        wordList.add("Luna");
        wordList.add("Medusa");
        wordList.add("Meepo (легетимный реролл вонючего говна)");
        wordList.add("Monkey King");
        wordList.add("Morphling");
        wordList.add("Naga Siren");
        wordList.add("Phatnom Assasin");
        wordList.add("Phantom Lancer");
        wordList.add("Razor");
        wordList.add("Riki");
        wordList.add("Shadow Fiend");
        wordList.add("Slark");
        wordList.add("Sniper");
        wordList.add("Spectre");
        wordList.add("Templar Assasin");
        wordList.add("Terrorblade");
        wordList.add("Troll Warlord");
        wordList.add("Ursa");
        wordList.add("Viper");
        wordList.add("Weaver");
        wordList.add("Ancient Apparation");
        wordList.add("Crystal Maiden");
        wordList.add("Death Prophet");
        wordList.add("Disruptor");
        wordList.add("Enchantress");
        wordList.add("Grimstroke");
        wordList.add("Invoker (легетимный реролл вонючего говна)");
        wordList.add("Jakiro");
        wordList.add("Keeper of the light");
        wordList.add("Leshrak");
        wordList.add("Lich");
        wordList.add("Lina");
        wordList.add("Lion");
        wordList.add("Muerta");
        wordList.add("Natures Prophet");
        wordList.add("Necrophos");
        wordList.add("Oracle");
        wordList.add("Outworld Destroyer");
        wordList.add("Puck");
        wordList.add("Pugna");
        wordList.add("Queen of Pain");
        wordList.add("Rubick");
        wordList.add("Shadow Demon");
        wordList.add("Shadow Shaman");
        wordList.add("Silencer");
        wordList.add("Skywrath Mage");
        wordList.add("Storm Spirit");
        wordList.add("Tinker");
        wordList.add("Warlock");
        wordList.add("Witch Doctor");
        wordList.add("Zeus");
        wordList.add("Abbadon");
        wordList.add("Bain");
        wordList.add("Batrider");
        wordList.add("Beastmaster");
        wordList.add("Brewmaster");
        wordList.add("Broodmother (легетимный реролл вонючего говна)");
        wordList.add("Chen");
        wordList.add("Clockwerk");
        wordList.add("Dark Seer");
        wordList.add("Dark Willow");
        wordList.add("Dazzle");
        wordList.add("Enigma");
        wordList.add("Io");
        wordList.add("Lone Druid (легетимный реролл вонючего говна)");
        wordList.add("Lycan (легетимный реролл вонючего говна)");
        wordList.add("Magnus");
        wordList.add("Marci");
        wordList.add("Mirana");
        wordList.add("Nyx");
        wordList.add("Pangolier");
        wordList.add("Phoenix");
        wordList.add("Sand King");
        wordList.add("Snapfire");
        wordList.add("Techies");
        wordList.add("Timbersaw");
        wordList.add("Vengeful Spirit");
        wordList.add("Venomancer");
        wordList.add("Visage (легетимный реролл вонючего говна)");
        wordList.add("Void Spirit");
        wordList.add("Windranger");
        wordList.add("Winter Wyvern");

        String randomWord = generateRandomWordFromList(wordList);


        return randomWord;
    }
    public static String generateRandomWordFromList(ArrayList<String> list) {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
    }

    public static void main(String[] args) {
        new CodeGenerator();
    }
}
