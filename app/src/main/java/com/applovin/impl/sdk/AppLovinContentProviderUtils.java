package com.applovin.impl.sdk;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class AppLovinContentProviderUtils {

    /* renamed from: a */
    private static final String[] f7532a = {"_display_name", "_size"};

    /* renamed from: a */
    private static Uri m8087a(String str) {
        return Uri.parse("content://" + (C3214m.m7475M().getPackageName() + ".applovincontentprovider/" + str));
    }

    @Nullable
    /* renamed from: a */
    private static File m8088a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        return m8086b(lastPathSegment);
    }

    @Nullable
    /* renamed from: b */
    private static File m8086b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C3214m.m7475M().getCacheDir());
        File file = new File(C0484a.m12392a(sb, File.separator, "ALContentProviderCache"));
        if (!file.exists()) {
            try {
                if (!file.mkdir()) {
                    return null;
                }
            } catch (Throwable unused) {
            }
        }
        return new File(file, str);
    }

    @Nullable
    public static Uri cacheJPEGImageWithFileName(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m8086b(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return m8087a(str);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinContentProvider", "Failed to create jpeg file '" + str + "' for content provider with exception: " + th);
                return null;
            }
            return null;
        }
    }

    @Nullable
    public static Uri cacheTextWithFileName(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m8086b(str2));
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            return m8087a(str2);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinContentProvider", "Failed to create text file '" + str2 + "' for content provider with exception: " + th);
                return null;
            }
            return null;
        }
    }

    @Nullable
    public static String getType(Uri uri) {
        File m8088a = m8088a(uri);
        try {
            String substring = m8088a.getName().substring(m8088a.getName().indexOf(46) + 1);
            if (MimeTypeMap.getSingleton().hasExtension(substring)) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
            }
            return null;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinContentProvider", "Failed to get file type for '" + uri.toString() + "'", th);
                return null;
            }
            return null;
        }
    }

    @Nullable
    public static ParcelFileDescriptor openFile(Uri uri) {
        try {
            return ParcelFileDescriptor.open(m8088a(uri), 268435456);
        } catch (FileNotFoundException e) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinContentProvider", "Failed to open file '" + uri.toString() + "'", e);
                return null;
            }
            return null;
        }
    }

    @Nullable
    public static Cursor query(Uri uri) {
        File m8088a = m8088a(uri);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(f7532a, 1);
            matrixCursor.addRow(new Object[]{m8088a.getName(), Long.valueOf(m8088a.length())});
            return matrixCursor;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinContentProvider", "Failed to query file '" + uri.toString() + "'", th);
                return null;
            }
            return null;
        }
    }
}
