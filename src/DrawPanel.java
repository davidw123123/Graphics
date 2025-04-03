import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseListener{

    private int[][] grid = new int[30][40];
    boolean start;
    private BrickLayout b;

    public DrawPanel() {
    this.addMouseListener(this);
    boolean start = false;
//    randomizeGrid();
         b = new BrickLayout("src/bricks", 40, false);
         b.printBrickLayout();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x =10;
        int y =10;

        Graphics2D g2 = (Graphics2D) g;
        for (int j = 0; j < 30; j++) {
            for (int i = 0; i < 40; i++) {
                g.drawRect(x, y, 20, 20);
                x += 25;

                if (b.getBrickLayout()[j][i]==1 && start)
                {
                    g2.setColor(Color.RED);
                    g2.fillRect(x,y,20,20);
                    g2.setColor(Color.BLACK);
                }

            }
            g.drawRect(x, y, 20, 20);
            x = 10;
            y+=25;
        }

    }
    public void createGrid(){

    }
//    private void randomizeGrid(){
//        long time = System.currentTimeMillis();
//        grid = new int[30][40];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if ((int) (Math.random() * 100) < 30)
//                {
//                    grid[i][j] = true;
//                }
//            }
//        }
//        long times = System.currentTimeMillis();
//    }


    @Override
    public void mouseClicked(MouseEvent e) {
        start = true;
        b.doOneBrick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}