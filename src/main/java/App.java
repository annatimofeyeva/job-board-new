import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/job-openings/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/job-opening-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/job-openings", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobs", JobOpening.all());
      model.put("template", "templates/job-openings.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/job-openings", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String title = request.queryParams("title");
      String description = request.queryParams("description");
      String contact = request.queryParams("contact");

      JobOpening newJobOpening = new JobOpening(title, description, contact);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/job-openings/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      JobOpening jobOpening = JobOpening.find(Integer.parseInt(request.params(":id")));
      model.put("jobOpening", jobOpening);
      model.put("template", "templates/job-opening.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
