package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Student;
import models.StudentStore;
import play.libs.Json;
import play.mvc.Result;
import util.Util;

import static play.mvc.Http.Context.Implicit.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.created;

/**
 * Created by tomasz.biniecki on 22/09/2017.
 */
public class StudentController {
    public Result create() {
        JsonNode json = request().body().asJson();
        if (json == null){
            return badRequest(Util.createResponse(
                    "Expecting Json data", false));
        }
        Student student = StudentStore.getInstance().addStudent(
                (Student) Json.fromJson(json, Student.class));
        JsonNode jsonObject = Json.toJson(student);
        return created(Util.createResponse(jsonObject, true));
    }
}
