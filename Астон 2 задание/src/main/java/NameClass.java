public class NameClass {
    public static void main(String[] args) {


        String firstStr = "Вячеслав";
        String str2 = "Вячеслав";
        String str3 = "Максим";
        String str4 = "12345";
        String str5 = "вячеслав";

        if (firstStr.equals(str2)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        if (firstStr.equalsIgnoreCase(str5)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        if (firstStr == str3) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        if (firstStr.equals(str4)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}