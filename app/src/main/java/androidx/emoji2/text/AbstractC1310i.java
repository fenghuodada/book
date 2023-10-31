package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.C1303a;

@RequiresApi(19)
/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes.dex */
public abstract class AbstractC1310i extends ReplacementSpan {
    @NonNull

    /* renamed from: b */
    public final EmojiMetadata f3202b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f3201a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public float f3203c = 1.0f;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public AbstractC1310i(@NonNull EmojiMetadata emojiMetadata) {
        if (emojiMetadata != null) {
            this.f3202b = emojiMetadata;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.f3201a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        EmojiMetadata emojiMetadata = this.f3202b;
        C1303a m10681c = emojiMetadata.m10681c();
        int m10677a = m10681c.m10677a(14);
        short s2 = 0;
        if (m10677a != 0) {
            s = m10681c.f3186b.getShort(m10677a + m10681c.f3185a);
        } else {
            s = 0;
        }
        this.f3203c = abs / s;
        C1303a m10681c2 = emojiMetadata.m10681c();
        int m10677a2 = m10681c2.m10677a(14);
        if (m10677a2 != 0) {
            m10681c2.f3186b.getShort(m10677a2 + m10681c2.f3185a);
        }
        C1303a m10681c3 = emojiMetadata.m10681c();
        int m10677a3 = m10681c3.m10677a(12);
        if (m10677a3 != 0) {
            s2 = m10681c3.f3186b.getShort(m10677a3 + m10681c3.f3185a);
        }
        short s3 = (short) (s2 * this.f3203c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
