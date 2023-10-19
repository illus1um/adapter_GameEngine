public class Game {
    private ModernGraphicsEngine graphicsEngine;

    public Game(ModernGraphicsEngine graphicsEngine) {
        this.graphicsEngine = graphicsEngine;
    }

    public void renderGameGraphics() {
        graphicsEngine.renderModernGraphics();
    }
}
