public class Output {
        public static void main(String[] args) {
                SolarSystem choosePlanet = SolarSystem.MARS;
                System.out.println("Планета: " + choosePlanet);
                System.out.println("Порядковий номер від сонця: " + choosePlanet.getOrderFromSun());
                System.out.println("Відстань від сонця: " + choosePlanet.getDistanceFromSun() + " млн км");
                System.out.println("Відстань від попередньої планети: " + choosePlanet.getDistanceFromPrevious() + " млн км");
                System.out.println("Радіус: " + choosePlanet.getRadius() + " км");
                System.out.println("Попередня планета: " + (choosePlanet.getPreviousPlanet() != null ? choosePlanet.getPreviousPlanet() : "немає"));
                System.out.println("Наступна планета: " + (choosePlanet.getNextPlanet() != null ? choosePlanet.getNextPlanet() : "немає"));
        }
}
