class OldToModernGraphicsAdapter implements ModernGraphicsEngine {
    private OldGraphicsEngine oldEngine;

    public OldToModernGraphicsAdapter(OldGraphicsEngine oldEngine) {
        this.oldEngine = oldEngine;
    }

    @Override
    public void renderModernGraphics() {
        oldEngine.renderOldGraphics();
    }
}
