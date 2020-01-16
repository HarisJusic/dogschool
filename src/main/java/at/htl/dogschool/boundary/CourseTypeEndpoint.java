package at.htl.dogschool.boundary;

import at.htl.dogschool.control.CourseTypeRepository;
import at.htl.dogschool.entity.Course;
import at.htl.dogschool.entity.CourseType;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("course_type")
public class CourseTypeEndpoint {

    @Inject
    CourseTypeRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List<CourseType> readAll() {
        return repository.findAll();
    }

    public Response create(CourseType courseType, @Context UriInfo info) {
        Response response = Response.ok().build();
        CourseType newCourseType = repository.save(courseType);
        if (newCourseType != null){
            String newPath = info.getPath()
                    + "/"
                    + newCourseType.getId();

            response = Response
                    .notAcceptable(null)
                    .build();
        }
        return response;

    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") long id, CourseType courseType) {
        Response response = Response.ok().build();
        CourseType ct = repository.findById(id);
        if (ct != null){
            repository.update(id, courseType);
            return response;
        } else{

            String exec = "courseType ID:" + id + "is not existing!";
            return null;
        }




    }

    public Response delete(@PathParam("id") long id) {
        return null;
    }


}
