package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3860j;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.file.b */
/* loaded from: classes.dex */
public final class C3750b implements InterfaceC3573x<File> {

    /* renamed from: a */
    public final File f9725a;

    public C3750b(File file) {
        C3860j.m6404b(file);
        this.f9725a = file;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6510a() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: c */
    public final Class<File> mo6509c() {
        return this.f9725a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final File get() {
        return this.f9725a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }
}
