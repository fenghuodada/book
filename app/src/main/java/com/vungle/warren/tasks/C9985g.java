package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import com.vungle.warren.log.C9829a;
import com.vungle.warren.log.C9830b;
import com.vungle.warren.log.C9835f;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.vungle.warren.tasks.g */
/* loaded from: classes3.dex */
public final class C9985g implements Job {

    /* renamed from: b */
    public static final /* synthetic */ int f20072b = 0;

    /* renamed from: a */
    public final C9835f f20073a;

    public C9985g(C9835f c9835f) {
        this.f20073a = c9835f;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        boolean z;
        File[] listFiles;
        String str;
        C9835f c9835f = this.f20073a;
        if (!c9835f.f19647g.get()) {
            str = "Crash report disabled, no need to send crash log files.";
        } else {
            int i = c9835f.f19649i.get();
            File file = c9835f.f19641a.f19623a;
            if (file != null && file.exists()) {
                z = false;
            } else {
                z = true;
            }
            File[] fileArr = null;
            if (z) {
                listFiles = null;
            } else {
                listFiles = file.listFiles(new C9829a("_crash"));
            }
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new C9830b());
                fileArr = (File[]) Arrays.copyOfRange(listFiles, 0, Math.min(listFiles.length, i));
            }
            if (fileArr != null && fileArr.length != 0) {
                c9835f.f19642b.m1479b(fileArr);
                c9835f.m1486c();
                return 0;
            }
            str = "No need to send empty crash log files.";
        }
        Log.d("f", str);
        c9835f.m1486c();
        return 0;
    }
}
