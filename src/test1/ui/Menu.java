package test1.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zorm on 03.06.2018.
 */
public class Menu {

    private List<MenuEntry> entries = new ArrayList<MenuEntry>();
    private boolean isExit = false;

    public Menu() {
        entries.add(new MenuEntry("Exit") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public void run() {


        while (!isExit) {
            printMenu();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            try {
                line = reader.readLine();

            int choice = Integer.parseInt(line);
                MenuEntry entry = entries.get(choice - 1);

                entry.run();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public Menu addEntry(MenuEntry entry) {
        int index = entries.size() - 1;
        entries.add(index, entry);
        return this;
    }

    private void printMenu() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nMenu:\n");
        for (int i = 0; i < entries.size(); i++) {
            MenuEntry entry = entries.get(i);
            String entryFormatted = String.format("%s - %s\n", (i + 1), entry.getTitle());
            buffer.append(entryFormatted);
        }
        System.out.print(buffer.toString());
    }
}
