public class CompanyInfo {
    public static void main(String[] args) {
        String companyName = "TechBridge Solutions";
        int founded = 2015;
        int employeeCount = 847;
        String headquarters = "Lagos, Nigeria";
        boolean isPubliclyListed = false;
        String techStack = "Java 17, Spring Boot, PostgreSQL, AWS";
        int yearsInOperation = 2025 - founded;

        System.out.println("╔══════════════════════════════════════╗\n" +
                "║       TECHBRIDGE SOLUTIONS           ║\n" +
                "║       Company Profile                ║\n" +
                "╚══════════════════════════════════════╝");
        System.out.println("Company: " + companyName + " ");
        System.out.println("Founded: " + founded);
        System.out.println("Employees: " + employeeCount);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Publicly Listed: " + isPubliclyListed);
        System.out.println("Tech Stack: " + techStack);
        System.out.println("Years in Operation: " + yearsInOperation);

    }
}
