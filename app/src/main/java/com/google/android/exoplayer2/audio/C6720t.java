package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.audio.t */
/* loaded from: classes.dex */
public final class C6720t {
    @Nullable

    /* renamed from: a */
    public final C6721a f10820a;

    /* renamed from: b */
    public int f10821b;

    /* renamed from: c */
    public long f10822c;

    /* renamed from: d */
    public long f10823d;

    /* renamed from: e */
    public long f10824e;

    /* renamed from: f */
    public long f10825f;

    @RequiresApi(19)
    /* renamed from: com.google.android.exoplayer2.audio.t$a */
    /* loaded from: classes.dex */
    public static final class C6721a {

        /* renamed from: a */
        public final AudioTrack f10826a;

        /* renamed from: b */
        public final AudioTimestamp f10827b = new AudioTimestamp();

        /* renamed from: c */
        public long f10828c;

        /* renamed from: d */
        public long f10829d;

        /* renamed from: e */
        public long f10830e;

        public C6721a(AudioTrack audioTrack) {
            this.f10826a = audioTrack;
        }
    }

    public C6720t(AudioTrack audioTrack) {
        if (C7408g0.f13905a >= 19) {
            this.f10820a = new C6721a(audioTrack);
            m6050a();
            return;
        }
        this.f10820a = null;
        m6049b(3);
    }

    /* renamed from: a */
    public final void m6050a() {
        if (this.f10820a != null) {
            m6049b(0);
        }
    }

    /* renamed from: b */
    public final void m6049b(int i) {
        this.f10821b = i;
        long j = 10000;
        if (i == 0) {
            this.f10824e = 0L;
            this.f10825f = -1L;
            this.f10822c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i != 4) {
                throw new IllegalStateException();
            } else {
                j = 500000;
            }
        }
        this.f10823d = j;
    }
}
