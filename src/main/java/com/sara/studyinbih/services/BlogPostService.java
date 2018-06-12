package com.sara.studyinbih.services;

import com.sara.studyinbih.persistence.model.helpers.enums.BlogPostType;
import com.sara.studyinbih.persistence.model.tables.BlogPost;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlogPostService extends BaseService {

    private static final String ORDER_KEY = "title";


    /**
     * Gets all BlogPost.
     *
     * @return the all BlogPost
     */
    @SuppressWarnings("unchecked")
    public List<BlogPost> getAllBlogPosts() {
        return (List<BlogPost>) getSession().createCriteria(BlogPost.class)
                .addOrder(Order.asc(ORDER_KEY))
                .list();
    }

    /**
     * Gets BlogPost.
     *
     * @param id the id
     * @return the BlogPost
     */
    public BlogPost getBlogPost(final UUID id) {
        return (BlogPost) getSession().createCriteria(BlogPost.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    /**
     * Create BlogPost boolean.
     *
     * @param blogPost the BlogPost
     * @return the boolean
     */
    public Boolean createBlogPost(final BlogPost blogPost) {
        getSession().save(blogPost);
        return true;
    }

    /**
     * Edit blogPost boolean.
     *
     * @param blogPost the blogPost
     * @return the boolean
     */
    public Boolean editBlogPost(final BlogPost blogPost) {
        getSession().update(blogPost);
        return true;
    }

    /**
     * Delete blogPost boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public Boolean deleteBlogPost(final UUID id) {
        BlogPost blogPost = (BlogPost) getSession().createCriteria(BlogPost.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();

        getSession().delete(blogPost);
        return true;
    }

    public List<BlogPost> getBlogPostByType(String type) {

        BlogPostType typeEnum = BlogPostType.valueOf(type);

        return  (List<BlogPost>) getSession().createCriteria(BlogPost.class)
                .add(Restrictions.eq("type", typeEnum))
                .list();

    }
}







