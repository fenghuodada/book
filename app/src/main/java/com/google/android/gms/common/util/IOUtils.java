package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long copyStream(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long copyStream(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j;
    }

    @KeepForSdk
    public static boolean isGzipByteBuffer(@NonNull byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@NonNull InputStream inputStream) throws IOException {
        return readInputStreamFully(inputStream, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@NonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static byte[] toByteArray(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
