package com.example.android.miwok;

/**
 * Created by Kashyap on 28-06-2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTrandslation;
    private int mImageResourceId=noImage;
    private int mAudioResourceId;
    private static final int noImage= -1;

    public Word(String defaultTranslation, String miwokTranslation,int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTrandslation = miwokTranslation;
        mAudioResourceId=audio;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageId,int audioId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTrandslation=miwokTranslation;
        mImageResourceId=imageId;
        mAudioResourceId=audioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTrandslation() {
        return mMiwokTrandslation;
    }
    public int getmImageResourceId()
    {return mImageResourceId;}
    public boolean checkImage()
    {if(mImageResourceId == noImage) {
        return true;
    }
    else {
    return false;
    }
    }
    public int getmAudioResourceId()
    {return mAudioResourceId;}

}
