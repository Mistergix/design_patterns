public class Launcher {
    public static void main(String[] args) {
        WeatherBase wb = new WeatherBase();
        DisplayConditions dc = new DisplayConditions(wb);

        wb.UpdateMeasures(26, 15, 10);
        wb.UpdateMeasures(20, 19, 8);
    }
}
