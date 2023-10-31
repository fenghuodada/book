package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C1308h;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.e */
/* loaded from: classes.dex */
public final class C1335e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f3239a;

    /* renamed from: b */
    public final C1336a f3240b;

    /* renamed from: androidx.emoji2.viewsintegration.e$a */
    /* loaded from: classes.dex */
    public static class C1336a {
    }

    public C1335e(KeyListener keyListener) {
        C1336a c1336a = new C1336a();
        this.f3239a = keyListener;
        this.f3240b = c1336a;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3239a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3239a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean m10674a;
        boolean z;
        this.f3240b.getClass();
        Object obj = EmojiCompat.f3153i;
        if (i != 67) {
            if (i != 112) {
                m10674a = false;
            } else {
                m10674a = C1308h.m10674a(editable, keyEvent, true);
            }
        } else {
            m10674a = C1308h.m10674a(editable, keyEvent, false);
        }
        if (m10674a) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f3239a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3239a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3239a.onKeyUp(view, editable, i, keyEvent);
    }
}
