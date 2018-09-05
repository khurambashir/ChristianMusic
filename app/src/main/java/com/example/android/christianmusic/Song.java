package com.example.android.christianmusic;



import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {



    private String mSongName;
    private String mSingerName;
    private int mImageResourceId;
    private int mImageResourceId2;
    private int mAlbumArt;


    public Song(String sName, String singerName, int imageResourceId, int imageResourceId2, int albumArt) {
        mSongName = sName;
        mSingerName = singerName;
        mImageResourceId = imageResourceId;
        mImageResourceId2 = imageResourceId2;
        mAlbumArt = albumArt;
    }

        //Get Song Name
        public String getSongName () {
            return mSongName;
        }
        //Get Singer Name
        public String getSingerName () {
            return mSingerName;
        }
        //Get image
        public int getImageResourceID () {
            return mImageResourceId;
        }
        //Get image2
        public int getImageResourceId2 () {
            return mImageResourceId2;
        }
        public int getAlbumArt () {
            return (mAlbumArt);
        }


//PArcell
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(mSongName);
        parcel.writeString(mSingerName);
        parcel.writeInt(mImageResourceId);
        parcel.writeInt(mImageResourceId2);
        parcel.writeInt(mAlbumArt);
    }

    public static final Parcelable.Creator<Song> CREATOR
            = new Parcelable.Creator<Song>() {
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    public Song(Parcel in) {
        mSongName = in.readString();
        mSingerName = in.readString();
        mImageResourceId = in.readInt();
        mImageResourceId2 = in.readInt();
        mAlbumArt = in.readInt();
    }


};

