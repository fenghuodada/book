package com.adcolony.sdk;

import java.net.URL;

/* renamed from: com.adcolony.sdk.s1 */
/* loaded from: classes.dex */
public final class C2284s1 {

    /* renamed from: a */
    public final URL f5556a;

    public C2284s1(URL url) {
        this.f5556a = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9504a(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r7.f5556a     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L72
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L72
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L72
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            r3 = 1
            r2.setDoInput(r3)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.io.OutputStream r5 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.nio.charset.Charset r0 = com.adcolony.sdk.C2108f2.f5107a     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            byte[] r8 = r8.getBytes(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.write(r8)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r2.getResponseCode()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r4.close()
            java.io.InputStream r8 = r2.getInputStream()
            if (r8 == 0) goto L4e
            java.io.InputStream r8 = r2.getInputStream()
            r8.close()
        L4e:
            r2.disconnect()
            return
        L52:
            r8 = move-exception
            r1 = r3
            goto L7b
        L55:
            r8 = move-exception
            r1 = r3
            goto L60
        L58:
            r8 = move-exception
            goto L7b
        L5a:
            r8 = move-exception
            goto L60
        L5c:
            r8 = move-exception
            goto L7c
        L5e:
            r8 = move-exception
            r5 = r0
        L60:
            r0 = r4
            goto L68
        L62:
            r8 = move-exception
            r5 = r0
            r0 = r2
            goto L6f
        L66:
            r8 = move-exception
            r5 = r0
        L68:
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L76
        L6d:
            r8 = move-exception
            r5 = r0
        L6f:
            r2 = r1
            r1 = r5
            goto L78
        L72:
            r8 = move-exception
            r5 = r0
            r2 = r1
            r1 = r5
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
        L78:
            r4 = r1
            r1 = r2
            r2 = r0
        L7b:
            r0 = r5
        L7c:
            if (r0 == 0) goto L83
            if (r1 != 0) goto L83
            r0.close()
        L83:
            if (r4 == 0) goto L88
            r4.close()
        L88:
            if (r2 == 0) goto L9a
            java.io.InputStream r0 = r2.getInputStream()
            if (r0 == 0) goto L97
            java.io.InputStream r0 = r2.getInputStream()
            r0.close()
        L97:
            r2.disconnect()
        L9a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2284s1.m9504a(java.lang.String):void");
    }
}
