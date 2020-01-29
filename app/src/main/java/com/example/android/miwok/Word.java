package com.example.android.miwok;

public class Word {
    private String mDefaulttranslation;

    private String mMiwoktranslation;

    public String getmDefaulttranslation() {
        return mDefaulttranslation;
    }

    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }

    public Word(String DefaultTranslation, String Miwoktranslation){
        mDefaulttranslation = DefaultTranslation;
        mMiwoktranslation = Miwoktranslation;

    }
}
