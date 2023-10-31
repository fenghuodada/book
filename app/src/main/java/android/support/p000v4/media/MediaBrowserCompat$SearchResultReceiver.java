package android.support.p000v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.p001os.C0021b;
import java.util.ArrayList;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0021b {
    @Override // android.support.p000v4.p001os.C0021b
    /* renamed from: b */
    public final void mo13070b(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m13072b(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
