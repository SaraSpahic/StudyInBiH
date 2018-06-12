package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.tables.BlogPost;
import com.sara.studyinbih.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class BlogPostController extends BaseController {


    @Autowired
    private BlogPostService service;

    @RequestMapping(value = "/api/v1/getBlogPost/{blogPostId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getBlogPost(@PathVariable final String blogPostId) {
        return wrapForPublic(() -> this.service.getBlogPost(UUID.fromString(blogPostId)));
    }

    /**
     * Create blogPost result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/createBlogPost", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createBlogPost(@RequestBody BlogPost blogPost, HttpSession session) {
        return wrapForAdmin(() -> this.service.createBlogPost(blogPost), session);
    }


    /**
     * Edit blogPost result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/editBlogPost", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity editBlogPost(@RequestBody BlogPost blogPost, HttpSession session) {
        return wrapForAdmin(() -> this.service.editBlogPost(blogPost), session);
    }

    /**
     * Delete blogPost result.
     *
     * @param blogPostId the id
     * @return the result
     */
    @RequestMapping(value = "/api/v1/deleteBlogPost/{blogPostId}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteBlogPost(@PathVariable final String blogPostId, HttpSession session) {
        return wrapForAdmin(() -> this.service.deleteBlogPost(UUID.fromString(blogPostId)), session);
    }

    /**
     * Gets all blogPosts.
     *
     * @return the all blogPosts
     */
    @RequestMapping(value = "/api/v1/getAllBlogPosts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllBlogPosts() {
        return wrapForPublic(() -> this.service.getAllBlogPosts());
    }



    @RequestMapping(value = "/api/v1/getBlogPostByType/{type}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getBlogPostByType(@PathVariable final String type) {
        return wrapForPublic(() -> this.service.getBlogPostByType(type));
    }


}


