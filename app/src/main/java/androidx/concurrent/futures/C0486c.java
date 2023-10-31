package androidx.concurrent.futures;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* renamed from: androidx.concurrent.futures.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0486c implements LibraryVersionComponent.VersionExtractor {
    /* renamed from: a */
    public static StringBuilder m12390a(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.m3407d((Context) obj);
    }
}
