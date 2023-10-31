package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0692c;
import androidx.emoji2.text.C1317m;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.flatbuffer.C1303a;

@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes.dex */
public final class C1308h {
    @NonNull

    /* renamed from: a */
    public final EmojiCompat.C1289i f3192a;
    @NonNull

    /* renamed from: b */
    public final C1317m f3193b;
    @NonNull

    /* renamed from: c */
    public final EmojiCompat.InterfaceC1284d f3194c;

    /* renamed from: androidx.emoji2.text.h$a */
    /* loaded from: classes.dex */
    public static final class C1309a {

        /* renamed from: a */
        public int f3195a = 1;

        /* renamed from: b */
        public final C1317m.C1318a f3196b;

        /* renamed from: c */
        public C1317m.C1318a f3197c;

        /* renamed from: d */
        public C1317m.C1318a f3198d;

        /* renamed from: e */
        public int f3199e;

        /* renamed from: f */
        public int f3200f;

        public C1309a(C1317m.C1318a c1318a) {
            this.f3196b = c1318a;
            this.f3197c = c1318a;
        }

        /* renamed from: a */
        public final int m10672a(int i) {
            C1317m.C1318a c1318a;
            boolean z;
            SparseArray<C1317m.C1318a> sparseArray = this.f3197c.f3219a;
            if (sparseArray == null) {
                c1318a = null;
            } else {
                c1318a = sparseArray.get(i);
            }
            int i2 = 1;
            if (this.f3195a != 2) {
                if (c1318a != null) {
                    this.f3195a = 2;
                    this.f3197c = c1318a;
                    this.f3200f = 1;
                    i2 = 2;
                }
                m10671b();
            } else {
                if (c1318a != null) {
                    this.f3197c = c1318a;
                    this.f3200f++;
                } else {
                    boolean z2 = false;
                    if (i == 65038) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (i == 65039) {
                            z2 = true;
                        }
                        if (!z2) {
                            C1317m.C1318a c1318a2 = this.f3197c;
                            if (c1318a2.f3220b != null) {
                                if (this.f3200f == 1) {
                                    if (m10670c()) {
                                        c1318a2 = this.f3197c;
                                    }
                                }
                                this.f3198d = c1318a2;
                                m10671b();
                                i2 = 3;
                            }
                        }
                    }
                    m10671b();
                }
                i2 = 2;
            }
            this.f3199e = i;
            return i2;
        }

        /* renamed from: b */
        public final void m10671b() {
            this.f3195a = 1;
            this.f3197c = this.f3196b;
            this.f3200f = 0;
        }

        /* renamed from: c */
        public final boolean m10670c() {
            boolean z;
            boolean z2;
            C1303a m10681c = this.f3197c.f3220b.m10681c();
            int m10677a = m10681c.m10677a(6);
            if (m10677a != 0 && m10681c.f3186b.get(m10677a + m10681c.f3185a) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            if (this.f3199e == 65039) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
    }

    public C1308h(@NonNull C1317m c1317m, @NonNull EmojiCompat.C1289i c1289i, @NonNull C1300d c1300d) {
        this.f3192a = c1289i;
        this.f3193b = c1317m;
        this.f3194c = c1300d;
    }

    /* renamed from: a */
    public static boolean m10674a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        boolean z2;
        AbstractC1310i[] abstractC1310iArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && (abstractC1310iArr = (AbstractC1310i[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1310i.class)) != null && abstractC1310iArr.length > 0) {
            for (AbstractC1310i abstractC1310i : abstractC1310iArr) {
                int spanStart = editable.getSpanStart(abstractC1310i);
                int spanEnd = editable.getSpanEnd(abstractC1310i);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m10673b(CharSequence charSequence, int i, int i2, EmojiMetadata emojiMetadata) {
        int i3;
        if (emojiMetadata.f3177c == 0) {
            EmojiCompat.InterfaceC1284d interfaceC1284d = this.f3194c;
            C1303a m10681c = emojiMetadata.m10681c();
            int m10677a = m10681c.m10677a(8);
            if (m10677a != 0) {
                m10681c.f3186b.getShort(m10677a + m10681c.f3185a);
            }
            C1300d c1300d = (C1300d) interfaceC1284d;
            c1300d.getClass();
            ThreadLocal<StringBuilder> threadLocal = C1300d.f3179b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c1300d.f3180a;
            String sb2 = sb.toString();
            int i4 = C0692c.f2388a;
            if (C0692c.C0693a.m11964a(textPaint, sb2)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            emojiMetadata.f3177c = i3;
        }
        if (emojiMetadata.f3177c != 2) {
            return false;
        }
        return true;
    }
}
