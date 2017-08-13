package Properties;

public interface Colorable {
    public Color getColor ();
        public static class Color {
            public int red, green, blue;
            public Color(int red, int green, int blue){
                this.red = red;
                this.green = green;
                this.blue = blue;
            }

            public int getBlue() {
                return blue;
            }

            public int getGreen() {
                return green;
            }

            public int getRed() {
                return red;
            }
        }
}
