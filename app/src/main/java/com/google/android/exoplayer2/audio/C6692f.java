package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.common.collect.AbstractC8013s;
import com.google.common.primitives.C8035a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.f */
/* loaded from: classes.dex */
public final class C6692f {

    /* renamed from: c */
    public static final C6692f f10700c = new C6692f(new int[]{2}, 8);

    /* renamed from: d */
    public static final C6692f f10701d = new C6692f(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final int[] f10702e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a */
    public final int[] f10703a;

    /* renamed from: b */
    public final int f10704b;

    @RequiresApi(29)
    /* renamed from: com.google.android.exoplayer2.audio.f$a */
    /* loaded from: classes.dex */
    public static final class C6693a {
        @DoNotInline
        /* renamed from: a */
        public static int[] m6069a() {
            int[] iArr;
            boolean isDirectPlaybackSupported;
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            AbstractC8013s.C8014a c8014a = new AbstractC8013s.C8014a();
            for (int i : C6692f.f10702e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    c8014a.m4242b(Integer.valueOf(i));
                }
            }
            c8014a.m4242b(2);
            return C8035a.m4210b(c8014a.m4241c());
        }
    }

    public C6692f(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10703a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f10703a = new int[0];
        }
        this.f10704b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6692f) {
            C6692f c6692f = (C6692f) obj;
            return Arrays.equals(this.f10703a, c6692f.f10703a) && this.f10704b == c6692f.f10704b;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f10703a) * 31) + this.f10704b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f10703a);
        StringBuilder sb = new StringBuilder(C0552c.m12193a(arrays, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.f10704b);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
