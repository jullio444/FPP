package homework.lesson6.prob2;

import java.awt.*;

public class RainBowDesc {

    private Color color;
    private String description;

    private RainBowDesc(Color color, String description) {
        this.color = color;
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public static RainBowDesc[] get() {

    	RainBowDesc[] colors = {
                new RainBowDesc(Color.RED, "Red signifies passion, vitality, enthusiasm and security."),
                new RainBowDesc(Color.ORANGE, "Orange is joy, warmth, heat, sunshine, enthusiasm and creativity."),
                new RainBowDesc(Color.YELLOW, "Yellow stands for freshness, happiness, positivity, clarity and energy."),
                new RainBowDesc(Color.GREEN, "Green the color of life, renewal, nature, and energy."),
                new RainBowDesc(Color.BLUE, "Blue is the color of the sky and sea. It is often associated with depth and stability."),
                new RainBowDesc(new Color( 75, 0, 130 ), "Indigo is powerful and dignified, indigo conveys integrity and deep sincerity."),
                new RainBowDesc(new Color( 128, 0, 128 ), "Violet (purple) represents meanings of wealth, extravagance, creativity, and wisdom.")
        };
        return colors;
    }
}