package com.vungle.warren.persistence;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.vungle.warren.persistence.g */
/* loaded from: classes3.dex */
public final class C9927g implements InterfaceC9923d, C9914a.InterfaceC9917c {

    /* renamed from: a */
    public final C9914a f19927a;

    public C9927g(@NonNull C9914a c9914a) {
        this.f19927a = c9914a;
        c9914a.m1420a(this);
        mo1399e();
        List<Class<?>> list = C10089k.f20313a;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9923d
    /* renamed from: a */
    public final void mo1403a() {
        C9914a c9914a = this.f19927a;
        if (c9914a != null && c9914a.m1417d() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c9914a.m1417d().getPath());
            File file = new File(C0484a.m12392a(sb, File.separator, "vungle"));
            if (file.exists()) {
                try {
                    C10089k.m1268b(file);
                } catch (IOException e) {
                    Log.e("g", "Failed to delete cached files. Reason: " + e.getLocalizedMessage());
                }
            }
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    @Override // com.vungle.warren.persistence.C9914a.InterfaceC9917c
    /* renamed from: b */
    public final void mo1402b() {
        ArrayList arrayList;
        C9914a c9914a = this.f19927a;
        if (c9914a == null) {
            return;
        }
        synchronized (c9914a) {
            c9914a.m1419b();
            arrayList = c9914a.f19911e;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C10089k.m1268b(new File(file.getPath() + File.separator + "vungle"));
            } catch (IOException e) {
                Log.e("g", "Failed to delete cached files. Reason: " + e.getLocalizedMessage());
            }
        }
    }

    @Override // com.vungle.warren.persistence.InterfaceC9923d
    /* renamed from: c */
    public final File mo1401c(String str) throws IllegalStateException {
        StringBuilder sb = new StringBuilder();
        sb.append(mo1399e().getPath());
        File file = new File(C0484a.m12392a(sb, File.separator, str));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9923d
    /* renamed from: d */
    public final void mo1400d(String str) throws IOException, IllegalStateException {
        File[] listFiles = mo1399e().listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isDirectory() && file.getName().equals(str)) {
                C10089k.m1268b(file);
            }
        }
    }

    @Override // com.vungle.warren.persistence.InterfaceC9923d
    /* renamed from: e */
    public final File mo1399e() throws IllegalStateException {
        C9914a c9914a = this.f19927a;
        if (c9914a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c9914a.m1417d());
            File file = new File(C0484a.m12392a(sb, File.separator, "vungle"));
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }
        throw new IllegalStateException("Context has expired, cannot continue.");
    }
}
