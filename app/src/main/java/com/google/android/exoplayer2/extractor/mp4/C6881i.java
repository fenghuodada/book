package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.i */
/* loaded from: classes.dex */
public final class C6881i {

    /* renamed from: a */
    public final boolean f11503a;
    @Nullable

    /* renamed from: b */
    public final String f11504b;

    /* renamed from: c */
    public final TrackOutput.C6809a f11505c;

    /* renamed from: d */
    public final int f11506d;
    @Nullable

    /* renamed from: e */
    public final byte[] f11507e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r6.equals("cbc1") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6881i(boolean r5, @androidx.annotation.Nullable java.lang.String r6, int r7, byte[] r8, int r9, int r10, @androidx.annotation.Nullable byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.google.android.exoplayer2.util.C7394a.m5134a(r2)
            r4.f11503a = r5
            r4.f11504b = r6
            r4.f11506d = r7
            r4.f11507e = r11
            com.google.android.exoplayer2.extractor.TrackOutput$a r5 = new com.google.android.exoplayer2.extractor.TrackOutput$a
            if (r6 != 0) goto L20
            goto L7b
        L20:
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L4c;
                case 3046671: goto L41;
                case 3049879: goto L36;
                case 3049895: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r2
            goto L55
        L2b:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L34
            goto L29
        L34:
            r0 = 3
            goto L55
        L36:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L3f
            goto L29
        L3f:
            r0 = r11
            goto L55
        L41:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L4a
            goto L29
        L4a:
            r0 = r1
            goto L55
        L4c:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L55
            goto L29
        L55:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L7a;
                case 2: goto L7b;
                case 3: goto L7b;
                default: goto L58;
            }
        L58:
            int r7 = r6.length()
            int r7 = r7 + 68
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7b
        L7a:
            r1 = r11
        L7b:
            r5.<init>(r1, r8, r9, r10)
            r4.f11505c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.C6881i.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
