package no.hiof.magnuhol.repository;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.magnuhol.controller.ObservationController;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7001);

        app.config.enableWebjars();

        app.before("/", ctx -> ctx.redirect("/observations"));

        JSONhandler discoveryRepository = new JSONhandler("observation.json");
        ObservationController obsController = new ObservationController(discoveryRepository);
        discoveryRepository.writeToJson("observation.json");



        app.get("/observations", new VueComponent("observations-overview"));
        app.get("/observations/:observation-id", new VueComponent("observation-detail"));

        app.get("api/observations", obsController::getAllObservations);
        app.get("api/observations/:observation-id", obsController::getObservation);
        app.get("/api/observations/:observation-id/delete", obsController::removeObs);
    }
}
