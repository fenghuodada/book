package com.vungle.warren.downloader;

import androidx.annotation.NonNull;
import com.vungle.warren.downloader.DownloadRequest;

/* renamed from: com.vungle.warren.downloader.d */
/* loaded from: classes3.dex */
public final class C9777d implements Comparable {

    /* renamed from: a */
    public final Integer f19491a;

    /* renamed from: b */
    public final Integer f19492b;

    public C9777d(int i, @DownloadRequest.Priority int i2) {
        this.f19491a = Integer.valueOf(i);
        this.f19492b = Integer.valueOf(i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof C9777d) {
            C9777d c9777d = (C9777d) obj;
            int compareTo = this.f19491a.compareTo(c9777d.f19491a);
            return compareTo == 0 ? this.f19492b.compareTo(c9777d.f19492b) : compareTo;
        }
        return -1;
    }

    @NonNull
    public final String toString() {
        return "AssetPriority{firstPriority=" + this.f19491a + ", secondPriority=" + this.f19492b + '}';
    }
}
