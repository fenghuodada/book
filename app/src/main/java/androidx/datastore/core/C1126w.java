package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.datastore.core.w */
/* loaded from: classes.dex */
public final class C1126w extends AbstractC10844k implements InterfaceC10809a<File> {

    /* renamed from: a */
    public final /* synthetic */ C1107q<Object> f2898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126w(C1107q<Object> c1107q) {
        super(0);
        this.f2898a = c1107q;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final File invoke() {
        File invoke = this.f2898a.f2830a.invoke();
        String it = invoke.getAbsolutePath();
        synchronized (C1107q.f2829l) {
            LinkedHashSet linkedHashSet = C1107q.f2828k;
            if (!linkedHashSet.contains(it)) {
                C10843j.m431e(it, "it");
                linkedHashSet.add(it);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + invoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return invoke;
    }
}
