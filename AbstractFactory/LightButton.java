package AbstractFactory;

class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}