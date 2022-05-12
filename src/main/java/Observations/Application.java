package Observations;

import Observations.controller.ObservationController;
import Observations.repository.ObservedCSVRepository;
import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;

public class Application {

    public static void main(String[] args){
        Javalin app = Javalin.create().start(7001);
        app.before("/",ctx -> ctx.redirect("/observations"));

        ObservedCSVRepository observedCSVRepository = new ObservedCSVRepository("tester.csv");
        ObservationController observationController = new ObservationController(observedCSVRepository);

        app.get("/observations", new VueComponent("observations-overview"));

        app.get("api/observations",observationController::getAllObservations);



    }


}
