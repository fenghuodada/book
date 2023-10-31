package com.vungle.warren.downloader;

import androidx.annotation.Nullable;
import com.vungle.warren.C9804i;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public interface Downloader {

    /* loaded from: classes3.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    /* renamed from: com.vungle.warren.downloader.Downloader$a */
    /* loaded from: classes3.dex */
    public static class C9773a extends Exception {
        public C9773a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    void mo1544a();

    /* renamed from: b */
    void mo1543b();

    /* renamed from: c */
    void mo1542c();

    /* renamed from: d */
    void mo1541d(boolean z);

    /* renamed from: e */
    boolean mo1540e(String str);

    /* renamed from: f */
    void mo1539f(DownloadRequest downloadRequest, C9804i c9804i);

    /* renamed from: g */
    ArrayList mo1538g();

    /* renamed from: h */
    void mo1537h(@Nullable DownloadRequest downloadRequest);

    /* renamed from: i */
    boolean mo1536i(@Nullable DownloadRequest downloadRequest);

    /* renamed from: j */
    void mo1535j(DownloadRequest downloadRequest);
}
