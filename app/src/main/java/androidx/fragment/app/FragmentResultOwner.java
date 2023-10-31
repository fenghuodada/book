package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC1483m;

/* loaded from: classes.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(@NonNull String str);

    void clearFragmentResultListener(@NonNull String str);

    void setFragmentResult(@NonNull String str, @NonNull Bundle bundle);

    void setFragmentResultListener(@NonNull String str, @NonNull InterfaceC1483m interfaceC1483m, @NonNull FragmentResultListener fragmentResultListener);
}
