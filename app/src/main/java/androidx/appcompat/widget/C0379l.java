package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0157c;
import androidx.core.util.C0804h;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.viewsintegration.C1327a;
import androidx.emoji2.viewsintegration.C1331c;
import androidx.emoji2.viewsintegration.C1335e;
import androidx.emoji2.viewsintegration.C1341g;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public final class C0379l {
    @NonNull

    /* renamed from: a */
    public final EditText f1305a;
    @NonNull

    /* renamed from: b */
    public final C1327a f1306b;

    public C0379l(@NonNull EditText editText) {
        this.f1305a = editText;
        this.f1306b = new C1327a(editText);
    }

    @Nullable
    /* renamed from: a */
    public final KeyListener m12586a(@Nullable KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            this.f1306b.f3227a.getClass();
            if (!(keyListener instanceof C1335e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new C1335e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    /* renamed from: b */
    public final void m12585b(@Nullable AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1305a.getContext().obtainStyledAttributes(attributeSet, C0157c.f418i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m12583d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    /* renamed from: c */
    public final InputConnection m12584c(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        C1327a c1327a = this.f1306b;
        if (inputConnection == null) {
            c1327a.getClass();
            return null;
        }
        C1327a.C1328a c1328a = c1327a.f3227a;
        c1328a.getClass();
        if (!(inputConnection instanceof C1331c)) {
            return new C1331c(c1328a.f3228a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    /* renamed from: d */
    public final void m12583d(boolean z) {
        C1341g c1341g = this.f1306b.f3227a.f3229b;
        if (c1341g.f3249d != z) {
            if (c1341g.f3248c != null) {
                EmojiCompat m10693a = EmojiCompat.m10693a();
                C1341g.C1342a c1342a = c1341g.f3248c;
                m10693a.getClass();
                C0804h.m11791c(c1342a, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = m10693a.f3155a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    m10693a.f3156b.remove(c1342a);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1341g.f3249d = z;
            if (z) {
                C1341g.m10646a(c1341g.f3246a, EmojiCompat.m10693a().m10692b());
            }
        }
    }
}
