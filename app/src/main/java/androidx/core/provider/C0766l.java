package androidx.core.provider;

import androidx.collection.C0482i;
import androidx.core.provider.C0767m;
import androidx.core.util.InterfaceC0797a;
import java.util.ArrayList;

/* renamed from: androidx.core.provider.l */
/* loaded from: classes.dex */
public final class C0766l implements InterfaceC0797a<C0767m.C0768a> {

    /* renamed from: a */
    public final /* synthetic */ String f2453a;

    public C0766l(String str) {
        this.f2453a = str;
    }

    @Override // androidx.core.util.InterfaceC0797a
    public final void accept(C0767m.C0768a c0768a) {
        C0767m.C0768a c0768a2 = c0768a;
        synchronized (C0767m.f2456c) {
            C0482i<String, ArrayList<InterfaceC0797a<C0767m.C0768a>>> c0482i = C0767m.f2457d;
            ArrayList<InterfaceC0797a<C0767m.C0768a>> orDefault = c0482i.getOrDefault(this.f2453a, null);
            if (orDefault != null) {
                c0482i.remove(this.f2453a);
                for (int i = 0; i < orDefault.size(); i++) {
                    orDefault.get(i).accept(c0768a2);
                }
            }
        }
    }
}
