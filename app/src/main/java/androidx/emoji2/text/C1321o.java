package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C1321o extends AbstractC1310i {
    public C1321o(@NonNull EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        EmojiCompat.m10693a().getClass();
        EmojiMetadata emojiMetadata = this.f3202b;
        C1317m c1317m = emojiMetadata.f3176b;
        Typeface typeface = c1317m.f3218d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = emojiMetadata.f3175a * 2;
        canvas.drawText(c1317m.f3216b, i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
