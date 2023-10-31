package com.vungle.warren.log;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.google.gson.C8699t;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.C9924e;
import com.vungle.warren.utility.C10089k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.vungle.warren.log.j */
/* loaded from: classes3.dex */
public final class C9843j {

    /* renamed from: a */
    public final VungleApiClient f19671a;

    /* renamed from: b */
    public final C9924e f19672b;

    /* renamed from: c */
    public final String f19673c;

    /* renamed from: d */
    public int f19674d;

    public C9843j(@NonNull VungleApiClient vungleApiClient, @NonNull C9924e c9924e) {
        int i;
        this.f19671a = vungleApiClient;
        this.f19672b = c9924e;
        String m1408c = c9924e.m1408c("device_id", "");
        if (TextUtils.isEmpty(m1408c)) {
            m1408c = UUID.randomUUID().toString();
            c9924e.m1406e("device_id", m1408c);
            c9924e.m1410a();
        }
        this.f19673c = m1408c;
        Object obj = c9924e.f19921c.get("batch_id");
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        this.f19674d = i;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0035: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:17:0x0035 */
    @Nullable
    /* renamed from: a */
    public static C8690m m1480a(@NonNull File file) {
        BufferedReader bufferedReader;
        Closeable closeable;
        C8690m c8690m = new C8690m();
        Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            C10089k.m1269a(bufferedReader);
                            return c8690m;
                        }
                        c8690m.m3224r(C8699t.m3209b(readLine).m3220n());
                    } catch (Exception unused) {
                        Log.e("j", "Invalidate log document file.");
                        C10089k.m1269a(bufferedReader);
                        return null;
                    }
                }
            } catch (Exception unused2) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                C10089k.m1269a(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            C10089k.m1269a(closeable2);
            throw th;
        }
    }

    /* renamed from: b */
    public final void m1479b(@NonNull File[] fileArr) {
        C8690m m1480a;
        for (File file : fileArr) {
            C8695r c8695r = new C8695r();
            c8695r.m3216t("batch_id", Integer.valueOf(this.f19674d));
            c8695r.m3215u("device_guid", this.f19673c);
            try {
                m1480a = m1480a(file);
            } catch (IOException unused) {
                Log.e("j", "Failed to generate request payload.");
            }
            if (m1480a == null) {
                C10089k.m1268b(file);
            } else {
                c8695r.m3218r(m1480a, "payload");
                VungleApiClient vungleApiClient = this.f19671a;
                String str = vungleApiClient.f19371i;
                if (str != null) {
                    if (vungleApiClient.f19380r.m1428b(VungleApiClient.f19359C, str, c8695r).m1432a().m1430a()) {
                        C10089k.m1268b(file);
                    }
                    if (this.f19674d >= Integer.MAX_VALUE) {
                        this.f19674d = -1;
                    }
                    this.f19674d++;
                } else {
                    throw new IllegalStateException("API Client not configured yet! Must call /config first.");
                    break;
                }
            }
        }
        int i = this.f19674d;
        C9924e c9924e = this.f19672b;
        c9924e.m1407d(i, "batch_id");
        c9924e.m1410a();
    }
}
