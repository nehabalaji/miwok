package com.example.android.miwok;

public class Word {


    private int mImageResourceId = No_Image_Id;
    private static final int No_Image_Id = 0;
    private String mDefaulttranslation;
    private String mMiwoktranslation;
    private int mAudioResId;


    public String getmDefaulttranslation() {
        return mDefaulttranslation;
    }

    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResId(){
        return mAudioResId;
    }


    public Word(String DefaultTranslation, String Miwoktranslation, int AudioResId) {
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = Miwoktranslation;
        mAudioResId = AudioResId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int AudioResId) {
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResId = AudioResId;
    }

    public boolean hasImage(){
        return mImageResourceId!=No_Image_Id;
    }
}
