public class Output {
        public static void main(String[] args) {
                SolarSystem chosenPlanet = SolarSystem.MARS;
                System.out.println("Планета: " + choosePlanet);
                System.out.println("Порядковий номер від сонця: " + chosenPlanet.getOrderFromSun());
                System.out.println("Відстань від сонця: " + chosenPlanet.getDistanceFromSun() + " млн км");
                System.out.println("Відстань від попередньої планети: " + chosenPlanet.getDistanceFromPrevious() + " млн км");
                System.out.println("Радіус: " + chosenPlanet.getRadius() + " км");
                System.out.println("Попередня планета: " + (chosenPlanet.getPreviousPlanet() != null ? chosenPlanet.getPreviousPlanet() : "немає"));
                System.out.println("Наступна планета: " + (chosenPlanet.getNextPlanet() != null ? chosenPlanet.getNextPlanet() : "немає"));
        }
}
