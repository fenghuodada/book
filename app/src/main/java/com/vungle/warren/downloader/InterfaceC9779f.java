package com.vungle.warren.downloader;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.vungle.warren.downloader.f */
/* loaded from: classes3.dex */
public interface InterfaceC9779f {
    @NonNull
    /* renamed from: a */
    File mo1522a(@NonNull String str) throws IOException;

    /* renamed from: b */
    void mo1521b();

    /* renamed from: c */
    void mo1520c(@NonNull File file, long j);

    void clear();

    /* renamed from: d */
    void mo1519d(@NonNull File file, long j);

    boolean deleteContents(@NonNull File file);

    @NonNull
    /* renamed from: e */
    File mo1518e(@NonNull File file);

    @NonNull
    /* renamed from: f */
    List<File> mo1517f();

    /* renamed from: g */
    void mo1516g(@NonNull File file);

    /* renamed from: h */
    void mo1515h(@NonNull File file);

    /* renamed from: i */
    boolean mo1514i(@NonNull File file);
}
