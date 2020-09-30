public class Dishes {
    public static abstract class Dish{
        public String color, material;

        Dish() {}

        public void setColor(String color) { this.color = color; }

        public void setMaterial(String material) {this.material = material;}

        public String getColor() {return color;}

        public String getMaterial() {return material;}

        public abstract String toString();
    }
    static class Plate extends Dish {
        double diameter;

        Plate(String color, String material, double diameter) {
            this.color = color;
            this.material = material;
            this.diameter = diameter;
        }

        @Override
        public String toString() {
            return "Plate{" +
                    "diameter=" + diameter + "cm, " + "color: " + color + ", material: " + material +
                    '}';
        }
    }
        static class Knife extends Dish{
        double size;
        Knife(String color,String material, double size) {
            this.color=color;
            this.material = material;
            this.size = size;
        }
        @Override
        public String toString() {
            return "Knife{" +
                    "size = " + size + "color: "+color+", material: "+material+
                    '}';
        }
    }
}
