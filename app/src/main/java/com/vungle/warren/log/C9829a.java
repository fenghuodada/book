package com.vungle.warren.log;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.vungle.warren.log.a */
/* loaded from: classes3.dex */
public final class C9829a implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f19622a;

    public C9829a(String str) {
        this.f19622a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(this.f19622a);
    }
}
