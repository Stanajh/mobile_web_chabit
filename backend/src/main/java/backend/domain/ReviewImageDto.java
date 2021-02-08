package backend.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ReviewImageDto {
    private List<ReviewImage> reviewImageList = new ArrayList<>();

    public void addReviewImage(ReviewImage reviewImage){
        this.reviewImageList.add(reviewImage);
    }

}
