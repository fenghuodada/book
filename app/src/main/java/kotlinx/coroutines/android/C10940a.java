package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.AbstractC11097q1;
import kotlinx.coroutines.internal.InterfaceC11063u;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.android.a */
/* loaded from: classes3.dex */
public final class C10940a implements InterfaceC11063u {
    @Override // kotlinx.coroutines.internal.InterfaceC11063u
    @NotNull
    /* renamed from: a */
    public String mo233a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.InterfaceC11063u
    @NotNull
    /* renamed from: b */
    public AbstractC11097q1 mo232b(@NotNull List<? extends InterfaceC11063u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C10942c(C10944e.m353a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.InterfaceC11063u
    /* renamed from: c */
    public int mo231c() {
        return 1073741823;
    }
}
