package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.o */
/* loaded from: classes.dex */
public final class C0723o {

    @RequiresApi(19)
    /* renamed from: androidx.core.graphics.o$a */
    /* loaded from: classes.dex */
    public static class C0724a {
        @DoNotInline
        /* renamed from: a */
        public static ParcelFileDescriptor m11873a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m11878a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m11877b(@NonNull File file, @NonNull Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m11876c = m11876c(inputStream, file);
            m11878a(inputStream);
            return m11876c;
        } catch (Throwable th2) {
            th = th2;
            m11878a(inputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static boolean m11876c(@NonNull InputStream inputStream, @NonNull File file) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m11878a(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m11878a(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m11878a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    @Nullable
    /* renamed from: d */
    public static File m11875d(@NonNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @Nullable
    @RequiresApi(19)
    /* renamed from: e */
    public static MappedByteBuffer m11874e(@NonNull Context context, @NonNull Uri uri) {
        try {
            ParcelFileDescriptor m11873a = C0724a.m11873a(context.getContentResolver(), uri, "r", null);
            if (m11873a == null) {
                if (m11873a != null) {
                    m11873a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m11873a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                m11873a.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
