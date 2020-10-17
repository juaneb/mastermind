package main.java.juaneb.mastermind.views;
import main.java.juaneb.mastermind.models.*;

public class View {
    protected Board board;
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Board board) {
        this.board = board;
        this.startView = new StartView();
        this.playView = new PlayView(this.board);
        this.resumeView = new ResumeView(this.board);
    }

    public void interact() {
         do {
            this.startView.interact();
            this.playView.interact();
            
        } while (this.resumeView.interact());
    }


}
