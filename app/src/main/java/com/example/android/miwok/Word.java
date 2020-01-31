package com.example.android.miwok;

public class Word {


    private int mImageResourceId = No_Image_Id;
    private static final int No_Image_Id = 0;
    private String mDefaulttranslation;
    private String mMiwoktranslation;


    public String getmDefaulttranslation() {
        return mDefaulttranslation;
    }

    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public Word(String DefaultTranslation, String Miwoktranslation) {
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = Miwoktranslation;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId) {
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=No_Image_Id;
    }
}
