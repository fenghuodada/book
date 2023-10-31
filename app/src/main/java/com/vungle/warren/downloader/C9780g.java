package com.vungle.warren.downloader;

import androidx.annotation.NonNull;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: com.vungle.warren.downloader.g */
/* loaded from: classes3.dex */
public final class C9780g {

    /* renamed from: a */
    public final C9914a f19500a;

    /* renamed from: c */
    public final LinkedHashSet<File> f19502c = new LinkedHashSet<>();

    /* renamed from: b */
    public final String f19501b = "clever_cache";

    public C9780g(@NonNull C9914a c9914a) {
        this.f19500a = c9914a;
    }

    /* renamed from: a */
    public final File m1513a() {
        File file = new File(this.f19500a.m1417d(), this.f19501b);
        if (file.exists() && !file.isDirectory()) {
            C10089k.m1267c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "cache_policy_journal");
    }

    /* renamed from: b */
    public final void m1512b(long j, @NonNull File file) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        LinkedHashSet<File> linkedHashSet = this.f19502c;
        if (i > 0) {
            linkedHashSet.remove(file);
        }
        linkedHashSet.add(file);
    }

    /* renamed from: c */
    public final void m1511c() {
        C10089k.m1264f(m1513a(), this.f19502c);
    }
}
