public class Act1 {
    public static void main(String[] args){

        Carro polaris = new Carro();
        Carro chevrolet = new Carro();

        polaris.cantidadDeLlantas = 3;
        chevrolet.cantidadDeLlantas = 4;
        polaris.caballos = 175;
        chevrolet.caballos = 650;
        polaris.marca = "Slingshot";
        chevrolet.marca = "Corvette";

        polaris.avanza(205);
        chevrolet.avanza(341);
        polaris.manejo("mal");
        chevrolet.manejo("bien");

        Television j5500 = new Television();
        Television oled55e6v = new Television();

        j5500.pulgadas = 55;
        oled55e6v.pulgadas = 55;
        j5500.marca = "Samsung";
        oled55e6v.marca = "LG";
        j5500.woofer = "no";
        oled55e6v.woofer = "si";

        j5500.proyecta("720 x 1080");
        oled55e6v.proyecta("3840 x 2160");
        j5500.bocina("malo");
        oled55e6v.bocina("bueno");

        Celular huawei = new Celular();
        Celular samsung = new Celular();

        huawei.apertura = 1.8;
        samsung.apertura = 1.7;
        huawei.ram = 6;
        samsung.ram = 4;
        huawei.marca = "P20";
        samsung.marca ="S8";

        huawei.camara(40);
        samsung.camara(12);
        huawei.proceso("Kirin 970");
        samsung.proceso("Snapdragon 835");
    }
}
