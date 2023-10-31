package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@AnyThread
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public final class C1300d implements EmojiCompat.InterfaceC1284d {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f3179b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f3180a;

    public C1300d() {
        TextPaint textPaint = new TextPaint();
        this.f3180a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
