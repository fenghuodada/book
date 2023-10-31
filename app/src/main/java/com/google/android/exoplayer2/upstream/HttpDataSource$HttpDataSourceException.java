package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.common.base.C7929b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends C7365j {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Type {
    }

    public HttpDataSource$HttpDataSourceException() {
        super(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpDataSource$HttpDataSourceException(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException.<init>(java.io.IOException, int, int):void");
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, i == 2000 ? AdError.INTERNAL_ERROR_CODE : i);
    }

    public HttpDataSource$HttpDataSourceException(String str, @Nullable IOException iOException, int i) {
        super(str, iOException, i == 2000 ? AdError.INTERNAL_ERROR_CODE : i);
    }

    /* renamed from: a */
    public static HttpDataSource$HttpDataSourceException m5177a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C7929b.m4294a(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        return i2 == 2007 ? new C7379t(iOException) : new HttpDataSource$HttpDataSourceException(iOException, i2, i);
    }
}
