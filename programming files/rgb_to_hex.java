public class rgb_to_hex {
    public static void main(String[] args) {
        //declaring integers for color
        int r = 255;
        int g = 127;
        int b = 0;
        //mkaing the color with hexColor
        String hexColor = rgbToHex(r, g, b);
        //outputting it
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    //this method creates a hex (representation of color)
    public static String rgbToHex(int r, int g, int b) {
        //making colors from the input
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        //returning my creation!
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


