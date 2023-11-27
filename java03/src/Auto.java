public class Auto {
    String brand;
    String color;

    public Auto(){
    }

    public Auto(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public String action(String action){
        return action; // тормозит или едет
    }
    public static void main(String[] args){
        Auto audi = new Auto("Audi", "red");
        Auto mitsubishi = new Auto("Mitsubishi", "lime");

        Auto mercedes = new Auto();
        mercedes.brand = "Mercedes";
        mercedes.color = "black";

        System.out.println(audi.color +" "+ audi.brand + audi.action(" is moving"));
        System.out.println(mercedes.color +" "+ mercedes.brand + mercedes.action(" is stopping"));
        System.out.println(mitsubishi.color +" "+ mitsubishi.brand + mitsubishi.action(" is moving"));
    }
}
