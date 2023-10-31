package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.data.mediastore.d */
/* loaded from: classes.dex */
public final class C3473d {

    /* renamed from: a */
    public final InterfaceC3472c f9224a;

    /* renamed from: b */
    public final InterfaceC3483b f9225b;

    /* renamed from: c */
    public final ContentResolver f9226c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f9227d;

    static {
        new C3468a();
    }

    public C3473d(ArrayList arrayList, InterfaceC3472c interfaceC3472c, InterfaceC3483b interfaceC3483b, ContentResolver contentResolver) {
        this.f9224a = interfaceC3472c;
        this.f9225b = interfaceC3483b;
        this.f9226c = contentResolver;
        this.f9227d = arrayList;
    }
}
