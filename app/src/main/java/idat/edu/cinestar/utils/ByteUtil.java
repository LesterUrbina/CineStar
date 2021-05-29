package idat.edu.cinestar.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ByteUtil {

    public static Bitmap byteArrayToBitmap(byte[] bytes) {
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }
}
