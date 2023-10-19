public class Main {
    public static void main(String[] args) {
        OldGraphicsEngine legacyEngine = new OldGraphicsRenderer();
        ModernGraphicsEngine modernEngine = new OldToModernGraphicsAdapter(legacyEngine);

        Game game = new Game(modernEngine);
        game.renderGameGraphics();

        modernEngine = new ModernGraphicsRenderer();
        game = new Game(modernEngine);
        game.renderGameGraphics();
    }
}