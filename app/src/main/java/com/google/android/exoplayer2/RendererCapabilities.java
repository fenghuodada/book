package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface RendererCapabilities {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdaptiveSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Capabilities {
    }

    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FormatSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TunnelingSupport {
    }

    /* renamed from: a */
    int mo4921a(C7003m0 c7003m0) throws ExoPlaybackException;

    String getName();

    /* renamed from: n */
    int mo5578n() throws ExoPlaybackException;
}
