package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C0608c;

/* renamed from: androidx.activity.result.c */
/* loaded from: classes.dex */
public abstract class AbstractC0057c<I> {
    @NonNull
    public abstract AbstractC0058a<I, ?> getContract();

    public void launch(@SuppressLint({"UnknownNullness"}) I i) {
        launch(i, null);
    }

    public abstract void launch(@SuppressLint({"UnknownNullness"}) I i, @Nullable C0608c c0608c);

    @MainThread
    public abstract void unregister();
}
