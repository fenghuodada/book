package com.google.android.exoplayer2.util;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class FileTypes {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Type {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x019a, code lost:
        if (r0.equals("video/mp2t") == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5136a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r21) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.FileTypes.m5136a(java.util.Map):int");
    }

    /* renamed from: b */
    public static int m5135b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
