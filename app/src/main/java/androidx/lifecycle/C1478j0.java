package androidx.lifecycle;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.j0 */
/* loaded from: classes.dex */
public final class C1478j0 {
    @NotNull

    /* renamed from: a */
    public final LinkedHashMap f3450a = new LinkedHashMap();

    /* renamed from: a */
    public final void m10541a() {
        LinkedHashMap linkedHashMap = this.f3450a;
        for (AbstractC1460f0 abstractC1460f0 : linkedHashMap.values()) {
            abstractC1460f0.clear();
        }
        linkedHashMap.clear();
    }
}
