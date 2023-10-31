package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6733b1;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.InterfaceC7423p;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface Renderer extends C6733b1.InterfaceC6735b {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface State {
    }

    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface VideoScalingMode {
    }

    /* renamed from: com.google.android.exoplayer2.Renderer$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6630a {
        /* renamed from: a */
        void mo5692a();

        /* renamed from: b */
        void mo5691b(long j);
    }

    /* renamed from: b */
    boolean mo4920b();

    /* renamed from: d */
    boolean mo4919d();

    /* renamed from: e */
    void mo5709e();

    /* renamed from: g */
    boolean mo5708g();

    String getName();

    int getState();

    @Nullable
    SampleStream getStream();

    /* renamed from: h */
    void mo5707h(C7003m0[] c7003m0Arr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException;

    /* renamed from: i */
    void mo5706i();

    /* renamed from: j */
    AbstractC6974h mo5705j();

    /* renamed from: l */
    void mo4939l(float f, float f2) throws ExoPlaybackException;

    /* renamed from: m */
    void mo5704m(C6740d1 c6740d1, C7003m0[] c7003m0Arr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    /* renamed from: o */
    void mo4918o(long j, long j2) throws ExoPlaybackException;

    /* renamed from: q */
    void mo5703q() throws IOException;

    /* renamed from: r */
    long mo5702r();

    void reset();

    /* renamed from: s */
    void mo5701s(long j) throws ExoPlaybackException;

    void setIndex(int i);

    void start() throws ExoPlaybackException;

    void stop();

    /* renamed from: t */
    boolean mo5700t();

    @Nullable
    /* renamed from: u */
    InterfaceC7423p mo5699u();

    /* renamed from: v */
    int mo5698v();
}
