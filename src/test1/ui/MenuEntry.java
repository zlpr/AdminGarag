package test1.ui;

/**
 * Created by zorm on 03.06.2018.
 */
public abstract class MenuEntry {
    private String title;

    public MenuEntry(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void run() throws Exception;
}
