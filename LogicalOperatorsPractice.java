public class LogicalOperatorsPractice {
    public static void main(String[] args) {

        boolean isRaining = true, hasUmbrella = false;

        boolean isPreparedForRain = isRaining && hasUmbrella;
        System.out.println("Is prepared for rain? " + isPreparedForRain);

        boolean hasProtectionFromRain = isRaining || hasUmbrella;
        System.out.println("Has protection from rain? " + hasProtectionFromRain);

        boolean isNotRaining = !isRaining;
        System.out.println("Is it not raining? " + isNotRaining);

    }
}
