public class Application {
    private services.AppliancesService appliancesService = new services.AppliancesService();


    public static void main(String...args) {
        Application application = new Application();
        application.init();
    }

    public void init() {



        Console.printWelcome();
    }
}
