import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.Actor;
import java.util.Random;

public class Ambulance extends Actor {
    private static final int speed = 4;
    private static final int edge_distance = 20;
    private Random random = new Random();

    public void act() {
        if (random.nextInt(100) < 1) {
            randomTurn();
        }
        move(speed);

        if (isCloseToEdge()) {
            avoidObstacle();
        }
    }

    private boolean isCloseToEdge() {
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();

        return x <= edge_distance || x >= width - edge_distance || y <= edge_distance || y >= height - edge_distance;
    }

    private void avoidObstacle() {
        // Implementasi logika untuk menghindari dinding atau hambatan lainnya
        // Misalnya, putar mobil sekitar 90 derajat ke kiri
        turn(-90);
        move(speed);
    }

    private void randomTurn() {
        // Putar mobil secara acak antara -45 hingga 45 derajat
        int angle = random.nextInt(90) - 45;
        turn(angle);
    }
}



