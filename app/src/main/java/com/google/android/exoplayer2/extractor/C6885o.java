package com.google.android.exoplayer2.extractor;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.flac.C7058a;
import com.google.android.exoplayer2.metadata.flac.C7060b;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7435u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.o */
/* loaded from: classes.dex */
public final class C6885o {

    /* renamed from: a */
    public final int f11536a;

    /* renamed from: b */
    public final int f11537b;

    /* renamed from: c */
    public final int f11538c;

    /* renamed from: d */
    public final int f11539d;

    /* renamed from: e */
    public final int f11540e;

    /* renamed from: f */
    public final int f11541f;

    /* renamed from: g */
    public final int f11542g;

    /* renamed from: h */
    public final int f11543h;

    /* renamed from: i */
    public final int f11544i;

    /* renamed from: j */
    public final long f11545j;
    @Nullable

    /* renamed from: k */
    public final C6886a f11546k;
    @Nullable

    /* renamed from: l */
    public final C7042a f11547l;

    /* renamed from: com.google.android.exoplayer2.extractor.o$a */
    /* loaded from: classes.dex */
    public static class C6886a {

        /* renamed from: a */
        public final long[] f11548a;

        /* renamed from: b */
        public final long[] f11549b;

        public C6886a(long[] jArr, long[] jArr2) {
            this.f11548a = jArr;
            this.f11549b = jArr2;
        }
    }

    public C6885o(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable C6886a c6886a, @Nullable C7042a c7042a) {
        this.f11536a = i;
        this.f11537b = i2;
        this.f11538c = i3;
        this.f11539d = i4;
        this.f11540e = i5;
        this.f11541f = m5863e(i5);
        this.f11542g = i6;
        this.f11543h = i7;
        this.f11544i = m5866b(i7);
        this.f11545j = j;
        this.f11546k = c6886a;
        this.f11547l = c7042a;
    }

    public C6885o(byte[] bArr, int i) {
        C7435u c7435u = new C7435u(bArr, bArr.length);
        c7435u.m5022j(i * 8);
        this.f11536a = c7435u.m5026f(16);
        this.f11537b = c7435u.m5026f(16);
        this.f11538c = c7435u.m5026f(24);
        this.f11539d = c7435u.m5026f(24);
        int m5026f = c7435u.m5026f(20);
        this.f11540e = m5026f;
        this.f11541f = m5863e(m5026f);
        this.f11542g = c7435u.m5026f(3) + 1;
        int m5026f2 = c7435u.m5026f(5) + 1;
        this.f11543h = m5026f2;
        this.f11544i = m5866b(m5026f2);
        int m5026f3 = c7435u.m5026f(4);
        int m5026f4 = c7435u.m5026f(32);
        int i2 = C7408g0.f13905a;
        this.f11545j = ((m5026f3 & 4294967295L) << 32) | (m5026f4 & 4294967295L);
        this.f11546k = null;
        this.f11547l = null;
    }

    @Nullable
    /* renamed from: a */
    public static C7042a m5867a(List<String> list, List<C7058a> list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            int i2 = C7408g0.f13905a;
            String[] split = str2.split("=", 2);
            if (split.length != 2) {
                if (str2.length() != 0) {
                    str = "Failed to parse Vorbis comment: ".concat(str2);
                } else {
                    str = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("FlacStreamMetadata", str);
            } else {
                arrayList.add(new C7060b(split[0], split[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7042a(arrayList);
    }

    /* renamed from: b */
    public static int m5866b(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: e */
    public static int m5863e(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    public final long m5865c() {
        long j = this.f11545j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f11540e;
    }

    /* renamed from: d */
    public final C7003m0 m5864d(byte[] bArr, @Nullable C7042a c7042a) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f11539d;
        if (i <= 0) {
            i = -1;
        }
        C7042a c7042a2 = this.f11547l;
        if (c7042a2 != null) {
            if (c7042a == null) {
                c7042a = c7042a2;
            } else {
                c7042a = c7042a2.m5539b(c7042a.f12490a);
            }
        }
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12316k = "audio/flac";
        c7005b.f12317l = i;
        c7005b.f12329x = this.f11542g;
        c7005b.f12330y = this.f11540e;
        c7005b.f12318m = Collections.singletonList(bArr);
        c7005b.f12314i = c7042a;
        return new C7003m0(c7005b);
    }
}
