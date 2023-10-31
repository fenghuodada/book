package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.activity.result.contract.a */
/* loaded from: classes.dex */
public abstract class AbstractC0058a<I, O> {

    /* renamed from: androidx.activity.result.contract.a$a */
    /* loaded from: classes.dex */
    public static final class C0059a<T> {

        /* renamed from: a */
        public final T f108a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0059a(Serializable serializable) {
            this.f108a = serializable;
        }
    }

    @NotNull
    public abstract Intent createIntent(@NotNull Context context, I i);

    @Nullable
    public C0059a<O> getSynchronousResult(@NotNull Context context, I i) {
        C10843j.m430f(context, "context");
        return null;
    }

    public abstract O parseResult(int i, @Nullable Intent intent);
}
