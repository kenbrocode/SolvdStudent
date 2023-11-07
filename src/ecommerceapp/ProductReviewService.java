package ecommerceapp;

interface ProductReviewService {
    void addReview(Review review);
    Review[] getReviews(Product product);
}