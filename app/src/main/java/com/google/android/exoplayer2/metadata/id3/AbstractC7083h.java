package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;

/* renamed from: com.google.android.exoplayer2.metadata.id3.h */
/* loaded from: classes.dex */
public abstract class AbstractC7083h implements C7042a.InterfaceC7044b {

    /* renamed from: a */
    public final String f12565a;

    public AbstractC7083h(String str) {
        this.f12565a = str;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public /* synthetic */ void mo5509a(MediaMetadata.C6623a c6623a) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public String toString() {
        return this.f12565a;
    }
}
