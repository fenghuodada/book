package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: androidx.transition.g0 */
/* loaded from: classes.dex */
public final class C1753g0 implements InterfaceC1755h0 {

    /* renamed from: a */
    public final WindowId f4257a;

    public C1753g0(@NonNull View view) {
        this.f4257a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1753g0) && ((C1753g0) obj).f4257a.equals(this.f4257a);
    }

    public final int hashCode() {
        return this.f4257a.hashCode();
    }
}
