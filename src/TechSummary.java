public class TechSummary {
    public static void main(String[] args) {
        String language = "Java";
        int currentLTS = 21;
        boolean isOpenSource = true;
        String primaryUse = "Enterprise Backend Development";
        String jvmDescription = "Executes bytecode on any picture";
        int yearCreated = 1995;
        int ageOfLanguage = 2025 - yearCreated;

        System.out.println("╔══════════════════════════════════════╗\n" +
                "║         JAVA TECHNOLOGY              ║\n" +
                "║            Summary                   ║\n" +
                "╚══════════════════════════════════════╝");
        System.out.println("Language: " + language);
        System.out.println("Current LTs Version: " + currentLTS);
        System.out.println("Open Source: " + isOpenSource);
        System.out.println("Primary Use: " + primaryUse);
        System.out.println("JVM: " + jvmDescription);
        System.out.println("Created: " + yearCreated);
        System.out.println("Age Of Language: " + ageOfLanguage);
        System.out.println("Write Once RUn Anywhere: " + isOpenSource);

    }
}
