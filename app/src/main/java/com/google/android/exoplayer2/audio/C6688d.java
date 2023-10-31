package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.audio.d */
/* loaded from: classes.dex */
public final class C6688d {

    /* renamed from: f */
    public static final C6688d f10690f = new C6688d();

    /* renamed from: a */
    public final int f10691a = 0;

    /* renamed from: b */
    public final int f10692b = 0;

    /* renamed from: c */
    public final int f10693c = 1;

    /* renamed from: d */
    public final int f10694d = 1;
    @Nullable

    /* renamed from: e */
    public AudioAttributes f10695e;

    @RequiresApi(21)
    /* renamed from: a */
    public final AudioAttributes m6071a() {
        if (this.f10695e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10691a).setFlags(this.f10692b).setUsage(this.f10693c);
            if (C7408g0.f13905a >= 29) {
                usage.setAllowedCapturePolicy(this.f10694d);
            }
            this.f10695e = usage.build();
        }
        return this.f10695e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6688d.class != obj.getClass()) {
            return false;
        }
        C6688d c6688d = (C6688d) obj;
        return this.f10691a == c6688d.f10691a && this.f10692b == c6688d.f10692b && this.f10693c == c6688d.f10693c && this.f10694d == c6688d.f10694d;
    }

    public final int hashCode() {
        return ((((((527 + this.f10691a) * 31) + this.f10692b) * 31) + this.f10693c) * 31) + this.f10694d;
    }
}
