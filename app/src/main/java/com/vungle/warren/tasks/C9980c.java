package com.vungle.warren.tasks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vungle.warren.AdLoader;
import com.vungle.warren.AdRequest;
import com.vungle.warren.InterfaceC10128w1;
import java.util.Collection;

/* renamed from: com.vungle.warren.tasks.c */
/* loaded from: classes3.dex */
public final class C9980c implements Job {

    /* renamed from: c */
    public static final /* synthetic */ int f20067c = 0;

    /* renamed from: a */
    public final AdLoader f20068a;

    /* renamed from: b */
    public final InterfaceC10128w1 f20069b;

    public C9980c(@NonNull AdLoader adLoader, @NonNull InterfaceC10128w1 interfaceC10128w1) {
        this.f20068a = adLoader;
        this.f20069b = interfaceC10128w1;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        AdRequest adRequest = (AdRequest) bundle.getSerializable("request");
        Collection<String> mo1227a = this.f20069b.mo1227a();
        if (adRequest != null && mo1227a.contains(adRequest.f19307b)) {
            AdLoader adLoader = this.f20068a;
            AdLoader.C9718f c9718f = (AdLoader.C9718f) adLoader.f19268b.remove(adRequest);
            if (c9718f != null) {
                adLoader.m1637l(c9718f.m1624a(0L));
                return 0;
            }
            return 0;
        }
        return 1;
    }
}
