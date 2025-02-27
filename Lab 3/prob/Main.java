public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("=== Pandavs ===");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\n=== Kauravs ===");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
