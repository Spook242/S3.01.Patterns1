package Nivel1Singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {

        private static Undo instance;
        private List<String> commands;
        private Undo() {

            this.commands = new ArrayList<>();
        }

        public static Undo getInstance() {
            if (instance == null) {
                instance = new Undo();
            }
            return instance;
        }

        public void addCommand(String command) {
            this.commands.add(command);
        }

        public void removeLastCommand() {
            if (commands.isEmpty()) {
                System.out.println("There are no undo commands.");
            } else {
                String removedCommand = this.commands.remove(this.commands.size() - 1);
                System.out.println("Undo command: " + removedCommand);
            }
        }

        public void listCommands() {
            if (commands.isEmpty()) {
                System.out.println("The command history is empty.");
                return;
            }

            System.out.println("--- Command history ---");
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ": " + commands.get(i));
            }

        }
    }

