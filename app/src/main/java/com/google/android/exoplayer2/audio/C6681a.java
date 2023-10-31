package com.google.android.exoplayer2.audio;

import com.google.android.gms.ads.AdRequest;

/* renamed from: com.google.android.exoplayer2.audio.a */
/* loaded from: classes.dex */
public final class C6681a {

    /* renamed from: a */
    public static final int[] f10679a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f10680b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f10681c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f10682d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f10683e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f */
    public static final int[] f10684f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m6079a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f10680b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f10684f[i3]) * 2;
        }
        int i5 = f10683e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
