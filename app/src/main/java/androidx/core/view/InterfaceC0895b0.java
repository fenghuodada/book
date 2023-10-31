package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.b0 */
/* loaded from: classes.dex */
public interface InterfaceC0895b0 {
    void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater);

    void onMenuClosed(@NonNull Menu menu);

    boolean onMenuItemSelected(@NonNull MenuItem menuItem);

    void onPrepareMenu(@NonNull Menu menu);
}
