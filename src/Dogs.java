public class Dogs {
    static abstract public class Dog{
        int age, weight;
        String size;

        Dog(){}

        public void setAge(int age) {this.age = age; }

        public void setSize(String size) { this.size = size; }

        public void setWeight(int weight) { this.weight = weight; }

        public double getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public String getSize() {
            return size;
        }
        public int AgeCalc(){
           return age*7;
        }

        @Override
        public abstract String toString();
    }
    public static class Pitbul extends Dog{
        String name;
        Pitbul(int age, int weight, String size, String name){
            this.name = name;
            this.age=age;
            this.weight=weight;
            this.size=size;
        }
        @Override
        public String toString(){
            return "Pitbul { Name - "+name +"age = " + age + ", weight = " + weight + ", size = " + size +
                    '}';
        }

    }

    public static class Huskie extends Dog{
        String name, mood;
        Huskie(int age, int weight, String size, String name, String mood){
            this.mood = mood;
            this.name = name;
            this.age=age;
            this.weight=weight;
            this.size=size;
        }
        @Override
        public String toString(){
            return "Huskie { Name - "+name +"age = " + age + ", weight = " + weight + ", size = " + size +
              ", Dog's mood - " + mood+'}';
        }
    }
}
