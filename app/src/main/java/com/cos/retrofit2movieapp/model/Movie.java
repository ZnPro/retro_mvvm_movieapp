package com.cos.retrofit2movieapp.model;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private static final String TAG = "Hello";

    private long id;
    private String url;
    private String title;
    private long year;
    private double rating;
    private long runtime;
    private String summary;
    @SerializedName("medium_cover_image")
    private String mediumCoverImage;

    @BindingAdapter({"mediumCoverImage"})
    public static void loadImage(ImageView view, String mediumCoverImage){

        Log.d(TAG, "loadImage: ");

        Glide.with(view.getContext())
                .load(mediumCoverImage)
                .into(view);
    }
}
