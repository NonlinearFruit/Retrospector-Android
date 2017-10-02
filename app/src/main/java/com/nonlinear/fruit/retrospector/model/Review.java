package com.nonlinear.fruit.retrospector.model;

import java.util.Date;

/**
 * Created by nonfrt on 9/30/17.
 */

public class Review {
    private Date date;
    private String user;
    private String review;
    private Integer rating;
    private Integer mediaId;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public Review(){
        this(0);
    }

    public Review(Integer rating){
        this(rating, new Date());
    }

    public Review(Integer rating, Date date){
        this(rating,date,"");
    }

    public Review(Integer rating, Date date, String user){
        this(rating,date,user,"");
    }

    public Review(Integer rating, Date date, String user, String review){
        setRating(rating);
        setDate(date);
        setUser(user);
        setReview(review);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void morphInto(Review r) {

        this.setRating(r.getRating());

        if (r.getDate() != null) {
            this.setDate(r.getDate());
        }
        if (r.getUser() != null) {
            this.setUser(r.getUser());
        }
        if (r.getReview() != null) {
            this.setReview(r.getReview());
        }
    }

    @Override
    public String toString(){

        String rating = getRating().toString();
        String user = getUser()==null || getUser().equals("")? "??": getUser();
        String date = getDate()==null? "??": getDate().toString();

        return rating+" by "+user+" on "+date;
    }

    public void clone(Review review){
        setId(review.getId());
        setMediaId(review.getMediaId());
        setUser(review.getUser());
        setReview(review.getReview());
        setDate(review.getDate());
        setRating(review.getRating());
    }
}
