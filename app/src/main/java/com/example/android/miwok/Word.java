package com.example.android.miwok;

public class Word {
    private String mDefaulttranslation;

    private String mMiwoktranslation;

    private int mImageResourceId;

    public String getmDefaulttranslation() {
        return mDefaulttranslation;
    }

    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public Word(String DefaultTranslation, String Miwoktranslation){
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = Miwoktranslation;

    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId){
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;

    }
}
