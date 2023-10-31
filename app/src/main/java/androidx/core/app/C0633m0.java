package androidx.core.app;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.m0 */
/* loaded from: classes.dex */
public final class C0633m0 implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f2299a = new ArrayList<>();

    /* renamed from: b */
    public final Context f2300b;

    /* renamed from: androidx.core.app.m0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0634a {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public C0633m0(Context context) {
        this.f2300b = context;
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f2299a.iterator();
    }
}
