package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslationId;

    /** Miwok translation for the word */
    private String mMiwokTranslationId;

    /** Associated image for the word */
    private int mImageId  = NO_IMAGE_PROVIDED;

    /** Associated audio file for the word */
    private int mAudioId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioId is the resource ID for the audio file associated with this word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslationId = defaultTranslation;
        mMiwokTranslationId = miwokTranslation;
        mAudioId = audioId;
    }
    /**
     * Create a new WordImage object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageId is the image associated with the word
     *
     * @param audioId is the resource ID for the audio file associated with this word
     */

    public Word (String defaultTranslation, String miwokTranslation, int imageId, int audioId) {
        mDefaultTranslationId = defaultTranslation;
        mMiwokTranslationId = miwokTranslation;
        mImageId = imageId;
        mAudioId = audioId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslationId;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslationId;
    }


    /**
     * Get the associated image for the word.
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the associated audio file for the word.
     */
    public int getAudioId() {
        return mAudioId;
    }
}
