package android.support.p000v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.p001os.C0021b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0021b {
    @Override // android.support.p000v4.p001os.C0021b
    /* renamed from: b */
    public final void mo13070b(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m13072b(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
        throw null;
    }
}
